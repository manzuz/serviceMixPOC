package com.conztanz.connect.identification;

import org.jibx.runtime.JiBXException;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.marshalling.AbstractConztanzUnmarshaller;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;

/**
 * 
 * @author User
 *
 * @param <UNMARSHALLER>
 */
public abstract class AbstractConnectIdentifier< UNMARSHALLER extends AbstractConztanzUnmarshaller<ForPnrHandling>> {
	/**
	 * 
	 * @param payLoad
	 * @return
	 * @throws JiBXException
	 */
	public String identify(IncomingMessage incomingMessage) throws JiBXException {
		ForPnrHandling forPnrHandling = this.getUnmarshaller().unmarshall(incomingMessage.getTransformedPayload());
		System.out.println(forPnrHandling.getAgency());
		System.out.println(forPnrHandling.getVersion());
		System.out.println(forPnrHandling.getType());
		System.out.println(forPnrHandling.getType());
		System.out.println(forPnrHandling.getSequenceNum());
		return "lol";
	}

	public abstract UNMARSHALLER getUnmarshaller();

}
