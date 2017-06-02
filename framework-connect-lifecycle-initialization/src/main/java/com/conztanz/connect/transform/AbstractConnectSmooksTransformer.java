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
	public String transform2XML(byte[] payload) {
		StringResult serializedEvents = new StringResult();
		try {
			this.getSmooksReader().filterSource(new StreamSource(this.byte2Stream(payload)), serializedEvents);
		} catch (SmooksException | IOException | SAXException e) {
			// TODO Auto-generated catch block
			System.out.println("heeeeeeeeeeeeeeeeeeeeeeeeere");
			e.printStackTrace();
		}
		return serializedEvents.getResult();
	}

	/**
	 * 
	 * @return
	 */
	public Smooks getSmooksReader() throws IOException, SAXException {
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(this.getPathToConfigFile());
		Smooks smooks = new Smooks(inputStream);
		return smooks;

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

}
