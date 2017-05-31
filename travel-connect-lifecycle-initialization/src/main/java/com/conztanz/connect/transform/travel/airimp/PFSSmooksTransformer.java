package com.conztanz.connect.transform.travel.airimp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.conztanz.connect.PFSConnectInitialzer;
import com.conztanz.connect.PFSIncomingMessage;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;

/**
 * 
 * @author User
 *
 * @param <TRANSFORMER>
 */
public  class PFSSmooksTransformer extends AbstractConnectSmooksTransformer{

	@Override
	public String getPathToConfigFile() {
		return "airimp/PFSSmooksConfig.xml";
	}
	
	
	
	public static void main(String[] args) throws IOException {
//		java.nio.file.Path p =  new Path("airimp/PFS.txt");
//		new PFSSmooksTransformer().transform2XML(Files.readAllBytes(p));
		
		Path path = Paths.get("C:\\Users\\User\\Desktop\\serviceMixPOC\\travel-connect-lifecycle-initialization\\src\\test\\resources\\airimp\\PFS.txt");
		byte [] payload = Files.readAllBytes(path); 
//		System.out.println(		new PFSSmooksTransformer().transform2XML(payload));
		PFSConnectInitialzer p = new PFSConnectInitialzer();
		PFSIncomingMessage m = p.init(payload);
		System.out.println(m.getType());
		System.out.println(m.getRawPayload().length);

	}
	

	

	

}