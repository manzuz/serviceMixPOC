package com.conztanz.connect.identification;

import org.jibx.runtime.JiBXException;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.marshalling.AbstractConztanzUnmarshaller;

/**
 * 
 * @author User
 *
 * @param <BINDING>
 * @param <UNMARSHALLER>
 */
public abstract class AbstractConnectIdentifier<BINDING,
												UNMARSHALLER extends AbstractConztanzUnmarshaller<BINDING>> {
/**
 * 
 * @param incomingMessage
 * @return
 * @throws JiBXException
 */
	public BINDING unmarshall(String payload ) throws JiBXException {
		BINDING binding = this.getUnmarshaller().unmarshall(payload);
		return binding;
		
	}
	/**
	 * 
	 * @return
	 */
	public abstract UNMARSHALLER getUnmarshaller();
	
	/**
	 * 
	 * @param incomingMessage
	 * @return
	 * @throws JiBXException 
	 */
	public abstract String identify(IncomingMessage incomingMessage) throws JiBXException;

}
