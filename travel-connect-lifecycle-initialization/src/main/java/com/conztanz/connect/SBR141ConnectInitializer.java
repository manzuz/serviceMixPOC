package com.conztanz.connect;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.factory.SBR14IncomingMessageFactory;
import com.conztanz.connect.initialize.AbstractConnectInitializer;
import com.conztanz.connect.transform.travel.sbr.SBR141EDI2XMLSmooksTransformer;
import com.conztanz.connect.travel.model.SBR141IncomingMessage;



//@Singleton
public class SBR141ConnectInitializer
		extends AbstractConnectInitializer<SBR141EDI2XMLSmooksTransformer, SBR141IncomingMessage> {

	@Autowired
	private SBR14IncomingMessageFactory sBR14IncomingMessageFactory;

	@Autowired
	private SBR141EDI2XMLSmooksTransformer sBR141EDI2XMLSmooksTransformer;

	@Override
	public AbstractIncomingMessageFactory<SBR141IncomingMessage> getMessageFactory() {
		return sBR14IncomingMessageFactory;
	}

	@Override
	public SBR141EDI2XMLSmooksTransformer getSmooksTransformer() {
		return sBR141EDI2XMLSmooksTransformer;
	}

}
