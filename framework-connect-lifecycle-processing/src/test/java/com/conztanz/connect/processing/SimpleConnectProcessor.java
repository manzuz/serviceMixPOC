package com.conztanz.connect.processing;

import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.processing.binding.SimpleBinding;
import com.conztanz.connect.processing.marshalling.SimpleUnmarshaller;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 7/4/2017.
 */
public class SimpleConnectProcessor extends AbstractConnectProcessor<ForPnrHandling,SimpleSequencedIncomingMessage>
  implements IAbstractConnectProcessor<ForPnrHandling,SimpleSequencedIncomingMessage>
{

  @Autowired
  private SimpleUnmarshaller simpleUnmarshaller;
  @Override
  public SimpleUnmarshaller getUnmarshaller()
  {
    return simpleUnmarshaller;
  }
}
