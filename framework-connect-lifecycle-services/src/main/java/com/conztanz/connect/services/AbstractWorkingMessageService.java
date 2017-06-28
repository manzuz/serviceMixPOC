package com.conztanz.connect.services;

import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.connect.persistence.WorkingMessageDao;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResultSet;

import java.util.HashSet;
import java.util.Set;

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

  @Override
  public  ConztanzResultSet<WORKING_MESSAGE> getWorkingMessage(OBJECT_ID objectId)
  {
    Set<WORKING_MESSAGE> result =  new HashSet<>();
    try
    {
      WORKING_MESSAGE workingMessage  = this.getDao().getOne(objectId);
      result.add(workingMessage);
    } catch (PersistenceException e)
    {
      e.printStackTrace();
    }
    return new ConztanzResultSet<>(result);
  }


  protected abstract WorkingMessageDao<OBJECT_ID,WORKING_MESSAGE> getDao();


}