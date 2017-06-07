package com.conztanz.connect.identification;

import org.jibx.runtime.JiBXException;

import com.conztanz.marshalling.AbstractConztanzUnmarshaller;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;

/**
 * 
 * @author User
 *
 * @param <UNMARSHALLER>
 */
public abstract class AbstractConnectIdentifier< UNMARSHALLER extends AbstractConztanzUnmarshaller<ForPnrHandling>> {

	public String identify(String payLoad) throws JiBXException {
		ForPnrHandling forPnrHandling = this.getUnmarshaller().unmarshall(payLoad);
		System.out.println(forPnrHandling.getAgency());
		System.out.println(forPnrHandling.getVersion());
		System.out.println(forPnrHandling.getType());
		return "lol";
	}

	public abstract UNMARSHALLER getUnmarshaller();

}
