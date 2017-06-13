package com.conztanz.connect.camel;

import com.conztanz.connect.PFSConnectInitializer;
import com.conztanz.connect.identification.wrapping.PFSConnectIdentifierWrapper;
import com.conztanz.connect.processor.FileProcessor;

//@Singleton
public class PFSOrchestrationMQCamelRoute extends AbstractOrchestrationCamelRoute<PFSConnectInitializer, FileProcessor,PFSConnectIdentifierWrapper> {

//	@Autowired
	private PFSConnectInitializer pFSConnectInitializer;

//	@Autowired
	private FileProcessor fileProcessor;
	
//	@Autowired 
	PFSConnectIdentifierWrapper pfsconnectIdentifier ;

	@Override
	public PFSConnectInitializer getInitializer() {
		return pFSConnectInitializer;
	}

	@Override
	public String getRouteEndpoint() {
		return "amq:PFSFeed";
	}

	@Override
	public FileProcessor getProcessor() {
		return fileProcessor;
	}

	@Override
	public PFSConnectIdentifierWrapper getIdentifier() {
		return pfsconnectIdentifier;
	}

}
