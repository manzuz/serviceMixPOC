package com.conztanz.connect.persistence;

import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.exception.UniqueViolationException;
import com.conztanz.model.jpa.ConztanzField.ConztanzFieldSimple;
import com.conztanz.persistence.AbstractEntityDaoImpl;
import com.conztanz.persistence.jpa.data.ConztanzData;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @param <OBJECT_ID>
 * @param <ENTITY>
 */
public abstract class WorkingMessageDao<OBJECT_ID,
                                        ENTITY extends WorkingMessage<OBJECT_ID,?>>
        extends     AbstractEntityDaoImpl<ENTITY>
        implements  IWorkingMessageDao<OBJECT_ID, ENTITY>
{

    /**
     *
     * @param entityClass
     */
    protected WorkingMessageDao(Class<ENTITY> entityClass)
    {
        super(entityClass);
    }

    /**
     * @return
     */
    @Transactional(readOnly = true, rollbackFor = {ConztanzException.class}, propagation = Propagation.SUPPORTS)
    public abstract ConztanzFieldSimple<ENTITY, OBJECT_ID> buildObjectIdField();

    /**
     * @param objectIds
     * @return
     */
    @Transactional(readOnly = true, rollbackFor = {ConztanzException.class}, propagation = Propagation.SUPPORTS)
    public ConztanzData<ENTITY, OBJECT_ID> buildObjectIdCriteria(OBJECT_ID... objectIds)
    {
        return this.buildData(this.buildObjectIdField(), objectIds);
    }


    /**
     * @param objectId
     * @return
     * @throws PersistenceException
     * @throws NotFoundException
     */
    @Transactional(readOnly = true, rollbackFor = {ConztanzException.class}, noRollbackFor = {NotFoundException.class}, propagation = Propagation.MANDATORY)
    public ENTITY lock(OBJECT_ID objectId) throws PersistenceException,NotFoundException
    {
        ENTITY entity  = this.getOne(objectId);
        entity = super.lock(entity);
        return entity;
    }

    /**
     *
     * @param objectId
     * @return
     * @throws PersistenceException
     * @throws NotFoundException
     */
    public ENTITY getOne(OBJECT_ID objectId) throws PersistenceException ,NotFoundException
    {
        return this.getOne(this.buildObjectIdCriteria(objectId));
    }

    /**
     *
     * @param entity Entity to be added to persistence context
     * @return
     * @throws PersistenceException
     */
    //TODO NAME
//    @Transactional(readOnly = false, rollbackFor = {ConztanzException.class}, noRollbackFor={UniqueViolationException.class}, propagation = Propagation.NESTED)
    public ENTITY addToto(ENTITY entity) throws PersistenceException,UniqueViolationException
    {
        entity =  super.add(entity);
        super.flush();
        return entity;
    }


}
