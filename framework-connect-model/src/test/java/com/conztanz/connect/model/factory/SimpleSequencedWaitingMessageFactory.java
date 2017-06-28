package com.conztanz.connect.model.factory;

import com.conztanz.connect.model.MessageStatus;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWaitingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;

/**
 * Created by User on 6/19/2017.
 */
public class SimpleSequencedWaitingMessageFactory extends AbstractIncomingMessageFactory<SimpleSequencedWaitingMessage>
{

  /**
   * @param payload
   * @return
   */
  @Override
  public SimpleSequencedWaitingMessage createMessage(byte[] payload)
  {
    return null;
  }
}
