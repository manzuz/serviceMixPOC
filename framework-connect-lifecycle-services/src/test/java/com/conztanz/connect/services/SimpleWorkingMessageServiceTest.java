package com.conztanz.connect.services;

import com.conztanz.connect.model.MessageStatus;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.transport.ConztanzResultList;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.List;
import java.util.Set;

/**
 * Created by User on 6/28/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
@TransactionConfiguration(transactionManager = "ConztanzTransactionManager")
public class SimpleWorkingMessageServiceTest
{
  @Autowired
  private SimpleWorkingMessageService simpleWorkingMessageService;




  @Test
  public void test()
  {
    String objectId = "12345";
    SimpleSequencedWorkingMessage msg = new SimpleSequencedWorkingMessage(objectId,42, MessageStatus.WORKING);
    simpleWorkingMessageService.AddWorkingMessage(msg);
    ConztanzResultList<SimpleSequencedWorkingMessage> result  = simpleWorkingMessageService.getWorkingMessage(objectId);
    List<SimpleSequencedWorkingMessage> resultSet = result.getResult();
    assert (resultSet .size() >  1);
    SimpleSequencedWorkingMessage retrieved  = resultSet.get(0);
    assertEquals(retrieved.getStatus(),MessageStatus.KO);
    assertEquals(retrieved.getObjectId(),objectId);


  }
}


