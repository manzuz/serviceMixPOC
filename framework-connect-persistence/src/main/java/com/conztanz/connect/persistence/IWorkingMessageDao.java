package com.conztanz.connect.persistence;

import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 * Created by User on 6/20/2017.
 */
public interface IWorkingMessageDao<OBJECT_ID, ENTITY extends WorkingMessage<OBJECT_ID>> extends IAbstractEntityDao<ENTITY>
{
    /**
     *
     * @param entity
     * @return
     */
    ENTITY addToto(ENTITY entity) throws PersistenceException;

    /**
     *
     * @param objectID
     * @return
     */
    ENTITY lock(OBJECT_ID objectID) throws PersistenceException,NotFoundException;
}
