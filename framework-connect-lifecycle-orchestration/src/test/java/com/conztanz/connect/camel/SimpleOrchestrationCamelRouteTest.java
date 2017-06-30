package com.conztanz.connect.camel;

import com.conztanz.connect.test.utils.Utils;
import com.conztanz.jms.ConztanzJMSWaitREST;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.ApplicationContext;

import javax.jms.Destination;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class SimpleOrchestrationCamelRouteTest

{
  @Autowired
  private CamelContext camelCtx;
  @Autowired
  private ApplicationContext context;
  @Autowired
  private ConztanzJMSWaitREST jmsWaitClient;

  public CamelContext getCamelCtx()
  {
    return camelCtx;
  }

  @Test
  public void testCamel() throws Exception
  {
    ProducerTemplate template=camelCtx.createProducerTemplate();
    //send msg to log
    String objectID = Utils.generateObjectId();
    System.out.println(objectID);
    byte [] message  = Utils.getMessage(objectID,"1");
    Destination destination = (Destination) this.context.getBean("LifecycleDestinationJNDI");

    template.sendBody("activemq://TEST.connect.Lifecycle", message);
    this.jmsWaitClient.waitForIt(destination);
  }
}