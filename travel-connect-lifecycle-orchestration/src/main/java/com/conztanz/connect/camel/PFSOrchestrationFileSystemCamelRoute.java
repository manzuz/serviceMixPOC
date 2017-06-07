package com.conztanz.connect.camel;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.PFSConnectInitializer;
import com.conztanz.connect.identification.PFSConnectIdentifier;
import com.conztanz.connect.processor.FileProcessor;
import com.conztanz.transform.delivery.Delivery;

@Singleton
public class PFSOrchestrationFileSystemCamelRoute extends AbstractOrchestrationCamelRoute<PFSConnectInitializer, FileProcessor,Delivery,PFSConnectIdentifier> {

	@Autowired
	private PFSConnectInitializer pFSConnectInitializer;

	@Autowired
	private FileProcessor fileProcessor;
	
	@Autowired 
	PFSConnectIdentifier pfsconnectIdentifier ;

	@Override
	public PFSConnectInitializer getInitializer() {
		return pFSConnectInitializer;
	}

	@Override
	public String getRouteEndpoint() {
		return "file:camel/PFSinput";
	}

	@Override
	public FileProcessor getProcessor() {
		return fileProcessor;
	}

	@Override
	public PFSConnectIdentifier getIdentifier() {
		return pfsconnectIdentifier;
	}

}
