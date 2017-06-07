package com.conztanz.connect;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.jibx.runtime.JiBXException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.conztanz.connect.identification.ConnectIdentifier;
import com.conztanz.connect.model.SBR14IncomingMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-connect-beans.xml")
public class SBROrchestrationFileSystemCamelRouteTest {

	@Autowired
	private SBR14ConnectInitializer sBR14ConnectInitializer;

	@Autowired
	ConnectIdentifier connectIdentifier;

	@Test
	public void test() throws IOException, JiBXException {
		Path path = Paths.get(
				"C:\\Users\\User\\Desktop\\serviceMixPOC\\travel-connect-lifecycle-initialization\\src\\test\\resources\\edifact\\edifact-sample.txt");
		byte[] payload = Files.readAllBytes(path);
		SBR14IncomingMessage m = sBR14ConnectInitializer.init(payload);
		
		connectIdentifier.identify(m);
	}
}
