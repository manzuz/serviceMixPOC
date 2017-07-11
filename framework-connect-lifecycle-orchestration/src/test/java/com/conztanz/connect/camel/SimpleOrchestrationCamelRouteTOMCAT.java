package com.conztanz.connect.camel;

import com.conztanz.connect.services.SimpleIncomingMessageService;
import com.conztanz.connect.services.SimpleWaitingMessageService;
import com.conztanz.connect.services.SimpleWorkingMessageService;
import com.conztanz.connect.test.utils.Utils;
import com.conztanz.exception.PersistenceException;
import com.conztanz.jms.ConztanzJMSWaitREST;
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
@ContextConfiguration(locations = "classpath:config/applicationContext-lifeCycle-TOMCAT.xml")
public class SimpleOrchestrationCamelRouteTOMCAT

{

  @Autowired
  private CamelContext camelCtx;
  @Autowired
  private ApplicationContext context;






  @Test
  public void test() throws IOException
  {
    ProducerTemplate template=camelCtx.createProducerTemplate();
    String objectID = Utils.generateObjectId();
    byte [] message  = Utils.getMessage(objectID,"3");
    byte [] messageOld  = Utils.getMessage(objectID,"1");
    template.sendBody("direct:foo", message);
  }





}