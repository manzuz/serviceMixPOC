package com.conztanz.connect.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by User on 6/14/2017.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class SequencedWorkingMessage<OBJECT_ID> extends WorkingMessage<OBJECT_ID>
{
    @Column(name = "SEQUENCE_NUMBER", nullable = false, unique = false)
    @Access(AccessType.PROPERTY)
    private int sequenceNumber;

    public SequencedWorkingMessage()
    {
        this.sequenceNumber = -1;
    }

    public SequencedWorkingMessage(OBJECT_ID object_id) {
        super(object_id);
    }

    public SequencedWorkingMessage(OBJECT_ID object_id, int sequenceNumber) {
        super(object_id);
        this.sequenceNumber = sequenceNumber;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


}
