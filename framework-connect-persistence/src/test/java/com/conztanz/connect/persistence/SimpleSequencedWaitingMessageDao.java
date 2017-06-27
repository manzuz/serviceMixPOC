package com.conztanz.connect.persistence;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;

/**
 * Created by User on 6/26/2017.
 */
public class SimpleSequencedWaitingMessageDao extends WaitingMessageDao<String,SimpleSequencedIncomingMessage>
        implements IWaitingMessageDao<String,SimpleSequencedIncomingMessage>

{
  /**
   *
   */
  protected SimpleSequencedWaitingMessageDao()
  {
    super(SimpleSequencedIncomingMessage.class);
  }
}
