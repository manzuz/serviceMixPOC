package com.conztanz.connect.transform.sbr.impl;

import org.apache.camel.Body;
import org.apache.camel.CamelContext;
import org.milyn.Smooks;
import org.milyn.SmooksFactory;

import com.conztanz.connect.transform.sbr.ISBR_14_1_Transformer;

public class SBR_14_1_Transformer implements ISBR_14_1_Transformer {

	@Override
	public String transform(@Body String ediMessage, CamelContext camelContext) {

		System.out.println("SBR_14_1_Transformer=>transform()");
		System.out.println("ediMessage:" + ediMessage);

		// clean EDI
		// conversion edi => xml via smooks

		final SmooksFactory smooksFactory = (SmooksFactory) camelContext.getRegistry()
				.lookup(SmooksFactory.class.getName());
		final Smooks smooks = smooksFactory.createInstance();

		// retourne le xml
		System.out.println("<= SBR_14_1_Transformer=>transform()");

		return smooks.toString();

	}

}
