package com.conztanz.activator;

public class SpringContextLoaderActivator extends AbstractSpringContextLoaderActivator {

	@Override
	public String getSpringContextXmlLocation() {
		return "/config/applicationContext.xml";
	}

}
