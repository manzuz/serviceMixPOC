package com.conztanz.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;

public abstract class AbstractSpringContextLoaderActivator   implements BundleActivator {
	
	/**
	 * Path to Spring XML configuration file
	 * @return
	 */
	public abstract String getSpringContextXmlLocation();

	/**
	 * Method called by the container when bundle stops Nothing to do here
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		ConztanzSpringApplicationContext.contextTearDown();
	}

	/**
	 * Method called by the container when the bundles stars
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		/**
		 * http://stackoverflow.com/questions/14255135/loading-classes-using-spring-inside-an-eclipse-osgi-container-does-not-seem-to-w
		 */
		Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
		ConztanzSpringApplicationContext.contextStartup(this.getSpringContextXmlLocation());
	}
	

	
	

	
	
	
	
	
	
	

}
