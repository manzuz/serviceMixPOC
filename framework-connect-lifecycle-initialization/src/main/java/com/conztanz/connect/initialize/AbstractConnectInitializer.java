package com.conztanz.connect.initialize;


import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.connect.transform.exception.ConnectTransformationException;

/**
 * @param <TRANSFORMER>
 * @param <MESSAGE>
 * @author User
 */
public abstract class AbstractConnectInitializer< TRANSFORMER extends AbstractConnectSmooksTransformer,
                                                  MESSAGE extends IncomingMessage>
        implements IAbstractConnectInitializer<TRANSFORMER, MESSAGE>
{


  //	@TransactionIdentifiable
//	@Transactional(value = TxType.REQUIRED, rollbackOn = { ConztanzException.class })
  public MESSAGE init(byte[] payload) throws ConnectTransformationException
  {
    MESSAGE m = this.getMessageFactory().createMessage(payload);
    String transformedPayload = this.getSmooksTransformer().transform2XML(payload);
    m.setTransformedPayload(transformedPayload);
    return m;
  }

  /**
   * @return
   */
  public abstract AbstractIncomingMessageFactory<MESSAGE> getMessageFactory();

  /**
   *
   */
  public abstract TRANSFORMER getSmooksTransformer();

}
