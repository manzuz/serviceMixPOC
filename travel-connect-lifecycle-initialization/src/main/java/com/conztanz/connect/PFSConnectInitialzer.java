package com.conztanz.connect;

import org.springframework.beans.factory.annotation.Autowired;

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
