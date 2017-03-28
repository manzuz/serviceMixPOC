package com.conztanz.persistence.services;

import com.conztanz.exception.PersistenceException;

public interface ISBR_14MessageService {
	
	void insertMessage() throws  PersistenceException ;
	int getTotalCount();

}
