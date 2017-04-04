package com.conztanz.persistence.services;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.model.test.SimpleEntity;
import com.conztanz.persistence.connect.test.ISimpleEntityDao;

@OsgiServiceProvider(classes = { ISBR_14MessageService.class })
@Singleton
public class SBR_14MessageServiceImpl implements ISBR_14MessageService {
	
	
	
	@Inject 
	private ISimpleEntityDao entityDao ;
	
	
	
	
	
	
	@Transactional(value = TxType.REQUIRED,rollbackOn = {ConztanzException.class})
	public void insertMessage() throws   PersistenceException{
			this.entityDao.add(new SimpleEntity("TOTO"));


	}
	


	@Transactional()
	public int getTotalCount() {
		return entityDao.getTotalCount();
	}



	

}
