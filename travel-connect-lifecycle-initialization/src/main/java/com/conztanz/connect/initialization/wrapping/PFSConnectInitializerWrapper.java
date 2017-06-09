package com.conztanz.connect.initialization.wrapping;

import javax.inject.Singleton;

import com.conztanz.connect.PFSConnectInitializer;
import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.initialize.IAbstractConnectInitializer;
import com.conztanz.connect.transform.travel.airimp.PFSSmooksTransformer;
import com.conztanz.connect.travel.model.PFSIncomingMessage;
import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;

/**
 * 
 * @author User
 *
 */

@Singleton
public class PFSConnectInitializerWrapper implements IAbstractConnectInitializer<PFSSmooksTransformer, PFSIncomingMessage> {

	public PFSIncomingMessage init(byte[] payload) {
		return ConztanzSpringApplicationContext.getBean(PFSConnectInitializer.class).init(payload);
	}

	@Override
	public AbstractIncomingMessageFactory<PFSIncomingMessage> getMessageFactory() {
		return ConztanzSpringApplicationContext.getBean(PFSConnectInitializer.class).getMessageFactory();
	}

	@Override
	public PFSSmooksTransformer getSmooksTransformer() {
		return ConztanzSpringApplicationContext.getBean(PFSConnectInitializer.class).getSmooksTransformer();
	}
}
