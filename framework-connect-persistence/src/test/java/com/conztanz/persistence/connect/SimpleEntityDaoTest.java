package com.conztanz.persistence.connect;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.conztanz.factory.AbstractEntityTestFactory;
import com.conztanz.model.test.SimpleEntity;
import com.conztanz.persistence.AbstractDaoTester;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-persistence-test.xml")
@TransactionConfiguration(transactionManager = "ConztanzTransactionManager")
public class SimpleEntityDaoTest extends AbstractDaoTester<SimpleEntity>
{
	
	/** DAO to be tested */
	@Autowired
	private ISimpleEntityDao dao = null;

	@Override
	protected ISimpleEntityDao getDao() {
		return this.dao;
	}

	@Override
	protected AbstractEntityTestFactory<SimpleEntity> getTestFactory() {
		return null;
	}
	
	
	
	
	  

}
