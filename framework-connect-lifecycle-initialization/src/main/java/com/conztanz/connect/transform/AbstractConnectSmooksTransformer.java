package com.conztanz.connect.transform;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.payload.StringResult;
import org.xml.sax.SAXException;

public abstract class AbstractConnectSmooksTransformer {
	/**
	 * 
	 * @param payload
	 * @return
	 */
	public String transform2XML(byte[] payLoad) {
		StringResult serializedEvents = new StringResult();
		//TODO decodeBase64BeforeCleaning
		byte[] cleanedpayLoad = this.getCleaner().clean(payLoad,false);
		try {
			this.getSmooksReader().filterSource(new StreamSource(this.byte2Stream(cleanedpayLoad)), serializedEvents);
		} catch (SmooksException | IOException | SAXException e) {
			e.printStackTrace();
		}
//		System.out.println(serializedEvents.getResult());
		return serializedEvents.getResult();
	}

	/**
	 * 
	 * @return
	 */
	public Smooks getSmooksReader() throws IOException, SAXException {
		ClassLoader classLoader = this.getClass().getClassLoader();
		Thread.currentThread().setContextClassLoader(classLoader);
		return new Smooks(this.getClass().getResourceAsStream(this.getPathToConfigFile()));
	}

	/**
	 * 
	 * @return
	 */
	private InputStream byte2Stream(byte[] payload) {
		InputStream inputStream = new ByteArrayInputStream(payload);
		return inputStream;
	}
	
	/**
	 * 
	 * @return
	 */
	public abstract String getPathToConfigFile();
	
	/**
	 * 
	 * @return
	 */
	public abstract IMessageCleaner getCleaner();

}
