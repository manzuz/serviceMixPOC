package com.conztanz.connect.travel.model;

/**
 * 
 * @author User
 *
 */
public class SBRObjectID 
{
	/**
	 * 
	 */
	private String controlNumber;
	
	/**
	 * 
	 */
	private String creationDate;
	
	
	

	public SBRObjectID(String controlNumber, String creationDate) {
		this.controlNumber = controlNumber;
		this.creationDate = creationDate;
	}

	public String getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
