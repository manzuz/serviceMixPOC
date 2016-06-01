package com.conztanz.publisher;

import java.io.InputStream;
import java.io.StringWriter;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Producer;
import org.apache.camel.util.IOHelper;
import org.apache.commons.io.IOUtils;
import org.springframework.context.support.AbstractApplicationContext;

public class MQPublisherThread extends Thread {

	private CamelContext camelContext;
	private AbstractApplicationContext context;

	@Override
	public void run() {
		try {
			publishJMS();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String endpointURI;
	private String sampleFileName;

	public MQPublisherThread(String endpointURI, String sampleFileName, CamelContext camelContext) {
		this.endpointURI = endpointURI;
		this.sampleFileName = sampleFileName;
		this.camelContext = camelContext;
	}

	/**
	 * 
	 * @param endpointURI
	 * @param sampleFileName
	 * @throws Exception
	 */
	private void publishJMS() throws Exception {

		System.out.println("endpointURI=" + endpointURI);

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
		Producer producer = null;
		producer = endpoint.createProducer();
		try {
			// start the producer so it can operate
			producer.start();

			producer.process(exchange);

			// stopping the JMS producer has the side effect of the "ReplyTo
			// Queue"
			// being properly
			// closed, making this client not to try any further reads for the
			// replies from the server
			// producer.stop();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (producer != null) {
				producer.stop();
			}
			closeContext();
		}

	}

	private void closeContext() {

		// we're done so let's properly close the application context
		IOHelper.close(context);

	}

	/**
	 * 
	 * @param string
	 * @return
	 */
	private Endpoint getEndpoint(String uri) {
		Endpoint endpoint = camelContext.getEndpoint(uri);
		// System.out.println("ENDPOINT URI: " + endpoint.getEndpointUri());
		return endpoint;

	}

}
