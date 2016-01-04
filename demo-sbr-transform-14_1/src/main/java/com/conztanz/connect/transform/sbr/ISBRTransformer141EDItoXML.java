package com.conztanz.connect.transform.sbr;

import org.apache.camel.Body;
import org.apache.camel.CamelContext;

public interface ISBRTransformer141EDItoXML {

	public String transform(@Body String ediMessage, CamelContext camelContext) throws Exception;
}
