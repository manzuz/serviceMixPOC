package com.conztanz.connect.locking;


import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.connect.persistence.WorkingMessageDao;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.exception.UniqueViolationException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @param <OBJECT_ID>
 * @param <ENTITY>
 * @param <DAO>
 * @param <FACTORY>
 */
@Transactional(value = "ConztanzTransactionManager", propagation = Propagation.MANDATORY,
        readOnly = false, rollbackFor = {ConztanzException.class})
public abstract class AbstractConnectLocker<OBJECT_ID,
                                            ENTITY  extends WorkingMessage<OBJECT_ID>,
                                            DAO     extends WorkingMessageDao<OBJECT_ID,ENTITY>,
                                            FACTORY extends  AbstractWorkingMessageFactory<OBJECT_ID,ENTITY>>
{
    /**
     *
     * @param objectId
     * @return
     * @throws PersistenceException
     */
    public ENTITY lockBySelectFirst(OBJECT_ID objectId) throws PersistenceException
    {
        ENTITY workingMessage;
        try
        {
            workingMessage = this.getDAO().lock(objectId);
        }
        catch (NotFoundException nfe)
        {
            workingMessage = this.getWorkingMessageFactory().create(objectId);
            workingMessage = this.getDAO().addToto(workingMessage);
        }
        return workingMessage;
    }

    /**
     *
     * @param objectId
     * @return
     * @throws PersistenceException
     */
    public ENTITY lockByInsertFirst(OBJECT_ID objectId) throws PersistenceException
    {
        ENTITY workingMessage;
        try
        {
            workingMessage = this.getWorkingMessageFactory().create(objectId);
            workingMessage = this.getDAO().addToto(workingMessage);
        }
        catch (UniqueViolationException nfe)
        {
            workingMessage = this.getDAO().lock(objectId);
        }
        return workingMessage;
    }
    //TODO
    //public abstract ENTITY lock(OBJECT_ID objectId);

    /**
     *
     * @return
     */
    public abstract DAO getDAO();

    /**
     *
     * @return
     */
    public abstract FACTORY getWorkingMessageFactory();
}
