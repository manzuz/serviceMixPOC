package com.conztanz.connect.mq.sbr.service.impl;

import org.apache.camel.builder.RouteBuilder;

public class SBR_Route_v14_1_EDI extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("jms:queue:SBR_14_1").to("bean:SBR_14_1_EDI_SERVICE?method=onMessage");

		// Version raccourcie:
		// from("jms:queue:SBR_14_1").to("SBR_14_1_EDI_SERVICE");
	}

}
