package com.conztanz.connect.initialize;


import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.connect.transform.IConnectTransformer;
import com.conztanz.connect.transform.exception.ConnectTransformationException;

/**
 *
 * @param <MESSAGE>
 */
public interface IConnectInitializer<MESSAGE extends IncomingMessage>
{

  /**
   *
   * @param payload
   * @return
   * @throws ConnectTransformationException
   */
	public MESSAGE init(byte[] payload) throws ConnectTransformationException;

}
