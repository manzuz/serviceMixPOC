package com.conztanz.connect.camel;

import com.conztanz.connect.exception.BlockedContinuityException;
import com.conztanz.connect.exception.SequenceContinuityException;
import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import com.conztanz.exception.PersistenceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

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

  public SimpleLifeCycleOrchestrator getSimpleLifeCycleOrchestrator()
  {
    return SimpleLifeCycleOrchestrator;
  }

  @Test
  @Transactional
  public void test() throws BlockedContinuityException, ConnectIdentificationException, PersistenceException, SequenceContinuityException, ConnectTransformationException
  {
    this.getSimpleLifeCycleOrchestrator().startLifeCycle(new byte[10]);
  }
}
