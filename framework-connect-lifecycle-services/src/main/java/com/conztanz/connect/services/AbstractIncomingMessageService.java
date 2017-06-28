package com.conztanz.connect.services;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.persistence.IncomingMessageDao;
import com.conztanz.transport.ConztanzResultSet;

/**
 * Created by User on 6/28/2017.
 */
public abstract class AbstractIncomingMessageService<OBJECT_ID,
                                             INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>>
  extends AbstractConnectService<INCOMING_MESSAGE>
  implements IIncomingMessageService<OBJECT_ID,INCOMING_MESSAGE>

{
  @Override
  public ConztanzResultSet<INCOMING_MESSAGE> getIncomingMessage(OBJECT_ID objectId)
  {
    return null;
  }

  protected abstract IncomingMessageDao<OBJECT_ID,INCOMING_MESSAGE> getDao();


}