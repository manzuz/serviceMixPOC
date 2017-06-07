package com.conztanz.connect.initialize;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.exception.ConztanzException;

/**
 * 
 * @author User
 *
 * @param <TRANSFORMER>
 * @param <MESSAGE>
 */
public abstract class AbstractConnectInitializer<TRANSFORMER extends AbstractConnectSmooksTransformer, MESSAGE extends IncomingMessage> {
	
	
	
	@Transactional(value = TxType.REQUIRED, rollbackOn = { ConztanzException.class })
	public MESSAGE init(byte[] payload) {
		MESSAGE m = this.getMessageFactory().createMessage(payload);
		String transformedPayload = this.getSmooksTransformer().transform2XML(payload);
//		System.out.println(transformedPayload);
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
