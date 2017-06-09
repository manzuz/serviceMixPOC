package com.conztanz.connect.initialization.wrapping;

import javax.inject.Singleton;

import com.conztanz.connect.SBR141ConnectInitializer;
import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.initialize.IAbstractConnectInitializer;
import com.conztanz.connect.transform.travel.sbr.SBR141EDI2XMLSmooksTransformer;
import com.conztanz.connect.travel.model.SBR141IncomingMessage;
import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;



@Singleton
public class SBR141ConnectInitializerWrapper
		implements IAbstractConnectInitializer<SBR141EDI2XMLSmooksTransformer, SBR141IncomingMessage> {

	
	@Override
	public AbstractIncomingMessageFactory<SBR141IncomingMessage> getMessageFactory() {
		return   ConztanzSpringApplicationContext.getBean(SBR141ConnectInitializer.class).getMessageFactory();
	}

	@Override
	public SBR141EDI2XMLSmooksTransformer getSmooksTransformer() {
		return ConztanzSpringApplicationContext.getBean(SBR141ConnectInitializer.class).getSmooksTransformer();
	}

	@Override
	public SBR141IncomingMessage init(byte[] payload) {
		return ConztanzSpringApplicationContext.getBean(SBR141ConnectInitializer.class).init(payload);
	}

}
