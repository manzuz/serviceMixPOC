package com.conztanz.connect.locking;

import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import com.conztanz.exception.NotFoundException;
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

/**
 * Created by User on 6/19/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/persistence/applicationContext.xml")
@TransactionConfiguration(transactionManager = "ConztanzTransactionManager")
public class SimpleConnectLockerTest extends AbstractDaoTester<SimpleSequencedWorkingMessage>
{
    @Autowired
    private SimpleConnectLocker simpleConnectLocker;

    public SimpleConnectLocker getSimpleConnectLocker()
    {
        return simpleConnectLocker;
    }

    @Test
    @Transactional
    public void testLockBySelectFirst() throws PersistenceException
    {

        String objectID = "123456789";
//        this.getSimpleConnectLocker().getDAO().add(this.getSimpleConnectLocker().getWorkingMessageFactory().create("1234562789"));
//        this.getSimpleConnectLocker().getDAO().flush();
        SimpleSequencedWorkingMessage entity1 = getSimpleConnectLocker().lockBySelectFirst(objectID);
//        System.out.println(entity);
        SimpleSequencedWorkingMessage entity2 = getSimpleConnectLocker().lockBySelectFirst(objectID);
    }
    @Test
    @Transactional
    public void testLockByInsertFirst() throws PersistenceException
    {

        String objectID = "123456789";
//        this.getSimpleConnectLocker().getDAO().add(this.getSimpleConnectLocker().getWorkingMessageFactory().create("1234562789"));
//        this.getSimpleConnectLocker().getDAO().flush();
        SimpleSequencedWorkingMessage entity1 = getSimpleConnectLocker().lockByInsertFirst(objectID);
//        System.out.println(entity);
        SimpleSequencedWorkingMessage entity2 = getSimpleConnectLocker().lockByInsertFirst(objectID);
    }

    @Override
    protected IAbstractEntityDao<SimpleSequencedWorkingMessage> getDao() {
        return getSimpleConnectLocker().getDAO();
    }

    @Override
    protected AbstractEntityTestFactory<SimpleSequencedWorkingMessage> getTestFactory() {
        return null;
    }
}
