package com.conztanz.connect.camel;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.conztanz.connect.PFSConnectInitializerWrapper;
import com.conztanz.connect.identification.PFSConnectIdentifier;
import com.conztanz.connect.processor.FileProcessor;
import com.conztanz.transform.delivery.Delivery;

@Singleton
public class PFSOrchestrationFileSystemCamelRoute extends AbstractOrchestrationCamelRoute<PFSConnectInitializerWrapper, FileProcessor,Delivery,PFSConnectIdentifier> {
//
//	@Inject
//	private PFSConnectInitializer pFSConnectInitializer;
//
//	@Inject
//	private FileProcessor fileProcessor;
//	
//	@Inject
//	PFSConnectIdentifier pfsconnectIdentifier ;
	
	@Inject
	PFSConnectInitializerWrapper pFSConnectInitializerWrapper ; 

	@Override
	public PFSConnectInitializerWrapper getInitializer() {
		return pFSConnectInitializerWrapper;
	}

	@Override
	public String getRouteEndpoint() {
		return "file:camel/PFSinput";
	}

	@Override
	public FileProcessor getProcessor() {
		return null;
	}

	@Override
	public PFSConnectIdentifier getIdentifier() {
		return null;
	}

}
