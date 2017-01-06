package com.conztanz.persistence.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class SBRMessage {
	@Id 
	@GeneratedValue
	@Column(name = "id")
	private int id;

	private int sequenceNumber;
	
	
	
	public SBRMessage() {
		this.sequenceNumber = 42;
	}
	
	
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
	

}
