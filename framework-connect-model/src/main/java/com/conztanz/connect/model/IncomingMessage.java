package com.conztanz.connect.model;

import com.conztanz.exception.ConztanzException;
import com.conztanz.model.AbstractEntity;

import javax.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class IncomingMessage<OBJECT_ID> extends AbstractEntity
{


  @Transient
  private byte[] rawPayload;

  @Transient
  private OBJECT_ID objectId;

  @Transient
  private String transformedPayload;

  @Transient
  private MessageStatus status;


  public IncomingMessage(byte[] rawPayload)
  {
    this.rawPayload = rawPayload;
  }
  public IncomingMessage(byte[] rawPayload , MessageStatus status)
  {
    this.rawPayload = rawPayload;
    this.status=status;
  }
  public IncomingMessage(OBJECT_ID objectId, byte[] rawPayload)
  {
    this.rawPayload = rawPayload;
    this.objectId = objectId;
  }
  @Access(AccessType.PROPERTY)
  @Column(name = "RAW_PAYLOAD", nullable = false)
  public byte[] getRawPayload()
  {
    return rawPayload;
  }

  @Access(AccessType.PROPERTY)
  @Column(name = "TRANSFORMED_PAYLOAD", nullable = false)
  public String getTransformedPayload()
  {
    return transformedPayload;
  }

  @Access(AccessType.PROPERTY)
  @Enumerated(EnumType.STRING)
  @Column(name = "STATUS", nullable = false)
  public MessageStatus getStatus()
  {
    return status;
  }

  protected void setStatus(MessageStatus status)
  {
    this.status = status;
  }

  public void setTransformedPayload(String transformedPayload)
  {
    this.transformedPayload = transformedPayload;
  }

  @Override
  protected boolean sameContentInternal(Object toBeCompared)
  {
    return false;
  }
  //TODO exception type
  public void reject(ConztanzException e)
  {
    this.setStatus(MessageStatus.REJECTED);
  }

  @Override
  protected boolean sameLinksInternal(Object toBeCompared)
  {
    return false;
  }

  public OBJECT_ID getObjectId()
  {
    return objectId;
  }

  public void setObjectId(OBJECT_ID objectId)
  {
    this.objectId = objectId;
  }

  public void setRawPayload(byte[] rawPayload)
  {
    this.rawPayload = rawPayload;
  }


}
