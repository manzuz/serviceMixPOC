package com.conztanz.demo.camel.service.impl;

import java.util.Dictionary;
import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.conztanz.demo.camel.service.TransformService;

/**
 * Extension of the default OSGi bundle activator
 */
public final class TransformActivator implements BundleActivator {
	/**
	 * Called whenever the OSGi framework starts our bundle
	 */
	public void start(BundleContext bc) throws Exception {
		System.out.println("STARTING com.conztanz.demo.camel.service");

		Dictionary props = new Properties();
		// add specific service properties here...

		System.out.println("REGISTER com.conztanz.demo.camel.service.TransformService");

		// Register our transform service implementation in the OSGi service registry
		bc.registerService(TransformService.class.getName(), new TransformServiceImpl(), props);
	}

	/**
	 * Called whenever the OSGi framework stops our bundle
	 */
	public void stop(BundleContext bc) throws Exception {
		System.out.println("STOPPING com.conztanz.demo.camel.service");

		// No need to unregister our service - the OSGi framework handles it for us
	}
}
