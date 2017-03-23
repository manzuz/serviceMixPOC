package com.conztanz.persistence.services;

import com.conztanz.exception.PersistenceException;
import com.conztanz.exceptions.TestRuntimeException;

public interface ISBR_14MessageService {
	
	void insertMessage( boolean shouldFail) throws TestRuntimeException, PersistenceException ;
	int getTotalCount();

}
