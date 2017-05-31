package com.conztanz.connect;

import com.conztanz.model.AbstractEntity;

public class IncomingMessage extends AbstractEntity {

	/**
	 * 
	 */
	private MessageType type;

	/**
	 * 
	 */
	private byte[] rawPayload;

	/**
	 * 
	 * @return
	 */
	private String transformedPayload;
	
	

	public IncomingMessage(byte[] rawPayload) {
		this.rawPayload = rawPayload;
	}
	
	

	public IncomingMessage( byte[] rawPayload,MessageType type) {
		this.type = type;
		this.rawPayload = rawPayload;
	}



	public String getTransformedPayload() {
		return transformedPayload;
	}

	public void setTransformedPayload(String transformedPayload) {
		this.transformedPayload = transformedPayload;
	}

	public byte[] getRawPayload() {
		return rawPayload;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	@Override
	protected boolean sameContentInternal(Object toBeCompared) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean sameLinksInternal(Object toBeCompared) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}
