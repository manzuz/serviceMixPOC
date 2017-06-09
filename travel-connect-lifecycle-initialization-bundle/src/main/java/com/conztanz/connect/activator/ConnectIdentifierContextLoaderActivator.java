package com.conztanz.connect.activator;

import com.conztanz.activator.AbstractSpringContextLoaderActivator;

public class ConnectIdentifierContextLoaderActivator extends AbstractSpringContextLoaderActivator {

	@Override
	public String getSpringContextXmlLocation() {
		return "/config/applicationContext.xml";
	}

//public static void main(String[] args) throws Exception {
//	new ConnectIdentifierContextLoaderActivator().start(null);
//	System.out.println(ConztanzSpringApplicationContext.getBean("PFSIncomingMessageFactory"));
//}
	
}
