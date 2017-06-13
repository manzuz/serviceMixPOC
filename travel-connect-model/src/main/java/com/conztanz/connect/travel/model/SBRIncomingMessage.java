package com.conztanz.connect.travel.model;

import com.conztanz.connect.model.IncomingMessage;

/**
 * 
 * @author User
 *
 */
public class SBRIncomingMessage extends IncomingMessage<SBRObjectID> {
	/**
	 *
	 * @param rawPayload
	 */
	public SBRIncomingMessage(byte[] rawPayload ) {

		super(rawPayload);
	}

}
