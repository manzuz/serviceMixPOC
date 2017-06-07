package com.conztanz.connect.transform.travel.airimp;

import javax.inject.Singleton;

import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.connect.transform.IMessageCleaner;

/**
 * 
 * @author User
 *
 * @param <TRANSFORMER>
 */
@Singleton
public  class PFSSmooksTransformer extends AbstractConnectSmooksTransformer{
	
	
	/**
	 * 
	 */
	@Override
	public String getPathToConfigFile() {
		return "/airimp/PFSSmooksConfig.xml";
	}
	
	
	/**
	 * 
	 */
	@Override
	public IMessageCleaner getCleaner() {
		return new IMessageCleaner() {
			@Override
			public byte[] clean(byte[] payLoad,boolean decodeBase64BeforeCleaning) {
				return payLoad;
			}
		};
	}



	
	

	

	

}
