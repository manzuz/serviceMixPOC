package com.conztanz.connect.factory;

import com.conztanz.connect.model.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.travel.model.SBRIncomingMessage;
//@Singleton
public class SBR14IncomingMessageFactory extends AbstractIncomingMessageFactory<SBRIncomingMessage>
{

	@Override
	public SBRIncomingMessage createMessage(byte[] payload) {
		return new SBRIncomingMessage(payload);
	}

}
