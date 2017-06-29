package com.conztanz.connect.model;

import com.conztanz.exception.ConztanzException;
import com.conztanz.model.AbstractEntity;

import javax.persistence.*;

/**
 * @param <OBJECT_ID>
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractMessage<OBJECT_ID> extends AbstractEntity
{
  @Transient
  private OBJECT_ID objectId;

  @Transient
  private MessageStatus status;

  public AbstractMessage()
  {
  }

  public AbstractMessage(AbstractMessage<OBJECT_ID> message)
  {
    this.setObjectId(message.getObjectId());
    this.setStatus(message.getStatus());
  }

  @Access(AccessType.PROPERTY)
  @Enumerated(EnumType.STRING)
  @Column(name = "STATUS", nullable = false)
  public MessageStatus getStatus()
  {
    return status;
  }

  public OBJECT_ID getObjectId()
  {
    return objectId;
  }

  public void setStatus(MessageStatus status)
  {
    this.status = status;
  }

  public void setObjectId(OBJECT_ID objectId)
  {
    this.objectId = objectId;
  }

  //TODO exception type
  public void reject(ConztanzException e)
  {
    this.setStatus(MessageStatus.REJECTED);
  }



}
