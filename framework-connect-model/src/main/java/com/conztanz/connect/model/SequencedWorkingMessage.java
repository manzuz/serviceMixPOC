package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/14/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class SequencedWorkingMessage<OBJECT_ID,
                                              INCOMING_MESSAGE extends SequencedIncomingMessage<OBJECT_ID>>
        extends WorkingMessage<OBJECT_ID,INCOMING_MESSAGE>
{
  @Transient
  private int sequenceNumber;

  public SequencedWorkingMessage()
  {
    super();
  }

  public SequencedWorkingMessage(OBJECT_ID object_id)
  {
    super(object_id);
  }

  public SequencedWorkingMessage(OBJECT_ID object_id, int sequenceNumber)
  {
    super(object_id);
    this.sequenceNumber = sequenceNumber;
  }

  public SequencedWorkingMessage(OBJECT_ID objectId, int sequenceNumber, MessageStatus status)
  {
    super(objectId, status);
    this.sequenceNumber = sequenceNumber;
  }

  public SequencedWorkingMessage(OBJECT_ID objectId, MessageStatus status)
  {
    super(objectId, status);
  }

  @Access(AccessType.PROPERTY)
  @Column(name = "SEQUENCE_NUMBER", nullable = false, unique = false)
  public int getSequenceNumber()
  {
    return sequenceNumber;
  }

  public void setSequenceNumber(int sequenceNumber)
  {
    this.sequenceNumber = sequenceNumber;
  }


}
