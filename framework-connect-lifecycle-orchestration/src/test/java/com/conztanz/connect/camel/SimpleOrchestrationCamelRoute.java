package com.conztanz.connect.camel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public  class SimpleOrchestrationCamelRoute
        extends AbstractOrchestrationCamelRoute<SimpleLifeCycleOrchestrator>
{



  @Autowired
  private SimpleLifeCycleOrchestrator orchestrator;

  @Autowired
  @Qualifier("LifecycleInComingQJNDIName")
  private String lifecycleInComingQJNDIName;



  /**
   *
   * @return
   */
  protected  String getRouteEndpoint()
  {
//    return "activemq://TEST.connect.Lifecycle";
    return "activemq://" + this.getLifecycleInComingQJNDIName();
  }

  /**
   *
   * @return
   */
  protected SimpleLifeCycleOrchestrator getOrchestrator()
  {
    return this.orchestrator;
  }


  public void setOrchestrator(SimpleLifeCycleOrchestrator orchestrator)
  {
    this.orchestrator = orchestrator;
  }

  public String getLifecycleInComingQJNDIName()
  {
    return lifecycleInComingQJNDIName;
  }

  public void setLifecycleInComingQJNDIName(String lifecycleInComingQJNDIName)
  {
    this.lifecycleInComingQJNDIName = lifecycleInComingQJNDIName;
  }
}
