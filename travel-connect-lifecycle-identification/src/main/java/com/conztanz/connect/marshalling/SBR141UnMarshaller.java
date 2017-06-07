package com.conztanz.connect.marshalling;

import javax.inject.Singleton;

import com.conztanz.marshalling.AbstractConztanzUnmarshaller;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;
@Singleton
public class SBR141UnMarshaller extends AbstractConztanzUnmarshaller<ForPnrHandling> {
		
	public SBR141UnMarshaller() {
		super(ForPnrHandling.class);
	}

}
