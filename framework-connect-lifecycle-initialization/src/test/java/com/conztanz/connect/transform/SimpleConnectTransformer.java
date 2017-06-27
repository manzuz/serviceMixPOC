package com.conztanz.connect.transform;

import com.conztanz.connect.transform.exception.ConnectTransformationException;

/**
 * NOOP : doesn't do any transformation per say, only coverts bytecode to String
 * Used ti facilitate lifeCycle tests 
 * Created by User on 6/27/2017.
 */
public class SimpleConnectTransformer implements IConnectTransformer
{
  /**
   * @param payLoad
   * @return
   * @throws ConnectTransformationException
   */
  @Override
  public String transform2XML(byte[] payLoad) throws ConnectTransformationException
  {
    return new String(payLoad);
  }
}
