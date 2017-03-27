package com.conztanz.persistence.services;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.dao.ISimpleEntityDao;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.persistence.model.SBRMessage;

@OsgiServiceProvider(classes = { ISBR_14MessageService.class })
@Singleton
public class SBR_14MessageServiceImpl implements ISBR_14MessageService {
	
	
	
	@Inject 
	private ISimpleEntityDao entityDao ;
	
	
	
	
	
	
	@Transactional(value = TxType.REQUIRED,rollbackOn = {ConztanzException.class})
	public void insertMessage(boolean shouldFail) throws   PersistenceException{
			this.entityDao.persist(new SBRMessage());


	}
	


	@Transactional()
	public int getTotalCount() {
		return entityDao.getTotalCount();
	}



	
	

	

}
