package com.conztanz.connect;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.factory.PFSIncomingMessageFactory;
import com.conztanz.connect.initialize.AbstractConnectInitializer;
import com.conztanz.connect.model.PFSIncomingMessage;
import com.conztanz.connect.transform.travel.airimp.PFSSmooksTransformer;

/**
 * 
 * @author User
 *
 */

//@Singleton
//@Component()
public class PFSConnectInitializer extends AbstractConnectInitializer<PFSSmooksTransformer, PFSIncomingMessage> {

	@Autowired
	private PFSIncomingMessageFactory pFSIncomingMessageFactory;

	@Autowired
	private PFSSmooksTransformer pFSSmooksTransformer;

	@Override
	public AbstractIncomingMessageFactory<PFSIncomingMessage> getMessageFactory() {
		return pFSIncomingMessageFactory;
	}

	@Override
	public PFSSmooksTransformer getSmooksTransformer() {
		return pFSSmooksTransformer;
	}

}
