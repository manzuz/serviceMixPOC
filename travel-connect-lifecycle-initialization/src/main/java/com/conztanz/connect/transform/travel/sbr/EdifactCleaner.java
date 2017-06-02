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
	public void clean(byte[] tab,boolean decodeBase64BeforeCleaning) {
		if (decodeBase64BeforeCleaning) {
			tab = Base64.decodeBase64(tab);
		}
		StringBuilder sbrresCleanBatch = new StringBuilder();

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == (byte) 126) {
				tab[i] = (byte) 46;
			} else if (tab[i] == (byte) 29) {
				// GS => {
//				System.err.println(tab[i]);
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
				System.out.println("heeeeeeere");
				continue;
			} else if (tab[i] == (byte) 13) {
				// CR
				System.out.println("theeeeeeeeeeere");

				continue;
			}
			sbrresCleanBatch.append((char) tab[i]);
			if("UNH{1{SBRRES}12}1}1A{030614/0122/4/7AEDL9/020614".equals(sbrresCleanBatch.toString()))  {
				System.out.println("AVANT SAUT D ELIGNE");
			}
//			System.out.println((char) tab[i] + " vs " + tab[i]);
//			System.out.println(tab[i] + " vs " + (char) tab[i] );
//			System.out.println(tab[i]);
//			System.out.println("####"+(char) tab[i] + "####");

		}
		String[] tabBif = sbrresCleanBatch.toString().split("[\n]+");
		System.out.println(sbrresCleanBatch);
		

	}

	public static void main(String[] args) throws IOException {
//		Path path = Paths.get("C:\\Users\\User\\Desktop\\serviceMixPOC\\travel-connect-lifecycle-initialization\\src\\test\\resources\\edifact\\edifact-sample.txt");
//		byte [] payload = Files.readAllBytes(path); 
//		new EdifactCleaner().clean(payload, false);
		System.out.println(((char)(byte) 10)+ "##");
	}
}
