package com.conztanz.connect.mq.sbr.service.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.log4j.Logger;

import com.conztanz.connect.mq.sbr.service.ISBR141EDIMessageListenerService;
import com.conztanz.connect.transform.sbr.ISBRMarshaller141Service;
import com.conztanz.connect.transform.sbr.ISBRTransformer141EDItoXML;
import com.conztanz.persistence.model.SBRMessage;
import com.conztanz.persistence.services.SBR_14MessageService;
import com.conztanz.sbr.edifact.cleaner.ISBREdifactMessageCleaner;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;

//@Service(value = "SBR_14_1_EDI_SERVICE")
public class SBR141EDIMessageListenerService implements ISBR141EDIMessageListenerService {

	private static Logger log = Logger.getLogger(SBR141EDIMessageListenerService.class);

	// Injecté par blueprint
	private ISBREdifactMessageCleaner cleaner;
	private ISBRTransformer141EDItoXML smooksTransformer;
	private ISBRMarshaller141Service marshaller;
	private SBR_14MessageService  sbr_14MessageService;
								  
	@Override
	@Handler
	public String onMessage(String body, Exchange exchange) throws Exception {

		log.debug("=> SBR141EDIMessageListenerService.onMessage()");

		Map<String, Object> props = exchange.getProperties();
		if (props != null) {
			log.debug("******************");
			log.debug("Properties:");
			Iterator<Entry<String, Object>> it = props.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String, Object> entry = it.next();
				log.debug("\t" + entry.getKey() + ":" + entry.getValue());
			}
		}

		log.debug("body:" + body);

		// start transaction?

		// conversion en xml via smooks (avec nettoyage edifact)
		log.info("Transforming EDI message to XML via OSGI service...");
		String xml = smooksTransformer.transform(body, exchange.getContext());
		log.info("OK : EDI successfully transformed to XML");

		log.debug("xml:\r\n" + xml);

		// Conversion java via jibx (objet de type BINDING dans conztanz one -
		// AbstractTravelMediator, spécialisé ici en ForPnrHandling)

		log.info("Unmarshalling XML message to java via OSGI service...");
		ForPnrHandling pnr = marshaller.unmarshall(xml, exchange);
		log.info("OK : ForPnrHandling object created!");

		log.debug("Example : pnr.getActMarker().getActionRequestCode() : " + pnr.getActMarker().getActionRequestCode());
		sbr_14MessageService.insertMessage(new SBRMessage());
		

		// TODO => extraction TRAVEL à partir de BINDING

		// TODO => conversion des TRAVEL JSON via jackson

		// TODO checks + insertion lifecycle

		// TODO commit (XA?)

		// TODO appel (travel) AS

		return xml;
	}

	public ISBRTransformer141EDItoXML getSmooksTransformer() {
		return smooksTransformer;
	}

	public void setSmooksTransformer(ISBRTransformer141EDItoXML smooksTransformer) {
		this.smooksTransformer = smooksTransformer;
	}

	public ISBREdifactMessageCleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(ISBREdifactMessageCleaner cleaner) {
		this.cleaner = cleaner;
	}

	public ISBRMarshaller141Service getMarshaller() {
		return marshaller;
	}

	public void setMarshaller(ISBRMarshaller141Service marshaller) {
		this.marshaller = marshaller;
	}

	public SBR_14MessageService getSbr_14MessageService() {
		return sbr_14MessageService;
	}

	public void setSbr_14MessageService(SBR_14MessageService sbr_14MessageService) {
		this.sbr_14MessageService = sbr_14MessageService;
	}
	
	
	
	
	

}
