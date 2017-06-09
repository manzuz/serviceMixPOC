package com.conztanz.connect;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.conztanz.connect.PFSConnectInitializer;
import com.conztanz.connect.SBR141ConnectInitializer;
import com.conztanz.connect.model.MessageType;
import com.conztanz.connect.travel.model.PFSIncomingMessage;
import com.conztanz.connect.travel.model.SBR141IncomingMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-connect-beans.xml")
public class PFSConnectInitializerTest {
	
	
	@Autowired
	private PFSConnectInitializer pfsConnectInitializer;
	
	
	@Autowired
	private SBR141ConnectInitializer sBR14ConnectInitializer;
	
	
	
	
	
	@Test
	public void test() {
		PFSIncomingMessage msg = pfsConnectInitializer.getMessageFactory().createMessage(new byte[10]);
		assertEquals(msg.getType(), MessageType.PFS);
	}

	
	
	@Test
	public void testEDI2XML() throws IOException {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./edifact/edifact-sample.txt");
		SBR141IncomingMessage m  = sBR14ConnectInitializer.init(IOUtils.toByteArray(is));
//		System.out.println(m.getTransformedPayload());
//		SBR14IncomingMessage msg = sBR14ConnectInitializer.getMessageFactory().createMessage(payload);
	}

}
