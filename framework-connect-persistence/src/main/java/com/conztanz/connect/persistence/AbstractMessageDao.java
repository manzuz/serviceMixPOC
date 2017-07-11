package com.conztanz.connect.persistence;

import com.conztanz.connect.model.AbstractMessage;
import com.conztanz.exception.ConztanzException;
import com.conztanz.exception.NotFoundException;
import com.conztanz.exception.PersistenceException;
import com.conztanz.model.jpa.ConztanzField.ConztanzFieldSimple;
import com.conztanz.persistence.AbstractEntityDaoImpl;
import com.conztanz.persistence.jpa.data.ConztanzData;
import com.conztanz.transport.ConztanzResultList;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by User on 6/28/2017.
 */
public abstract class AbstractMessageDao<OBJECT_ID,
                                         MESSAGE extends AbstractMessage<OBJECT_ID>>
        extends AbstractEntityDaoImpl<MESSAGE>
{
  /**
   * Constructor
   *
   * @param messageClass Entity class handled by the DAO
   */
  protected AbstractMessageDao(Class<MESSAGE> messageClass)
  {
    super(messageClass);
  }

  /**
   * @param objectId
   * @return
   * @throws PersistenceException
   * @throws NotFoundException
   */
  public MESSAGE getOne(OBJECT_ID objectId) throws PersistenceException, NotFoundException
  {
    return this.getOne(this.buildObjectIdCriteria(objectId));
  }

  /**
   *
   * @param objectId
   * @return
   * @throws PersistenceException
   */
  public ConztanzResultList<MESSAGE> findList(OBJECT_ID objectId) throws PersistenceException
  {
    return super.findList(this.buildObjectIdCriteria(objectId));
  }

  /**
   * @param objectIds
   * @return
   */
  @Transactional(readOnly = true, rollbackFor = {ConztanzException.class}, propagation = Propagation.SUPPORTS)
  public ConztanzData<MESSAGE, OBJECT_ID> buildObjectIdCriteria(OBJECT_ID... objectIds)
  {
    return this.buildData(this.buildObjectIdField(), objectIds);
  }

  /**
   * @return
   */
  @Transactional(readOnly = true, rollbackFor = {ConztanzException.class}, propagation = Propagation.SUPPORTS)
  public abstract ConztanzFieldSimple<MESSAGE, OBJECT_ID> buildObjectIdField();


}
