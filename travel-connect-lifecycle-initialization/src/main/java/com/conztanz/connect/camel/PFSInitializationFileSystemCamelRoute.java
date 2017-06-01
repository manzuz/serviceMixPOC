package com.conztanz.connect.camel;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.PFSConnectInitialzer;
import com.conztanz.connect.processor.FileProcessor;

@Singleton
public class PFSInitializationFileSystemCamelRoute
		extends AbstractInitializationCamelRoute<PFSConnectInitialzer, FileProcessor> {

	@Autowired
	private PFSConnectInitialzer pFSConnectInitialzer;

	@Autowired
	private FileProcessor fileProcessor;

	@Override
	public PFSConnectInitialzer getInitializer() {
		return pFSConnectInitialzer;
	}

	@Override
	public String getRouteEndpoint() {
		return "file:camel/PFSinput";
	}

	@Override
	public FileProcessor getProcessor() {
		return fileProcessor;
	}

}
