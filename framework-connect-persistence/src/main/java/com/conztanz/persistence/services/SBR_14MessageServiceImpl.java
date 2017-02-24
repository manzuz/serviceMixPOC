package com.conztanz.persistence.services;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.dao.IEntityDaoBoth;
import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.model.SBRMessage;

@OsgiServiceProvider(classes = { ISBR_14MessageService.class })
@Singleton
public class SBR_14MessageServiceImpl implements ISBR_14MessageService {
	
	
	
	@Inject 
	private IEntityDaoBoth entityDao ;
	
	
	
	
	
	
	@Transactional(value = TxType.REQUIRED,rollbackOn = {TestRuntimeException.class})
	public void insertMessage(boolean shouldFail) throws  TestRuntimeException{
			this.entityDao.persist(new SBRMessage(), new SBRMessage());
//			if(shouldFail)
//				throw new TestRuntimeException();

	}
	


	@Transactional()
	public int getTotalCount() {
		return entityDao.getTotalCount();
	}



	
	

	

}
