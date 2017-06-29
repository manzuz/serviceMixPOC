package com.conztanz.connect.services;

import com.conztanz.connect.model.SimpleSequencedWaitingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.persistence.SimpleSequencedWaitingMessageDao;
import com.conztanz.connect.persistence.WaitingMessageDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 6/28/2017.
 */
public class SimpleWaitingMessageService extends AbstractWaitingMessageService<String,SimpleSequencedWaitingMessage>
{
  @Autowired
  private SimpleSequencedWaitingMessageDao dao ;
  @Override
  protected WaitingMessageDao<String, SimpleSequencedWaitingMessage> getDao()
  {
    return dao;
  }
}
