package com.conztanz.connect.travel.model;

import com.conztanz.connect.model.IncomingMessage;

public class PFSIncomingMessage extends IncomingMessage<String> {

	public PFSIncomingMessage(byte[] rawPayload ) {
		super(rawPayload);
	}

}
