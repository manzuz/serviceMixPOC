package com.conztanz.connect.camel;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.PFSConnectInitializer;
import com.conztanz.connect.identification.ConnectIdentifier;
import com.conztanz.connect.processor.FileProcessor;

@Singleton
public class PFSOrchestrationFileSystemCamelRoute extends AbstractOrchestrationCamelRoute<PFSConnectInitializer, FileProcessor,ConnectIdentifier> {

	@Autowired
	private PFSConnectInitializer pFSConnectInitializer;

	@Autowired
	private FileProcessor fileProcessor;
	
	@Autowired 
	ConnectIdentifier connectIdentifier ;

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
	public ConnectIdentifier getIdentifier() {
		return connectIdentifier;
	}

}
