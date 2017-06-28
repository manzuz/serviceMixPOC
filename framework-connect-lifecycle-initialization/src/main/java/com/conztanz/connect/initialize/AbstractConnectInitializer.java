package com.conztanz.connect.initialize;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.transform.IConnectTransformer;
import com.conztanz.connect.transform.exception.ConnectTransformationException;

/**
 * @param <TRANSFORMER>
 * @param <MESSAGE>
 * @author User
 */
public abstract class AbstractConnectInitializer<TRANSFORMER extends IConnectTransformer,
                                                 MESSAGE extends IncomingMessage>
        implements IConnectInitializer<MESSAGE>
{


  public MESSAGE init(byte[] payload) throws ConnectTransformationException
  {
    MESSAGE m = this.getMessageFactory().createMessage(payload);
    String transformedPayload = this.getTransformer().transform2XML(payload);
    m.setTransformedPayload(transformedPayload);
    return m;
  }

  /**
   * @return
   */
  protected abstract AbstractIncomingMessageFactory<MESSAGE> getMessageFactory();

  /**
   *
   */
  protected abstract TRANSFORMER getTransformer();

}
