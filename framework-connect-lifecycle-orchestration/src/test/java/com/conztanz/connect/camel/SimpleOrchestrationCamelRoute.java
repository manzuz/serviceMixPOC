package com.conztanz.connect.camel;


import org.springframework.beans.factory.annotation.Autowired;


public  class SimpleOrchestrationCamelRoute
        extends AbstractOrchestrationCamelRoute<SimpleLifeCycleOrchestrator>
{



  @Autowired
  private SimpleLifeCycleOrchestrator orchestrator;




  /**
   *
   * @return
   */
  protected  String getRouteEndpoint()
  {
    return "activemq://lifeCycle";
  }

  /**
   *
   * @return
   */
  protected SimpleLifeCycleOrchestrator getOrchestrator()
  {
    return this.orchestrator;
  }

}
