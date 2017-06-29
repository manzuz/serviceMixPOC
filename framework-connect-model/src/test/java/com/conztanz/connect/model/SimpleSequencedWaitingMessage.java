package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/22/2017.
 */
@Entity(name = "SIMPLE_SEQUENCED_WAITING_MESSAGE")
@SequenceGenerator(name = "SEQ_ID", sequenceName = "SIMPLE_SEQUENCED_WAITING_MESSAGE_ID_SEQ")
@Access(AccessType.FIELD)
public class SimpleSequencedWaitingMessage extends SequencedIncomingMessage<String>
{
  public SimpleSequencedWaitingMessage(byte[] rawPayload, int sequenceNumber)
  {
    super(rawPayload, sequenceNumber);
  }
  public SimpleSequencedWaitingMessage()
  {
    super( );
  }
  public SimpleSequencedWaitingMessage(SimpleSequencedIncomingMessage simpleSequencedIncomingMessage)
  {
    super(simpleSequencedIncomingMessage);
  }

  public SimpleSequencedWaitingMessage(String objectId, byte[] rawPayload, int sequenceNumber)
  {
    super(objectId, rawPayload, sequenceNumber);
  }

  @Override
  @Column(name = "OBJECT_ID", nullable = false, unique = false)
  @Access(AccessType.PROPERTY)
  public String getObjectId()
  {
    return super.getObjectId();
  }
}
