package com.conztanz.connect.persistence;

import com.conztanz.connect.model.SequencedWorkingMessage;
import com.conztanz.connect.model.WorkingMessage;

/**
 * Created by User on 6/21/2017.
 */
public abstract class SequencedWorkingMessageDao<OBJECT_ID, ENTITY extends SequencedWorkingMessage<OBJECT_ID>>
    extends WorkingMessageDao<OBJECT_ID, ENTITY> implements ISequencedWorkingMessageDao<OBJECT_ID, ENTITY>
{
    protected SequencedWorkingMessageDao(Class<ENTITY> entityClass)
    {
        super(entityClass);
    }
}
