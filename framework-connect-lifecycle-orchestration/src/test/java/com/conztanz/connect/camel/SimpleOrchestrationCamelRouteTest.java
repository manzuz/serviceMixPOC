package com.conztanz.connect.camel;

import com.conztanz.connect.test.utils.Utils;
import com.conztanz.jms.ConztanzJMSWaitREST;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.Destination;

import static org.junit.Assert.assertTrue;


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

  public ApplicationContext getContext() {
    return context;
  }

  public ConztanzJMSWaitREST getJmsWaitClient() {
    return jmsWaitClient;
  }

  @Test
  public void testRollBack() throws Exception
  {
    long sizeBeforeRollback = this.getJmsWaitClient().getQueueSize();
    ProducerTemplate template=camelCtx.createProducerTemplate();
    //send msg to log
    byte [] message  = Utils.getMessage("","1");
    template.sendBody("activemq://TEST.connect.Lifecycle", message);

    Destination destination = (Destination) this.context.getBean("LifecycleDestinationJNDI");
    this.jmsWaitClient.waitForIt(destination);
    assertTrue(sizeBeforeRollback == jmsWaitClient.getQueueSize() + 1);
  }


  @Test
  public void testNoRollBack() throws Exception
  {
    ProducerTemplate template=camelCtx.createProducerTemplate();
    //send msg to log
    String objectID = Utils.generateObjectId();
    byte [] message  = Utils.getMessage(objectID,"3");
    byte [] messageOld  = Utils.getMessage(objectID,"1");
    template.sendBody("activemq://TEST.connect.Lifecycle", message);


    Destination destination = (Destination) this.context.getBean("LifecycleDestinationJNDI");
    template.sendBody("activemq://TEST.connect.Lifecycle", messageOld);
    this.jmsWaitClient.waitForIt(destination);
  }



}