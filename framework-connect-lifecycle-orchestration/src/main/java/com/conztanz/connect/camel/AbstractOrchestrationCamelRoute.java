package com.conztanz.connect.camel;


import com.conztanz.exception.ConztanzTechnicalException;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.SpringRouteBuilder;
import org.apache.camel.spring.spi.SpringTransactionPolicy;

import java.security.Policy;

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

    from(this.getRouteEndpoint())
            .transacted()
            .log("here")
            .bean(this.getOrchestrator(),"startLifeCycle(${body})")
            .process(new Processor()
            {
              @Override
              public void process(Exchange exchange) throws Exception
              {
//                throw new ConztanzTechnicalException("ERROR MESSAGE");
              }
            });


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
