package com.conztanz.connect.camel;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.services.SimpleIncomingMessageService;
import com.conztanz.connect.services.SimpleWaitingMessageService;
import com.conztanz.connect.services.SimpleWorkingMessageService;
import com.conztanz.connect.test.utils.Utils;
import com.conztanz.exception.PersistenceException;
import com.conztanz.jms.ConztanzJMSWaitREST;
import com.conztanz.transport.ConztanzResultList;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.Destination;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext-lifeCycle.xml")
public class SimpleOrchestrationCamelRouteTest

{

  @Autowired
  private CamelContext camelCtx;
  @Autowired
  private ApplicationContext context;
  @Autowired
  @Qualifier("ConztanzJMSWaitREST")
  private ConztanzJMSWaitREST jmsWaitClient;

  @Autowired
  @Qualifier("ConztanzJMSStatsREST")
  private ConztanzJMSStatsREST  jMSStatsClient;

  @Autowired
  private SimpleWorkingMessageService workingService;


  @Autowired
  private SimpleWaitingMessageService waitingService;

  @Autowired
  private SimpleIncomingMessageService incomingService;


//  @Test
//  public void a()
//  {
//    System.out.println(context.getBean("ConztanzXADataSourcePrimaryJNDIName"));
//  }
  @Test
  public void testRollBack() throws Exception
  {
    Destination dql= (Destination) this.context.getBean("LifecycleDLQDestinationJNDI");
    long dLQSizeBeforeRollback = this.getjMSStatsClient().getQueueSize(dql);
    int dBSizeBeforeRollback =  this.getAllDBsSize();

    //send msg to log
    ProducerTemplate template=camelCtx.createProducerTemplate();
    byte [] message  = Utils.getMessage("","1");
    template.sendBody(this.getQEndPoint(), message);

    Destination destination= (Destination) this.context.getBean("LifecycleDestinationJNDI");
    this.jmsWaitClient.waitForIt(destination);


    assertTrue(this.getjMSStatsClient().getQueueSize(dql) == dLQSizeBeforeRollback + 1);
    int dBSizeAfterRollback =  this.getAllDBsSize();
    assertEquals(dBSizeAfterRollback,dBSizeBeforeRollback);
  }


  @Test
  public void testNoRollBack() throws Exception
  {
    Destination dql= (Destination) this.context.getBean("LifecycleDLQDestinationJNDI");
    long dLQSizeBeforeRollback = this.getjMSStatsClient().getQueueSize(dql);
    int dBSizeBeforeRollback =  this.getAllDBsSize();

    //send msg to log
    ProducerTemplate template=camelCtx.createProducerTemplate();
    String objectID = Utils.generateObjectId();
    byte [] message  = Utils.getMessage(objectID,"3");
    byte [] messageOld  = Utils.getMessage(objectID,"1");
    template.sendBody(this.getQEndPoint(), message);
    template.sendBody(this.getQEndPoint(), messageOld);

    Destination destination = (Destination) this.context.getBean("LifecycleDestinationJNDI");

    this.jmsWaitClient.waitForIt(destination);
    assertEquals(dLQSizeBeforeRollback,this.getjMSStatsClient().getQueueSize(dql));

    int dBSizeAfterRollback =  this.getAllDBsSize();
    assertEquals(dBSizeAfterRollback,dBSizeBeforeRollback+3);
  }



  public SimpleWorkingMessageService getWorkingService()
  {
    return workingService;
  }

  public void setWorkingService(SimpleWorkingMessageService workingService)
  {
    this.workingService = workingService;
  }

  public SimpleWaitingMessageService getWaitingService()
  {
    return waitingService;
  }

  public void setWaitingService(SimpleWaitingMessageService waitingService)
  {
    this.waitingService = waitingService;
  }

  public SimpleIncomingMessageService getIncomingService()
  {
    return incomingService;
  }

  public void setIncomingService(SimpleIncomingMessageService incomingService)
  {
    this.incomingService = incomingService;
  }

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

  public ConztanzJMSStatsREST getjMSStatsClient()
  {
    return jMSStatsClient;
  }

  public void setJMSStatsClient(ConztanzJMSStatsREST jMSStatsClient)
  {
    this.jMSStatsClient = jMSStatsClient;
  }

  private String getQEndPoint()
  {
    System.out.println(context.getBean("ConztanzConnectionFactoryPrimaryJNDIName"));
//    return  "activemq://TEST.connect.Lifecycle";
    return  "activemq://java:comp/env/jms/test.ConnectLifecycle";

  }

  private int getAllDBsSize() throws PersistenceException
  {
    return  this.getIncomingService().findAll().size()+
            this.getWaitingService().findAll().size()+
            this.getWorkingService().findAll().size();
  }

}