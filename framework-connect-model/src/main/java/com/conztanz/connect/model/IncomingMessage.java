package com.conztanz.connect.model;

import com.conztanz.model.AbstractEntity;

public abstract class IncomingMessage<OBJECT_ID> extends AbstractEntity {


    /**
     *
     */
    private byte[] rawPayload;

    /**
     * TODO generic instead of string (with a string implementation for now)
     */
    private OBJECT_ID objectId;

    /**
     * @return
     */
    private String transformedPayload;

    public IncomingMessage(byte[] rawPayload) {
        this.rawPayload = rawPayload;
    }


    public String getTransformedPayload() {
        return transformedPayload;
    }

    public void setTransformedPayload(String transformedPayload) {
        this.transformedPayload = transformedPayload;
    }

    public byte[] getRawPayload() {
        return rawPayload;
    }


    @Override
    protected boolean sameContentInternal(Object toBeCompared) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected boolean sameLinksInternal(Object toBeCompared) {
        // TODO Auto-generated method stub
        return false;
    }

    public OBJECT_ID getObjectId() {
        return objectId;
    }

    public void setObjectId(OBJECT_ID objectId) {
        this.objectId = objectId;
    }

    public void setRawPayload(byte[] rawPayload) {
        this.rawPayload = rawPayload;
    }


}
