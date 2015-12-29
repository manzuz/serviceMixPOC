package com.conztanz.sbr.edifact.cleaner;

import org.apache.camel.Exchange;

public interface ISBREdifactMessageCleaner {

	String cleanMessage(String body, Exchange exchange) throws Exception;

}
