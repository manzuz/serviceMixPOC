package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/14/2017.
 */
@Entity(name = "SIMPLE_SEQUENCED_WORKING_MESSAGE")
@SequenceGenerator(name = "SEQ_ID", sequenceName = "SIMPLE_SEQUENCED_WORKING_MESSAGE_ID_SEQ")
@Access(AccessType.FIELD)
public class SimpleSequencedWorkingMessage extends SequencedWorkingMessage<String>


{

    public SimpleSequencedWorkingMessage(String objectID)
    {
        super(objectID);
    }

    public SimpleSequencedWorkingMessage(String objectID, int sequenceNumber) {
        super(objectID, sequenceNumber);
    }


    @Override
    @Column(name = "OBJECT_ID", nullable = false, unique = false)
    @Access(AccessType.PROPERTY)
    public String getObjectId() {
        return super.getObjectId();
    }

}
