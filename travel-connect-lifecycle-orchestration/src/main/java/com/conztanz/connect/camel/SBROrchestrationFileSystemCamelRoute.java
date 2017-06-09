package com.conztanz.connect.camel;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.conztanz.connect.identification.wrapping.SBR141ConnectIdentifierWrapper;
import com.conztanz.connect.initialization.wrapping.SBR141ConnectInitializerWrapper;
import com.conztanz.connect.processor.FileProcessor;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;

@Singleton
public class SBROrchestrationFileSystemCamelRoute extends
		AbstractOrchestrationCamelRoute<SBR141ConnectInitializerWrapper, FileProcessor, ForPnrHandling, SBR141ConnectIdentifierWrapper> {

	@Inject
	private SBR141ConnectInitializerWrapper sBR14ConnectInitializerWrapper;

	// @Autowired
	private FileProcessor fileProcessor;

	@Inject
	SBR141ConnectIdentifierWrapper sBR141ConnectIdentifierWrapper;

	@Override
	public SBR141ConnectInitializerWrapper getInitializer() {
		return sBR14ConnectInitializerWrapper;
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
	public SBR141ConnectIdentifierWrapper getIdentifier() {
		return sBR141ConnectIdentifierWrapper;
	}
}
