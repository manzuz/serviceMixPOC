package com.conztanz.sbr.edifact.cleaner.impl;

import org.apache.camel.Exchange;

import com.conztanz.connect.sbr.edifact.helper.SBRTagEdifactHelper;
import com.conztanz.sbr.edifact.cleaner.ISBREdifactMessageCleaner;

public class SBREdifactMessageCleaner implements ISBREdifactMessageCleaner {

	@Override
	// @Handler
	public String cleanMessage(Exchange exchange) throws Exception {

		// System.out.println("=> SBREdifactMessageCleaner.cleanMessage()");
		String body = exchange.getIn().getBody().toString();
		String cleanedMessageBody = SBRTagEdifactHelper.cleanMessage(body);
		// System.out.println("<= SBREdifactMessageCleaner.cleanMessage()");
		return cleanedMessageBody;
	}
}
