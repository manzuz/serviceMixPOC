package com.conztanz.connect.model.factory;

import com.conztanz.connect.model.*;

/**
 * Created by User on 6/19/2017.
 */
public class SimpleSequencedWaitingMessageFactory extends AbstractWaitingMessageFactory<SimpleSequencedIncomingMessage,SimpleSequencedWaitingMessage>
{




  /**
   * @param message
   * @return
   */
  @Override
  public SimpleSequencedWaitingMessage createMessage(SimpleSequencedIncomingMessage message)
  {
    return new SimpleSequencedWaitingMessage(message);
  }
}
