package com.conztanz.connect.camel;

import com.conztanz.connect.exception.*;
import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.model.*;
import com.conztanz.connect.services.SimpleIncomingMessageService;
import com.conztanz.connect.services.SimpleWaitingMessageService;
import com.conztanz.connect.services.SimpleWorkingMessageService;
import com.conztanz.connect.test.utils.Utils;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResult;
import com.conztanz.transport.ConztanzResultList;
import com.conztanz.utils.StringUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-lifeCycle.xml")
@TransactionConfiguration(transactionManager = "ConztanzTransactionManager")
public class SimpleLifeCycleOrchestratorTest
{

  @Autowired
  private SimpleWorkingMessageService workingService;

  @Autowired
  private SimpleLifeCycleOrchestrator orchestrator;

  @Autowired
  private SimpleWaitingMessageService waitingService;

  @Autowired
  private SimpleIncomingMessageService incomingService;


  public SimpleIncomingMessageService getIncomingService()
  {
    return incomingService;
  }

  public SimpleLifeCycleOrchestrator getOrchestrator()
  {
    return orchestrator;
  }

  public SimpleWorkingMessageService getWorkingService()
  {
    return workingService;
  }

  public SimpleWaitingMessageService getWaitingService()
  {
    return waitingService;
  }


  @Test
  public void test() throws BlockedContinuityException, ConnectIdentificationException, SequenceContinuityException, ConnectTransformationException, IOException, PersistenceException
  {
    String objectID1 = Utils.generateObjectId();
    String sequenceNumber1 = "1";
    String sequenceNumber2 = "2";
    byte[] message1  = Utils.getMessage(objectID1, sequenceNumber1 );
    try
    {
      // Sending a new message
      this.getOrchestrator().startLifeCycle(message1);
    }
    catch (ContinuityException |PersistenceException e)
    {
      fail(e.getMessage());
    }
    //Message should be in working
    SimpleSequencedWorkingMessage retrievedWorking1   = this.getWorkingService().find(objectID1).getResult();
    assertEquals(objectID1, retrievedWorking1.getObjectId());
    assertEquals(MessageStatus.WORKING, retrievedWorking1.getStatus());

    //Message should be in incoming
    ConztanzResultList<SimpleSequencedIncomingMessage> resultIncoming = this.getIncomingService().find(objectID1);
//    TODO message
    assertEquals("",1,resultIncoming.size());
    SimpleSequencedIncomingMessage retrievedIncoming = resultIncoming.getResult().get(0);
    assertEquals(objectID1,retrievedIncoming.getObjectId());
    assertEquals(MessageStatus.WORKING,retrievedIncoming.getStatus());

    try
    {
    // Sending a message with the same objectID and sequence number
      this.getOrchestrator().startLifeCycle(message1);
    }
    catch (WORKINGContinuityException e)
    {
      assertTrue(e.getMessage().contains("A message with the same object ID: " + objectID1 + " is in WORKING state"));
    }

    // Message should be added to waiting
    ConztanzResultList<SimpleSequencedWaitingMessage> waitingMessageList = this.getWaitingService().find(objectID1);
    SimpleSequencedWaitingMessage retrievedWaiting = waitingMessageList.getResult().get(0);
    assertEquals(objectID1, retrievedWaiting.getObjectId());
    assertEquals(MessageStatus.WORKING, retrievedWorking1.getStatus());

    // We simulate AS response by updating Status in working table
    //TODO REMOVE ! !
    this.getWorkingService().updateStatus(retrievedWorking1.getId(),MessageStatus.OK);

    // We re-send the same message, but with a bigger sequence number
     byte[] message2 = Utils.getMessage(objectID1,sequenceNumber2);
     try
     {
        this.getOrchestrator().startLifeCycle(message2);
     }
     catch (ContinuityException | PersistenceException e)
     {
       fail();
     }

    //Message should be in working now
    retrievedWorking1  = this.getWorkingService().find(objectID1).getResult();
    assertEquals(MessageStatus.WORKING, retrievedWorking1.getStatus());

    //We update status to KO
    this.getWorkingService().updateStatus(retrievedWorking1.getId(),MessageStatus.KO);

    // resend the message, should fail due to KO
    try
    {
      this.getOrchestrator().startLifeCycle(message2);
    }
    catch (KOContinuityException e)
    {
      assertTrue(e.getMessage().contains("A message with the same object ID: " + objectID1 + " is in KO state"));
    }
  }

  @Test
  public void  ComplexTest() throws PersistenceException, IOException
  {
    String objectID1 = Utils.generateObjectId();
    String sequenceNumber1 = "1";
    byte[] message1  = Utils.getMessage(objectID1, sequenceNumber1 );

    //Sending a message
    try
    {
      this.getOrchestrator().startLifeCycle(message1);
    }
    catch (Exception e)
    {
      fail(e.getMessage());
    }

    // Message should be in working table
    SimpleSequencedWorkingMessage wm1 = this.getWorkingService().find(objectID1).getResult();
    assertNotNull(wm1);
    assertEquals(MessageStatus.WORKING,wm1.getStatus());

    // Message should be in incoming table
    List<SimpleSequencedIncomingMessage> incomingMessages  = this.getIncomingService().find(objectID1).getResult();
    assertEquals(incomingMessages.size(),1);
    SimpleSequencedIncomingMessage im1 = incomingMessages.get(0);
    assertNotNull(im1);
    assertEquals(MessageStatus.WORKING,im1.getStatus());

  }






}
