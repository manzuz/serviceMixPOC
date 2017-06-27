package com.conztanz.connect.identification;

import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class SimpleConnectIdentifierTest {
	
	@Autowired
	private SimpleConnectIdentifier simpleConnectIdentifier;
	@Test
	public void identificationTest() throws IOException, ConnectIdentificationException
  {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./Xml_sample.xml");
		StringWriter writer = new StringWriter();
		IOUtils.copy(is, writer);
		String xml = writer.toString();
		SimpleSequencedIncomingMessage incomingMessage = new SimpleSequencedIncomingMessage(null,-1);
		incomingMessage.setTransformedPayload(xml);
		simpleConnectIdentifier.identify(incomingMessage);
		assertEquals("123456789", incomingMessage.getObjectId());
	}

}
