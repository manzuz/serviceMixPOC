package com.conztanz.connect.transform.travel.airimp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.XMLConstants;

import org.apache.commons.lang3.StringUtils;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import com.conztanz.connect.transform.AbstractSmooksXMLReader;
import com.conztanz.enums.event.Action;
import com.conztanz.travel.model.traveler.LoyaltyProgramUsage.Usage;

/**
 * 
 * TODO TO BE REVIEWED<BR>
 * <BR>
 * @author Emeric Fillâtre
 */
public abstract class AbstractAIRIMPSmooksReader extends AbstractSmooksXMLReader
{
  /** TODO TO BE REVIEWED */
  private ThreadLocal<String> reference = new ThreadLocal<>();
  /** TODO TO BE REVIEWED */
  private ThreadLocal<Map<String, String>> recordLocatorMap =
      new ThreadLocal<Map<String, String>>()
      {
        @Override
        protected Map<String, String> initialValue()
        {
          return new HashMap<>();
        }
      };
  /** TODO TO BE REVIEWED */
  private ThreadLocal<Integer> mergedPaxNb = new ThreadLocal<>();
  /** TODO TO BE REVIEWED */
  private ThreadLocal<Integer> mergedPaxIndex = new ThreadLocal<>();
  /** TODO TO BE REVIEWED */
  private ThreadLocal<Boolean> booked = new ThreadLocal<>();
  /** TODO TO BE REVIEWED */
  private ThreadLocal<String> checkinStatus = new ThreadLocal<>();
  /** TODO TO BE REVIEWED */
  private ThreadLocal<Boolean> boarded = new ThreadLocal<>();
  /** TODO TO BE REVIEWED */
  private ThreadLocal<String> boardingReport = new ThreadLocal<>();

  /**
   * 
   * TODO TO BE REVIEWED
   * @param prlInputSource {@inheritDoc}
   * @throws IOException {@inheritDoc}
   * @throws SAXException {@inheritDoc}
   * @see org.xml.sax.XMLReader#parse(org.xml.sax.InputSource)
   */
  @Override
  public void parse(InputSource prlInputSource) throws IOException, SAXException
  {
    try
    {
      BufferedReader reader = new BufferedReader(prlInputSource.getCharacterStream());

      // Send the start of message events to the handler...
      this.getContentHandler().startDocument();
      this.getContentHandler().startElement(XMLConstants.NULL_NS_URI, this.getDocumentStart(), "", new AttributesImpl());

      String line = reader.readLine();
      while(line != null)
      {
        if(this.isStart(line))
        {
          break;
        }
        line = reader.readLine();
      }
      if(line != null)
      {
        line = this.parseSegment(reader);
      }
      // TODO check end part ?

      // Send the end of message events to the handler...
      this.getContentHandler().endElement(XMLConstants.NULL_NS_URI, this.getDocumentStart(), "");
      this.getContentHandler().endDocument();
    }
    finally
    {
      this.recordLocatorMap.remove();
    }
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected String getDocumentStart()
  {
    return "delivery";
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param line TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  public boolean isStart(String line)
  {
    return line.startsWith(this.getDeliveryType());
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected abstract String getDeliveryType();
  
  /**
   * 
   * TODO TO BE REVIEWED
   * @param reader TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws IOException TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected String parseSegment(BufferedReader reader) throws IOException, SAXException
  {
    String line = reader.readLine();
    while(line != null)
    {
      //                 AF______1063_____/_18________JAN_____ARN_____PART1
      line = line.replace(" ", "");
      if(!line.matches("[A-Z]{2}[0-9]{3,4}/[0-9]{1,2}[A-Z]{3}[A-Z]{3}.*"))
      {
        break;
      }
      this.startElement("segment");
      String[] array = line.split("/");
      this.startElement("designator");
      this.simpleElement("company", this.substring(array[0], 0, 2));
      this.simpleElement("number", this.substring(array[0], 2));
      this.endElement("designator");
      this.startElement("departure");
      int length = 4;
      if(array[1].matches("[0-9]{2}[A-Z]{3}[A-Z]{3}.*"))
      {
        length = 5;
      }
      this.simpleElement("date", this.substring(array[1], 0, length));
      this.simpleElement("station", this.substring(array[1], length, 3));
      this.endElement("departure");
      
      this.startElement("destinations");
      line = this.parseDestinations(reader);
      this.endElement("destinations");
      this.endElement("segment");
    }
    return line;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param reader TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws IOException TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected String parseDestinations(BufferedReader reader) throws IOException, SAXException
  {
    String line = reader.readLine();
    while(line != null)
    {
      //                       -CDG_____114________Y
      // if(!line.matches("-[A-Z]{3}([0-9]{1,4}[A-Z])?.*"))
      line = line.replace(" ", "");
      if(!line.matches("-[A-Z]{3}.*"))
      {
        // if(line.startsWith("CFG") || line.startsWith("RBD") ||
        //    line.matches("[A-Z]{3}[0-9]{1,3}/[0-9]{1,3}/[0-9]{1,3}.*"))//FCO13/047/032
        // {
        // line = reader.readLine();
        // continue;
        // }
        if(this.isIgnoredDestinationData(line))
        {
          line = reader.readLine();
          continue;
        }
        break;
      }
      this.startElement("arrival");
      this.simpleElement("station", this.substring(line, 1, 3));
      if(line.matches("-[A-Z]{3}[0-9]{3}[A-Z].*"))
      {
        this.simpleElement("physicalClass", this.substring(line, 7, 1));
      }
      this.startElement("travelers");
      line = this.parseTravelers(reader);
      this.endElement("travelers");
      this.endElement("arrival");
    }
    return line;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected boolean isIgnoredDestinationData(String data)
  {
    if(data.startsWith("CFG/") || data.startsWith("RBD"))
    {
      return true;
    }
    return false;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param reader TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws IOException TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected String parseTravelers(BufferedReader reader) throws IOException, SAXException
  {
    // In order to be able to parse several times the same line (several travelers sharing the same
    // last name could be merged on the same line), mark the current position
    String line = reader.readLine();
    reader.mark(1000);
    try
    {
      while(line != null)
      {
        if(!this.startTraveler(line))
        {
          break;
        }
        String nextLine = this.parseTravelerData(reader);
        if(this.endTraveler())
        {
          reader.mark(1000);
          line = nextLine;
          this.mergedPaxNb.remove();
          this.mergedPaxIndex.remove();
          this.reference.remove();
        }
        else
        {
          reader.reset();
        }
      }
    }
    finally
    {
      this.mergedPaxNb.remove();
      this.mergedPaxIndex.remove();
      this.reference.remove();
    }
    return line;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param line TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   * @throws IOException TODO TO BE REVIEWED
   */
  protected boolean startTraveler(String line) throws SAXException, IOException
  {
    // 1FOURNIE/VINCENTMR(-XX)
    if(!line.matches("[1-9].+/.+"))
    {
      return false;
    }
    BufferedReader reader = new BufferedReader(new StringReader(line.replace(" .", "\n.")));
    line = reader.readLine();
    this.startElement("traveler");
    this.startElement("name");
    // Get list of first names in case of merged travelers
    String[] names = this.substring(line, line.indexOf("/") + 1).split("/");
    int index = 0;
    if(this.getMergedPaxNb() == null)
    {
      this.setMergedPaxNb(Integer.valueOf(this.substring(line, 0, 1)));
      String name = names[names.length - 1];
      if(name.matches(".+-[A-Z][0-9]"))
      {
        this.setReference(this.substring(name, name.lastIndexOf("-") + 1));
        names[names.length - 1] = this.substring(name, 0, name.lastIndexOf("-"));
      }
    }
    else
    {
      index = this.nextMergedPax();
    }
    this.simpleElement("last", this.substring(line, 1, line.indexOf("/") - 1));
    this.simpleElement("first", names[index]);
    this.endElement("name");
    // Parse potential data contained on the traveler's line
    this.parseTravelerData(reader);
    return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean endTraveler() throws SAXException
  {
    try
    {
      this.simpleElement("booked", this.getBooked());
      this.simpleElement("checkinStatus", this.getCheckinStatus());
      this.simpleElement("boarded", this.getBoarded());
      this.simpleElement("boardingReport", this.getBoardingReport());
      this.simpleElement("recordLocator", this.retrieveLocator());
      this.endElement("traveler");
      if(this.getMergedPaxIndex() == this.getMergedPaxNb() - 1)
      {
        return true;
      }
      return false;
    }
    finally
    {
      this.booked.remove();
      this.checkinStatus.remove();
      this.boarded.remove();
      this.boardingReport.remove();
    }
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param reader TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws IOException TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected String parseTravelerData(BufferedReader reader) throws IOException, SAXException
  {
    // Read first line
    String line = reader.readLine();
    while(line != null)
    {
      // .L/7XKFVC or .O2/AF9738Q19CANSYD2100HK or ...
      if(!line.matches("\\.[A-Z][0-9]?/.*") && !line.matches("\\.[A-Z]{3}/.*"))
      {
        break;
      }
      // Read next line
      String nextLine = reader.readLine();
      // Continuation element processing (line are cut when size over a defined limit)
      while(nextLine != null && nextLine.startsWith(".RN/"))
      {
        line += this.substring(nextLine, 4);
        nextLine = reader.readLine();
      }
      if(this.parseRecordLocator(line))
      {
        //
      }
      else if(this.parseCommercialSegment(line))
      {
        //
      }
      // Delivery data
      else if(this.parseInboundConnection(line))
      {
        //
      }
      else if(this.parseBagTag(line))
      {
        //
      }
      else if(this.parseBagsWeight(line))
      {
        //
      }
      else if(this.parseBagsPieces(line))
      {
        //
      }
      else if(this.parseSeat(line))
      {
        //
      }
      else if(this.parseCompensation(line))
      {
        //
      }
      // PNR data
      else if(this.parseTripReceipt(line))
      {
        //
      }
      else if(this.parseLoyaltyUsage(line))
      {
        //
      }
      else if(this.parseVisa(line))
      {
        //
      }
      else if(this.parseIdentification(line))
      {
        //
      }
      else if(this.parseAddress(line))
      {
        //
      }
      else
      {
        System.out.println("SKIPPED: " + line);
      }
      line = nextLine;
    }
    return line;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected boolean parseRecordLocator(String data)
  {
    if(!data.startsWith(".L/"))
    {
      return false;
    }
    data = this.substring(data, 3).trim();
    this.defineLocator(data);
    return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseInboundConnection(String data) throws SAXException {
      if (!data.startsWith(".I/")) {
          return false;
      }
      // Get inbound connection station tag
      String[] array = this.substring(data, 3).split("/");
      String inboundDepStation = null;
      String inboundArrStation = null;
      
      String inboundConnectionFlightInfo = array[0].trim();
      
      if (inboundConnectionFlightInfo.matches("[A-Z]{2}[0-9]{3}[A-Z][0-9]{2}[A-Z]{3}.*")) {
          
          this.startElement("inboundConnection");
          
          if (inboundConnectionFlightInfo.length() == 15 || inboundConnectionFlightInfo.length() == 11) {
              // .I/NZ040X27AKL
              // .I/NZ040X27AKL0651
              inboundDepStation = this.substring(inboundConnectionFlightInfo, 8, 11);
              this.simpleElement("inboundConnectionDepStation", inboundDepStation);
          } else if (inboundConnectionFlightInfo.length() >= 14) {
              // .I/NZ040X27AKLJFK
              // .I/NZ040X27AKLJFK0651
              inboundDepStation = this.substring(inboundConnectionFlightInfo, 8, 11);
              this.simpleElement("inboundConnectionDepStation", inboundDepStation);
              if (inboundConnectionFlightInfo.length() == 18) {
                  inboundArrStation = this.substring(inboundConnectionFlightInfo, 11, 14);
                  this.simpleElement("inboundConnectionArrStation", inboundArrStation);
                  
              }
              
          }
          this.endElement("inboundConnection");
      }
      return true;
  }
  
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseCommercialSegment(String data) throws SAXException
  {
    if(!data.startsWith(".M/"))
    {
      return false;
    }
    data = this.substring(data, 3).trim();
    this.startElement("commercial");
    this.startElement("designator");
    this.simpleElement("company", this.substring(data, 0, 2));
    int length = 3;
    if(data.matches("[A-Z]{2}[0-9]{4}.*"))
    {
      length++;
    }
    this.simpleElement("number", this.substring(data, 2, length));
    this.endElement("designator");
    this.simpleElement("bookingClass", this.substring(data, 2 + length, 1));
    this.endElement("commercial");
    return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseBagTag(String data) throws SAXException
  {
    if(!data.startsWith(".N/"))
    {
      return false;
    }
    // Get bag tag
    String[] array = this.substring(data, 3).split("/");
    this.simpleElement("bagTag", array[0]);
    return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseBagsWeight(String data) throws SAXException
  {
    if(!data.startsWith(".W/K/"))
    {
      return false;
    }
    // Get bags total weight
    String[] array = this.substring(data, 5).split("/");
    this.simpleElement("bagsWeight", array[1]);
    return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseBagsPieces(String data) throws SAXException {
      if (!data.startsWith(".W/P/")) {
          return false;
      }
      // Get bags total number of pieces .W/P/5
      String[] array = this.substring(data, 3).split("/");
      this.simpleElement("bagsPieces", array[1]);
      return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseSeat(String data) throws SAXException
  {
    if(!data.startsWith(".R/SEAT"))
    {
      return false;
    }
    data = this.handleMutliPax(this.cleanHK(this.substring(data, 7).trim()), " ");
    this.startElement("seat");
    this.simpleElement("row", data.replaceAll("[A-Z]", ""));
    this.simpleElement("column", data.replaceAll("[0-9]", ""));
    this.endElement("seat");
    return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseCompensation(String data) throws SAXException
  {
    if(!data.startsWith(".DBC/")) // .DBC/V/USD200PAIDINCASH OR .DBC/I/MCOGIVENFORDOMESTICRTTRAVEL
    {
      return false;
    }
    String[] array = this.substring(data, 5).split("/");
    this.startElement("compensation");
    if(array[0].equals("V"))
    {
      this.simpleElement("voluntary", "true");
    }
    else
    {
      this.simpleElement("voluntary", "false");
    }
    this.simpleElement("nature", array[1]);
    this.endElement("compensation");
    return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseTripReceipt(String data) throws SAXException
  {
    if(!data.startsWith(".R/TKNE")) // .R/TKNE HK1 0741943659292/4
    {
      return false;
    }
    data = this.cleanHK(this.substring(data, 7).trim());
    this.startElement("tripReceipt");
    this.simpleElement("company", this.substring(data, 0, 3));
    this.simpleElement("number", this.substring(data, 3, 10));
    this.endElement("tripReceipt");
    return true;
  }
  /**
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseLoyaltyUsage(String data) throws SAXException
  {
    if(!data.startsWith(".R/FQT") && !data.startsWith(".F/"))
    {
      return false;
    }
    String usageCode = "V";
    if(data.startsWith(".R/FQT"))
    {
      usageCode = this.substring(data, 6, 1);
      data = this.substring(data, 7).replace(" ", "");
    }
    else
    {
      data = this.substring(data, 3).replace(" ", "");
    }
    this.startElement("loyalty");
    this.simpleElement("company", this.substring(data, 0, 2));
    this.simpleElement("number", this.substring(data, 2));
    switch(usageCode)
    {
      case "R":
        this.simpleElement("usage", Usage.REDEEM.name());
        break;
      case "S":
        this.simpleElement("usage", Usage.AGREEMENT.name());
        break;
      case "U":
        this.simpleElement("usage", Usage.UPGRADE.name());
        break;
      default:
        this.simpleElement("usage", Usage.ACCRUAL.name());
        break;
    }
    this.endElement("loyalty");
    return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseVisa(String data) throws SAXException
  {
    if(!data.startsWith(".R/DOCO"))
    {
      return false;
    }
    String[] array = this.cleanHK(this.substring(data, 7).trim()).split("/");
    if(array.length < 6 || array[1].equals(""))
    {
      return true;
    }
    this.startElement("visa");
    int i = 0;
    this.simpleElement("birthPlace", array[i++]);
    this.simpleElement("type", array[i++]);
    this.simpleElement("number", array[i++]);
    this.simpleElement("issuingPlace", array[i++]);
    this.simpleElement("issuingDate", array[i++]);
    this.simpleElement("applicableCountry", array[i++]);
    // Infant in PRL ???
    // if(splittedData.length > 6)
    // {
    // infantIndicator = splittedData[6];
    // if("I".equals(infantIndicator))
    // {
    // isHolder = false;
    // }
    // }
    this.endElement("visa");
    return true;
  }
  /**
   * TODO TO BE REVIEWED
   * @param data .R/DOCA R/GBR/7 KINGS ROAD/CHELSEA/LONDON/SW3 007 TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseAddress(String data) throws SAXException {
      if (!data.startsWith(".R/DOCA")) {
          return false;
      }
      data = this.cleanHK(this.substring(data, 7).trim());
      
      // check if there is the passenger identification element at the end of the line
      data = filterPassengerIdentificationElement(data);
      
      String[] array = data.split("/");
      if (array.length < 6) {
          return true;
      }
      this.startElement("address");
      int i = 0;
      this.simpleElement("usage", "AP");
      this.simpleElement("type", array[i++]);
      this.simpleElement("country", array[i++]);
      this.simpleElement("street", array[i++]);
      this.simpleElement("city", array[i++]);
      this.simpleElement("state", array[i++]);
      this.simpleElement("postCode", array[i++]);
      // Infant in PRL ???
      // if(splittedData.length > 6)
      // {
      // infantIndicator = splittedData[6];
      // if("I".equals(infantIndicator))
      // {
      // isHolder = false;
      // }
      // }
      this.endElement("address");
      return true;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   * @throws SAXException TODO TO BE REVIEWED
   */
  protected boolean parseIdentification(String data) throws SAXException
  {
    if(!data.startsWith(".R/DOCS"))
    {
      return false;
    }
    String[] array = this.cleanHK(this.substring(data, 7).trim()).split("/");
    if(array.length < 9 || array[0].equals(""))
    {
      return true;
    }
    this.startElement("identification");
    int i = 0;
    this.simpleElement("type", array[i++]);
    this.simpleElement("issuingCountry", array[i++]);
    this.simpleElement("number", array[i++]);
    this.simpleElement("nationality", array[i++]);
    this.simpleElement("birthDate", array[i++]);
    this.simpleElement("gender", array[i++]);
    // if (StringUtils.isNoneEmpty(gender)) {
    // // take only first letter
    // gender = gender.substring(0, 1);
    // }
    this.simpleElement("expiryDate", array[i++]);
    this.simpleElement("lastName", array[i++]);
    this.simpleElement("firstName", array[i++]);
    if(array.length > i)
    {
      this.simpleElement("middleName", array[i++]);
    }
    // if(array.length > i)
    // {
    // this.simpleElement("secondGivenName", array[i++]);
    // i++;
    // if (splittedData.length > 10) {
    // isHolder = identifyIfTravelerIsHolderOfIDCard(context, splittedData[10], gender);
    // }
    // }
    //
    //
    // if (splittedData.length > 4 && StringUtils.isNotEmpty(splittedData[4])) {
    // DateTimeFormatter fmt = DateTimeFormat.forPattern("ddMMMyyyy").withLocale(Locale.US);
    // String dateStr = splittedData[4].substring(0, 5);
    // if (!isHolder || Integer.valueOf(splittedData[4].substring(5, 7)) < (new LocalDate().getYear() - 2000)) {
    // // for sure an infant and teenagers are on the 2000 years
    // dateStr += "20";
    // } else {
    // dateStr += "19";
    // }
    // dateStr += splittedData[4].substring(5, 7);
    // try {
    // dateOfBirth = fmt.parseDateTime(dateStr).toLocalDate();
    // } catch (Exception e) {
    // context.getLogger().warn(
    // e.getMessage() + SystemUtils.LINE_SEPARATOR + StringUtils.join(e.getStackTrace(), SystemUtils.LINE_SEPARATOR));
    // }
    // }

    this.endElement("identification");
    return true;
  }
  
  /**
   * 
   * TODO TO BE REVIEWED
   * @param line TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected String cleanHK(String line)
  {
    if(line.matches("HK[1-9].*"))
    {
      if(line.length() == 3)
      {
        return StringUtils.EMPTY;
      }
      line = this.substring(line, 3).trim();
      if(line.startsWith("/"))
      {
        line = this.substring(line, 1).trim();
      }
      return line;
    }
    return line;
  }
  /**
   * TODO TO BE REVIEWED
   * @param data TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected String filterPassengerIdentificationElement(String data) {
      // check if there is the passenger identification element at the end of the line
      if (data.matches(".*-[0-9][A-Z]*/[A-Z]*")) {
          data = StringUtils.substringBeforeLast(data, "-");
      }
      return data;
  }
  
  /**
   * 
   * TODO TO BE REVIEWED
   * @param line TODO TO BE REVIEWED
   * @param separator TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected String handleMutliPax(String line, String separator)
  {
    if(this.getMergedPaxNb() == 1)
    {
      return line;
    }
    return line.split(separator)[this.getMergedPaxIndex()];
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param string TODO TO BE REVIEWED
   * @param beginIndex TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected String substring(String string, int beginIndex)
  {
    if(string.length() <= beginIndex)
    {
      return null;
    }
    return string.substring(beginIndex);
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param string TODO TO BE REVIEWED
   * @param beginIndex TODO TO BE REVIEWED
   * @param length TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  protected String substring(String string, int beginIndex, int length)
  {
    if(string.length() < beginIndex + length)
    {
      return null;
    }
    return string.substring(beginIndex, beginIndex + length);
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param systemId {@inheritDoc}
   * @throws IOException {@inheritDoc}
   * @throws SAXException {@inheritDoc}
   * @see org.xml.sax.XMLReader#parse(java.lang.String)
   */
  @Override
  public void parse(String systemId) throws IOException, SAXException
  {
    // TODO Auto-generated method stub
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private String getReference()
  {
    return this.reference.get();
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param reference TODO TO BE REVIEWED
   */
  private void setReference(String reference)
  {
    this.reference.set(reference);
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param recordLocator TODO TO BE REVIEWED
   */
  private void defineLocator(String recordLocator)
  {
    this.recordLocatorMap.get().put(this.getReference(), recordLocator);
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private String retrieveLocator()
  {
    String recordLocator = this.recordLocatorMap.get().get(this.getReference());
    if(recordLocator == null)
    {
      if(this.getReference() == null)
      {
        recordLocator = "NORECLOC";
      }
      else
      {
        throw new RuntimeException("Cannot retreive record locator for passenger referenced " + this.getReference());
      }
    }
    return recordLocator;
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private Integer getMergedPaxNb()
  {
    return this.mergedPaxNb.get();
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param mergedPaxNb TODO TO BE REVIEWED
   */
  private void setMergedPaxNb(int mergedPaxNb)
  {
    this.mergedPaxNb.set(mergedPaxNb);
    this.mergedPaxIndex.set(0);
  }
  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private int getMergedPaxIndex()
  {
    return this.mergedPaxIndex.get();
  }
  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private int nextMergedPax()
  {
    this.mergedPaxIndex.set(this.getMergedPaxIndex() + 1);
    return this.getMergedPaxIndex();
  }

  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private Boolean getBooked()
  {
    return this.booked.get();
  }
  /**
   * TODO TO BE REVIEWED
   * @param booked TODO TO BE REVIEWED
   */
  protected void setBooked(Boolean booked)
  {
    this.booked.set(booked);
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private String getCheckinStatus()
  {
    return this.checkinStatus.get();
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param checkinStatus TODO TO BE REVIEWED
   */
  protected void setCheckinStatus(Action checkinStatus)
  {
    this.checkinStatus.set(checkinStatus.getCode());
  }
  /**
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private Boolean getBoarded()
  {
    return this.boarded.get();
  }
  /**
   * TODO TO BE REVIEWED
   * @param boarded TODO TO BE REVIEWED
   */
  protected void setBoarded(Boolean boarded)
  {
    this.boarded.set(boarded);
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @return TODO TO BE REVIEWED
   */
  private String getBoardingReport()
  {
    return this.boardingReport.get();
  }
  /**
   * 
   * TODO TO BE REVIEWED
   * @param boardingReport TODO TO BE REVIEWED
   */
  protected void setBoardingReport(String boardingReport)
  {
    this.boardingReport.set(boardingReport);
  }
}
