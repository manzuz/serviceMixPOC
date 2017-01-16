package com.conztanz.persistence.services;

import java.util.List;

import com.conztanz.persistence.model.SBRMessage;

public interface SBR_14MessageService {
	
	void insertMessage( ) ;
	List<SBRMessage> getAll();

}
