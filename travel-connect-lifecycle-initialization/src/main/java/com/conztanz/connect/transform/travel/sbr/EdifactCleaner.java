package com.conztanz.connect.transform.travel.sbr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.inject.Singleton;

import org.apache.commons.codec.binary.Base64;

import com.conztanz.connect.transform.IMessageCleaner;

@Singleton
public class EdifactCleaner implements IMessageCleaner {

	@Override
	public byte[]  clean(byte[] tab, boolean decodeBase64BeforeCleaning) {
		if (decodeBase64BeforeCleaning) {
			tab = Base64.decodeBase64(tab);
		}

		StringBuilder cleanMessage = null;

		StringBuilder sbrresCleanBatch = new StringBuilder();
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == (byte) 126) {
				tab[i] = (byte) 46;
			} else if (tab[i] == (byte) 29) {
				// GS => {
				// System.err.println(tab[i]);
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
				// CR
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
//				cleanMessage ;
			}

		}
		for(int i  = 0 ; i< tabBif.length ; i++){
//			System.out.println(tab[i] + "  " + cleanMessage.toString().getBytes()[i]);
		}
		System.out.println(cleanMessage.toString());
		return  cleanMessage.toString().getBytes();
	}
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\User\\Desktop\\serviceMixPOC\\travel-connect-lifecycle-initialization\\src\\test\\resources\\edifact\\edifact-sample.txt");
		byte [] payload = Files.readAllBytes(path); 
		new EdifactCleaner().clean(payload, false);
		System.out.println(((char)(byte) 10)+ "##");
	}
}
