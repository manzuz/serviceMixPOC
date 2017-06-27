package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.AbstractEntityDaoImpl;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 * Created by User on 6/22/2017.
 */

//TODO : incoming message ????
public abstract class WaitingMessageDao<OBJECT_ID,
                                        ENTITY extends IncomingMessage<OBJECT_ID>>
         extends AbstractEntityDaoImpl<ENTITY>
         implements IWaitingMessageDao<OBJECT_ID,ENTITY>
{

  /**
   * Constructor
   *
   * @param entityClass Entity class handled by the DAO
   */
  protected WaitingMessageDao(Class<ENTITY> entityClass)
  {
    super(entityClass);
  }

  /**
   * @param entity
   * @return
   */
  @Override
  public ENTITY remove(ENTITY entity) throws PersistenceException
  {
    return super.remove(entity);
  }

  /**
   * @param entity
   * @return
   */
  @Override
  public ENTITY add(ENTITY entity) throws PersistenceException
  {
    return super.add(entity);
  }
}
