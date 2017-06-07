package com.conztanz.connect.transform;

/**
 * 
 * @author User
 *
 */
public interface IMessageCleaner {

	/**
	 * 
	 * @param payLoad
	 * @return
	 */
	byte[]  clean(byte[] payLoad,boolean decodeBase64BeforeCleaning);

}
