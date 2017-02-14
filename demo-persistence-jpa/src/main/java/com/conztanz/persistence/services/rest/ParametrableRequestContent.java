package com.conztanz.persistence.services.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ParametrableRequestContent {

	private boolean shouldFail;

	public ParametrableRequestContent(boolean shouldFail) {
		super();
		this.shouldFail = shouldFail;
	}

	public ParametrableRequestContent() {
		super();
	}

	public boolean isShouldFail() {
		return shouldFail;
	}

	public void setShouldFail(boolean shouldFail) {
		this.shouldFail = shouldFail;
	}
}

	
	

