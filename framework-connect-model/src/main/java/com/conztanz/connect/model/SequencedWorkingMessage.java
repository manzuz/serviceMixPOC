package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/14/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class SequencedWorkingMessage<OBJECT_ID> extends WorkingMessage<OBJECT_ID>
{
    @Transient
    private int sequenceNumber;

    public SequencedWorkingMessage()
    {
        this.sequenceNumber = -1;
    }

    public SequencedWorkingMessage(OBJECT_ID object_id)
    {
        super(object_id);
    }

    public SequencedWorkingMessage(OBJECT_ID object_id, int sequenceNumber)
    {
        super(object_id);
        this.sequenceNumber = sequenceNumber;
    }
    public SequencedWorkingMessage(OBJECT_ID object_id, int sequenceNumber,MessageStatus status)
    {
        super(object_id,status);
        this.sequenceNumber = sequenceNumber;
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
