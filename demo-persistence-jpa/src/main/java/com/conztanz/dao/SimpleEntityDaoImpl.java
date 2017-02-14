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




@OsgiServiceProvider(classes = { ISimpleEntityDao.class })
@Singleton
public class SimpleEntityDaoImpl implements ISimpleEntityDao{
	
	@PersistenceContext(unitName = "pu1")
	private EntityManager em;

	@Override
	public void persist(SBRMessage message) throws TestRuntimeException {
		em.persist(message);
		em.flush();
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
		return this.allEntries(em).size() ;
	}
	@Override
	public void persist() {
		// TODO Auto-generated method stub
		
	}
	

}
