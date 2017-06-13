package com.conztanz.connect.camel;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.conztanz.connect.identification.wrapping.PFSConnectIdentifierWrapper;
import com.conztanz.connect.initialization.wrapping.PFSConnectInitializerWrapper;
import com.conztanz.connect.processor.FileProcessor;
import com.conztanz.transform.delivery.Delivery;

@Singleton
public class PFSOrchestrationFileSystemCamelRoute extends AbstractOrchestrationCamelRoute<PFSConnectInitializerWrapper, FileProcessor,PFSConnectIdentifierWrapper> {
//	@Inject
//	private FileProcessor fileProcessor;
//	
	@Inject
	PFSConnectIdentifierWrapper pFSConnectIdentifierWrapper ;
	
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
	public PFSConnectIdentifierWrapper getIdentifier() {
		return pFSConnectIdentifierWrapper;
	}

	

}
