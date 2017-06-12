package com.conztanz.connect.model;

import com.conztanz.model.AbstractEntity;

//@Entity(name = "INCOMING_MESSAGE")
//@SequenceGenerator(name = "SEQ_ID", sequenceName = "INCOMING_MESSAGE_ID_SEQ")
//@Access(AccessType.FIELD)
public abstract class IncomingMessage extends AbstractEntity {

	/**
	 * 
	 */
//	private MessageType type;

	/**
	 * 
	 */
	private byte[] rawPayload;
	
	/**
	 * TODO generic instead of string (with a string implementation for now) 
	 */
	private String objectId;

	/**
	 * 
	 * @return
	 */
	private String transformedPayload;

	public IncomingMessage(byte[] rawPayload) {
		this.rawPayload = rawPayload;
	}

//	public IncomingMessage(byte[] rawPayload, MessageType type) {
//		this.type = type;
//		this.rawPayload = rawPayload;
//	}

	public String getTransformedPayload() {
		return transformedPayload;
	}

	public void setTransformedPayload(String transformedPayload) {
		this.transformedPayload = transformedPayload;
	}

	public byte[] getRawPayload() {
		return rawPayload;
	}

//	public MessageType getType() {
//		return type;
//	}
//
//	public void setType(MessageType type) {
//		this.type = type;
//	}

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

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public void setRawPayload(byte[] rawPayload) {
		this.rawPayload = rawPayload;
	}
	
	

}
