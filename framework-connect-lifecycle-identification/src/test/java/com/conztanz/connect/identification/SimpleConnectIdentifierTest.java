package com.conztanz.connect.identification;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import static org.junit.Assert.*;

import com.conztanz.connect.identification.exception.ConnectIdentificationException;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xml.sax.SAXException;

import com.conztanz.connect.factory.SimpleIncomingMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class SimpleConnectIdentifierTest {
	
	@Autowired
	private   SimpleConnectIdentifier simpleConnectIdentifier;
	@Test
	public void identificationTest() throws IOException, ConnectIdentificationException
  {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./Xml_sample.xml");
		StringWriter writer = new StringWriter();
		IOUtils.copy(is, writer);
		String xml = writer.toString();
		SimpleIncomingMessage incomingMessage = new SimpleIncomingMessage(null);
		incomingMessage.setTransformedPayload(xml);
		simpleConnectIdentifier.identify(incomingMessage);
		assertEquals("123456789", incomingMessage.getObjectId());
	}

}
