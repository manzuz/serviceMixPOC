package com.conztanz.connect.factory;

import javax.inject.Singleton;

import com.conztanz.connect.MessageType;
import com.conztanz.connect.PFSIncomingMessage;


/**
 * 
 * @author User
 *
 */
@Singleton
public class PFSIncomingMessageFactory extends AbstractIncomingMessageFactory<PFSIncomingMessage> {
	
	
	/**
	 * 
	 */
	@Override
	public PFSIncomingMessage createMessage(byte[] payload) {
		return new PFSIncomingMessage(payload, MessageType.PFS);

	}

}
