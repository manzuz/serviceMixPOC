package com.conztanz.connect.travel.model;

import com.conztanz.connect.model.IncomingMessage;

/**
 *
 */
public class SBRIncomingMessage extends IncomingMessage<SBRObjectID>
{
	/**
	 * SBR version, ex: 9.2, 14.1 etc
	 */
	private String  messageVersion;
	/**
	 *
	 * @param rawPayload
	 */
	public SBRIncomingMessage(byte[] rawPayload ) {

		super(rawPayload);
	}

	public String getMessageVersion() {
		return messageVersion;
	}

	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}
}
