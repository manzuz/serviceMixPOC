package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.SequencedWorkingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 * Created by User on 6/20/2017.
 */
public interface ISequencedWorkingMessageDao<OBJECT_ID,
                                             WORKING_MESSAGE extends SequencedWorkingMessage<OBJECT_ID,?>>
        extends IWorkingMessageDao<OBJECT_ID, WORKING_MESSAGE >
{
}
