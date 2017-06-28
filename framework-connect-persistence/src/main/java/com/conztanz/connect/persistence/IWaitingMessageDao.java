package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 * Created by User on 6/22/2017.
 */
//TODO : incoming message ????
public interface IWaitingMessageDao<OBJECT_ID,
                                    ENTITY extends IncomingMessage<OBJECT_ID>>
        extends IIncomingMessageDao<OBJECT_ID,ENTITY>
{
    /**
     *
     * @param entity
     * @return
     */
    ENTITY remove (ENTITY entity) throws PersistenceException;

  /**
   *
   * @param entity
   * @return
   */
}
