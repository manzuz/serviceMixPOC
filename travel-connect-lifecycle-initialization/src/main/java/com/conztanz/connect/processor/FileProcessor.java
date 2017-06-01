package com.conztanz.connect.processor;

import java.io.File;

import javax.inject.Singleton;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


/**
 * TODO rename
 * @author User
 *
 */

@Singleton
public class FileProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		org.apache.camel.component.file.GenericFile<File> f = (org.apache.camel.component.file.GenericFile<File>) exchange
				.getIn().getBody();
		System.out.println(f.getFileNameOnly());
		// byte[] b = body.getBytes(Charset.forName("UTF-8"));
		// exchange.getIn().setBody(b);

	}
}