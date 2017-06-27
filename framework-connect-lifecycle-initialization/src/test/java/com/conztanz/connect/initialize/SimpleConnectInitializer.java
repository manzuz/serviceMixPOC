package com.conztanz.connect.initialize;

import com.conztanz.connect.factory.SimpleIncomingMessageFactory;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.transform.SimpleMessageConnectSmooksTransformer;

public class SimpleConnectInitializer
		extends AbstractConnectInitializer<SimpleMessageConnectSmooksTransformer, SimpleSequencedIncomingMessage>
{

	@Autowired
	private SimpleMessageConnectSmooksTransformer smooksTransformer;

	@Autowired
	private SimpleIncomingMessageFactory simpleIncomingMessageFactory;

	@Override
	public SimpleIncomingMessageFactory getMessageFactory() {
		return simpleIncomingMessageFactory;
	}

	@Override
	public SimpleMessageConnectSmooksTransformer getSmooksTransformer() {
		return smooksTransformer;
	}

}
