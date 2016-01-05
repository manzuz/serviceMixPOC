package com.conztanz.sbr.edifact.cleaner;

public interface ISBREdifactMessageCleaner {

	String cleanMessage(String body) throws Exception;

}
