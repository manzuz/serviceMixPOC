package com.conztanz.connect.factory;

import com.conztanz.connect.travel.model.PFSIncomingMessage;


/**
 * 
 * @author User
 *
 */
//@Singleton
public class PFSIncomingMessageFactory extends AbstractIncomingMessageFactory<PFSIncomingMessage> {
	
	
	/**
	 * 
	 */
	@Override
	public PFSIncomingMessage createMessage(byte[] payload) {
		return new PFSIncomingMessage(payload);

	}

}
