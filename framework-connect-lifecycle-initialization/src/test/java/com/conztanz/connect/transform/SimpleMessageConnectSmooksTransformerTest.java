package com.conztanz.connect.transform;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class SimpleMessageConnectSmooksTransformerTest {

	@Autowired
	SimpleMessageConnectSmooksTransformer simpleMessageConnectSmooksTransformer;

	@Test
	public void transform2XMLTest() throws IOException, ParserConfigurationException {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./messages/SimpleIncomingMessage.txt");
		String xml = simpleMessageConnectSmooksTransformer.transform2XML(IOUtils.toByteArray(is));
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		factory.setNamespaceAware(true);

		DocumentBuilder builder = factory.newDocumentBuilder();
		builder.setErrorHandler(new SimpleErrorHandler());
		try {
			Document document = builder.parse((new ByteArrayInputStream(xml.getBytes())));
			document.getDocumentElement();
		} catch (SAXException e) {
			fail("document should be well formed");
		}
	}

	private class SimpleErrorHandler implements ErrorHandler {
		public void warning(SAXParseException e) throws SAXException {
			e.printStackTrace();
		}

		public void error(SAXParseException e) throws SAXException {
			e.printStackTrace();
		}

		public void fatalError(SAXParseException e) throws SAXException {
			e.printStackTrace();
		}
	}

}
