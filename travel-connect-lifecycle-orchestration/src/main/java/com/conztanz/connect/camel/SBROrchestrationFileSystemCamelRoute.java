package com.conztanz.connect.camel;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.SBR141ConnectInitializer;
import com.conztanz.connect.identification.SBR141ConnectIdentifier;
import com.conztanz.connect.processor.FileProcessor;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;


@Singleton
public class SBROrchestrationFileSystemCamelRoute extends AbstractOrchestrationCamelRoute<SBR141ConnectInitializer, FileProcessor,ForPnrHandling,SBR141ConnectIdentifier>{
	
	@Autowired
	private SBR141ConnectInitializer sBR14ConnectInitializer ;
	
	@Autowired
	private FileProcessor fileProcessor;
	
	@Autowired 
	SBR141ConnectIdentifier connectIdentifier ;
	
	
	@Override
	public SBR141ConnectInitializer getInitializer() {
		return sBR14ConnectInitializer;
	}

	@Override
	public FileProcessor getProcessor() {
		return fileProcessor;
	}

	@Override
	public String getRouteEndpoint() {
		return "file:camel/EDIinput";
	}

	@Override
	public SBR141ConnectIdentifier getIdentifier() {
		return connectIdentifier;
	}
}
