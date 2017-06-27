package com.conztanz.connect.transform;

public class SimpleMessageConnectSmooksTransformer extends AbstractConnectSmooksTransformer
{

	@Override
	public String getPathToConfigFile() {
		return "/messages/SimpleIncomingMessageSmooksConfig.xml";
	}
	
	
	/**
	 * 
	 */
	@Override
	public IMessageCleaner getCleaner() {
		return new IMessageCleaner() {
			@Override
			public byte[] clean(byte[] payLoad,boolean decodeBase64BeforeCleaning) {
				return payLoad;
			}
		};
	}

}
