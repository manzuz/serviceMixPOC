package com.conztanz.connect.exception;

/**
 * Created by User on 6/21/2017.
 */
public class KOContinuityException extends ContinuityException
{



    /**
     *
     * @param ObjectID
     */
    public KOContinuityException(String ObjectID)
    {

        super("A message with the same object ID: " + ObjectID +" is in KO state");
    }


}
