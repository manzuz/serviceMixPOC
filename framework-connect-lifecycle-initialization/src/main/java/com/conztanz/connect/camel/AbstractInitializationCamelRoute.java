package com.conztanz.connect.camel;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.conztanz.connect.IncomingMessage;
import com.conztanz.connect.initialize.AbstractConnectInitialzer;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;

public abstract class AbstractInitializationCamelRoute<INITIALIZER extends AbstractConnectInitialzer<? extends AbstractConnectSmooksTransformer, ? extends IncomingMessage>, PREPROCESSOR extends Processor>
		extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from(this.getRouteEndpoint())
			.transacted()
			.log("{${body}}")
//			.process(this.getProcessor())
			.bean(getInitializer(), "init(${body})").
			log("DOOOONE");

	}

	/**
	 * 
	 * @return
	 */
	public abstract INITIALIZER getInitializer();

	/**
	 * TODO : method name
	 * 
	 * @return
	 */

	public abstract PREPROCESSOR getProcessor();

	/**
	 * 
	 * @return
	 */
	public abstract String getRouteEndpoint();

	

}
