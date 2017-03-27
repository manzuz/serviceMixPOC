package com.conztanz.dao;

import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.model.SBRMessage;

public interface ISimpleEntityDao {
	
	
	 void persist(SBRMessage message1) throws PersistenceException;
	 int getTotalCount();
	 void persist();

}
