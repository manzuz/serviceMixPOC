package com.conztanz.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.conztanz.j2ee.utils.ConztanzSpringApplicationContext;

public class SpringContextLoader implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
//		 Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader()); 
//		 ConztanzSpringApplicationContext.contextStartup("/config/TestapplicationContext.xml");
//		
//		System.out.println("\n"
//				+ "#######################################################\n"
//				+  " ConztanzSpringApplicationContext Loaded \n"
//				+ "#######################################################");
		System.out.println("#######################################################\n Trying to load a dummy bean  : \n");
		System.out.println(ConztanzSpringApplicationContext.getBean("articleView"));
		System.out.println("#######################################################\n");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
	}
	
	
	public static void main(String[] args) throws Exception {
		new SpringContextLoader().start(null);
	}

}
