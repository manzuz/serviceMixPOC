package com.conztanz.persistence.connect.test;

import javax.inject.Singleton;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.dao.AbstractConnectDaoImpl;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.model.test.SimpleEntity;

@OsgiServiceProvider(classes = { ISimpleEntityDao.class })
@Singleton
public class SimpleEntityDaoImplPrimary extends AbstractConnectDaoImpl<SimpleEntity> implements ISimpleEntityDao {

	public SimpleEntityDaoImplPrimary() {
		super(SimpleEntity.class);
	}

	
	@Override
	@Transactional(rollbackOn = { ConztanzException.class }, value = TxType.MANDATORY)
	public SimpleEntity add(SimpleEntity entity) throws PersistenceException {
		return super.add(entity);
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
