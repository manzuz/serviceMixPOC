package com.conztanz.connect.locking;

import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.persistence.connect.SimpleSequencedWorkingMessageDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class SimpleConnectLocker extends AbstractConnectLocker<String,
                                                               SimpleSequencedWorkingMessage,
                                                               SimpleSequencedWorkingMessageDao,
                                                               SimpleSequencedWorkingMessageFactory>
{
    /**
     *
     */
    @Autowired
    private SimpleSequencedWorkingMessageDao simpleSequencedWorkingMessageDao;

    @Autowired
    private SimpleSequencedWorkingMessageFactory simpleSequencedWorkingMessageFactory;

    @Override
    public SimpleSequencedWorkingMessageDao getDAO()
    {
        return simpleSequencedWorkingMessageDao;
    }
    @Override
    public SimpleSequencedWorkingMessageFactory getWorkingMessageFactory()
    {
        return simpleSequencedWorkingMessageFactory;
    }

}
