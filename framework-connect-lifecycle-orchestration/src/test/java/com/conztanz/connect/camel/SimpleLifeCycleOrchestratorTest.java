package com.conztanz.connect.camel;

import com.conztanz.connect.exception.BlockedContinuityException;
import com.conztanz.connect.exception.SequenceContinuityException;
import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.persistence.SimpleSequencedWorkingMessageDao;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import com.conztanz.exception.PersistenceException;
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

/**
 * Created by User on 6/26/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
@TransactionConfiguration(transactionManager = "ConztanzTransactionManager")
public class SimpleLifeCycleOrchestratorTest
{

  @Autowired
  private SimpleLifeCycleOrchestrator SimpleLifeCycleOrchestrator;

  @Autowired
  private  SimpleSequencedWorkingMessageDao simpleSequencedWorkingMessageDao;

  @Autowired
  public SimpleLifeCycleOrchestrator getSimpleLifeCycleOrchestrator()
  {
    return SimpleLifeCycleOrchestrator;
  }


  public SimpleSequencedWorkingMessageDao getSimpleSequencedWorkingMessageDao()
  {
    return simpleSequencedWorkingMessageDao;
  }

  @Test
//  @Transactional
  public void test() throws BlockedContinuityException, ConnectIdentificationException, SequenceContinuityException, ConnectTransformationException, IOException, PersistenceException
  {
    String objectID = this.generateObjectId();
    byte[] message1 = this.getMessage(objectID, "1");
    this.getSimpleLifeCycleOrchestrator().startLifeCycle(message1);
    this.getSimpleSequencedWorkingMessageDao().getOne(objectID);

//    try
//    {
//      this.getSimpleLifeCycleOrchestrator().startLifeCycle(message1);
//    }
//    catch (BlockedContinuityException e)
//    {
//
//    }

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
