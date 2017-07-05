package com.conztanz.connect.processing;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.processing.exceptions.UnMarshallingException;
import org.jibx.runtime.JiBXException;

/**
 * Created by User on 7/3/2017.
 */
public interface IAbstractConnectProcessor<BINDING,
                                           INCOMING_MESSAGE extends IncomingMessage<?>>
{

    /**
     *
     * @param incomingMessage
     * @return
     */
    BINDING process(INCOMING_MESSAGE incomingMessage) throws UnMarshallingException;
}
