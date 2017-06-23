package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 *
 * @param <OBJECT_ID>
 * @param <ENTITY>
 */
public interface IIncomingMessageDao<OBJECT_ID,
                                     ENTITY extends IncomingMessage<OBJECT_ID>>
        extends IAbstractEntityDao<ENTITY>
{

    /**
     *
     * @param entity
     * @return
     */
    ENTITY add (ENTITY entity) throws PersistenceException;
}
