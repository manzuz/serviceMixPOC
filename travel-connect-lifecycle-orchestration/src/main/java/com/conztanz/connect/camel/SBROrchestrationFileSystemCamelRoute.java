package com.conztanz.connect.camel;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.conztanz.connect.identification.wrapping.SBRConnectIdentifierWrapper;
import com.conztanz.connect.initialization.wrapping.SBR141ConnectInitializerWrapper;
import com.conztanz.connect.processor.FileProcessor;

@Singleton
public class SBROrchestrationFileSystemCamelRoute extends
		AbstractOrchestrationCamelRoute<SBR141ConnectInitializerWrapper, FileProcessor,  SBRConnectIdentifierWrapper>
{

	@Inject
	private SBR141ConnectInitializerWrapper sBR14ConnectInitializerWrapper;

	// @Autowired
	private FileProcessor fileProcessor;

	@Inject
	SBRConnectIdentifierWrapper sBR141ConnectIdentifierWrapper;

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
	public SBRConnectIdentifierWrapper getIdentifier() {
		return sBR141ConnectIdentifierWrapper;
	}
}
