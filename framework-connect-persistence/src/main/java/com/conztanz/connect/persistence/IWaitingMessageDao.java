package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 * Created by User on 6/22/2017.
 */
public interface IWaitingMessageDao<OBJECT_ID,
                                    ENTITY extends IncomingMessage<OBJECT_ID>>
        extends IAbstractEntityDao<ENTITY>
{
    /**
     *
     * @param entity
     * @return
     */
    ENTITY remove (ENTITY entity);
}
