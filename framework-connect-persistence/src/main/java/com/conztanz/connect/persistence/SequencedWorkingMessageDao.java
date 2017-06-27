package com.conztanz.connect.persistence;

import com.conztanz.connect.model.SequencedWorkingMessage;
import com.conztanz.connect.model.WorkingMessage;

/**
 * Created by User on 6/21/2017.
 */
public abstract class SequencedWorkingMessageDao<OBJECT_ID,
                                                 SEQUENCED_WORKING_MESSAGE extends SequencedWorkingMessage<OBJECT_ID,?>>
    extends WorkingMessageDao<OBJECT_ID, SEQUENCED_WORKING_MESSAGE>
        implements ISequencedWorkingMessageDao<OBJECT_ID, SEQUENCED_WORKING_MESSAGE>
{
    protected SequencedWorkingMessageDao(Class<SEQUENCED_WORKING_MESSAGE> entityClass)
    {
        super(entityClass);
    }
}
