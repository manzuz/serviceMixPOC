package com.conztanz.connect.mq.sbr.service.impl;

import org.apache.camel.Exchange;

import com.conztanz.connect.mq.sbr.service.IConnectMessageListener_SBR;

public class ConnectMessageListener_SBR14_1_XMLService implements IConnectMessageListener_SBR {

	@Override
	public String onMessage(String body, Exchange exchange) throws Exception {

		System.out.println("body:" + body);
		return null;
	}

}
