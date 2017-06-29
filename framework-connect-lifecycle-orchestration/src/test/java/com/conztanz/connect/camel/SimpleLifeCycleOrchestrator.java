package com.conztanz.connect.camel;

import com.conztanz.connect.continuity.ContinuityChecker;
import com.conztanz.connect.continuity.SimpleIncreasingSequenceContinuityChecker;
import com.conztanz.connect.identification.SimpleConnectIdentifier;
import com.conztanz.connect.initialize.SimpleConnectInitializer;
import com.conztanz.connect.locking.AbstractConnectLocker;
import com.conztanz.connect.locking.SimpleConnectLocker;
import com.conztanz.connect.model.SequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWaitingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.model.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.model.factory.AbstractWaitingMessageFactory;
import com.conztanz.connect.model.factory.SimpleSequencedWaitingMessageFactory;
import com.conztanz.connect.persistence.IIncomingMessageDao;
import com.conztanz.connect.persistence.IWaitingMessageDao;
import com.conztanz.connect.persistence.SimpleSequencedIncomingMessageDao;
import com.conztanz.connect.persistence.SimpleSequencedWaitingMessageDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 6/26/2017.
 */
public class SimpleLifeCycleOrchestrator extends AbstractLifeCycleOrchestrator<String,
        SimpleSequencedWaitingMessage,
        SimpleSequencedIncomingMessage,
        SimpleSequencedWorkingMessage,
        SimpleConnectInitializer,
        SimpleConnectIdentifier>
{
  @Autowired
  private SimpleConnectInitializer simpleConnectInitializer;

  @Autowired
  private SimpleConnectIdentifier simpleConnectIdentifier;

  @Autowired
  private SimpleConnectLocker simpleConnectLocker;

  @Autowired
  private SimpleIncreasingSequenceContinuityChecker simpleIncreasingSequenceContinuityChecker;

  @Autowired
  private SimpleSequencedWaitingMessageDao simpleSequencedWaitingMessageDao;

  @Autowired
  private SimpleSequencedIncomingMessageDao incomingMessageDao;

  @Autowired
  private SimpleSequencedWaitingMessageFactory simpleSequencedWaitingMessageFactory;



  /**
   * @return
   */
  @Override
  public SimpleConnectInitializer getInitializer()
  {
    return simpleConnectInitializer;
  }

  /**
   * @return
   */
  @Override
  public SimpleConnectIdentifier getIdentifier()
  {
    return simpleConnectIdentifier;
  }

  /**
   * @return
   */
  @Override
  public AbstractConnectLocker<String, SimpleSequencedIncomingMessage, SimpleSequencedWorkingMessage, ?, ?> getLocker()
  {
    return simpleConnectLocker;
  }


  /**
   * @return
   */
  @Override
  public ContinuityChecker<String, SimpleSequencedIncomingMessage, SimpleSequencedWorkingMessage> getContinuityChecker()
  {
    return simpleIncreasingSequenceContinuityChecker;
  }

  /**
   * @return
   */
  @Override
  public IWaitingMessageDao<String, SimpleSequencedWaitingMessage> getWaitingMessageDao()
  {
    return simpleSequencedWaitingMessageDao;
  }

  /**
   * @return
   */
  @Override
  public IIncomingMessageDao<String, SimpleSequencedIncomingMessage> getIncomingMessageDao()
  {
    return incomingMessageDao;
  }

  /**
   * @return
   */
  @Override
  protected AbstractWaitingMessageFactory<SimpleSequencedIncomingMessage, SimpleSequencedWaitingMessage> getWaitingMessageFactory()
  {
    return simpleSequencedWaitingMessageFactory;
  }


}
