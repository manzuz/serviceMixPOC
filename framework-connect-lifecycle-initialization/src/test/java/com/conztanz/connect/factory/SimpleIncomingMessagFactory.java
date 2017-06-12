package com.conztanz.connect.factory;

public class SimpleIncomingMessagFactory extends AbstractIncomingMessageFactory<SimpleIncomingMessage> {

	@Override
	public SimpleIncomingMessage createMessage(byte[] payload) {
		return new SimpleIncomingMessage(payload);
	}

}
