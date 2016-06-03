package com.conztanz.connect.transform.sbr.impl;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

import com.conztanz.connect.transform.sbr.ISBRMarshaller141Service;
import com.conztanz.jibx.sbr.service.ForPnrHandling;

public class SBR141JIBXMarshallingService implements ISBRMarshaller141Service {

	private static Logger log = Logger.getLogger(SBR141JIBXMarshallingService.class);

	private SBR141Marshaller marshaller;

	@Override
	public ForPnrHandling unmarshall(String body, Exchange exchange) throws Exception {

		log.info("Unmarshalling XML to java via Jibx...");

		return marshaller.unmarshall(body);
	}

	public void setMarshaller(SBR141Marshaller marshaller) {
		this.marshaller = marshaller;

	}
}
