package com.conztanz.connect.camel;


import com.conztanz.connect.continuity.ContinuityChecker;
import com.conztanz.connect.exception.KOContinuityException;
import com.conztanz.connect.exception.SequenceContinuityException;
import com.conztanz.connect.exception.WORKINGContinuityException;
import com.conztanz.connect.identification.IAbstractConnectIdentifier;
import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.initialize.IAbstractConnectInitializer;
import com.conztanz.connect.locking.AbstractConnectLocker;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import com.conztanz.exception.PersistenceException;

/**
 *
 * @author User
 *
 * @param <INITIALIZER>
 * @param <IDENTIFIER>
 *   TODO : move generics
 */
public abstract class AbstractLifeCycleOrchestrator<OBJECT_ID,
                                                    WORKING_MESSAGE extends WorkingMessage<OBJECT_ID>,
                                                    INCOMING_MESSAGE extends IncomingMessage<OBJECT_ID>,
                                                    INITIALIZER extends IAbstractConnectInitializer<? extends AbstractConnectSmooksTransformer,INCOMING_MESSAGE >,
													                          IDENTIFIER extends IAbstractConnectIdentifier<INCOMING_MESSAGE>>
{

  /**
   *
   * @param payload
   * @throws ConnectTransformationException
   * @throws ConnectIdentificationException
   */
  public void startLifeCycle(byte[] payload) throws ConnectTransformationException , ConnectIdentificationException
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
      workingMessage = this.getLocker().lockByInsertFirst(incomingMessage.getObjectId());
    }
    catch (PersistenceException e)
    {
      // TODO dealt with it
      e.printStackTrace();
    }

    //CONTINUITY
    try
    {
      this.getContinuityChecker().checkContinuity(incomingMessage, workingMessage);
    }
    catch (KOContinuityException | WORKINGContinuityException | SequenceContinuityException e)
    {
      //TODO add to waiting
      e.printStackTrace();
    }
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
  public abstract AbstractConnectLocker<OBJECT_ID, WORKING_MESSAGE, ?, ?> getLocker();

  /**
   *
   * @return
   */
  public abstract ContinuityChecker<OBJECT_ID, INCOMING_MESSAGE, WORKING_MESSAGE> getContinuityChecker();

}
