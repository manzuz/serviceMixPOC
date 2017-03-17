package com.conztanz.persistence.model;


import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import com.conztanz.model.AbstractEntity;


@Entity(name = "sbr_message")
@SequenceGenerator(name = "SEQ_ID", sequenceName = "sbr_message_id_seq")
@Access(AccessType.FIELD)
public class SBRMessage 
extends AbstractEntity implements Serializable   
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
//    @Transient private Long  id;
	
	/**
	 * 
	 */
    @Transient  private int sequenceNumber;
	
	
	
	public SBRMessage() {
	
	}
	
	
	
	public SBRMessage(/*Long  id,*/ int sequenceNumber) {
		super();
//		this.id = id;
		this.sequenceNumber = sequenceNumber;
	}


	@Access(AccessType.PROPERTY)
	  @Column(name = "SEQUENCE_NUMBER", nullable = false, unique = false)
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

//	  @Access(AccessType.PROPERTY)
//	  @Id()
//	  @Column(name = "ID", length = 20, nullable = false, unique = true)
//	  @GeneratedValue(strategy = GenerationType.AUTO)
//	 public Long  getId() {
//		return id;
//	 }
//
//
//	private void setId(Long  id) {
//		this.id = id;
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

	
	

	
	
	

}
