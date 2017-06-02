package com.conztanz.connect.camel;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.PFSConnectInitializer;
import com.conztanz.connect.processor.FileProcessor;

@Singleton
public class PFSInitializationFileSystemCamelRoute extends AbstractInitializationCamelRoute<PFSConnectInitializer, FileProcessor> {

	@Autowired
	private PFSConnectInitializer pFSConnectInitializer;

	@Autowired
	private FileProcessor fileProcessor;

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

}
