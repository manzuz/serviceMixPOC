package com.conztanz.connect.persistence;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage_;
import com.conztanz.model.jpa.ConztanzField.ConztanzFieldSimple;

/**
 * Created by User on 6/22/2017.
 */
public class SimpleSequencedIncomingMessageDao extends SequencedIncomingMessageDao<String, SimpleSequencedIncomingMessage>
        implements ISimpleSequencedIncomingMessageDao

{
    /**
     * Constructor
     *
     * @param simpleSequencedIncomingMessageClass Entity class handled by the DAO
     */
    protected SimpleSequencedIncomingMessageDao(Class<SimpleSequencedIncomingMessage> simpleSequencedIncomingMessageClass)
    {
        super(simpleSequencedIncomingMessageClass);
    }

  /**
   * @return
   */
  @Override
  public ConztanzFieldSimple buildObjectIdField()
  {
    return new ConztanzFieldSimple<>(SimpleSequencedWorkingMessage_.objectId);
  }

  /**
     *
     */
    public SimpleSequencedIncomingMessageDao()
    {
        super(SimpleSequencedIncomingMessage.class);
    }


}
