package com.conztanz.connect.mq.sbr.service.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;

import com.conztanz.connect.mq.sbr.service.IConnectMessageListener_SBR;
import com.conztanz.connect.transform.sbr.ISBRTransformer141EDItoXML;
import com.conztanz.sbr.edifact.cleaner.ISBREdifactMessageCleaner;

//@Service(value = "SBR_14_1_EDI_SERVICE")
public class ConnectMessageListener_SBR14_1_EDIService implements IConnectMessageListener_SBR {

	// Injecté par blueprint
	private ISBREdifactMessageCleaner cleaner;
	private ISBRTransformer141EDItoXML smooksTransformer;

	@Override
	@Handler
	public String onMessage(String body, Exchange exchange) throws Exception {

		System.out.println("=> ConnectMessageListener_SBR14_1_EDIService.onMessage()");

		System.out.println("body:" + body);

		Map<String, Object> props = exchange.getProperties();
		if (props != null) {
			System.out.println("******************");
			System.out.println("Properties:");
			Iterator<Entry<String, Object>> it = props.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String, Object> entry = it.next();
				System.out.println("\t" + entry.getKey() + ":" + entry.getValue());
			}
		}

		// Message in = exchange.getIn();

		// start transaction?

//		System.out.println("Cleaning EDI message via OSGI service...");
//		String cleanMessage = cleaner.cleanMessage(exchange);
//		exchange.getIn().setBody(cleanMessage);
//		System.out.println("OK : EDI message is clean.");

		// conversion en xml via smooks

		body = exchange.getIn().getBody().toString();
		System.out.println("Transforming EDI message to XML via OSGI service...");
		String xml = smooksTransformer.transform(body, exchange.getContext());
		System.out.println("xml:" + xml);

		// CamelContext camelContext = exchange.getContext();
		// final SmooksFactory smooksFactory = (SmooksFactory)
		// camelContext.getRegistry().lookup(SmooksFactory.class.getName());
		// final Smooks smooks = smooksFactory.createInstance();

		/*
		 * try { Smooks smooks = new Smooks("smooks/smooks-config.xml");
		 * 
		 * 
		 * } catch (IOException | SAXException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 * 
		 */
		// conversion java via jibx (objet de type BINDING dans conztanz one -
		// AbstractTravelMediator)
		// => extraction TRAVEL à partir de BINDING
		// conversion des TRAVEL JSON via jackson
		// checks + insertion lifecycle
		// commit
		// appel (travel) AS ?

		return body;
	}

	// @Override
	// public void onMessage(Message message) {
	// // TODO Auto-generated method stub
	//
	// System.out.println("=>
	// ConnectMessageListener_SBR14_1_EDIService.onMessage()");
	// System.out.println("message:" + message);
	// // start transaction
	// // clean message
	// // conversion en xml via smooks
	// // conversion java via jibx (objet de type BINDING dans conztanz one -
	// // AbstractTravelMediator)
	// // => extraction TRAVEL à partir de BINDING
	// // conversion des TRAVEL JSON via jackson
	// // checks + insertion lifecycle
	// // commit
	// // appel (travel) AS ?
	//
	// }

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

}