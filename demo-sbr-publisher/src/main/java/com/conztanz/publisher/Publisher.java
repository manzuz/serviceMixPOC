package com.conztanz.publisher;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Producer;
import org.apache.camel.util.IOHelper;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Publisher {

	public static void main(final String[] args) throws Exception {

		System.out.println("Notice this client requires that the CamelServer is already running!");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("META-INF/camel-context.xml");
		CamelContext camel = context.getBean("camel-client", CamelContext.class);

		// get the endpoint from the camel context
		Endpoint endpoint = camel.getEndpoint("jms:queue:numbers");

		// create the exchange used for the communication
		// we use the in out pattern for a synchronized exchange where we expect
		// a response
		Exchange exchange = endpoint.createExchange(ExchangePattern.InOut);
		// set the input on the in body
		// must be correct type to match the expected type of an Integer object
		exchange.getIn().setBody(11);

		// to send the exchange we need an producer to do it for us
		Producer producer = endpoint.createProducer();
		// start the producer so it can operate
		producer.start();

		// let the producer process the exchange where it does all the work in
		// this oneline of code
		System.out.println("Invoking the multiply with 11");
		producer.process(exchange);

		// get the response from the out body and cast it to an integer
		int response = exchange.getOut().getBody(Integer.class);
		System.out.println("... the result is: " + response);

		// stopping the JMS producer has the side effect of the "ReplyTo Queue"
		// being properly
		// closed, making this client not to try any further reads for the
		// replies from the server
		producer.stop();

		// we're done so let's properly close the application context
		IOHelper.close(context);
	}
}
