package com.conztanz.connect.model;

import com.conztanz.model.AbstractEntity;

import javax.persistence.*;

/**
 * Created by User on 6/14/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
//TODO IS object ID automatically passed on to IncomingMessage ???
public abstract class WorkingMessage<OBJECT_ID,
                                     INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>>
        extends AbstractEntity
{

  @Transient
  private OBJECT_ID objectId;

  @Transient
  private MessageStatus status;

  @Transient
  private Long incomingMessageId;

  public WorkingMessage(OBJECT_ID objectId)
  {
    this.objectId = objectId;
  }

  public WorkingMessage(OBJECT_ID objectId, MessageStatus status)
  {
    this.objectId = objectId;
    this.status = status;
  }

  public WorkingMessage()
  {
    super();
  }

  @Access(AccessType.PROPERTY)
  @Enumerated(EnumType.STRING)
  @Column(name = "STATUS", nullable = false)
  public MessageStatus getStatus()
  {
    return status;
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

  public void workOn(INCOMING_MESSAGE incomingMessage)
  {
    this.setStatus(MessageStatus.WORKING);
    incomingMessage.setStatus(MessageStatus.WORKING);
    this.incomingMessageId = incomingMessage.getId();
  }

  public OBJECT_ID getObjectId()
  {
    return objectId;
  }

  public void setObjectId(OBJECT_ID objectId)
  {
    this.objectId = objectId;
  }


  public void setIncomingMessageId(Long incomingMessageId)
  {
    this.incomingMessageId = incomingMessageId;
  }

  protected void setStatus(MessageStatus status)
  {
    this.status = status;
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
