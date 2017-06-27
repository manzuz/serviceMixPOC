package com.conztanz.connect.camel;

import com.conztanz.connect.continuity.ContinuityChecker;
import com.conztanz.connect.identification.SimpleConnectIdentifier;
import com.conztanz.connect.initialize.SimpleConnectInitializer;
import com.conztanz.connect.locking.AbstractConnectLocker;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.persistence.IWaitingMessageDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

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

  @Test
  public void test()
  {
    System.out.println(SimpleLifeCycleOrchestrator);
  }
}
