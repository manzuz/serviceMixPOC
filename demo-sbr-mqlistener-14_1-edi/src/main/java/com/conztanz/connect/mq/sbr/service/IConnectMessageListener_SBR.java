package com.conztanz.connect.mq.sbr.service;

import javax.jms.MessageListener;

//public interface IConnectMessageListener_SBR extends MessageListener {
public interface IConnectMessageListener_SBR {

	public String onMessage(String message);
}
