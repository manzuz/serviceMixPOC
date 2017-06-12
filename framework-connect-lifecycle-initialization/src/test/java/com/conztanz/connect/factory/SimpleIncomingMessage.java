package com.conztanz.connect.factory;

import com.conztanz.connect.model.IncomingMessage;

public class SimpleIncomingMessage extends IncomingMessage {

	public SimpleIncomingMessage(byte[] rawPayload) {
		super(rawPayload);
	}

}
