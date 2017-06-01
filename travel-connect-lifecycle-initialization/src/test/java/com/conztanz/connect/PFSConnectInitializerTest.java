package com.conztanz.connect;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-connect-beans.xml")
public class PFSConnectInitializerTest {
	
	
	@Autowired
	private PFSConnectInitialzer pfsConnectInitialzer;
	
	
	
	
	
	@Test
	public void test() {
		PFSIncomingMessage msg = pfsConnectInitialzer.getMessageFactory().createMessage(new byte[10]);
		assertEquals(msg.getType(), MessageType.PFS);
	}

}
