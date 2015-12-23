package com.conztanz.connect.mq.sbr.service.impl;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Message;
import org.milyn.Smooks;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import com.conztanz.connect.mq.sbr.service.IConnectMessageListener_SBR;
import com.conztanz.connect.sbr.edifact.helper.SBRTagEdifactHelper;

@Service(value = "SBR_14_1_EDI_SERVICE")
public class ConnectMessageListener_SBR14_1_EDIService implements IConnectMessageListener_SBR {

	@Override
	@Handler
	public String onMessage(String body, Exchange exchange) {

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

		Message in = exchange.getIn();

		// Map<String, Object> headers = in.getHeaders();
		// if (headers != null) {
		// System.out.println("******************");
		// System.out.println("Headers:");
		// Iterator<Entry<String, Object>> it = props.entrySet().iterator();
		// while (it.hasNext()) {
		// Entry<String, Object> entry = it.next();
		// System.out.println("\t" + entry.getKey() + ":" + entry.getValue());
		// }
		// }

		// start transaction?

		System.out.println("Cleaning EDI message...");
		// clean message
		in.setBody(SBRTagEdifactHelper.cleanMessage(body));

		System.out.println("OK : EDI message is clean.");

		// conversion en xml via smooks
		
//		CamelContext camelContext = exchange.getContext();
//		final SmooksFactory smooksFactory = (SmooksFactory) camelContext.getRegistry().lookup(SmooksFactory.class.getName());
//		final Smooks smooks = smooksFactory.createInstance();
		
		try {
			Smooks smooks = new Smooks("smooks/smooks-config.xml");
			
			
		} catch (IOException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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

}
