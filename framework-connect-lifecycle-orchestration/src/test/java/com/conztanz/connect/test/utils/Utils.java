package com.conztanz.connect.test.utils;

import com.conztanz.utils.StringUtils;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

/**
 * Created by User on 6/30/2017.
 */

//TODO rename
public class Utils
{

  // private Constructor
  private Utils(){}



  /**
   *
   * @param objectID
   * @param sequenceNum
   * @return
   * @throws IOException
   */
  public static byte[] getMessage(String objectID, String sequenceNum) throws IOException
  {
    InputStream is = Utils.class.getClassLoader().getResourceAsStream("./messages/Message_Template.xml");
    StringWriter writer = new StringWriter();
    IOUtils.copy(is, writer);
    String isAsString = writer.toString();
    isAsString = isAsString.replace("[OBJECT_ID]", objectID);
    isAsString = isAsString.replace("[SEQUENCE_NUMBER]", sequenceNum);
    return isAsString.getBytes();
  }


  /**
   *
   * @return
   */
  public static  String generateObjectId()
  {
    return StringUtils.randomAlphaNumeric(10);
  }
}
