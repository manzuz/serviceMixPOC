package com.conztanz.connect.sbr.edifact.helper;

import org.apache.commons.codec.binary.Base64;

public class SBRTagEdifactHelper {

	/**
	 * 
	 * @param binaryData
	 * @return
	 */
	public static String cleanMessage(String binaryData) {

		StringBuilder cleanMessage = null;
		try {
			// String binaryData =
			// context.getEnvelope().getBody().getFirstElement().getText();
			byte[] tab = Base64.decodeBase64(binaryData.getBytes());

			StringBuilder sbrresCleanBatch = new StringBuilder();

			for (int i = 0; i < tab.length; i++) {
				if (tab[i] == (byte) 126) {
					tab[i] = (byte) 46;
				} else if (tab[i] == (byte) 29) {
					// GS => {
					tab[i] = (byte) 123;
				} else if (tab[i] == (byte) 28) {
					// FS => '39
					tab[i] = (byte) 10;
				} else if (tab[i] == (byte) 31) {
					// US => }
					tab[i] = (byte) 125;
				} else if (tab[i] == (byte) 25) {
					// EM = ~
					tab[i] = (byte) 126;
				} else if (tab[i] == (byte) 10) {
					// LF =
					continue;
				} else if (tab[i] == (byte) 13) {
					continue;
				}

				sbrresCleanBatch.append((char) tab[i]);
			}

			String[] tabBif = sbrresCleanBatch.toString().split("[\n]+");

			cleanMessage = new StringBuilder();
			for (int i = 0; i < tabBif.length; i++) {

				// ignore UNH and UNT lines
				if (!tabBif[i].startsWith("UNH") && !tabBif[i].startsWith("UNT")) {
					cleanMessage.append(tabBif[i]).append("\n");
				}

				// skip unwanted messages UNB and UNZ
				if (tabBif[i].startsWith("UNB") || tabBif[i].startsWith("UNZ")) {
					// context.getEnvelope().getBody().getFirstElement().setText("");
					return "";
				}

			}
		} catch (Exception ex) {

			System.err.println(ex.getMessage());
			// TODO gestion erreur
			// handleException(ex.getMessage(), ex, context);

			// return false;
		}

		// context.getEnvelope().getBody().getFirstElement().setText(sbrresBatch.toString());

		return cleanMessage.toString();

	}
}
