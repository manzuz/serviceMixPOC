package com.conztanz.connect.services;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResultList;

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
  ConztanzResultList<INCOMING_MESSAGE> find(OBJECT_ID objectId) throws PersistenceException;
}
