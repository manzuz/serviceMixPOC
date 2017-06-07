package com.conztanz.connect.marshalling;

import javax.inject.Singleton;

import com.conztanz.marshalling.AbstractConztanzUnmarshaller;
import com.conztanz.transform.delivery.Delivery;
/**
 * 
 * @author User
 *
 */
@Singleton
public class PFSUnMarshaller extends AbstractConztanzUnmarshaller<Delivery> {

	public PFSUnMarshaller() {
		super(Delivery.class);
	}

}
