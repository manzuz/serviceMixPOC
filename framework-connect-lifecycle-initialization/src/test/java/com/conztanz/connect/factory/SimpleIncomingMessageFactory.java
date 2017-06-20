package com.conztanz.connect.factory;

public class SimpleIncomingMessageFactory extends AbstractIncomingMessageFactory<SimpleIncomingMessage>
{

	@Override
	public SimpleIncomingMessage createMessage(byte[] payload) {
		return new SimpleIncomingMessage(payload);
	}

}
