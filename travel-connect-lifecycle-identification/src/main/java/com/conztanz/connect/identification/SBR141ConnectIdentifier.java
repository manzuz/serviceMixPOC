package com.conztanz.connect.identification;



import javax.inject.Singleton;

import com.conztanz.connect.model.IncomingMessage;

//TODO : naming 
@Singleton
public class SBR141ConnectIdentifier extends AbstractConnectIdentifier{
	


	@Override
	public void identify(IncomingMessage incomingMessage)  {
//		ForPnrHandling forPnrHandling = this.getUnmarshaller().unmarshall(incomingMessage.getTransformedPayload());
	}

}
