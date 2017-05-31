package com.conztanz.connect.initialize;

import com.conztanz.connect.IncomingMessage;
import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;

/**
 * 
 * @author User
 *
 * @param <TRANSFORMER>
 * @param <MESSAGE>
 */
public abstract class AbstractConnectInitialzer<TRANSFORMER extends AbstractConnectSmooksTransformer, MESSAGE extends IncomingMessage> {

	public MESSAGE init(byte[] payload) {
		MESSAGE m = this.getMessageFactory().createMessage(payload);
		String transformedPayload = this.getSmooksTransformer().transform2XML(payload);
		m.setTransformedPayload(transformedPayload);
		return m;
	}

	/**
	 * 
	 * @return
	 */
	public abstract AbstractIncomingMessageFactory<MESSAGE> getMessageFactory();

	/**
	 * 
	 */
	public abstract TRANSFORMER getSmooksTransformer();

}
