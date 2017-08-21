package com.conztanz.connect.transform;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import com.conztanz.connect.transform.exception.ConnectTransformationException;
import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.payload.StringResult;
import org.xml.sax.SAXException;

/**
 *
 */
public abstract class AbstractConnectSmooksTransformer implements IConnectTransformer
{
  /**
   * @param payLoad
   */
  @Override
  public String transform2XML(byte[] payLoad) throws ConnectTransformationException
  {
    StringResult serializedEvents = new StringResult();
    //TODO decodeBase64BeforeCleaning
    byte[] cleanedPayLoad = this.getCleaner().clean(payLoad, false);
    try
    {
      this.getSmooksReader().filterSource(new StreamSource(this.byte2Stream(cleanedPayLoad)), serializedEvents);
    } catch (SmooksException | IOException | SAXException e)
    {
      throw new ConnectTransformationException(e);
    }
    return serializedEvents.getResult();
  }

  /**
   * @return
   */
  private Smooks getSmooksReader() throws IOException, SAXException
  {
    ClassLoader classLoader = this.getClass().getClassLoader();
    Thread.currentThread().setContextClassLoader(classLoader);
    return new Smooks(this.getClass().getResourceAsStream(this.getPathToConfigFile()));
  }

  /**
   * @return
   */
  private InputStream byte2Stream(byte[] payload)
  {
    InputStream inputStream = new ByteArrayInputStream(payload);
    return inputStream;
  }

  /**
   * @return
   */
  protected abstract String getPathToConfigFile();

  /**
   * @return
   */
  protected abstract IMessageCleaner getCleaner();

}
