package com.conztanz.connect.services;

import com.conztanz.connect.model.MessageStatus;
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
   * Used to simulate AS response to lifecycle thus updating working message status
   * Here only for testing purposes, to be removed once life cycle is 100% implemented
   * TODO DELETE !!!!!!!!!!!!!!!!!
   * @param id
   * @param status
   * @throws PersistenceException
   */
  void updateStatus(Long id, MessageStatus status) throws PersistenceException;


}
