package com.conztanz.dao;

import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.model.SBRMessage;

public interface ISimpleEntityDao {
	
	
	SBRMessage add(SBRMessage message) throws PersistenceException;
	 int getTotalCount();


}
