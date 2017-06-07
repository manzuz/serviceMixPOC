package com.conztanz.connect.identification;

import javax.inject.Singleton;

import org.jibx.runtime.JiBXException;
import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.marshalling.PFSUnMarshaller;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.transform.delivery.Delivery;

//TODO : naming 
@Singleton
public class PFSConnectIdentifier extends AbstractConnectIdentifier<Delivery,PFSUnMarshaller> {
	
	@Autowired
	private PFSUnMarshaller pFSUnMarshaller;

	@Override
	public PFSUnMarshaller getUnmarshaller() {
		return pFSUnMarshaller;
	}

	@Override
	public String identify(IncomingMessage incomingMessage) throws JiBXException {
		Delivery delivery  = this.getUnmarshaller().unmarshall(incomingMessage.getTransformedPayload());
		System.out.println(delivery.getSegment());
		System.out.println(delivery.getSegment().getDeparture());

		return null;
	}

}
