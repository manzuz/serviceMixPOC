package com.conztanz.connect.services;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.persistence.IncomingMessageDao;
import com.conztanz.connect.persistence.SimpleSequencedIncomingMessageDao;
import com.conztanz.connect.persistence.SimpleSequencedWorkingMessageDao;
import com.conztanz.connect.persistence.WorkingMessageDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 6/28/2017.
 */

//TODO interface
public class SimpleIncomingMessageService extends AbstractIncomingMessageService<String,SimpleSequencedIncomingMessage>
{
  @Autowired
  private SimpleSequencedIncomingMessageDao dao ;
  @Override
  protected IncomingMessageDao<String, SimpleSequencedIncomingMessage> getDao()
  {
    return dao;
  }
}
