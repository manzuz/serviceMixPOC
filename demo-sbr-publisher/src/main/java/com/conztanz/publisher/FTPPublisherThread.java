package com.conztanz.publisher;

import java.io.File;
import java.net.URL;
import java.util.UUID;

import org.apache.camel.util.FileUtil;

public class FTPPublisherThread extends Thread {

	private String endpointURI;
	private String sampleFileName;

	public FTPPublisherThread(String endpointURI, String sampleFileName) {
		this.endpointURI = endpointURI;
		this.sampleFileName = sampleFileName;
	}

	@Override
	public void run() {
		try {
			publishFTP();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param endpointURI
	 * @param sampleFileName
	 * @throws Exception
	 */
	private void publishFTP() throws Exception {

		ClassLoader classLoader = Publisher.class.getClassLoader();
		URL iStream = classLoader.getResource(sampleFileName);
		File sample = new File(iStream.getPath());
		String relativeIncomingPath = endpointURI.split(":")[1];
		File destinationFile = new File("C:/apache-servicemix-6.1.1/" + relativeIncomingPath + "/" + sampleFileName + UUID.randomUUID().toString());
		System.out.println("Copying sample file to incoming dir...:" + iStream.getPath() + " => " + destinationFile);
		FileUtil.copyFile(sample, destinationFile);

	}

}
