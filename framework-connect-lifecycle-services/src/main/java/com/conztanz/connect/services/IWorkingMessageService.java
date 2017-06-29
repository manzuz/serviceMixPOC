package com.conztanz.connect.services;

import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResult;

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
  ConztanzResult<WORKING_MESSAGE> find(OBJECT_ID objectId) throws PersistenceException;

  /**
   *
   * @param workingMessage
   */
  void add(WORKING_MESSAGE workingMessage) throws PersistenceException;

}
