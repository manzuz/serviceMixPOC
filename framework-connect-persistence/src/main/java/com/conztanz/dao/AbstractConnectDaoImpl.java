package com.conztanz.dao;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.conztanz.exception.ConztanzException;
import com.conztanz.model.AbstractEntity;
import com.conztanz.persistence.AbstractEntityDaoImpl;




@Transactional(value = TxType.MANDATORY, rollbackOn = {ConztanzException.class} )
public abstract class AbstractConnectDaoImpl<ENTITY extends AbstractEntity> extends AbstractEntityDaoImpl<ENTITY> {

	protected AbstractConnectDaoImpl(Class<ENTITY> entityClass) {
		super(entityClass);
	}
	
	


}
