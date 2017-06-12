package com.conztanz.connect.travel.model;

import com.conztanz.connect.model.IncomingMessage;

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
	public SBR141IncomingMessage(byte[] rawPayload ) {
		super(rawPayload);
	}

}
