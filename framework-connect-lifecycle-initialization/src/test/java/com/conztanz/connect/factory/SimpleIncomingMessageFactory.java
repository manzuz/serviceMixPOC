package com.conztanz.connect.factory;

import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.factory.AbstractEntityFactory;

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
    return new SimpleSequencedIncomingMessage(payload,-1);
  }
}
