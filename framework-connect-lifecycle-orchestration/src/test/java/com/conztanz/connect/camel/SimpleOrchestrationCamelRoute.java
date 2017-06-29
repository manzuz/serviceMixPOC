package com.conztanz.connect.camel;


import org.springframework.beans.factory.annotation.Autowired;


public  class SimpleOrchestrationCamelRoute
        extends AbstractOrchestrationCamelRoute<SimpleLifeCycleOrchestrator>
{



  @Autowired
  private SimpleLifeCycleOrchestrator orchestrator;

  @Override
  public void configure() throws Exception
  {

    /**
     * TODO : two steps (from init to continuity, transacted, then the rest not transacted)
     */
    from(this.getRouteEndpoint())
            .transacted()
            .bean(this.getOrchestrator(),"startLifeCycle(${body})");

  }


  /**
   *
   * @return
   */
  protected  String getRouteEndpoint()
  {
    return "file:hi";
  }

  /**
   *
   * @return
   */
  protected    SimpleLifeCycleOrchestrator getOrchestrator()
  {
    return this.orchestrator;
  }

}
