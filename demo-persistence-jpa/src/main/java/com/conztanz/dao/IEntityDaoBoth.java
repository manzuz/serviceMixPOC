package com.conztanz.dao;

import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.model.SBRMessage;

public interface IEntityDaoBoth {
	 void persist(SBRMessage message1,SBRMessage message2) throws TestRuntimeException;
	 int getTotalCount();

}
