package com.conztanz.dao;

import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.model.jpa.ConztanzField.ConztanzFieldSimple;
import com.conztanz.persistence.AbstractEntityDaoImpl;
import com.conztanz.persistence.jpa.data.ConztanzData;
import com.conztanz.transport.ConztanzResultList;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by User on 6/13/2017.
 */
public abstract class WorkingMessageDao<OBJECT_ID, ENTITY extends WorkingMessage<OBJECT_ID>> extends AbstractEntityDaoImpl<ENTITY>
{
    protected WorkingMessageDao(Class<ENTITY> entityClass)
    {
        super(entityClass);
    }

    @Transactional(readOnly = true, rollbackFor = {ConztanzException.class}, propagation = Propagation.SUPPORTS)
    public abstract ConztanzFieldSimple<ENTITY, OBJECT_ID> buildObjectIdField();

    @Transactional(readOnly = true, rollbackFor = {ConztanzException.class}, propagation = Propagation.SUPPORTS)
    public ConztanzData<ENTITY, OBJECT_ID> buildObjectIdCriteria(OBJECT_ID... objectIds) {
        return this.buildData(this.buildObjectIdField(), objectIds);
    }


    /**
     *
     * @param objectId
     * @return
     * @throws PersistenceException
     * @throws NotFoundException
     */
    public ENTITY lock(OBJECT_ID objectId) throws PersistenceException,NotFoundException
    {
        ENTITY entity  = this.getOne(this.buildObjectIdCriteria(objectId));
        super.lock(entity);
        return entity;
    }
}
