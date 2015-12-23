package com.conztanz.connect.mq.sbr.service;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Header;

//public interface IConnectMessageListener_SBR extends MessageListener {
public interface IConnectMessageListener_SBR {

	public String onMessage(@Body String body, Exchange exchange);

}
