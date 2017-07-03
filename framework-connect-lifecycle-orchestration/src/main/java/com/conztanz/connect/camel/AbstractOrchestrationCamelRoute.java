package com.conztanz.connect.camel;


import com.conztanz.connect.exception.ContinuityException;
import org.apache.camel.model.TransactedDefinition;
import org.apache.camel.spring.SpringRouteBuilder;

/**
 * @param <ORCHESTRATOR>
 */
public abstract class AbstractOrchestrationCamelRoute<ORCHESTRATOR extends AbstractLifeCycleOrchestrator<?, ?, ?, ?, ?, ?>>
        extends SpringRouteBuilder
{

  @Override
  public void configure() throws Exception
  {

    /**
     * TODO : two steps (from init to continuity, transacted, then the rest not transacted)
     */
    onException(ContinuityException.class).handled(true);

    from(this.getRouteEndpoint())
            .transacted()
            .bean(this.getOrchestrator(),"startLifeCycle(${body})");



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
