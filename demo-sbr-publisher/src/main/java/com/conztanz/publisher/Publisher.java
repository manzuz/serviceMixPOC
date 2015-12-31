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
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Publisher {

	public static void main(final String[] args) throws Exception {

		// System.out.println("Notice this client requires that the CamelServer
		// is already running!");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("META-INF/camel-context.xml");
		CamelContext camel = context.getBean("camel-client", CamelContext.class);

		// get the endpoint from the camel context
		Endpoint endpoint = camel.getEndpoint("jms:queue:FUSE_SBR_14_1_EDI.TO.CC");
		System.out.println("ENDPOINT URI: " + endpoint.getEndpointUri());
		// create the exchange used for the communication
		Exchange exchange = endpoint.createExchange(ExchangePattern.InOnly);
		// set the input on the in body
		// must be correct type to match the expected type

		// ActiveMQTextMessage message = new ActiveMQTextMessage();
		// message.setJMSMessageID("DUMMY MESSAGE ID");
		// String payloadAsString = "DUMMY EDI MESSAGE - " + new Date();
		// ByteSequence content = new ByteSequence(payloadAsString.getBytes());
		// message.setContent(content);

		// exchange.getIn().setBody(message);

		InputStream iStream = Publisher.class.getClassLoader().getResourceAsStream("edifact-sample.txt");

		StringWriter writer = new StringWriter();
		IOUtils.copy(iStream, writer, "UTF-8");
//		IOUtils.copy(iStream, writer);
		String mockBody = writer.toString();

		// exchange.getIn().setBody("DUMMY EDI MESSAGE - " + new Date());
		exchange.getIn().setBody(mockBody);

		// to send the exchange we need an producer to do it for us
		Producer producer = endpoint.createProducer();
		// start the producer so it can operate
		producer.start();

		producer.process(exchange);

		// get the response from the out body
		// String response = exchange.getOut().getBody(String.class);
		// System.out.println("... the result is: " + response);

		// stopping the JMS producer has the side effect of the "ReplyTo Queue"
		// being properly
		// closed, making this client not to try any further reads for the
		// replies from the server
		producer.stop();

		// we're done so let's properly close the application context
		IOHelper.close(context);
	}
}
