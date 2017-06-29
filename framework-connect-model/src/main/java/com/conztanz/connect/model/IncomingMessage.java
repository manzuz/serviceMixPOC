package com.conztanz.connect.model;

import javax.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class IncomingMessage<OBJECT_ID> extends AbstractMessage<OBJECT_ID>
{
  @Transient
  private byte[] rawPayload;

  @Transient
  private String transformedPayload;

  public IncomingMessage()
  {
    super();
  }

  public IncomingMessage(byte[] rawPayload)
  {
    super();
    this.setRawPayload(rawPayload);
  }

  public IncomingMessage(IncomingMessage<OBJECT_ID> incomingMessage)
  {
    super(incomingMessage);
    this.setRawPayload(incomingMessage.getRawPayload());
    this.setTransformedPayload(incomingMessage.getTransformedPayload());
  }

  public IncomingMessage(byte[] rawPayload, MessageStatus status)
  {
    this.setRawPayload(rawPayload);
    super.setStatus(status);
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

  public void setRawPayload(byte[] rawPayload)
  {
    this.rawPayload = rawPayload;
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

  @Override
  protected boolean sameLinksInternal(Object toBeCompared)
  {
    return false;
  }


}
