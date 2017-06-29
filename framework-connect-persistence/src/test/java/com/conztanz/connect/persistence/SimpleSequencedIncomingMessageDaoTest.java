package com.conztanz.connect.persistence;

import com.conztanz.connect.model.MessageStatus;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.persistence.IIncomingMessageDao;
import com.conztanz.connect.persistence.IncomingMessageDao;
import com.conztanz.exception.PersistenceException;
import com.conztanz.factory.AbstractEntityTestFactory;
import com.conztanz.persistence.AbstractDaoTester;
import com.conztanz.persistence.IAbstractEntityDao;
import com.conztanz.persistence.datasource.PGConztanzConnection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by User on 6/22/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-persistence-test.xml")
@TransactionConfiguration(transactionManager = "ConztanzTransactionManager")
public class SimpleSequencedIncomingMessageDaoTest extends AbstractDaoTester<SimpleSequencedIncomingMessage>
{

  @Autowired
  private ISimpleSequencedIncomingMessageDao dao;

  /**
   * Getter of the DAO to be tested
   *
   * @return The DAO to be tested
   */
  @Override
  protected ISimpleSequencedIncomingMessageDao getDao()
  {
    return dao;
  }

  /**
   * Getter of the DAO to be tested
   *
   * @return The DAO to be tested
   */
  @Override
  protected AbstractEntityTestFactory<SimpleSequencedIncomingMessage> getTestFactory()
  {
    return null;
  }


  @Transactional
  @Test
  public void testRawPayLoadStorage() throws PersistenceException
  {

    SimpleSequencedIncomingMessage message1 = new SimpleSequencedIncomingMessage(new byte[100], MessageStatus.OK);
    message1.setObjectId("134");
    this.getDao().add(message1);
    this.getDao().flush();
  }
}
