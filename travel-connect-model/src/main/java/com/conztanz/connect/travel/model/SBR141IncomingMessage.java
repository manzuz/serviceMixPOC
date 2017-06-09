package com.conztanz.connect.travel.model;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.MessageType;

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
