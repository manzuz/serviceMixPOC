package com.conztanz.connect;

import javax.inject.Singleton;

import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.initialize.AbstractConnectInitializer;
import com.conztanz.connect.model.PFSIncomingMessage;
import com.conztanz.connect.transform.travel.airimp.PFSSmooksTransformer;
import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;

/**
 * 
 * @author User
 *
 */

@Singleton
public class PFSConnectInitializerWrapper extends AbstractConnectInitializer<PFSSmooksTransformer, PFSIncomingMessage> {

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
