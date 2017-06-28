package com.conztanz.connect.persistence;

import com.conztanz.connect.model.SimpleSequencedWaitingMessage;

/**
 * Created by User on 6/26/2017.
 */
public class SimpleSequencedWaitingMessageDao extends WaitingMessageDao<String,SimpleSequencedWaitingMessage>
        implements IWaitingMessageDao<String,SimpleSequencedWaitingMessage>

{
  /**
   *
   */
  protected SimpleSequencedWaitingMessageDao()
  {
    super(SimpleSequencedWaitingMessage.class);
  }
}
