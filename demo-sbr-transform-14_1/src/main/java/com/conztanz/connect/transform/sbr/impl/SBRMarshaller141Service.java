package com.conztanz.connect.transform.sbr.impl;

import org.apache.camel.Exchange;

import com.conztanz.connect.transform.sbr.ISBRMarshaller141Service;
import com.conztanz.connect.transform.sbr.impl.marshalling.SBR141Marshaller;
import com.conztanz.jibx.sbr.service.ForPnrHandling;

public class SBRMarshaller141Service implements ISBRMarshaller141Service {

	private SBR141Marshaller marshaller;

	@Override
	public ForPnrHandling unmarshall(String body, Exchange exchange) throws Exception {
		return marshaller.unmarshall(body);
	}

	public void setMarshaller(SBR141Marshaller marshaller) {
		this.marshaller = marshaller;

	}
}
