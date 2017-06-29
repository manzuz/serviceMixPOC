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
  public ConztanzResultList<WAITING_MESSAGE> getWaitingMessage(OBJECT_ID objectId)
  {
    ConztanzResultList<WAITING_MESSAGE> resultList = null;
    try
    {
      resultList = getDao().findList(objectId);
    } catch (PersistenceException e)
    {
      e.printStackTrace();
    }
    return resultList;
  }

  protected abstract WaitingMessageDao<OBJECT_ID, WAITING_MESSAGE> getDao();


}