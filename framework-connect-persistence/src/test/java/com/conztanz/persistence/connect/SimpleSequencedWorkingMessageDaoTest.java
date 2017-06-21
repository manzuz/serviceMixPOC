package com.conztanz.persistence.connect;

import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.exception.PersistenceException;
import com.conztanz.factory.AbstractEntityTestFactory;
import com.conztanz.persistence.AbstractDaoTester;
import com.conztanz.persistence.IAbstractEntityDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Entity;

import static org.junit.Assert.fail;

/**
 * Created by User on 6/14/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-persistence-test.xml")
@TransactionConfiguration(transactionManager = "ConztanzTransactionManager")
public class SimpleSequencedWorkingMessageDaoTest extends AbstractDaoTester<SimpleSequencedWorkingMessage>
{

    @Autowired
    private ISimpleSequencedWorkingMessageDao dao = null;

    @Override
    protected ISimpleSequencedWorkingMessageDao getDao()
    {
        return  this.dao;
    }

    @Override
    protected AbstractEntityTestFactory<SimpleSequencedWorkingMessage> getTestFactory() {
        return null;
    }


    @Test
    @Transactional
    public void testLock() throws PersistenceException {
        try
        {
            this.getDao().lock("0000000");
            fail("should not have found an entity ");
        }
        catch (PersistenceException e)
        {
            e.printStackTrace();
        }
        SimpleSequencedWorkingMessage workingMessage = this.getDao().addToto(new SimpleSequencedWorkingMessage("123456789"));
        try
        {
            this.getDao().lock("0000000");
            fail("should not have found an entity ");
        }
        catch (PersistenceException e)
        {
            e.printStackTrace();
        }
        try
        {
            this.getDao().lock(workingMessage.getObjectId());
        }
        catch (PersistenceException e)
        {
            e.printStackTrace();
            fail("should have found an entity ");
        }
    }
}
