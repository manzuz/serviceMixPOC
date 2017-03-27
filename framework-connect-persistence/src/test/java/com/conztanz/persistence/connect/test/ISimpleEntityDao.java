package com.conztanz.persistence.connect.test;

import com.conztanz.exception.PersistenceException;
import com.conztanz.model.test.SimpleEntity;
import com.conztanz.persistence.IAbstractEntityDao;

public interface ISimpleEntityDao extends IAbstractEntityDao<SimpleEntity> {
	
	
	SimpleEntity add(SimpleEntity message1) throws  PersistenceException;
	int getTotalCount();

}
