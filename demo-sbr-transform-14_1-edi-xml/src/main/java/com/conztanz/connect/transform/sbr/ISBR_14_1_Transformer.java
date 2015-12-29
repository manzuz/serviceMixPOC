package com.conztanz.connect.transform.sbr;

import org.apache.camel.Body;
import org.apache.camel.CamelContext;

public interface ISBR_14_1_Transformer {

	public String transform(@Body String ediMessage, CamelContext camelContext);
}
