package com.conztanz.connect.identification;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.conztanz.connect.identification.AbstractConnectIdentifier;
import com.conztanz.connect.marshalling.SBR141UnMarshaller;

//TODO : naming 
@Singleton
public class ConnectIdentifier extends AbstractConnectIdentifier<SBR141UnMarshaller> {
	
	@Autowired
	private SBR141UnMarshaller sBR141UnMarshaller;

	@Override
	public SBR141UnMarshaller getUnmarshaller() {
		return sBR141UnMarshaller;
	}

}
