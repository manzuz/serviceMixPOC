package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/21/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public class SequencedIncomingMessage<OBJECT_ID> extends IncomingMessage<OBJECT_ID>
{

    @Transient
    private int sequenceNumber;



    public SequencedIncomingMessage(byte[] rawPayload)
    {
        super(rawPayload);
    }
    public SequencedIncomingMessage(OBJECT_ID objectId , byte[] rawPayload)
    {
        super(objectId,rawPayload);
    }
    public SequencedIncomingMessage(byte[] rawPayload,int sequenceNumber)
    {
        super(rawPayload);
        this.sequenceNumber=sequenceNumber;
    }

    public SequencedIncomingMessage(OBJECT_ID objectId , byte[] rawPayload,int sequenceNumber)
    {
        super(objectId,rawPayload);
        this.sequenceNumber=sequenceNumber;
    }
    @Access(AccessType.PROPERTY)
    @Column(name = "SEQUENCE_NUMBER", nullable = false, unique = false)
    public int getSequenceNumber()
    {
        return sequenceNumber;
    }


    public void setSequenceNumber(int sequenceNumber)
    {
        this.sequenceNumber = sequenceNumber;
    }
}
