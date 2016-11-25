package com.conztanz.persistence.services;

import com.conztanz.persistence.model.SBRMessage;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;


@OsgiServiceProvider(classes = {SBR_14MessageService.class})
@Singleton
@Transactional
public class SBR_14MessageServiceImpl implements SBR_14MessageService {
	
	@PersistenceContext(unitName="message_store")
	private EntityManager em;
	    

	
	
	
	
	
	
	
	

	@Override
	public void insertMessage(SBRMessage sbrMessage) {
		System.out.println("####### insertMessage");
		 em.persist(sbrMessage);
	     em.flush();
		
	}

}
