package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.model.AbstractEntity;
import com.conztanz.persistence.AbstractEntityDaoImpl;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 *
 * @param <OBJECT_ID>
 * @param <ENTITY>
 */
public abstract class IncomingMessageDao<OBJECT_ID,
                                         ENTITY extends IncomingMessage<OBJECT_ID>>
        extends    AbstractEntityDaoImpl<ENTITY>
        implements IIncomingMessageDao<OBJECT_ID,ENTITY>
{
    /**
     * Constructor
     *
     * @param entityClass Entity class handled by the DAO
     */
    protected IncomingMessageDao(Class<ENTITY> entityClass)
    {
        super(entityClass);
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
