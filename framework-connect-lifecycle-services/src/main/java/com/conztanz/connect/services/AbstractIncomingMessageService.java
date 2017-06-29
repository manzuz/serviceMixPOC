package com.conztanz.connect.services;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.persistence.IncomingMessageDao;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResultList;

/**
 * Created by User on 6/28/2017.
 */
public abstract class AbstractIncomingMessageService<OBJECT_ID,
                                                     INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>>
  extends AbstractConnectService<INCOMING_MESSAGE>
  implements IIncomingMessageService<OBJECT_ID,INCOMING_MESSAGE>

{
  /**
   *
   * @param objectId
   * @return
   * @throws PersistenceException
   */
  @Override
  public ConztanzResultList<INCOMING_MESSAGE> find(OBJECT_ID objectId) throws PersistenceException
  {
    return this.getDao().findList(objectId);
  }

  /**
   *
   * @return
   */
  protected abstract IncomingMessageDao<OBJECT_ID,INCOMING_MESSAGE> getDao();


}