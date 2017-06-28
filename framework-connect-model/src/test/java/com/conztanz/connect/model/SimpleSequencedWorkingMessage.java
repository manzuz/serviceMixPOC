package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/14/2017.
 */
@Entity(name = "SIMPLE_SEQUENCED_WORKING_MESSAGE")
@SequenceGenerator(name = "SEQ_ID", sequenceName = "SIMPLE_SEQUENCED_WORKING_MESSAGE_ID_SEQ")
@Access(AccessType.FIELD)
public class SimpleSequencedWorkingMessage extends SequencedWorkingMessage<String,SimpleSequencedIncomingMessage>
{
  public SimpleSequencedWorkingMessage()
  {
    super();
  }
  public SimpleSequencedWorkingMessage(String objectID)
  {
    super(objectID);
  }

  @Override
  @Column(name = "OBJECT_ID", nullable = false, unique = true)
  @Access(AccessType.PROPERTY)
  public String getObjectId()
  {
    return super.getObjectId();
  }
  public SimpleSequencedWorkingMessage(String objectID, int sequenceNumber)
  {
    super(objectID, sequenceNumber);
  }

  public SimpleSequencedWorkingMessage(String objectID, int sequenceNumber, MessageStatus status)
  {
    super(objectID, sequenceNumber, status);
  }

  public SimpleSequencedWorkingMessage(String objectID, MessageStatus status)
  {
    super(objectID, status);
  }


}
