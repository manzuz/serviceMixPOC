package com.conztanz.connect.persistence;

import com.conztanz.connect.model.SimpleSequencedWaitingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage_;
import com.conztanz.model.jpa.ConztanzField.ConztanzFieldSimple;

/**
 * Created by User on 6/26/2017.
 */
public class SimpleSequencedWaitingMessageDao extends WaitingMessageDao<String,SimpleSequencedWaitingMessage>
        implements IWaitingMessageDao<String,SimpleSequencedWaitingMessage>

{
  /**
   *
   */
  protected SimpleSequencedWaitingMessageDao()
  {
    super(SimpleSequencedWaitingMessage.class);
  }

  @Override
  public ConztanzFieldSimple buildObjectIdField()
  {
    return new ConztanzFieldSimple<>(SimpleSequencedWorkingMessage_.objectId);
  }
}
