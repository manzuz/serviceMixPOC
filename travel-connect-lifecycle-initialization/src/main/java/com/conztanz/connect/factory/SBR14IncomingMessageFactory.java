package com.conztanz.connect.factory;

import javax.inject.Singleton;

import com.conztanz.connect.model.MessageType;
import com.conztanz.connect.model.SBR14IncomingMessage;
@Singleton
public class SBR14IncomingMessageFactory extends AbstractIncomingMessageFactory<SBR14IncomingMessage>{

	@Override
	public SBR14IncomingMessage createMessage(byte[] payload) {
		return new SBR14IncomingMessage(payload,MessageType.SBR);
	}

}
