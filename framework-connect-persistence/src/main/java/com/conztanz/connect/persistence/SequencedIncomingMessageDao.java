package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.SequencedIncomingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.AbstractEntityDaoImpl;

/**
 *
 * @param <OBJECT_ID>
 * @param <ENTITY>
 */
public abstract class SequencedIncomingMessageDao<OBJECT_ID, ENTITY extends SequencedIncomingMessage<OBJECT_ID>>
        extends IncomingMessageDao<OBJECT_ID,ENTITY> implements ISequencedIncomingMessageDao<OBJECT_ID,ENTITY>
{
    /**
     * Constructor
     *
     * @param entityClass Entity class handled by the DAO
     */
    protected SequencedIncomingMessageDao(Class<ENTITY> entityClass)
    {
        super(entityClass);
    }

}
