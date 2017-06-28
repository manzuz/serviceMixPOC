package com.conztanz.connect.model.factory;

import com.conztanz.connect.model.MessageStatus;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;

/**
 * Created by User on 6/26/2017.
 */
public class SimpleIncomingMessageFactory extends AbstractIncomingMessageFactory<SimpleSequencedIncomingMessage>
{
  /**
   * @param payload
   * @return
   */
  @Override
  public SimpleSequencedIncomingMessage createMessage(byte[] payload)
  {
    //TODO revoir
    return new SimpleSequencedIncomingMessage(payload, MessageStatus.NEW);
  }
}
