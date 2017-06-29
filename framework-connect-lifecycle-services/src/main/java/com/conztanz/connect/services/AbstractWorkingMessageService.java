package com.conztanz.connect.services;

import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.connect.persistence.WorkingMessageDao;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResult;
import com.conztanz.transport.ConztanzResultList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @param <OBJECT_ID>
 * @param <WORKING_MESSAGE>
 */
public abstract class AbstractWorkingMessageService<  OBJECT_ID,
                                                      WORKING_MESSAGE extends WorkingMessage<OBJECT_ID,?>>
  extends AbstractConnectService<WORKING_MESSAGE>
  implements IWorkingMessageService<OBJECT_ID,WORKING_MESSAGE>

{

  /**
   * @param objectId
   * @return
   */
  @Override
  public ConztanzResult<WORKING_MESSAGE> find(OBJECT_ID objectId) throws PersistenceException
  {
    WORKING_MESSAGE workingMessage = this.getDao().getOne(objectId);
    return new ConztanzResult<>(workingMessage);
  }

  /**
   * @param workingMessage
   */
  @Override
  public void add(WORKING_MESSAGE workingMessage) throws PersistenceException
  {
    this.getDao().addToto(workingMessage);
  }

  protected abstract WorkingMessageDao<OBJECT_ID, WORKING_MESSAGE> getDao();


}