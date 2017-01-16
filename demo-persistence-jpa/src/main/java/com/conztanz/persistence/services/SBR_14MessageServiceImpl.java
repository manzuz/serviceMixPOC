package com.conztanz.persistence.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.doa.EntityDaoImpl;
import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.model.SBRMessage;

@OsgiServiceProvider(classes = { SBR_14MessageService.class })
@Singleton
public class SBR_14MessageServiceImpl implements SBR_14MessageService {
	
	@PersistenceContext(unitName = "pu1")
	private EntityManager em1;
	
	@Inject 
	private EntityDaoImpl entityDao ;
	
//	@PersistenceContext(unitName = "pu2")
//	private EntityManager em2;
	
	
	
	
	
	@Transactional
	public void insertMessage()  {
		System.out.println("## count before persist() + flush() : " + this.entityDao.allEntries(em1).size());
		SBRMessage message1 = new SBRMessage();
		try {
			this.entityDao.persist(message1, em1,true);

		} catch (TestRuntimeException e) {
			System.out.println("## count after Exception : " + this.entityDao.allEntries(em1).size());
		}
	}
	
	
	
	public List<SBRMessage> getAll()  {
		return this.entityDao.allEntries(em1);
	}
	
	
	
	

}
