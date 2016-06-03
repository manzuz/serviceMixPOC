package com.conztanz.connect.mq.sbr.service.impl;

import org.apache.camel.Exchange;
import org.apache.commons.lang.NotImplementedException;
import org.apache.log4j.Logger;

import com.conztanz.connect.mq.sbr.service.ISBR141EDIMessageListenerService;

public class SBR141XMLMessageListenerService implements ISBR141EDIMessageListenerService {

	private static Logger log = Logger.getLogger(SBR141XMLMessageListenerService.class);

	@Override
	public String onMessage(String body, Exchange exchange) throws Exception {
		log.debug("=> onMessage");
		throw new NotImplementedException("TO IMPLEMENT : onMessage");
//		return null;
	}

}
