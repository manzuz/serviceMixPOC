package com.conztanz.doa;

import java.util.List;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.model.SBRMessage;




@OsgiServiceProvider(classes = { IEntityDao.class })
@Singleton
public class EntityDaoImpl implements IEntityDao{
	
	
	
	@Transactional(rollbackOn = {TestRuntimeException.class})
	public void persist(SBRMessage message,EntityManager em,boolean fail) throws TestRuntimeException{
		em.persist(message);
		em.flush();
		System.out.println("## count after persist() + flush() : " + this.allEntries(em).size());
		if(fail)
			throw new TestRuntimeException();
		
	}
	
	@Transactional
	public List<SBRMessage> allEntries( EntityManager em) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SBRMessage> cq = cb.createQuery(SBRMessage.class);
        Root<SBRMessage> rootEntry = cq.from(SBRMessage.class);
        CriteriaQuery<SBRMessage> all = cq.select(rootEntry);
        TypedQuery<SBRMessage> allQuery = em.createQuery(all);
        return allQuery.getResultList();
 }

}
