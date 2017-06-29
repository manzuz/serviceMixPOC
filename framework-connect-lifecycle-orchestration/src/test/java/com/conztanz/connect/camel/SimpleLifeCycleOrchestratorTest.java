package com.conztanz.connect.camel;

import com.conztanz.connect.exception.BlockedContinuityException;
import com.conztanz.connect.exception.SequenceContinuityException;
import com.conztanz.connect.exception.WORKINGContinuityException;
import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.model.MessageStatus;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWaitingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.services.SimpleIncomingMessageService;
import com.conztanz.connect.services.SimpleWaitingMessageService;
import com.conztanz.connect.services.SimpleWorkingMessageService;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResult;
import com.conztanz.transport.ConztanzResultList;
import com.conztanz.utils.StringUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

/**
 * Created by User on 6/26/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
@TransactionConfiguration(transactionManager = "ConztanzTransactionManager")
public class SimpleLifeCycleOrchestratorTest
{

  @Autowired
  private SimpleLifeCycleOrchestrator orchestrator;

  @Autowired
  private SimpleWorkingMessageService workingService;

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

    // Sending a new message
    String objectID1 = this.generateObjectId();
    byte[] message1 = this.getMessage(objectID1, "1");
    this.getOrchestrator().startLifeCycle(message1);

    //Message should be in working
    SimpleSequencedWorkingMessage retrievedWorking   = this.getWorkingService().find(objectID1).getResult();
    assertEquals(objectID1, retrievedWorking.getObjectId());
    assertEquals(MessageStatus.WORKING, retrievedWorking.getStatus());

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
    ConztanzResultList<SimpleSequencedWaitingMessage> waitingMessageList = this.getWaitingService().getWaitingMessage(objectID1);
    SimpleSequencedWaitingMessage retrievedWaiting = waitingMessageList.getResult().get(0);
    assertEquals(objectID1, retrievedWaiting.getObjectId());
    assertEquals(MessageStatus.WORKING, retrievedWorking.getStatus());

  }

  private byte[] getMessage(String objectID, String sequenceNum) throws IOException
  {
    InputStream is = this.getClass().getClassLoader().getResourceAsStream("./messages/Message_Template.xml");
    StringWriter writer = new StringWriter();
    IOUtils.copy(is, writer);
    String isAsString = writer.toString();
    isAsString = isAsString.replace("[OBJECT_ID]", objectID);
    isAsString = isAsString.replace("[SEQUENCE_NUMBER]", sequenceNum);
    return isAsString.getBytes();
  }

  private String generateObjectId()
  {
    return StringUtils.randomAlphaNumeric(10);
  }
}
