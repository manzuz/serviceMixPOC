package com.conztanz.persistence.services;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.persistence.model.SBRMessage;

@OsgiServiceProvider(classes = { SBR_14MessageService.class })
@Singleton
@Transactional(value=TxType.REQUIRED)
public class SBR_14MessageServiceImpl implements SBR_14MessageService {
	
	@PersistenceContext(unitName = "testTable")
	private EntityManager em;

	@Override
	public void insertMessage() {
		SBRMessage message = new SBRMessage();
		em.persist(message);
		em.flush();

	}

}
