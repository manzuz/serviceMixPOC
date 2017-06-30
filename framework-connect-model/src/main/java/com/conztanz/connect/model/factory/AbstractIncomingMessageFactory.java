package com.conztanz.connect.model.factory;

import com.conztanz.connect.model.IncomingMessage;

public abstract class AbstractIncomingMessageFactory<MESSAGE extends IncomingMessage> {
	
	
	
	/**
	 * 
	 * @param payload
	 * @return
	 */
	public abstract MESSAGE createMessage(byte[] payload);

}