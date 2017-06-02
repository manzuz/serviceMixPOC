package com.conztanz.connect.transform.travel.sbr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.PFSIncomingMessage;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.connect.transform.IMessageCleaner;

/**
 * 
 * @author User
 *
 * @param <TRANSFORMER>
 */
@Singleton
public  class SBR141EDI2XMLSmooksTransformer extends AbstractConnectSmooksTransformer{
	
	
	@Autowired
	private EdifactCleaner edifactCleaner = new EdifactCleaner();

	@Override
	public String getPathToConfigFile() {
		return "smooks/SBR14SmooksConfig.xml";
	}




	@Override
	public IMessageCleaner getCleaner() {
		return edifactCleaner;
	}
	

	

	

}
