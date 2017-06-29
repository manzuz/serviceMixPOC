package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/21/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class SequencedIncomingMessage<OBJECT_ID> extends IncomingMessage<OBJECT_ID>
{

  @Transient
  private int sequenceNumber;


  public SequencedIncomingMessage()
  {
    super();
  }

  public SequencedIncomingMessage(byte[] rawPayload)
  {
    super(rawPayload);
  }

  public SequencedIncomingMessage(SequencedIncomingMessage<OBJECT_ID> sequencedIncomingMessage)
  {
    super(sequencedIncomingMessage);
    this.setSequenceNumber(sequencedIncomingMessage.getSequenceNumber());
  }

  public SequencedIncomingMessage(byte[] rawPayload, MessageStatus status)
  {
    super(rawPayload, status);
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
