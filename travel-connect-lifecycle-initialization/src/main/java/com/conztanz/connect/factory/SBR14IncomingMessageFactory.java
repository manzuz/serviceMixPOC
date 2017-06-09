package com.conztanz.connect.factory;

import com.conztanz.connect.model.MessageType;
import com.conztanz.connect.travel.model.SBR141IncomingMessage;
//@Singleton
public class SBR14IncomingMessageFactory extends AbstractIncomingMessageFactory<SBR141IncomingMessage>{

	@Override
	public SBR141IncomingMessage createMessage(byte[] payload) {
		return new SBR141IncomingMessage(payload,MessageType.SBR);
	}

}
