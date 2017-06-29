package com.conztanz.connect.services;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.transport.ConztanzResultList;

/**
 * @param <OBJECT_ID>
 * @param <WAITING_MESSAGE>
 */
public interface IWaitingMessageService<OBJECT_ID,
        WAITING_MESSAGE extends IncomingMessage<OBJECT_ID>>
        extends IConnectService<WAITING_MESSAGE>
{
  /**
   * @param objectId
   * @return
   */
  ConztanzResultList<WAITING_MESSAGE> getWaitingMessage(OBJECT_ID objectId);


}
