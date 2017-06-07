package com.conztanz.connect.camel;


import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.conztanz.connect.identification.AbstractConnectIdentifier;
import com.conztanz.connect.initialize.AbstractConnectInitializer;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
import com.conztanz.marshalling.AbstractConztanzUnmarshaller;
/**
 * 
 * @author User
 *
 * @param <INITIALIZER>
 * @param <PREPROCESSOR>
 * @param <IDENTIFIER>
 */
public abstract class AbstractOrchestrationCamelRoute<INITIALIZER  extends AbstractConnectInitializer<? extends AbstractConnectSmooksTransformer, ? extends IncomingMessage>, 
													  PREPROCESSOR extends Processor,
													  BINDING,
													  IDENTIFIER extends AbstractConnectIdentifier<BINDING,? extends AbstractConztanzUnmarshaller<BINDING>>
													  >
														extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from(this.getRouteEndpoint())
			.transacted()
			.process(this.getProcessor())
			.bean(getInitializer(), "init(${body})")
			.bean(this.getIdentifier(),"identify(${body})")
//			.bean(this.getUnmarshaller(),"unmarshall(${body})")
//			.log("${body}")
			.log("###################\nDone ! ###################\n");

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
	 * @return
	 */
	public abstract String getRouteEndpoint();

	/**
	 * 
	 * @return
	 */
	public abstract IDENTIFIER getIdentifier();

}
