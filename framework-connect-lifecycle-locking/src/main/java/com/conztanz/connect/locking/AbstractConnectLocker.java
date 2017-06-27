package com.conztanz.connect.locking;


import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.WorkingMessage;
import com.conztanz.connect.persistence.WorkingMessageDao;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.exception.UniqueViolationException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @param <OBJECT_ID>
 * @param <INCOMING_MESSAGE>
 * @param <WORKING_MESSAGE>
 * @param <DAO>
 * @param <FACTORY>
 */
@Transactional(value = "ConztanzTransactionManager", propagation = Propagation.MANDATORY,
        readOnly = false, rollbackFor = {ConztanzException.class})
public abstract class AbstractConnectLocker<OBJECT_ID,
                                            INCOMING_MESSAGE  extends IncomingMessage<OBJECT_ID>,
                                            WORKING_MESSAGE  extends WorkingMessage<OBJECT_ID,INCOMING_MESSAGE>,
                                            DAO     extends WorkingMessageDao<OBJECT_ID,WORKING_MESSAGE>,
                                            FACTORY extends  AbstractWorkingMessageFactory<OBJECT_ID,INCOMING_MESSAGE,WORKING_MESSAGE>>
{
  /**
   * @param objectId
   * @return
   * @throws PersistenceException
   */
  protected WORKING_MESSAGE lockBySelectFirst(OBJECT_ID objectId) throws PersistenceException
  {
    WORKING_MESSAGE workingMessage;
    try
    {
      workingMessage = this.getDAO().lock(objectId);
    }
    catch (NotFoundException nfe)
    {
      workingMessage = this.getWorkingMessageFactory().create(objectId);
      workingMessage = this.getDAO().addToto(workingMessage);
    }
    return workingMessage;
  }

  /**
   * @param objectId
   * @return
   * @throws PersistenceException
   */
  protected WORKING_MESSAGE lockByInsertFirst(OBJECT_ID objectId) throws PersistenceException
  {
    WORKING_MESSAGE workingMessage;
    try
    {
      workingMessage = this.getWorkingMessageFactory().create(objectId);
      workingMessage = this.getDAO().addToto(workingMessage);
    }
    catch (UniqueViolationException nfe)
    {
      workingMessage = this.getDAO().lock(objectId);
    }
    return workingMessage;
  }

  /**
   *
   * @param objectId
   * @return
   * @throws PersistenceException
   */
  public abstract WORKING_MESSAGE lock(OBJECT_ID objectId) throws PersistenceException;

  /**
   * @return
   */
  public abstract DAO getDAO();

  /**
   * @return
   */
  public abstract FACTORY getWorkingMessageFactory();
}
