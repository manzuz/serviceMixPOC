package com.conztanz.connect.camel;


import com.conztanz.connect.continuity.ContinuityChecker;
import com.conztanz.connect.exception.*;
import com.conztanz.connect.identification.IAbstractConnectIdentifier;
import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.initialize.IAbstractConnectInitializer;
import com.conztanz.connect.locking.AbstractConnectLocker;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.connect.persistence.IIncomingMessageDao;
import com.conztanz.connect.persistence.IWaitingMessageDao;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import com.conztanz.exception.PersistenceException;
import javassist.bytecode.analysis.ControlFlow.Block;

/**
 *
 * @author User
 *
 * @param <INITIALIZER>
 * @param <IDENTIFIER>
 *   TODO : move generics
 */
public abstract class AbstractLifeCycleOrchestrator<OBJECT_ID,
                                                    INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>,
                                                    WORKING_MESSAGE extends WorkingMessage<OBJECT_ID,INCOMING_MESSAGE>,
                                                    INITIALIZER extends IAbstractConnectInitializer<? extends AbstractConnectSmooksTransformer,INCOMING_MESSAGE >,
													                          IDENTIFIER extends IAbstractConnectIdentifier<INCOMING_MESSAGE>>
{

  /**
   *
   * @param payload
   * @throws ConnectTransformationException
   * @throws ConnectIdentificationException
   */
  public void startLifeCycle(byte[] payload) throws ConnectTransformationException, ConnectIdentificationException, PersistenceException, BlockedContinuityException, SequenceContinuityException
  {
    WORKING_MESSAGE workingMessage = null;
    INCOMING_MESSAGE incomingMessage;

    // INITIALISATION
    incomingMessage = this.getInitializer().init(payload);

    // IDENTIFICATION
    this.getIdentifier().identify(incomingMessage);

    //LOCKING
    try
    {
      workingMessage = this.getLocker().lock(incomingMessage.getObjectId());
    }
    catch (PersistenceException e)
    {
      // TODO how dealt to with it ?
      e.printStackTrace();
    }

    //CONTINUITY
    try
    {
      this.getContinuityChecker().checkContinuity(incomingMessage, workingMessage);
    }
    catch (BlockedContinuityException e)
    {
      //TODO add to waiting
      this.getWaitingMessageDao().add(incomingMessage);
      e.printStackTrace();
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
  public abstract INITIALIZER getInitializer();



  /**
   * @return
   */
  public abstract IDENTIFIER getIdentifier();

  /**
   * @return
   */
  public abstract AbstractConnectLocker<OBJECT_ID,INCOMING_MESSAGE, WORKING_MESSAGE, ?, ?> getLocker();

  /**
   *
   * @return
   */
  public abstract ContinuityChecker<OBJECT_ID, INCOMING_MESSAGE, WORKING_MESSAGE> getContinuityChecker();

  /**
   *
   * @return
   */
  public abstract IWaitingMessageDao<OBJECT_ID,INCOMING_MESSAGE> getWaitingMessageDao();

  /**
   *
   * @return
   */
  public abstract IIncomingMessageDao<OBJECT_ID,INCOMING_MESSAGE> getIncomingMessageDao();

}
