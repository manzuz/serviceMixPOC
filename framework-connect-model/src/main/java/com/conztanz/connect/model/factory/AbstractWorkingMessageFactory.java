package com.conztanz.connect.model.factory;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.factory.AbstractEntityFactory;

/**
 * Created by User on 6/15/2017.
 */
public abstract class AbstractWorkingMessageFactory<OBJECT_ID,
                                                    INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>,
                                                    WORKING_MESSAGE extends WorkingMessage<OBJECT_ID,INCOMING_MESSAGE>>
        extends AbstractEntityFactory <WORKING_MESSAGE>
{

    /**
     *
     * @param objectId
     * @return
     */
    public abstract WORKING_MESSAGE create(OBJECT_ID objectId);
}
