package com.conztanz.connect.travel.model;

import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.model.MessageType;

public class PFSIncomingMessage extends IncomingMessage {

	public PFSIncomingMessage(byte[] rawPayload,MessageType messageType) {
		super(rawPayload,messageType);
	}

}
