package com.conztanz.connect.model;

import com.conztanz.model.AbstractEntity;

import javax.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class IncomingMessage<OBJECT_ID> extends AbstractEntity
{


    @Transient private byte[] rawPayload;

    @Transient private OBJECT_ID objectId;

    @Transient private String transformedPayload;


    public IncomingMessage(byte[] rawPayload)
    {
        this.rawPayload = rawPayload;
    }
    public IncomingMessage(OBJECT_ID objectId , byte[] rawPayload)
    {
        this.rawPayload = rawPayload;
        this.objectId  =objectId;
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "TRANSFORMED_PAYLOAD", nullable = false)
    public String getTransformedPayload()
    {
        return transformedPayload;
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "RAW_PAYLOAD", nullable = false)
    public byte[] getRawPayload()
    {
        return rawPayload;
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
