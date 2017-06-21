package com.conztanz.persistence.connect;

import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage_;
import com.conztanz.connect.persistence.WorkingMessageDao;
import com.conztanz.exception.PersistenceException;
import com.conztanz.model.jpa.ConztanzField.ConztanzFieldSimple;

/**
 * Created by User on 6/15/2017.
 */
public class SimpleSequencedWorkingMessageDao extends WorkingMessageDao<String,SimpleSequencedWorkingMessage>
                                              implements ISimpleSequencedWorkingMessageDao
{
    protected SimpleSequencedWorkingMessageDao( )
    {
        super(SimpleSequencedWorkingMessage.class);
    }

    @Override
    public ConztanzFieldSimple buildObjectIdField()
    {
          return new ConztanzFieldSimple<>(SimpleSequencedWorkingMessage_.objectId);
    }


}
