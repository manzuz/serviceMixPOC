package com.conztanz.connect.processing;

import com.conztanz.connect.model.MessageStatus;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.processing.exceptions.UnMarshallingException;
import com.conztanz.connect.test.utils.Utils;
import com.conztanz.connect.transform.SimpleConnectTransformer;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by User on 7/4/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class SimpleConnectProcessorTest
{

  @Autowired
  private SimpleConnectProcessor simpleConnectProcessor;
  @Autowired
  private SimpleConnectTransformer simpleConnectTransformer;
  public SimpleConnectProcessor getProcessor()
  {
    return simpleConnectProcessor;
  }

  public void setSimpleConnectProcessor(SimpleConnectProcessor simpleConnectProcessor)
  {
    this.simpleConnectProcessor = simpleConnectProcessor;
  }

  @Test
  public void test() throws IOException, ConnectTransformationException, UnMarshallingException
  {
    byte [] payload  = Utils.getMessage("Simple_Message","","");
    SimpleSequencedIncomingMessage message = new SimpleSequencedIncomingMessage(payload, MessageStatus.NEW);
    message.setTransformedPayload(simpleConnectTransformer.transform2XML(message.getRawPayload()));
    System.out.println(this.getProcessor().process(message).getActivePNRimage());
  }
}
