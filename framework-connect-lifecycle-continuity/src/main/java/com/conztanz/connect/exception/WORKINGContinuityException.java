package com.conztanz.connect.exception;

/**
 * Created by User on 6/21/2017.
 */
public class WORKINGContinuityException extends ContinuityException
{

    /**
     *
     * @param ObjectID
     */
    public WORKINGContinuityException(String ObjectID)
    {
        super("A message with the same object ID: " + ObjectID +" is in WORKING state");
    }
}
