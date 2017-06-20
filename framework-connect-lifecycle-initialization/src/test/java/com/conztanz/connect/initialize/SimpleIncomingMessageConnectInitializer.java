package com.conztanz.connect.initialize;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.factory.SimpleIncomingMessageFactory;
import com.conztanz.connect.factory.SimpleIncomingMessage;
import com.conztanz.connect.transform.SimpleMessageConnectSmooksTransformer;

public class SimpleIncomingMessageConnectInitializer
		extends AbstractConnectInitializer<SimpleMessageConnectSmooksTransformer, SimpleIncomingMessage> {

	@Autowired
	private SimpleMessageConnectSmooksTransformer pFSConnectSmooksTransformer;

	@Autowired
	private SimpleIncomingMessageFactory simpleIncomingMessageFactory;

	@Override
	public AbstractIncomingMessageFactory<SimpleIncomingMessage> getMessageFactory() {
		return simpleIncomingMessageFactory;
	}

	@Override
	public SimpleMessageConnectSmooksTransformer getSmooksTransformer() {
		return pFSConnectSmooksTransformer;
	}

}
