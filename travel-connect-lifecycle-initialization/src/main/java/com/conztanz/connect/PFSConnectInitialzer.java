package com.conztanz.connect;

import com.conztanz.connect.factory.AbstractIncomingMessageFactory;
import com.conztanz.connect.factory.PFSIncomingMessageFactory;
import com.conztanz.connect.initialize.AbstractConnectInitialzer;
import com.conztanz.connect.transform.travel.airimp.PFSSmooksTransformer;

/**
 * 
 * @author User
 *
 */
public class PFSConnectInitialzer extends AbstractConnectInitialzer<PFSSmooksTransformer, PFSIncomingMessage> {


	// @Autowired
	private PFSIncomingMessageFactory pFSIncomingMessageFactory = new PFSIncomingMessageFactory();

	// @Autowired
	private PFSSmooksTransformer pFSSmooksTransformer = new PFSSmooksTransformer();

	@Override
	public AbstractIncomingMessageFactory<PFSIncomingMessage> getMessageFactory() {
		return pFSIncomingMessageFactory;
	}

	@Override
	public PFSSmooksTransformer getSmooksTransformer() {
		return pFSSmooksTransformer;
	}

}
