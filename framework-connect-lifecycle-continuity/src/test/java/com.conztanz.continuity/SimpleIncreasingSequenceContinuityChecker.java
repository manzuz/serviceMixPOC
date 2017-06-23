package com.conztanz.continuity;

import com.conztanz.connect.continuity.SequencedContinuityChecker;
import com.conztanz.connect.exception.*;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;

/**
 * Created by User on 6/22/2017.
 */
public class SimpleIncreasingSequenceContinuityChecker extends SequencedContinuityChecker<String,SimpleSequencedIncomingMessage,SimpleSequencedWorkingMessage>
{
    /**
     * @param workingMessage
     * @throws ContinuityException
     */
    @Override
    protected void react2KOState(SimpleSequencedWorkingMessage workingMessage) throws KOContinuityException
    {
        throw new KOContinuityException(workingMessage.getObjectId());
    }

    /**
     * @param workingMessage
     * @throws ContinuityException
     */
    @Override
    protected void react2WORKINGState(SimpleSequencedWorkingMessage workingMessage) throws WORKINGContinuityException
    {

    }

    /**
     * @param incomingMessage
     * @param workingMessage
     * @throws SequenceContinuityException
     */
    @Override
    protected void checkSequenceContinuity(SimpleSequencedIncomingMessage incomingMessage, SimpleSequencedWorkingMessage workingMessage) throws SequenceContinuityException
    {
        if(incomingMessage.getSequenceNumber() <= workingMessage.getSequenceNumber())
            throw new SequenceContinuityException(SequenceContinuityError.OLD_INCOMING_MESSAGE);
    }
}
