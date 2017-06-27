package com.conztanz.connect.persistence;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;

/**
 * Created by User on 6/26/2017.
 */
public class SimpleSequencedWaitingMessageDao extends WaitingMessageDao<String,SimpleSequencedIncomingMessage>
        implements IWaitingMessageDao<String,SimpleSequencedIncomingMessage>

{
  /**
   * Constructor
   *
   * @param simpleSequencedIncomingMessageDaoClass Entity class handled by the DAO
   */
  protected SimpleSequencedWaitingMessageDao(Class<SimpleSequencedIncomingMessageDao> simpleSequencedIncomingMessageDaoClass)
  {
    super(SimpleSequencedIncomingMessage.class);
  }
}
