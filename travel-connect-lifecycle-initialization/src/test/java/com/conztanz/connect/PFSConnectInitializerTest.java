package com.conztanz.connect;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-connect-beans.xml")
public class PFSConnectInitializerTest {
	
	
	@Autowired
	private PFSConnectInitializer pfsConnectInitializer;
	
	
	@Autowired
	private SBR14ConnectInitializer sBR14ConnectInitializer;
	
	
	
	
	
	@Test
	public void test() {
		PFSIncomingMessage msg = pfsConnectInitializer.getMessageFactory().createMessage(new byte[10]);
		assertEquals(msg.getType(), MessageType.PFS);
	}

	
	
	@Test
	public void testEDI2XML() throws IOException {
		
		Path path = Paths.get("C:\\Users\\User\\Desktop\\serviceMixPOC\\travel-connect-lifecycle-initialization\\src\\test\\resources\\edifact\\edifact-sample.txt");
		byte [] payload = Files.readAllBytes(path); 
		sBR14ConnectInitializer.init(payload);
		SBR14IncomingMessage msg = sBR14ConnectInitializer.getMessageFactory().createMessage(payload);
	}

}
