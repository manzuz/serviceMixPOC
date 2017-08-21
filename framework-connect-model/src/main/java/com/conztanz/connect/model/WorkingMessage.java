package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/14/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
//TODO IS object ID automatically passed on to IncomingMessage ???
public abstract class WorkingMessage<OBJECT_ID,
                                      INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>>
        extends AbstractMessage<OBJECT_ID>
{

  @Transient
  private Long incomingMessageId;

  public WorkingMessage()
  {
    super();
  }

  public WorkingMessage(OBJECT_ID objectId)
  {
    super.setObjectId(objectId);
  }

  public WorkingMessage(OBJECT_ID objectId, MessageStatus status)
  {
    super.setObjectId(objectId);
    super.setStatus(status);
  }

  public WorkingMessage(MessageStatus status)
  {
    super.setStatus(status);
  }

  /**
   * Getter of the identification of the incoming message on which this message is working.
   */
  @Access(AccessType.PROPERTY)
  @Column(name = "INCOMING_MESSAGE_ID", nullable = false, unique = false/*,insertable = false, updatable = false*/)
  public Long getIncomingMessageId()
  {
    return this.incomingMessageId;
  }

  public void  workOn(INCOMING_MESSAGE incomingMessage)
  {
    this.setStatus(MessageStatus.WORKING);
    incomingMessage.setStatus(MessageStatus.WORKING);
    this.setIncomingMessageId(incomingMessage.getId());
  }

  public void setIncomingMessageId(Long incomingMessageId)
  {
    this.incomingMessageId = incomingMessageId;
  }

  @Override
  protected boolean sameContentInternal(Object toBeCompared)
  {
    return false;
  }

  @Override
  protected boolean sameLinksInternal(Object toBeCompared)
  {
    return false;
  }
}
