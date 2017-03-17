package com.conztanz.dao;

import java.util.List;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.model.SBRMessage;




@OsgiServiceProvider(classes = { IEntityDaoBoth.class })
@Singleton
public class EntityDaoBothImpl implements IEntityDaoBoth{
	@PersistenceContext(unitName = "ConztanzPersistenceUnitPrimary")
	private EntityManager em1;
//	@PersistenceContext(unitName = "ConztanzPersistenceUnitSecondary")
//	private EntityManager em2;
	
	@Transactional( rollbackOn = {TestRuntimeException.class}, value = TxType.MANDATORY)
	public void persist(SBRMessage message1,SBRMessage message2){
		em1.persist(message1);
		em1.flush();
		System.out.println("################## here ########################");
//		em2.persist(message2);
//		em2.flush();
	}
	private List<SBRMessage> allEntries( EntityManager em) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SBRMessage> cq = cb.createQuery(SBRMessage.class);
        Root<SBRMessage> rootEntry = cq.from(SBRMessage.class);
        CriteriaQuery<SBRMessage> all = cq.select(rootEntry);
        TypedQuery<SBRMessage> allQuery = em.createQuery(all);
        return allQuery.getResultList();
 }
	@Transactional( rollbackOn = {TestRuntimeException.class}, value = TxType.MANDATORY)
	public int getTotalCount() {
		// TODO Auto-generated method stub
//		return this.allEntries(em1).size() + this.allEntries(em2).size();
		return 42;
	}
	
	
	

}
