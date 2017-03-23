package com.conztanz.dao;

import javax.inject.Singleton;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.model.SBRMessage;

@OsgiServiceProvider(classes = { ISimpleEntityDao.class })
@Singleton
public class SimpleEntityDaoImpl extends AbstractConnectDaoImpl<SBRMessage> implements ISimpleEntityDao {

	public SimpleEntityDaoImpl() {
		super(SBRMessage.class);
	}

	
	@Override
	@Transactional(rollbackOn = { ConztanzException.class }, value = TxType.MANDATORY)
	public SBRMessage add(SBRMessage entity) throws PersistenceException {
		return super.add(entity);
	}

	@Override
	@Transactional(rollbackOn = { ConztanzException.class }, value = TxType.MANDATORY)
	public void persist(SBRMessage message1) throws TestRuntimeException, PersistenceException {
		this.add(message1);

	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void persist() {
		// TODO Auto-generated method stub

	}

}
