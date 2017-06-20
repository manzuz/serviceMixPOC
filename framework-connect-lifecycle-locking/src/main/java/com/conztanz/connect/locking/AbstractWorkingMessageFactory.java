package com.conztanz.connect.locking;

import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.factory.AbstractEntityFactory;

/**
 * Created by User on 6/15/2017.
 */
public abstract class AbstractWorkingMessageFactory<OBJECT_ID,
                                                    ENTITY extends WorkingMessage<OBJECT_ID>>
        extends AbstractEntityFactory <ENTITY>
{

    /**
     *
     * @param objectId
     * @return
     */
    public  abstract ENTITY create(OBJECT_ID objectId);
}
