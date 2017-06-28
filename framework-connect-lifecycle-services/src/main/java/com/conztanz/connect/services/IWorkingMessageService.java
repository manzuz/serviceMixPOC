package com.conztanz.connect.services;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.transport.ConztanzResultList;
import com.conztanz.transport.ConztanzResultSet;

/**
 *
 * @param <OBJECT_ID>
 * @param <WORKING_MESSAGE>
 */
public interface IWorkingMessageService<OBJECT_ID,
                                        WORKING_MESSAGE extends WorkingMessage<OBJECT_ID,?>>
        extends IConnectService<WORKING_MESSAGE>
{
  /**
   *
   * @param objectId
   * @return
   */
  ConztanzResultList<WORKING_MESSAGE> getWorkingMessage(OBJECT_ID objectId);

  void AddWorkingMessage(WORKING_MESSAGE workingMessage);

}
