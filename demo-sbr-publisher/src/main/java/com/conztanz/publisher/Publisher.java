package com.conztanz.publisher;

import java.util.Date;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.apache.activemq.util.ByteSequence;
import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Producer;
import org.apache.camel.util.IOHelper;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Publisher {

	public static void main(final String[] args) throws Exception {

		// System.out.println("Notice this client requires that the CamelServer
		// is already running!");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("META-INF/camel-context.xml");
		CamelContext camel = context.getBean("camel-client", CamelContext.class);

		// get the endpoint from the camel context
		Endpoint endpoint = camel.getEndpoint("jms:queue:SBR_14_1_EDI.TO.CC");
		System.out.println("ENDPOINT URI: " + endpoint.getEndpointUri());
		// create the exchange used for the communication
		Exchange exchange = endpoint.createExchange(ExchangePattern.InOnly);
		// set the input on the in body
		// must be correct type to match the expected type

//		ActiveMQTextMessage message = new ActiveMQTextMessage();
//		message.setJMSMessageID("DUMMY MESSAGE ID");
//		String payloadAsString = "DUMMY EDI MESSAGE - " + new Date();
//		ByteSequence content = new ByteSequence(payloadAsString.getBytes());
//		message.setContent(content);
		
//		exchange.getIn().setBody(message);
		
		
		
		
		String mockBody = "UNH1SBRRES1211A030614/0122/4/7AEDL9/020614MSGREGRCI7AEDL9PTD2207144RCI1A7AEDL9A0206141454RSIRPEPSUAJATQ210020204446AJATQ2100AGYAJATQ21002708EP020614202044461442RPI1CRDAJATQ2100202044462708EPSUELYPOSOWNUID20204446AJATQ2100TSYS1AAJAPREFRPOSCREUID20204446AJATQ2100TSYS1AAJAPREFRPOSUPDUID20204446AJATQ2100TSYS1AAJAPREFRRCI7AEDL9LFT3LUCAS/CHRISTRCI7AEFCRLFT3LUCAS/CHRISTEMSPT1NMTIFLUCAS1CHRISTIANODIEMSST6AIRTVL14071408501407141025FSCORYXK750AETDDATZT0206141442RPINNNNMSG1RCIXK7AEDL9RPI1HKAPD3201W0830SDTP2UID20204446AJATQ2100TSYS1AAJAPREFREMSST7AIRTVL14071413301407141345ORYLCYWX32NETIDATZT0206141442RPINNNNMSG1RCIWX7AEDL9RPI1HKAPDF501WSDTP2SCIYSBI0ABICFR1AUID20204446AJATQ2100TSYS1AAJAPREFREMSST9AIRTVL18071421301807142305ORYFSCXK753AETDDATZT0206141442RPINNNNMSG1RCIXK7AEDL9RPI1HKAPD3205W2110SDTP2UID20204446AJATQ2100TSYS1AAJAPREFREMSST11AIRTVL18071416351807141735LUXCDGLG8019KETDATZT0206141453RPINNNNMSG1RCILGJKDJ8RPI1HKAPDER452G1550SDTP2UID20204446AJATQ2100TSYS1AAJAPREFREMSST10AIRTVLPARFSCXKOPENAMSG1DUMEMSOT54RRRCI1A7AEFCR020614RSIRREPSUAJATQ2100EMSOT29APLFT35AJA 04.95.70.28.00 - AQUILA VACANCES - AEMSOT30APLFT3P02EMILYAQUILA@ORANGE.FREMSOT31TKTKETL030614AJATQ2100EMSOT62FEREFPT1ST7LFT310PAX NON REF/ FEE FOR CHANGEEMSOT63FVREFPT1ST7LFT3P18PAX WXEMSOT69OPCREFST7OPEAJATQ210005061418WX CANCELLATION DUE TO NO TICKET1700LFT3ATL1400686115176EMSOT70OPWREFST7OPEAJATQ210004061417WX REQUIRES TICKET ON OR BEFORE 05JUN:17001700EMSOT66RIMIRRIR*** TTC EUR 670.00 ***DUMEMSOT34UCIREFPT1IRVUCI305265330000A4E0EMSOT23DIDREFPT1ST7IRVDID00084538C8D6BA2CEMSOT66RIERMRIR*** TTC EUR 670.00 ***2PTKIRVTST2PXRPA1DISADT1MONT86.43EURMONB36.00EURMONGT86.43EURTXDX20.00YREURVBTXDX12.19QXEURAPTXDX1.13IZEUREBTXDX4.36FREURSETXDX12.75FREURTIPTKIFODIPARLONSTXMNSTXISDNATCTTBATCFCM0TXFFCAS1PAR WX LON49.69NUC49.69END ROE0.724488UIDAJATQ2100EPSDICRD201462SDIPD201462SDILT2014714REFSEG7PTSN9SR4WFRDATB140714DATA140714EBD1NPCACT0UNT1451";
//		 exchange.getIn().setBody("DUMMY EDI MESSAGE - " + new Date());
		 exchange.getIn().setBody(mockBody);

		// to send the exchange we need an producer to do it for us
		Producer producer = endpoint.createProducer();
		// start the producer so it can operate
		producer.start();

		producer.process(exchange);

		// get the response from the out body
		// String response = exchange.getOut().getBody(String.class);
		// System.out.println("... the result is: " + response);

		// stopping the JMS producer has the side effect of the "ReplyTo Queue"
		// being properly
		// closed, making this client not to try any further reads for the
		// replies from the server
		producer.stop();

		// we're done so let's properly close the application context
		IOHelper.close(context);
	}
}
