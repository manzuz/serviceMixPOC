package com.conztanz.connect.camel;

import com.conztanz.exception.CommunicationException;
import com.conztanz.exception.TimeoutException;

import javax.jms.Destination;

/**
 * TODO TO BE REVIEWED<BR>
 * <BR>
 * @author Emeric Fillâtre
 */
public interface IConztanzJMSStats
{
  /** Default timeout in case none is specified (in seconds) */
  static final int DEFAULT_WAIT_TIME_OUT = 30;
  /** Default buffer time in case none is specified (in milliseconds) */
  static final int DEFAULT_BUFFER_TIME = 50;
  

  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  String getServer();
  /**
   * TODO TO BE REVIEWED
   * @param server TODO TO BE REVIEWED
   */
  void setServer(String server);
  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  String getPort();
  /**
   * TODO TO BE REVIEWED
   * @param port TODO TO BE REVIEWED
   */
  void setPort(String port);
  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  Integer getWaitTimeout();
  /**
   * TODO TO BE REVIEWED
   * @param timeout TODO TO BE REVIEWED
   */
  void setWaitTimeout(Integer timeout);
  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  Integer getBufferTime();
  /**
   * TODO TO BE REVIEWED
   * @param bufferTime TODO TO BE REVIEWED
   */
  void setBufferTime(Integer bufferTime);
  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws CommunicationException TODO TO BE REVIEWED
   */
  long getQueueSize(Destination destination) throws CommunicationException;
}
