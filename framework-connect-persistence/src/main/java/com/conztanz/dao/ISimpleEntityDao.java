package com.conztanz.dao;

import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.model.SBRMessage;

public interface ISimpleEntityDao {
	
	
	 void persist(SBRMessage message1) throws TestRuntimeException;
	 int getTotalCount();
	 void persist();

}
