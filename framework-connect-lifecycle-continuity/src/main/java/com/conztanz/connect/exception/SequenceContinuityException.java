package com.conztanz.connect.exception;

/**
 * Created by User on 6/22/2017.
 */
public class SequenceContinuityException extends ContinuityException
{
    private SequenceContinuityError sequenceContinuityError;
//
//    /**
//     * Constructor of a generic functional exception
//     *
//     * @param message Message associated with the exception
//     */
//    public SequenceContinuityException(String message,SequenceContinuityError sequenceContinuityError)
//    {
//        super(message);
//        this.sequenceContinuityError=sequenceContinuityError;
//    }

    public SequenceContinuityException( SequenceContinuityError sequenceContinuityError)
    {
        //TODO
        super(sequenceContinuityError.toString());
        this.sequenceContinuityError=sequenceContinuityError;
    }

    public SequenceContinuityError getSequenceContinuityError()
    {
        return sequenceContinuityError;
    }
}
