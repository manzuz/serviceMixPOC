package com.conztanz.connect.identification.xpath;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * 
 * @author User
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class XpathClientTest


{
	@Autowired
	private XpathClient xpathClient;



	@Test
	public void retrievetest() throws IOException, XPathExpressionException, ParserConfigurationException, SAXException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./Xml_sample.xml");
		Document doc = builder.parse(is);
		String ObjectId = xpathClient.request("//root//objectID", doc);
		assertEquals("123456789",ObjectId);
		

	}
}
