package com.conztanz.persistence.services;

import com.conztanz.persistence.model.SBRMessage;

import java.lang.reflect.Method;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

@OsgiServiceProvider(classes = { SBR_14MessageService.class })
@Singleton
//@Transactional
public class SBR_14MessageServiceImpl implements SBR_14MessageService {
	// @OsgiServiceProvider(classes = {SBR_14MessageService.class})
	// @Singleton
	@PersistenceContext(unitName = "testTable")
	private EntityManager em;

	@Override
	public void insertMessage() {
		System.out.println("####### insertMessage");
		System.out.println(em);
		  try {
	            Class c = SBRMessage.class;
	            Method[] m = c.getDeclaredMethods();
	            for (int i = 0; i < m.length; i++)
	            System.out.println(m[i].toString());
	        } catch (Throwable e) {
	            System.err.println(e);
	        }
		SBRMessage message = new SBRMessage();
//		em.persist(message);
		// em.flush();

	}

}
