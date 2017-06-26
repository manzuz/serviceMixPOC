package com.conztanz.connect.transform.exception;

import com.conztanz.exception.ConztanzException;

/**
 * Created by User on 6/26/2017.
 */
public class ConnectTransformationException extends ConztanzException
{
  /**
   * Constructor
   *
   * @param cause Previous exception cause
   */
  public ConnectTransformationException(Throwable cause)
  {
    super(cause);
  }
}
