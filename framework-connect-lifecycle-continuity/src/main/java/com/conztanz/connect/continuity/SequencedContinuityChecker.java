package com.conztanz.connect.continuity;

import com.conztanz.connect.exception.SequenceContinuityError;
import com.conztanz.connect.exception.SequenceContinuityException;
import com.conztanz.connect.model.SequencedIncomingMessage;
import com.conztanz.connect.model.SequencedWorkingMessage;

/**
 *
 * @param <OBJECT_ID>
 * @param <SEQUENCED_INCOMING_MESSAGE>
 * @param <SEQUENCED_WORKING_MESSAGE>
 */
public abstract class SequencedContinuityChecker<OBJECT_ID,
                                                 SEQUENCED_INCOMING_MESSAGE extends SequencedIncomingMessage<OBJECT_ID>,
                                                 SEQUENCED_WORKING_MESSAGE  extends SequencedWorkingMessage<OBJECT_ID>>
        extends ContinuityChecker<OBJECT_ID,SEQUENCED_INCOMING_MESSAGE,SEQUENCED_WORKING_MESSAGE>
{


    /*
       #####################################################################################################
       # Methods to do comparison between Incoming Message and Working Message respective sequence numbers #
       # The sense of the comparison is Incoming Message to Working Message                                #
       #####################################################################################################
     */

    /**
     *
     * @param incomingMessage
     * @param sequencedWorkingMessage
     * @throws SequenceContinuityException
     */
    private void checkGreaterThan(SEQUENCED_INCOMING_MESSAGE incomingMessage, SEQUENCED_WORKING_MESSAGE sequencedWorkingMessage)
            throws SequenceContinuityException
    {
        if(incomingMessage.getSequenceNumber() < sequencedWorkingMessage.getSequenceNumber())
            throw new SequenceContinuityException(SequenceContinuityError.OLD_INCOMING_MESSAGE);
    }

    /**
     *
     * @param incomingMessage
     * @param workingMessage
     * @throws SequenceContinuityException
     */
    protected abstract void checkSequenceContinuity(SEQUENCED_INCOMING_MESSAGE incomingMessage, SEQUENCED_WORKING_MESSAGE workingMessage) throws SequenceContinuityException;

    /**
     *
     * @param incomingMessage
     * @param workingMessage
     * @throws SequenceContinuityException
     */
    @Override
    protected  void react2OKState(SEQUENCED_INCOMING_MESSAGE incomingMessage, SEQUENCED_WORKING_MESSAGE workingMessage)
            throws SequenceContinuityException
    {
        this.checkSequenceContinuity(incomingMessage,workingMessage);
    }


}
