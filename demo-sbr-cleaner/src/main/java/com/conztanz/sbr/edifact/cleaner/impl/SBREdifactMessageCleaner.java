package com.conztanz.sbr.edifact.cleaner.impl;

import org.apache.commons.codec.binary.Base64;

import com.conztanz.connect.sbr.edifact.helper.SBRTagEdifactHelper;
import com.conztanz.sbr.edifact.cleaner.ISBREdifactMessageCleaner;

/**
 * Nettoie un message EDIFACT en remplaçant les caractères spéciaux de
 * séparation par les séparateurs prévus pour la conversion smooks
 * 
 * @author Emmanuel
 *
 */
public class SBREdifactMessageCleaner implements ISBREdifactMessageCleaner {

	private static final boolean DECODE_BASE64_BEFORE_CLEANING = true;

	@Override
	// @Handler
	public String cleanMessage(String body) throws Exception {

		// Dans WSO2, les messages sont toujours encodés en binaire (base64)
		// avant d'être passés en xml dans la chaîne de médiation.
		// Ici, ce n'est pas le cas. Pour reproduire le traitement WSO2 au
		// maximum, on encode donc explicitement avant le nettoyage
		body = new String(Base64.encodeBase64(body.getBytes()));
		String cleanedMessageBody = SBRTagEdifactHelper.cleanMessage(body, DECODE_BASE64_BEFORE_CLEANING);

		System.out.println("-------------------");
		System.out.println("OK : EDI message is clean.");
		System.out.println("cleanedMessageBody:" + cleanedMessageBody);
		System.out.println("-------------------");

		return cleanedMessageBody;
	}
}
