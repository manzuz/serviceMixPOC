package com.conztanz.connect.model;

import javax.persistence.*;

/**
 * Created by User on 6/22/2017.
 */
@Entity(name = "SIMPLE_SEQUENCED_INCOMING_MESSAGE")
@SequenceGenerator(name = "SEQ_ID", sequenceName = "SIMPLE_SEQUENCED_INCOMING_MESSAGE_ID_SEQ")
@Access(AccessType.FIELD)
public class SimpleSequencedIncomingMessage extends SequencedIncomingMessage<String>
{
    public SimpleSequencedIncomingMessage(byte[] rawPayload,int sequenceNumber)
    {
        super(rawPayload, sequenceNumber);
    }

    @Override
    @Column(name = "OBJECT_ID", nullable = false, unique = false)
    @Access(AccessType.PROPERTY)
    public String getObjectId()
    {
        return super.getObjectId();
    }
}
