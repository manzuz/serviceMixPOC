package com.conztanz.connect.model.factory;

import com.conztanz.connect.model.IncomingMessage;

public abstract class AbstractWaitingMessageFactory<INCOMING_MESSAGE extends IncomingMessage,
                                                    WAITING_MESSAGE extends IncomingMessage>
{


  /**
   * @param message
   * @return
   */
  public abstract WAITING_MESSAGE createMessage(INCOMING_MESSAGE message);

}
