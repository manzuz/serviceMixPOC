package com.conztanz.connect.camel;


import com.conztanz.connect.continuity.ContinuityChecker;
import com.conztanz.connect.exception.BlockedContinuityException;
import com.conztanz.connect.exception.ContinuityException;
import com.conztanz.connect.exception.SequenceContinuityException;
import com.conztanz.connect.identification.IAbstractConnectIdentifier;
import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.initialize.IConnectInitializer;
import com.conztanz.connect.locking.AbstractConnectLocker;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.connect.model.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.model.factory.AbstractWaitingMessageFactory;
import com.conztanz.connect.persistence.IIncomingMessageDao;
import com.conztanz.connect.persistence.IWaitingMessageDao;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.PersistenceException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 *
 * @param <INITIALIZER>
 * @param <IDENTIFIER>
 *   TODO : move generics
 */
public abstract class AbstractLifeCycleOrchestrator<OBJECT_ID,
                                                    WAITING_MESSAGE extends IncomingMessage<OBJECT_ID>,
                                                    INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>,
                                                    WORKING_MESSAGE extends WorkingMessage<OBJECT_ID,INCOMING_MESSAGE>,
                                                    INITIALIZER extends IConnectInitializer<INCOMING_MESSAGE >,
													                          IDENTIFIER extends IAbstractConnectIdentifier<INCOMING_MESSAGE>>
{

  /**
   *
   * @param payload
   * @throws ConnectTransformationException
   * @throws ConnectIdentificationException
   */
  @Transactional(value = "ConztanzTransactionManager",
          propagation = Propagation.REQUIRED,
          readOnly = false,
          rollbackFor = {ConztanzException.class},
          noRollbackFor = {ContinuityException.class})
  public void startLifeCycle(byte[] payload) throws ConnectTransformationException, ConnectIdentificationException, PersistenceException, BlockedContinuityException, SequenceContinuityException
  {
    WORKING_MESSAGE workingMessage = null;
    INCOMING_MESSAGE incomingMessage;

    //  INITIALISATION
    incomingMessage = this.getInitializer().init(payload);

    //  IDENTIFICATION
    this.getIdentifier().identify(incomingMessage);

    //  LOCKING
    try
    {
      workingMessage = this.getLocker().lock(incomingMessage.getObjectId());
    }
    catch (PersistenceException e)
    {
      // TODO how dealt to with it ?
      e.printStackTrace();
    }

    //  CONTINUITY
    try
    {

      this.getContinuityChecker().checkContinuity(incomingMessage, workingMessage);
    }
    catch (BlockedContinuityException e)
    {
      WAITING_MESSAGE waitingMessage = this.getWaitingMessageFactory().createMessage(incomingMessage);
      this.getWaitingMessageDao().add(waitingMessage);
      throw e;
    }
    catch (ContinuityException e)
    {
      incomingMessage.reject(e);
      this.getIncomingMessageDao().add(incomingMessage);
      throw e;
    }
    this.getIncomingMessageDao().add(incomingMessage);
    workingMessage.workOn(incomingMessage);
  }


  /**
   * @return
   */
  protected abstract INITIALIZER getInitializer();

  /**
   * @return
   */
  protected abstract IDENTIFIER getIdentifier();

  /**
   * @return
   */
  protected abstract AbstractConnectLocker<OBJECT_ID, INCOMING_MESSAGE, WORKING_MESSAGE, ?, ?> getLocker();

  /**
   * @return
   */
  protected abstract ContinuityChecker<OBJECT_ID, INCOMING_MESSAGE, WORKING_MESSAGE> getContinuityChecker();

  /**
   * @return
   */
  protected abstract IWaitingMessageDao<OBJECT_ID, WAITING_MESSAGE> getWaitingMessageDao();

  /**
   * @return
   */
  protected abstract IIncomingMessageDao<OBJECT_ID, INCOMING_MESSAGE> getIncomingMessageDao();

  /**
   *
   * @return
   */
  protected abstract AbstractWaitingMessageFactory<INCOMING_MESSAGE,WAITING_MESSAGE> getWaitingMessageFactory();

}
