package com.conztanz.connect.services;

import com.conztanz.connect.model.AbstractMessage;
import com.conztanz.connect.persistence.AbstractMessageDao;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.transport.ConztanzResultList;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @param <OBJECT_ID>
 * @param <MESSAGE>
 */
@Transactional(
        readOnly = false,
        rollbackFor = {ConztanzException.class},
        propagation = Propagation.REQUIRED
)
public abstract class AbstractConnectService<OBJECT_ID,
                                              MESSAGE extends AbstractMessage<OBJECT_ID>>
        implements IConnectService<MESSAGE>
{
    /**
     *
     * @return
     * @throws PersistenceException
     */
    public ConztanzResultList<MESSAGE> findAll() throws PersistenceException
    {
        return this.getDao().findAll();
    }


    /**
     *
     * @return
     */
    protected abstract AbstractMessageDao<OBJECT_ID,MESSAGE> getDao();


}
