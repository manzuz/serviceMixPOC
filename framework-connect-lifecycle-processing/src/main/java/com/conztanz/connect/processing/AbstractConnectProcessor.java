package com.conztanz.connect.processing;

import com.conztanz.connect.processing.exceptions.UnMarshallingException;
import com.conztanz.connect.processing.marshalling.AbstractConztanzUnmarshaller;
import com.conztanz.connect.model.IncomingMessage;
import org.jibx.runtime.JiBXException;

/**
 * Created by User on 7/3/2017.
 */
public abstract class AbstractConnectProcessor<BINDING,
                                               INCOMING_MESSAGE extends IncomingMessage<?>>
        implements IAbstractConnectProcessor<BINDING,INCOMING_MESSAGE>
{
  /**
   * @param incomingMessage
   * @return
   * @throws UnMarshallingException
   */
  @Override
  public BINDING process(INCOMING_MESSAGE incomingMessage) throws UnMarshallingException
  {
    BINDING binding = null;
    try
    {
      binding = this.getUnmarshaller().unmarshall(incomingMessage.getTransformedPayload());
    }
    catch (JiBXException e)
    {
      throw new UnMarshallingException(e);
    }
    return binding;
  }


  /**
   * @param <UNMARSHALLER>
   * @return
   */
  public abstract <UNMARSHALLER extends AbstractConztanzUnmarshaller<BINDING>> UNMARSHALLER getUnmarshaller();
}
