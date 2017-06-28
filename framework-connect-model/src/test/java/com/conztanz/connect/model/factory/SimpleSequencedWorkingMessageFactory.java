package com.conztanz.connect.model.factory;

import com.conztanz.connect.model.MessageStatus;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;

/**
 * Created by User on 6/19/2017.
 */
public class SimpleSequencedWorkingMessageFactory extends AbstractWorkingMessageFactory<String,SimpleSequencedIncomingMessage,SimpleSequencedWorkingMessage>
{
    @Override
    public SimpleSequencedWorkingMessage create(String objectID)
    {
        return new SimpleSequencedWorkingMessage(objectID, MessageStatus.NEW);
    }
}
