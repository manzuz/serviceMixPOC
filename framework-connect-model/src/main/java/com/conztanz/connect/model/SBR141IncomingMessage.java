package com.conztanz.connect.model;

/**
 * 
 * @author User
 *
 */
public class SBR141IncomingMessage extends IncomingMessage {
	/**
	 * 
	 * @param rawPayload
	 * @param messageType
	 */
	public SBR141IncomingMessage(byte[] rawPayload, MessageType messageType) {
		super(rawPayload, messageType);
	}

}
