package com.conztanz.persistence.connect;

import com.conztanz.exception.PersistenceException;
import com.conztanz.model.test.SimpleEntity;
import com.conztanz.persistence.IAbstractEntityDao;

public interface ISimpleEntityDao extends IAbstractEntityDao<SimpleEntity>
{
    /**
     * @param simpleEntity
     * @return
     * @throws PersistenceException
     */
	SimpleEntity add(SimpleEntity simpleEntity) throws  PersistenceException;

    /**
     *
     * @return
     */
	int getTotalCount();
}
