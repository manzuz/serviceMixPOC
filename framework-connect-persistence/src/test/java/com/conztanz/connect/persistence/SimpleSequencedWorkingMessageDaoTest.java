package com.conztanz.connect.persistence;

import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.connect.model.MessageStatus;
import com.conztanz.exception.PersistenceException;
import com.conztanz.factory.AbstractEntityTestFactory;
import com.conztanz.persistence.AbstractDaoTester;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
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
    protected AbstractEntityTestFactory<SimpleSequencedWorkingMessage> getTestFactory()
    {
        return null;
    }




    @Test
    @Transactional
    public void testAddEntityWithWorkingStatus() throws PersistenceException
    {
        SimpleSequencedWorkingMessage toStore = new SimpleSequencedWorkingMessage("123AZE",
                                                                                        42,
                                                                                        MessageStatus.WORKING);
        this.getDao().addToto(toStore);
        this.getDao().flush();
        SimpleSequencedWorkingMessage retrieved = this.getDao().findById(toStore .getId());
        assertEquals(toStore.getObjectId(),retrieved.getObjectId());
        assertEquals(toStore.getSequenceNumber(),retrieved.getSequenceNumber());
        assertEquals(toStore.getStatus(), MessageStatus.WORKING);
    }



}
