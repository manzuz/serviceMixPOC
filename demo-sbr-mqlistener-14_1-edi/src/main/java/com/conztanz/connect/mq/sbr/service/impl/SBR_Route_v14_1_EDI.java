package com.conztanz.connect.mq.sbr.service.impl;

import org.apache.camel.builder.RouteBuilder;

// UNUSED - utilisation de config xml
public class SBR_Route_v14_1_EDI extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		System.out.println("SBR_Route_v14_1_EDI=>configure()");
		from("jms:queue:SBR_14_1_EDI.TO.CC").to("bean:SBR_14_1_EDI_SERVICE");
		// TransactedDefinition route =
		// from("jms:queue:SBR_14_1_EDI.TO.CC").transacted().to("bean:SBR_14_1_EDI_SERVICE");
		// System.out.println("route:" + route.toString());

		// Version raccourcie:
		// from("jms:queue:SBR_14_1").to("SBR_14_1_EDI_SERVICE");
	}

}
