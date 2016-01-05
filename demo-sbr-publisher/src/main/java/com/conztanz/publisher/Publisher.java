package com.conztanz.publisher;

import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Producer;
import org.apache.camel.util.FileUtil;
import org.apache.camel.util.IOHelper;
import org.apache.commons.io.IOUtils;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Publisher {

	private static CamelContext camelContext;
	private static AbstractApplicationContext context;

	public static void main(final String[] args) throws Exception {

		// publishInRemoteQueue();

		publishInLocalDir();

	}

	private static void publishInLocalDir() throws Exception {

		initCamelContext();
		publishFTP("file:ftp/incoming/edi", "edifact-sample.txt");

	}

	private static void publishFTP(String endpointURI, String sampleFileName) throws Exception {

		ClassLoader classLoader = Publisher.class.getClassLoader();
		URL iStream = classLoader.getResource(sampleFileName);
		File sample = new File(iStream.getPath());
		String relativeIncomingPath = endpointURI.split(":")[1];
		File destinationFile = new File("C:/apache-servicemix-6.1.0/" + relativeIncomingPath + "/" + sampleFileName);
		System.out.println("Copying sample file to incoming dir...:" + iStream.getPath() + " => " + destinationFile);
		FileUtil.copyFile(sample, destinationFile);

	}

	/**
	 * @throws Exception
	 * 
	 */
	private static void publishInRemoteQueue() throws Exception {

		System.out.println("Notice this client requires that the CamelServer is already running!");

		initCamelContext();

		publishJMS("jms:queue:FUSE_SBR_14_1_EDI.TO.CC", "edifact-sample.txt");

		closeContext();
	}

	private static void publishJMS(String endpointURI, String sampleFileName) throws Exception {

		// get the endpoint from the camel context
		Endpoint endpoint = getEndpoint(endpointURI);

		// create the exchange used for the communication
		Exchange exchange = endpoint.createExchange(ExchangePattern.InOnly);

		InputStream iStream = Publisher.class.getClassLoader().getResourceAsStream(sampleFileName);

		StringWriter writer = new StringWriter();
		IOUtils.copy(iStream, writer, "UTF-8");
		String mockBody = writer.toString();

		exchange.getIn().setBody(mockBody);

		// to send the exchange we need an producer to do it for us
		Producer producer = endpoint.createProducer();
		// start the producer so it can operate
		producer.start();

		producer.process(exchange);

		// stopping the JMS producer has the side effect of the "ReplyTo Queue"
		// being properly
		// closed, making this client not to try any further reads for the
		// replies from the server
		producer.stop();

	}

	private static void closeContext() {

		// we're done so let's properly close the application context
		IOHelper.close(context);

	}

	/**
	 * 
	 * @param string
	 * @return
	 */
	private static Endpoint getEndpoint(String uri) {
		Endpoint endpoint = camelContext.getEndpoint(uri);
		System.out.println("ENDPOINT URI: " + endpoint.getEndpointUri());
		return endpoint;

	}

	private static void initCamelContext() {

		context = new ClassPathXmlApplicationContext("META-INF/camel-context.xml");
		camelContext = context.getBean("camel-client", CamelContext.class);
		// return camelContext;

	}
}
