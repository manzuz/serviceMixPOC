package com.conztanz.connect.transform.sbr.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Body;
import org.apache.camel.CamelContext;
import org.apache.log4j.Logger;
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
public class SBR141EDItoXMLTransformService implements ISBRTransformer141EDItoXML {

	private static Logger log = Logger.getLogger(SBR141EDItoXMLTransformService.class);

	private ISBREdifactMessageCleaner cleanerService;

	private static Smooks smooks = null;

	@Override
	public String transform(@Body String ediMessage, CamelContext camelContext) throws Exception {

		log.info("SBR141EDItoXMLTransformService => transform()");

		log.info("Cleaning EDI message via OSGI service...");
		String cleanMessage = cleanerService.cleanMessage(ediMessage);

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
			log.debug("xml:" + xml);

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
	// private synchronized Smooks getSmooksSingleton() throws IOException,
	// SAXException {
	private Smooks getSmooksSingleton() throws IOException, SAXException {

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

		// Post trouvé à la page
		// http://stackoverflow.com/questions/7564370/importing-resources-from-osgi-bundle
		// :
		/*
		 * "Resources in the root of a bundle are in the "default" package,
		 * which cannot be imported or exported.
		 * 
		 * If you really must access the resources via classloader, you need to
		 * move them into a package and export that package. Otherwise you can
		 * use Bundle.getEntry() to read resources from any location of any
		 * bundle."
		 * 
		 * 
		 * 
		 * 
		 * => Impossible de déplacer les xsd car smooks impose de les mettre
		 * dans META-INF/ à la racine du classpath. => il faut essayer
		 * Bundle.getEntry(): cf
		 * http://stackoverflow.com/questions/3522978/access-resources-in-
		 * another-osgi-bundle:
		 * 
		 * "...The getEntry(String) method on Bundle is intended for this
		 * purpose. You can use it to load any resource from any bundle. Also
		 * see the methods findEntries() and getEntryPaths() if you don't know
		 * the exact path to the resource inside the bundle.
		 * 
		 * There is no need to get hold of the bundle's classloader to do this."
		 * 
		 */

		ClassLoader classLoader = this.getClass().getClassLoader();
		log.info("classLoader:" + classLoader);
		if (smooks == null) {
			Thread.currentThread().setContextClassLoader(classLoader);
			log.info("Smooks singleton is null. Instanciation...");
			// Instantiate Smooks with the config...
			smooks = new Smooks(this.getClass().getResourceAsStream("/smooks/smooks-config.xml"));
			// Permet d'avoir les fichiers smooks (xsd etc) dans le classpath.
			smooks.setClassLoader(classLoader);
		} else {
			log.info("Smooks singleton is not null.");
		}
		return smooks;
	}

	public ISBREdifactMessageCleaner getCleanerService() {
		return cleanerService;
	}

	public void setCleanerService(ISBREdifactMessageCleaner cleanerService) {
		this.cleanerService = cleanerService;
	}

}
