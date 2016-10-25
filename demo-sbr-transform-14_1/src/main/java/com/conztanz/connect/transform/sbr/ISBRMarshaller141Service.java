package com.conztanz.connect.transform.sbr;

import org.apache.camel.Body;
import org.apache.camel.Exchange;

import com.conztanz.transform.sbr.v14_1.ForPnrHandling;

public interface ISBRMarshaller141Service {

	public ForPnrHandling unmarshall(@Body String body, Exchange exchange) throws Exception;
}
