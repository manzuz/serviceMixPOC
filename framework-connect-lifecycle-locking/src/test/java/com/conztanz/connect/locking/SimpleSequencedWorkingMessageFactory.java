package com.conztanz.connect.locking;

import com.conztanz.connect.model.SimpleSequencedWorkingMessage;

/**
 * Created by User on 6/19/2017.
 */
public class SimpleSequencedWorkingMessageFactory extends AbstractWorkingMessageFactory<String,SimpleSequencedWorkingMessage>
{
    @Override
    public SimpleSequencedWorkingMessage create(String objectID)
    {
        return new SimpleSequencedWorkingMessage(objectID);
    }
}
