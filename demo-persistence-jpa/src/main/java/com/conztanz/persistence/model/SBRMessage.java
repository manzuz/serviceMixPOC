package com.conztanz.persistence.model;


import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Access(AccessType.FIELD)
@Table(name = "sbrmessage")
public class SBRMessage implements Serializable   {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
    @Transient private Long  id;
	
	/**
	 * 
	 */
    @Transient  private int sequenceNumber;
	
	
	
	public SBRMessage() {
		this.sequenceNumber= 42;	
	}
	
	
	
	public SBRMessage(Long  id, int sequenceNumber) {
		super();
		this.id = id;
		this.sequenceNumber = sequenceNumber;
	}


	@Access(AccessType.PROPERTY)
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	  @Access(AccessType.PROPERTY)
	  @Id()
	  @Column(name = "ID", length = 20, nullable = false, unique = true)
	  @GeneratedValue(strategy = GenerationType.AUTO)
	 public Long  getId() {
		return id;
	 }


	private void setId(Long  id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "SBRMessage [id=" + id + ", sequenceNumber=" + sequenceNumber + "]";
	}

	
	
	
	
	
	

}
