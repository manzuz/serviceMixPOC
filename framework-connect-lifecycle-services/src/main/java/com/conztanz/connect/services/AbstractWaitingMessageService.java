package com.conztanz.connect.services;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.persistence.WaitingMessageDao;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResultList;

import javax.validation.constraints.Null;
import javax.validation.constraints.Null.List;

/**
 * Created by User on 6/28/2017.
 */
public abstract class AbstractWaitingMessageService<OBJECT_ID,
                                                    WAITING_MESSAGE extends IncomingMessage<OBJECT_ID>>
        extends AbstractConnectService<WAITING_MESSAGE>
        implements IWaitingMessageService<OBJECT_ID, WAITING_MESSAGE>

{
  @Override
  public ConztanzResultList<WAITING_MESSAGE> find(OBJECT_ID objectId) throws PersistenceException
  {
    return  getDao().findList(objectId);
  }

  protected abstract WaitingMessageDao<OBJECT_ID, WAITING_MESSAGE> getDao();


}