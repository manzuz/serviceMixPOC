package com.conztanz.connect.camel;

import javax.inject.Singleton;

import org.apache.camel.builder.RouteBuilder;
@Singleton
public class TestingRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:camel/EDIinputMQ").to("amq:SBRFeed");
		from("file:camel/PFSinputMQ").to("amq:PFSFeed");


		
	}

}
