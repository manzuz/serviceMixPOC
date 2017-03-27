package com.conztanz.persistence.connect.test;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.conztanz.dao.AbstractConnectDaoImpl;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.model.test.SimpleEntity;


public class SimpleEntityDaoImplPrimary extends AbstractConnectDaoImpl<SimpleEntity> implements ISimpleEntityDao {

	public SimpleEntityDaoImplPrimary() {
		super(SimpleEntity.class);
	}

	
	@Override
	@Transactional(rollbackOn = { ConztanzException.class }, value = TxType.MANDATORY)
	public SimpleEntity add(SimpleEntity entity) throws PersistenceException {
		return super.add(entity);
	}


}
