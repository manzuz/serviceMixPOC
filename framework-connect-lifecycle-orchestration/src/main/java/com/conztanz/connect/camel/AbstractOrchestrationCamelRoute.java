package com.conztanz.connect.camel;


import com.conztanz.connect.exception.ContinuityException;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.spring.SpringRouteBuilder;

/**
 *
 * @param <ORCHESTRATOR>
 */
public abstract class AbstractOrchestrationCamelRoute<ORCHESTRATOR extends AbstractLifeCycleOrchestrator<?, ?, ?, ?, ?, ?>>
        extends SpringRouteBuilder
{

  @Override
  public void configure() throws Exception
  {
    final String PROCESSING_ENDPOINT = "direct:processing";

    // Don't rollback for the following exceptions :
    onException(ContinuityException.class).handled(true);


    //Transactional route (INITIALISATION, IDENTIFICATION, LOCKING, CONTINUITY)
    from(this.getRouteEndpoint())
                .transacted()
                .bean(this.getOrchestrator(),"startLifeCycle(${body})")
                .end();



    //PROCESSING route
    // TODO Is it worth it to put this in a queue ?
    from(PROCESSING_ENDPOINT)
            .process(new Processor()
            {
              @Override
              public void process(Exchange exchange) throws Exception
              {
//                throw new ConztanzTechnicalException("");
              }
            })
            .log("PROCESSING");


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
