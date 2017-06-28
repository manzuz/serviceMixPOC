package com.conztanz.connect.services;

import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.persistence.SimpleSequencedWorkingMessageDao;
import com.conztanz.connect.persistence.WorkingMessageDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 6/28/2017.
 */
public class SimpleWorkingMessageService extends AbstractWorkingMessageService<String,SimpleSequencedWorkingMessage>
{
  @Autowired
  private SimpleSequencedWorkingMessageDao dao ;
  @Override
  protected WorkingMessageDao<String, SimpleSequencedWorkingMessage> getDao()
  {
    return dao;
  }
}
