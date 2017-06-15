package com.conztanz.connect.model;

import com.conztanz.model.AbstractEntity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 * Created by User on 6/14/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class WorkingMessage<OBJECT_ID> extends AbstractEntity
{

    @Transient private OBJECT_ID objectId;

    public WorkingMessage(OBJECT_ID objectId)
    {
        this.objectId = objectId;
    }
    public WorkingMessage( )
    {
        super();
    }

    public OBJECT_ID getObjectId() {
        return objectId;
    }

    public void setObjectId(OBJECT_ID objectId) {
        this.objectId = objectId;
    }

    @Override
    protected boolean sameContentInternal(Object toBeCompared) {
        return false;
    }

    @Override
    protected boolean sameLinksInternal(Object toBeCompared) {
        return false;
    }
}
