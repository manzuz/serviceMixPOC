package com.conztanz.connect.transform.sbr;

import java.io.IOException;

import org.apache.camel.Body;
import org.apache.camel.CamelContext;
import org.xml.sax.SAXException;

public interface ISBR_14_1_Transformer {

	public String transform(@Body String ediMessage, CamelContext camelContext) throws Exception;
}
