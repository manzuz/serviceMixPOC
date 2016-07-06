package com.conztanz.publisher;

import org.apache.camel.CamelContext;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Publisher {

	private static CamelContext camelContext;
	private static AbstractApplicationContext context;

	public static void main(final String[] args) throws Exception {

		initCamelContext();

//		 publishInLocalQueue(10);
//		 publishInLocalDir(10);
		 publishInRemoteQueue(30);
//		 publishInLocalTransformQueue(10);

	}

	private static void publishInLocalDir(int nbThreads) throws Exception {

		for (int i = 1; i <= nbThreads; i++) {
			FTPPublisherThread pt = new FTPPublisherThread("file:ftp/incoming/edi", "edifact-sample.txt");
			pt.start();
		}

	}

	/**
	 * 
	 * @throws Exception
	 */
	private static void publishInLocalTransformQueue(int nbThreads) throws Exception {

		System.out.println("************* publishInLocalTransformQueue");
		System.out.println("Notice this client requires that the CamelServer is already running!");
		for (int i = 1; i <= nbThreads; i++) {
			MQPublisherThread pt = new MQPublisherThread("activemq:LOCAL_SBR_14_1_EDI_TRANSFORM", "edifact-sample.txt",
					camelContext);
			pt.start();
		}
	}

	/**
	 * @throws Exception
	 * 
	 */
	private static void publishInRemoteQueue(int nbThreads) throws Exception {

		System.out.println("************* publishInRemoteQueue");
		System.out.println("Notice this client requires that the CamelServer is already running!");
		for (int i = 1; i <= nbThreads; i++) {
			MQPublisherThread pt = new MQPublisherThread("jms:queue:SMX_SBR_14_1_EDI", "edifact-sample.txt",
					camelContext);
			pt.start();
		}
	}

	/**
	 * @param nbThreads
	 * @throws Exception
	 * 
	 */
	private static void publishInLocalQueue(int nbThreads) throws Exception {

		System.out.println("************* publishInLocalQueue");
		System.out.println("Notice this client requires that the CamelServer is already running!");

		for (int i = 1; i <= nbThreads; i++) {
			MQPublisherThread pt = new MQPublisherThread("activemq:queue:LOCAL_SBR_14_1_EDI", "edifact-sample.txt",
					camelContext);
			pt.start();
		}
	}

	/**
	 * 
	 */
	private static void initCamelContext() {

		context = new ClassPathXmlApplicationContext("META-INF/camel-context.xml");
		camelContext = context.getBean("camel-client", CamelContext.class);
		// return camelContext;

	}

}
