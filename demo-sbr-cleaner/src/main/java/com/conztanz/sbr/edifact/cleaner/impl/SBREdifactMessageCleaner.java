package com.conztanz.sbr.edifact.cleaner.impl;

import org.apache.camel.Exchange;

import com.conztanz.connect.sbr.edifact.helper.SBRTagEdifactHelper;
import com.conztanz.sbr.edifact.cleaner.ISBREdifactMessageCleaner;

public class SBREdifactMessageCleaner implements ISBREdifactMessageCleaner {

	@Override
	// @Handler
	public String cleanMessage(String body, Exchange exchange) throws Exception {

		System.out.println("=> SBREdifactMessageCleaner.cleanMessage()");
		String cleanedMessageBody = SBRTagEdifactHelper.cleanMessage(body);
		System.out.println("<= SBREdifactMessageCleaner.cleanMessage()");
		return cleanedMessageBody;
	}
}
