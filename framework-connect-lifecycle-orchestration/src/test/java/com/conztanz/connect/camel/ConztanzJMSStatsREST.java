package com.conztanz.connect.camel;

import com.conztanz.client.Header.ContentType;
import com.conztanz.client.Headers;
import com.conztanz.client.StringConztanzResourceClient;
import com.conztanz.client.exception.ConztanzResourceClientException;
import com.conztanz.exception.CommunicationException;
import com.conztanz.exception.ConztanzRuntimeException;
import com.conztanz.exception.TimeoutException;
import com.conztanz.jms.ConztanzJMSWaitREST;
import com.conztanz.jms.ConztanzJMSWaitRESTResponse;
import com.conztanz.jms.ConztanzJMSWaitUtils;
import com.conztanz.jms.IConztanzJMSWait;
import com.conztanz.json.ConztanzJSonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

import javax.annotation.PostConstruct;
import javax.jms.Destination;
import java.io.IOException;

/**
 * TODO TO BE REVIEWED<BR>
 * <BR>
 * @author Emeric Fillâtre
 */
public class ConztanzJMSStatsREST extends ConztanzJMSWaitREST implements IConztanzJMSStats
{
  /**
   *
   * @param destination
   * @return
   * @throws ConztanzResourceClientException
   */
  public long getQueueSize(Destination destination) throws ConztanzResourceClientException
  {
    try
    {
      super.getDestination().set(destination);
      return super.getQueueSize();
    }
    finally
    {
      super.getDestination().remove();
    }
  }
}