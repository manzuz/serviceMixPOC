package com.conztanz.connect.identification;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.marshalling.SBR141UnMarshaller;
import com.conztanz.connect.model.IncomingMessage;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;

//TODO : naming 
@Singleton
public class SBR141ConnectIdentifier extends AbstractConnectIdentifier<ForPnrHandling,SBR141UnMarshaller> {
	
	@Autowired
	private SBR141UnMarshaller sBR141UnMarshaller;

	@Override
	public SBR141UnMarshaller getUnmarshaller() {
		return sBR141UnMarshaller;
	}

	@Override
	public String identify(IncomingMessage incomingMessage) {
		// TODO Auto-generated method stub
		return null;
	}

}
