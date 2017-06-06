package com.conztanz.connect.camel;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.SBR14ConnectInitializer;
import com.conztanz.connect.processor.FileProcessor;


@Singleton
public class SBRInitializationFileSystemCamelRoute extends AbstractInitializationCamelRoute<SBR14ConnectInitializer, FileProcessor>{
	
	@Autowired
	private SBR14ConnectInitializer sBR14ConnectInitializer ;
	
	@Autowired
	private FileProcessor fileProcessor;
	
	
	
	
	@Override
	public SBR14ConnectInitializer getInitializer() {
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

}
