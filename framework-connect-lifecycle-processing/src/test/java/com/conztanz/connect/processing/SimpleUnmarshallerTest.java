package com.conztanz.connect.processing;

import com.conztanz.connect.processing.exceptions.UnMarshallingException;
import com.conztanz.connect.processing.marshalling.SimpleUnmarshaller;
import com.conztanz.connect.test.utils.Utils;
import com.conztanz.connect.transform.SimpleConnectTransformer;
import com.conztanz.connect.transform.exception.ConnectTransformationException;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;
import org.jibx.runtime.JiBXException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

import java.io.IOException;

/**
 * Created by User on 7/4/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class SimpleUnmarshallerTest
{
  @Autowired
  private SimpleUnmarshaller simpleUnmarshaller;

  @Autowired
  private SimpleConnectTransformer simpleConnectTransformer;

  public SimpleConnectTransformer getTransformer()
  {
    return simpleConnectTransformer;
  }

  public SimpleUnmarshaller getUnmarshaller()
  {
    return simpleUnmarshaller;
  }

  @Test
  public void test() throws IOException, ConnectTransformationException, UnMarshallingException, JiBXException
  {
    byte [] payload  = Utils.getMessage("Simple_Message","","");
    String transformed  = this.getTransformer().transform2XML(payload);
    ForPnrHandling forPnrHandling = this.getUnmarshaller().unmarshall(transformed);
    assertNotNull(forPnrHandling);
    // more tests ...
  }
}
