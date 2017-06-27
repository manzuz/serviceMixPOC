package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 * Created by User on 6/20/2017.
 */
public interface IWorkingMessageDao<OBJECT_ID,
                                    WORKING_MESSAGE extends WorkingMessage<OBJECT_ID,?>>
        extends IAbstractEntityDao<WORKING_MESSAGE>
{
    /**
     *
     * @param entity
     * @return
     */
    WORKING_MESSAGE addToto(WORKING_MESSAGE entity) throws PersistenceException;

    /**
     *
     * @param objectID
     * @return
     */
    WORKING_MESSAGE lock(OBJECT_ID objectID) throws PersistenceException,NotFoundException;
}
