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

import com.conztanz.connect.identification.PFSConnectIdentifier;
import com.conztanz.connect.model.PFSIncomingMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-connect-beans.xml")
public class PFSOrchestrationFileSystemCamelRouteTest {

	@Autowired
	private PFSConnectInitializer pfsConnectInitializer;

	@Autowired
	PFSConnectIdentifier pFSConnectIdentifier;

	@Test
	public void camelRouteTest() throws IOException, JiBXException {
		
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./airimp/PFS.txt");
		PFSIncomingMessage m  = pfsConnectInitializer.init(IOUtils.toByteArray(is));
		pFSConnectIdentifier.unmarshall(m.getTransformedPayload());
		
	}
}
