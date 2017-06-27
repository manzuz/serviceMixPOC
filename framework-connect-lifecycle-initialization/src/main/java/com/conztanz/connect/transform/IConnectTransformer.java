package com.conztanz.connect.transform;

import com.conztanz.connect.transform.exception.ConnectTransformationException;


public interface IConnectTransformer
{
  /**
   *
   * @param payLoad
   * @return
   * @throws ConnectTransformationException
   */
  String transform2XML(byte[] payLoad) throws ConnectTransformationException;
}
