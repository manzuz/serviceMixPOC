package com.conztanz.connect.camel;


import org.apache.camel.builder.RouteBuilder;

/**
 * @param <ORCHESTRATOR>
 */
public abstract class AbstractOrchestrationCamelRoute<ORCHESTRATOR extends AbstractLifeCycleOrchestrator<?, ?, ?, ?, ?, ?>>
        extends RouteBuilder
{

  @Override
  public void configure() throws Exception
  {

    /**
     * TODO : two steps (from init to continuity, transacted, then the rest not transacted)
     */
    from(this.getRouteEndpoint())
            .transacted()
            .bean(this.getOrchestrator(),"startLifeCycle${body}");

  }


  /**
   *
   * @return
   */
  protected abstract String getRouteEndpoint();

  /**
   *
   * @return
   */
  protected  abstract ORCHESTRATOR getOrchestrator();

}
