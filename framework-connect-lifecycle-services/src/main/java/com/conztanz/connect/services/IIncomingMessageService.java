package com.conztanz.connect.services;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResultSet;

/**
 *
 * @param <OBJECT_ID>
 * @param <INCOMING_MESSAGE>
 */
public interface IIncomingMessageService<OBJECT_ID,
                                         INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>>
        extends IConnectService<INCOMING_MESSAGE>
{
  /**
   *
   * @param objectId
   * @return
   */
  ConztanzResultSet<INCOMING_MESSAGE> getIncomingMessage(OBJECT_ID objectId) throws PersistenceException;
}
