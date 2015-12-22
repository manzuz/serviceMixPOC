package com.conztanz.demo.camel.routes;

import org.apache.camel.builder.RouteBuilder;

public class SBR_14_1_EDI_XML_RouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception{// TODO Auto-generated method stub
		
	     // set up the transform bean
//        MyTransform transform = new MyTransform();
//        transform.setPrefix("JavaDSL");
//        
//        from("timer://javaTimer?fixedRate=true&period=2000")
//            .bean(transform, "transform")
//            .to("log:ExampleRouter");    	
		
		/*
		 *         <cxf:rsServer id="rsServer" address="${CXFserver}${service}"
                      serviceClass="org.apache.servicemix.examples.camel.rest.PersonService"
                      loggingFeatureEnabled="true" loggingSizeLimit="20"/>

		 */
		
		
		/*
		 *  <camelContext xmlns="http://camel.apache.org/schema/blueprint" >
            <route id="PersonServiceRoute">
                <from uri="cxfrs:bean:rsServer?bindingStyle=SimpleConsumer" />
                <recipientList>
                    <simple>direct-vm:${header.operationName}</simple>
                </recipientList>
            </route>
        </camelContext>
		 */
		
		from("cxfrs:beanrsServer?bindingStyle=SimpleConsumer").bean("smooksTransformer_14_1_EDI_XML").endRest();
		
	}

}
