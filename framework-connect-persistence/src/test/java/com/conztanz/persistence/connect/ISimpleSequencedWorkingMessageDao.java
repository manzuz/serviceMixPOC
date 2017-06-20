package com.conztanz.persistence.connect;

import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.persistence.IWorkingMessageDao;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.model.test.SimpleEntity;
import com.conztanz.persistence.IAbstractEntityDao;
import com.conztanz.transport.ConztanzResultList;

/**
 * Created by User on 6/15/2017.
 */
public interface ISimpleSequencedWorkingMessageDao extends IWorkingMessageDao<String, SimpleSequencedWorkingMessage>
{
}
