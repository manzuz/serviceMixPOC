package com.conztanz.connect.model;

import com.conztanz.model.AbstractEntity;

import javax.persistence.*;

/**
 * Created by User on 6/14/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class WorkingMessage<OBJECT_ID> extends AbstractEntity
{

    @Transient
    private OBJECT_ID objectId;

    @Transient
    private MessageStatus status;

    public WorkingMessage(OBJECT_ID objectId)
    {
        this.objectId = objectId;
    }

    public WorkingMessage(OBJECT_ID objectId,MessageStatus status)
    {
        this.objectId = objectId;
        this.status=status;
    }
    public WorkingMessage( )
    {
        super();
    }

    public OBJECT_ID getObjectId()
    {
        return objectId;
    }

    public void setObjectId(OBJECT_ID objectId)
    {
        this.objectId = objectId;
    }



    @Access(AccessType.PROPERTY)
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    public MessageStatus getStatus()
    {
        return status;
    }

    public void setStatus(MessageStatus status)
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
