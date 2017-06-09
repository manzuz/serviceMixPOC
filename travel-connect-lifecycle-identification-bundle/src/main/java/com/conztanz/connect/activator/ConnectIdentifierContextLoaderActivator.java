package com.conztanz.connect.activator;

import com.conztanz.activator.AbstractSpringContextLoaderActivator;
import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;

public class ConnectIdentifierContextLoaderActivator extends AbstractSpringContextLoaderActivator {

	@Override
	public String getSpringContextXmlLocation() {
		return "/config/applicationContext.xml";
	}

public static void main(String[] args) throws Exception {
	new ConnectIdentifierContextLoaderActivator().start(null);
	System.out.println(ConztanzSpringApplicationContext.getBean("pFSUnMarshaller"));
}
	
}
