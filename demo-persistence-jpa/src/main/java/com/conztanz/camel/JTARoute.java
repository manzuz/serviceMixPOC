package com.conztanz.camel;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.CsvDataFormat;

import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.services.ISBR_14MessageService;

@Singleton
public class JTARoute extends RouteBuilder {

	@Inject
	private ISBR_14MessageService sBR_14MessageService;

	@Override
	public void configure() throws Exception {
//		onException(TestRuntimeException.class)
//	        .maximumRedeliveries(1)
//	        .handled(true)
//	        .to("activemq:DLQ")
//	        .markRollbackOnly();
		
//        errorHandler(deadLetterChannel("jms:errors"))
//        ;
//		 mdp = serviceMix
		
		/**
		 * Get a file and process it, then send it to the Q
		 */
		from("file:camel/input")
		   .unmarshal(buildCsvFormat())
           .split(body())
           .process(csvProcessor)
		.to("amq:JtaPoc");
		
		
		/**
		 * 
		 */
		from("amq:JtaPoc")
		.transacted()
		.bean(sBR_14MessageService, "insertMessage(${body})")
		.process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				if( (boolean) exchange.getIn().getBody())
					throw new TestRuntimeException();				
			}
		});
		
		
		
		/**
		 * 
		 */
//		from("direct:garbage")
//		.log("in da garbage " + simple("${body}"));

	}
	
	
	private static Processor csvProcessor = new Processor() {

		@Override
		public void process(Exchange exchange) throws Exception {
			Map<String, Object> input = (Map<String, Object>) exchange.getIn().getBody();
			String shouldFail = (String)input.get("shouldFail");
            exchange.getIn().setBody(Boolean.valueOf(shouldFail));

			// System.out.println(input);
		}

	};
	
	 private static CsvDataFormat buildCsvFormat() {
	        CsvDataFormat format = new CsvDataFormat();
	        format.setDelimiter(",");
	        format.setSkipHeaderRecord(true);
	        format.setUseMaps(true);
	        return format;
	    }
	 
	 

}
