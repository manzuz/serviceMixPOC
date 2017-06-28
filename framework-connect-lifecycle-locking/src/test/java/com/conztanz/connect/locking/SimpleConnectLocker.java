package com.conztanz.connect.locking;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.model.factory.SimpleSequencedWorkingMessageFactory;
import com.conztanz.connect.persistence.SimpleSequencedWorkingMessageDao;
import com.conztanz.exception.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class SimpleConnectLocker extends AbstractConnectLocker<String,SimpleSequencedIncomingMessage,
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
  public SimpleSequencedWorkingMessage lock(String objectId) throws PersistenceException
  {
    return super.lockBySelectFirst(objectId);
  }

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
