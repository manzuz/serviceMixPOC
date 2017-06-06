package com.conztanz.connect.transform.travel.airimp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.inject.Singleton;

import com.conztanz.connect.SBR14ConnectInitializer;
import com.conztanz.connect.SBR14IncomingMessage;
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
			public void clean(byte[] payLoad,boolean decodeBase64BeforeCleaning) {
				//NOOP
			}
		};
	}
	
	public static void main(String[] args) throws IOException {
//		java.nio.file.Path p =  new Path("airimp/PFS.txt");
//		new PFSSmooksTransformer().transform2XML(Files.readAllBytes(p));
		
		Path path = Paths.get("C:\\Users\\User\\Desktop\\serviceMixPOC\\travel-connect-lifecycle-initialization\\src\\test\\resources\\edifact\\edifact-sample.txt");
		byte [] payload = Files.readAllBytes(path); 
		SBR14ConnectInitializer initializer  = new SBR14ConnectInitializer();
		SBR14IncomingMessage m = initializer.init(payload);
//		System.out.println(m.getType());
//		System.out.println(m.getRawPayload().length);
	}



	
	

	

	

}
