package com.conztanz.connect.initialize;


import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.connect.transform.exception.ConnectTransformationException;

/**
 * 
 * @author User
 *
 * @param <TRANSFORMER>
 * @param <MESSAGE>
 */
public interface IAbstractConnectInitializer<TRANSFORMER extends AbstractConnectSmooksTransformer, 
											 MESSAGE extends IncomingMessage
											> 
{
	
	/**
	 * 
	 * @param payload
	 * @return
	 */
	public MESSAGE init(byte[] payload) throws ConnectTransformationException;

	/**
	 * 
	 * @return
	 */
	public   AbstractIncomingMessageFactory<MESSAGE> getMessageFactory();

	/**
	 * 
	 */
	public   TRANSFORMER getSmooksTransformer();

}
