package com.conztanz.connect.model;

/**
 * 
 * @author User
 *
 */
public class SBR14IncomingMessage extends IncomingMessage {
	/**
	 * 
	 * @param rawPayload
	 * @param messageType
	 */
	public SBR14IncomingMessage(byte[] rawPayload, MessageType messageType) {
		super(rawPayload, messageType);
	}

}
