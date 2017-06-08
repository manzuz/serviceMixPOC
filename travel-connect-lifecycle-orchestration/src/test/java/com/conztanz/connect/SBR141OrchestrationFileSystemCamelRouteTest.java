package com.conztanz.connect;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.jibx.runtime.JiBXException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.conztanz.connect.identification.SBR141ConnectIdentifier;
import com.conztanz.connect.model.SBR141IncomingMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-connect-beans.xml")
public class SBR141OrchestrationFileSystemCamelRouteTest {

	@Autowired
	private SBR141ConnectInitializer sBR14ConnectInitializer;

	@Autowired
	SBR141ConnectIdentifier connectIdentifier;

	@Test
	public void test() throws IOException, JiBXException {
		
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./edifact/edifact-sample.txt");
		SBR141IncomingMessage m  = sBR14ConnectInitializer.init(IOUtils.toByteArray(is));
//		connectIdentifier.unmarshall(m.getTransformedPayload());
		
	}
}
