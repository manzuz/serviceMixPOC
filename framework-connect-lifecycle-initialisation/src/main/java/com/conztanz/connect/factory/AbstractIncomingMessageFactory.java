package com.conztanz.connect.factory;

import com.conztanz.connect.IncomingMessage;

public abstract class AbstractIncomingMessageFactory<MESSAGE extends IncomingMessage> {
	
	
	
	/**
	 * 
	 * @param payload
	 * @return
	 */
	public abstract MESSAGE createMessage(byte[] payload);

}
