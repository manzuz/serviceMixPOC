package com.conztanz.connect.initialize;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class SimpleIncomingMessageConnectInitializerTest {
	
	
	@Autowired
	private SimpleConnectSmooksInitializer simpleConnectSmooksInitializer;
	
	
	
	
	

	
	
	@Test
	public void loadingReaderClassTest() throws IOException, ConnectTransformationException
  {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./messages/SimpleIncomingMessage.txt");
    simpleConnectSmooksInitializer.init(IOUtils.toByteArray(is));
	}
	
	public void payLoadInitializationTest() throws IOException, ConnectTransformationException
  {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("./messages/SimpleIncomingMessage.txt");
		byte[] rawPayload = IOUtils.toByteArray(is);
		SimpleSequencedIncomingMessage message = simpleConnectSmooksInitializer.init(IOUtils.toByteArray(is));
		assert(message.getTransformedPayload().equals("<test />"));
		assertEquals(rawPayload, message.getRawPayload()); 
	}
	

}
