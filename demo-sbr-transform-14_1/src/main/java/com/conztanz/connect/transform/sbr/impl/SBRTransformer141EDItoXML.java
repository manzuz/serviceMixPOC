package com.conztanz.connect.transform.sbr.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Body;
import org.apache.camel.CamelContext;
import org.milyn.Smooks;
import org.milyn.container.ExecutionContext;
import org.milyn.payload.StringResult;
import org.xml.sax.SAXException;

import com.conztanz.connect.transform.sbr.ISBRTransformer141EDItoXML;
import com.conztanz.sbr.edifact.cleaner.ISBREdifactMessageCleaner;

/**
 * 
 * @author Emmanuel
 *
 */
public class SBRTransformer141EDItoXML implements ISBRTransformer141EDItoXML {

	private ISBREdifactMessageCleaner cleaner;

	private static Smooks smooks = null;

	@Override
	public String transform(@Body String ediMessage, CamelContext camelContext) throws Exception {

		System.out.println("SBRTransformer141EDItoXML => transform()");

		System.out.println("Cleaning EDI message via OSGI service...");
		String cleanMessage = cleaner.cleanMessage(ediMessage);

		// Locale defaultLocale = Locale.getDefault();
		// Locale.setDefault(new Locale("en", "IE"));

		Smooks smooks = getSmooksSingleton();

		try {
			// Create an exec context - no profiles....
			ExecutionContext executionContext = smooks.createExecutionContext();

			StringResult result = new StringResult();

			// Configure the execution context to generate a report...
			// executionContext.setEventListener(new
			// HtmlReportGenerator("target/report/report.html"));

			// Filter the input message to the outputWriter, using the execution
			// context...
			ByteArrayInputStream is = new ByteArrayInputStream(cleanMessage.getBytes());
			smooks.filterSource(executionContext, new StreamSource(is), result);

			String xml = result.getResult();
			System.out.println("xml:" + xml);

			// Locale.setDefault(defaultLocale);

			return xml;

		} finally {
			smooks.close();
		}

	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 * @throws SAXException
	 */
	private synchronized Smooks getSmooksSingleton() throws IOException, SAXException {

		// TODO : essayer de ne pas embarquer les xsd smooks dans le code
		// appelant!

		// Si on n'embarque pas les xsd smooks dans le code appelant
		// (mqlistener), on a une erreur de classpath :
		// org.milyn.cdr.SmooksConfigurationException: Unable to locate Smooks
		// digest configuration '/META-INF/xsd/smooks/edi-1.1.xsd-smooks.xml'
		// for extended resource configuration namespace
		// 'http://www.milyn.org/xsd/smooks/edi-1.1.xsd'.
		// This resource must be available on the classpath.
		// => pour test: copie en dur depuis le jar smooks vers classpath
		// mqlistener => corrige l'erreur mais pourquoi?

		if (smooks == null) {
			System.out.println("Smooks singleton is null. Instanciation...");
			// Instantiate Smooks with the config...
			smooks = new Smooks(this.getClass().getResourceAsStream("/smooks/smooks-config.xml"));
			// Permet d'avoir les fichiers smooks (xsd etc) dans le classpath.
			ClassLoader classLoader = this.getClass().getClassLoader();
			Thread.currentThread().setContextClassLoader(classLoader);
			smooks.setClassLoader(classLoader);
		}
		System.out.println("Smooks singleton is null. Instanciation...");
		return smooks;
	}

	public ISBREdifactMessageCleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(ISBREdifactMessageCleaner cleaner) {
		this.cleaner = cleaner;
	}

}
