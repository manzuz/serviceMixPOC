package com.conztanz.connect.processing.marshalling;

import com.conztanz.connect.processing.binding.SimpleBinding;
import com.conztanz.connect.processing.marshalling.AbstractConztanzUnmarshaller;
import com.conztanz.transform.sbr.v14_1.ForPnrHandling;

/**
 * Created by User on 7/4/2017.
 */
public class SimpleUnmarshaller extends AbstractConztanzUnmarshaller<ForPnrHandling>
{
  /**
   *
   */
  public SimpleUnmarshaller()
  {
    super(ForPnrHandling.class);
  }
}
