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
	void  clean(byte[] payLoad,boolean decodeBase64BeforeCleaning);

}
