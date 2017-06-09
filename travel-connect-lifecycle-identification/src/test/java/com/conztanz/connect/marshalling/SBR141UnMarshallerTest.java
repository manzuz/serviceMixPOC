package com.conztanz.connect.marshalling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.jibx.runtime.JiBXException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.transform.sbr.v14_1.ForPnrHandling;

public class SBR141UnMarshallerTest {
	@Autowired
	SBR141UnMarshaller sbr141UnMarshaller;

	@Test
	public void test() throws IOException, JiBXException {
		String sbr = this.readFile(
				"C:\\Users\\User\\Desktop\\serviceMixPOC\\travel-connect-lifecycle-identification\\src\\test\\resources\\sbr_samples\\sbr2.xml");
		// System.out.println(sbr);
		SBR141UnMarshaller sbr141UnMarshaller = new SBR141UnMarshaller();
		ForPnrHandling forPnrHandling = sbr141UnMarshaller.unmarshall(sbr);
		System.out.println(forPnrHandling.getSequenceNum());
	}

	private String readFile(String path) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded);
	}
}
