package com.conztanz.connect.transform.sbr.impl;

import java.io.ByteArrayInputStream;
import java.util.Locale;

import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Body;
import org.apache.camel.CamelContext;
import org.milyn.Smooks;
import org.milyn.container.ExecutionContext;
import org.milyn.payload.StringResult;

import com.conztanz.connect.transform.sbr.ISBRTransformer141EDItoXML;

public class SBRTransformer141EDItoXML implements ISBRTransformer141EDItoXML {

	@Override
	public String transform(@Body String ediMessage, CamelContext camelContext) throws Exception {

		System.out.println("SBRTransformer141EDItoXML=>transform()");
		System.out.println("ediMessage:" + ediMessage);

		// TODO
		
		// CE CODE NE MARCHE PAS ENCORE!!!!:
		// Erreur de classpath : org.milyn.cdr.SmooksConfigurationException: Unable to locate Smooks
		// digest configuration '/META-INF/xsd/smooks/edi-1.1.xsd-smooks.xml'
		// for extended resource configuration namespace 'http://www.milyn.org/xsd/smooks/edi-1.1.xsd'.
		// This resource must be available on the classpath.
		//  => pour test: copie en dur depuis le jar smooks vers classpath mqlistener => corrige l'erreur mais pourquoi?

		Locale defaultLocale = Locale.getDefault();
		Locale.setDefault(new Locale("en", "IE"));

		// Instantiate Smooks with the config...
		// Smooks smooks = new Smooks("smooks/smooks-config.xml");
		Smooks smooks = new Smooks(this.getClass().getResourceAsStream("/smooks/smooks-config.xml"));

		try {
			// Create an exec context - no profiles....
			ExecutionContext executionContext = smooks.createExecutionContext();

			StringResult result = new StringResult();

			// Configure the execution context to generate a report...
			// executionContext.setEventListener(new
			// HtmlReportGenerator("target/report/report.html"));
			
			// Permet d'avoir les fichiers smooks (xsd etc) dans le classpath.
			ClassLoader classLoader = getClass().getClassLoader();
			Thread.currentThread().setContextClassLoader(classLoader );
			smooks.setClassLoader(classLoader);
			
			// Filter the input message to the outputWriter, using the execution
			// context...
			smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(ediMessage.getBytes())),
					result);

			Locale.setDefault(defaultLocale);

			return result.getResult();
		} finally {
			smooks.close();
		}

		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // conversion edi => xml via smooks //
		 * *************************************** final SmooksFactory
		 * smooksFactory = (SmooksFactory) camelContext.getRegistry()
		 * .lookup(SmooksFactory.class.getName()); // final Smooks smooks =
		 * smooksFactory.createInstance(); StreamSource is = new
		 * StreamSource(ediMessage); smooks.filterSource(is);
		 * 
		 * // ***************************************
		 * 
		 * // Smooks smooks = new // Smooks(this.getClass().getResourceAsStream(
		 * "/smooks/smooks-config.xml")); // SmooksProcessor processor = new
		 * SmooksProcessor(smooks, // camelContext); // Exchange exchange = //
		 * ExchangeBuilder.anExchange(camelContext).withBody(ediMessage).build()
		 * ; // // processor.process(exchange); // // String xml =
		 * exchange.getIn().getBody().toString(); // System.out.println("xml:" +
		 * xml); // ***************************************
		 * 
		 * // StreamSource is = new StreamSource(ediMessage); // StringWriter
		 * writer = new StringWriter(); // smooks.filterSource(is, new
		 * StreamResult(writer)); // System.out.println(
		 * "==============Message Out============="); // String xml =
		 * writer.toString(); // System.out.println("xml:" + xml); //
		 * ***************************************
		 * 
		 * // StreamSource is = new StreamSource(ediMessage); // Smooks smooks =
		 * new Smooks("smooks/smooks-config.xml"); // ExecutionContext ctx =
		 * smooks.createExecutionContext(); // smooks.filterSource(is);
		 * 
		 * // ***************************************
		 * 
		 * System.out.println("<= SBRTransformer141EDItoXML=>transform()");
		 * 
		 * // Retourne le xml return smooks.toString(); // return xml;
		 * 
		 */
	}

}
