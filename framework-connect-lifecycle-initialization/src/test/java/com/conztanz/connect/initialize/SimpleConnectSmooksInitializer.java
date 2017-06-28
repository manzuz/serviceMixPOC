package com.conztanz.connect.initialize;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.factory.SimpleIncomingMessageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.transform.SimpleMessageConnectSmooksTransformer;

public class SimpleConnectSmooksInitializer
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
	public SimpleMessageConnectSmooksTransformer getTransformer()
  {
		return smooksTransformer;
	}

}
