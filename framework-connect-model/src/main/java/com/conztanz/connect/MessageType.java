package com.conztanz.connect;

public enum MessageType {
	PFS("Passenger Final Sales"),
	PNL("Passenger Name List"),
	PRL("Passenger Reconcile List"),
//	TODO : Description 
	SBR ("Description goes here");
	
	
	
	private String description;

	MessageType(String description) {
		this.description = description;
	}

	public String toString() {
		return description;
	}
}
