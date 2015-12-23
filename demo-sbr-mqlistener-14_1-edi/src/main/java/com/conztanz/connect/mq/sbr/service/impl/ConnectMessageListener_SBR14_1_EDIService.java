package com.conztanz.connect.mq.sbr.service.impl;

import javax.jms.Message;

import org.springframework.stereotype.Service;

import com.conztanz.connect.mq.sbr.service.IConnectMessageListener_SBR;

@Service(value="SBR_14_1_EDI_SERVICE")
public class ConnectMessageListener_SBR14_1_EDIService implements IConnectMessageListener_SBR {

	@Override
	public String onMessage(String message) {
		// TODO Auto-generated method stub

		System.out.println("=> ConnectMessageListener_SBR14_1_EDIService.onMessage()");
		System.out.println("message:" + message);
		// start transaction
		// clean message
		// conversion en xml via smooks
		// conversion java via jibx (objet de type BINDING dans conztanz one -
		// AbstractTravelMediator)
		// => extraction TRAVEL à partir de BINDING
		// conversion des TRAVEL JSON via jackson
		// checks + insertion lifecycle
		// commit
		// appel (travel) AS ?

		return message;
	}

//	@Override
//	public void onMessage(Message message) {
//		// TODO Auto-generated method stub
//
//		System.out.println("=> ConnectMessageListener_SBR14_1_EDIService.onMessage()");
//		System.out.println("message:" + message);
//		// start transaction
//		// clean message
//		// conversion en xml via smooks
//		// conversion java via jibx (objet de type BINDING dans conztanz one -
//		// AbstractTravelMediator)
//		// => extraction TRAVEL à partir de BINDING
//		// conversion des TRAVEL JSON via jackson
//		// checks + insertion lifecycle
//		// commit
//		// appel (travel) AS ?
//
//	}

}
