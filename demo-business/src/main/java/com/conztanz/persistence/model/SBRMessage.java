package com.conztanz.persistence.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.joda.time.DateTime;

@Entity
public class SBRMessage {
	@Id
	private int id;
	private String msg_id;
	private String msg_type;
	private String msg_format;
	private String msg_version;
	private DateTime msg_timestamp;
	private String object_id;
	private int sequence;
	private String message;
	private String status;
	private String reason;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(String msg_id) {
		this.msg_id = msg_id;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	public String getMsg_format() {
		return msg_format;
	}
	public void setMsg_format(String msg_format) {
		this.msg_format = msg_format;
	}
	public String getMsg_version() {
		return msg_version;
	}
	public void setMsg_version(String msg_version) {
		this.msg_version = msg_version;
	}
	public DateTime getMsg_timestamp() {
		return msg_timestamp;
	}
	public void setMsg_timestamp(DateTime msg_timestamp) {
		this.msg_timestamp = msg_timestamp;
	}
	public String getObject_id() {
		return object_id;
	}
	public void setObject_id(String object_id) {
		this.object_id = object_id;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	
	
	

}
