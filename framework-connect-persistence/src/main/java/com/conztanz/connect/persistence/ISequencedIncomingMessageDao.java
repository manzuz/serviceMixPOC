package com.conztanz.connect.persistence;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.SequencedIncomingMessage;
import com.conztanz.persistence.IAbstractEntityDao;

/**
 *
 * @param <OBJECT_ID>
 * @param <ENTITY>
 */
public interface ISequencedIncomingMessageDao<OBJECT_ID,
                                              ENTITY extends SequencedIncomingMessage<OBJECT_ID>>
        extends IIncomingMessageDao<OBJECT_ID,ENTITY>
{
}
