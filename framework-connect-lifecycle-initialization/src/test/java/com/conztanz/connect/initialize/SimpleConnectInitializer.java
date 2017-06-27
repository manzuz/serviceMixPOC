package com.conztanz.connect.initialize;

import com.conztanz.connect.factory.SimpleIncomingMessageFactory;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.transform.SimpleConnectTransformer;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleConnectInitializer
        extends AbstractConnectInitializer<SimpleConnectTransformer, SimpleSequencedIncomingMessage>
{

  @Autowired
  private SimpleConnectTransformer connectTransformer;

  @Autowired
  private SimpleIncomingMessageFactory simpleIncomingMessageFactory;

  @Override
  public SimpleIncomingMessageFactory getMessageFactory()
  {
    return simpleIncomingMessageFactory;
  }

  @Override
  public SimpleConnectTransformer getTransformer()
  {
    return connectTransformer;
  }

}
