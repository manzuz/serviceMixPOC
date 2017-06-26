package com.conztanz.connect.continuity;

import com.conztanz.connect.exception.ContinuityException;
import com.conztanz.connect.exception.KOContinuityException;
import com.conztanz.connect.exception.SequenceContinuityException;
import com.conztanz.connect.exception.WORKINGContinuityException;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;

/**
 * @param <OBJECT_ID>
 * @param <INCOMING_MESSAGE>
 * @param <WORKING_MESSAGE>
 */
public abstract class ContinuityChecker<OBJECT_ID,
                                        INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>,
                                        WORKING_MESSAGE  extends WorkingMessage<OBJECT_ID>>
{
    /**
     * @param incomingMessage
     * @param workingMessage
     * @throws ContinuityException
     */
    public void checkContinuity(INCOMING_MESSAGE incomingMessage, WORKING_MESSAGE workingMessage) throws KOContinuityException, WORKINGContinuityException, SequenceContinuityException
    {
        switch (workingMessage.getStatus())
        {
            case KO:
                this.react2KOState(incomingMessage,workingMessage);
                break;
            case WORKING:
                this.react2WORKINGState(incomingMessage,workingMessage);
                break;
            case OK:
                this.react2OKState(incomingMessage, workingMessage);
                break;
        }
    }

    /**
     * @param workingMessage
     * @throws ContinuityException
     */
    protected abstract void react2KOState(INCOMING_MESSAGE incomingMessage,WORKING_MESSAGE workingMessage) throws KOContinuityException;

    /**
     * @param workingMessage
     * @throws ContinuityException
     */
    protected abstract void react2WORKINGState(INCOMING_MESSAGE incomingMessage,WORKING_MESSAGE workingMessage) throws WORKINGContinuityException ;

    /**
     * @param incomingMessage
     * @param workingMessage
     * @throws SequenceContinuityException
     */
    protected abstract void react2OKState(INCOMING_MESSAGE incomingMessage, WORKING_MESSAGE workingMessage) throws SequenceContinuityException;

}
