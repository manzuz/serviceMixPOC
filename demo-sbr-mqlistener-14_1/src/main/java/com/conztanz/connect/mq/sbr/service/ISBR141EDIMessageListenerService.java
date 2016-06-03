package com.conztanz.connect.mq.sbr.service;

import org.apache.camel.Body;
import org.apache.camel.Exchange;

public interface ISBR141EDIMessageListenerService {

	public String onMessage(@Body String body, Exchange exchange) throws Exception;

}
