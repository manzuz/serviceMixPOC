
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedContentFerryLegDescription_ticketInfogroup_145843_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_128754_S_CUS_PNRDataFeed_132" name="ticketNumber"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128730_S_CUS_PNRDataFeed_132" name="dateInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedContentFerryLegDescriptionTicketInfogroup145843GCUSPNRDataFeed132
{
    private TicketNumberDetails128754SCUSPNRDataFeed132 ticketNumber;
    private StructuredDateTimeInformation128730SCUSPNRDataFeed132 dateInfo;

    /** 
     * Get the 'ticketNumber' element value.
     * 
     * @return value
     */
    public TicketNumberDetails128754SCUSPNRDataFeed132 getTicketNumber() {
        return ticketNumber;
    }

    /** 
     * Set the 'ticketNumber' element value.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(
            TicketNumberDetails128754SCUSPNRDataFeed132 ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /** 
     * Get the 'dateInfo' element value. This segment conveys the ticket issuance date
     * 
     * @return value
     */
    public StructuredDateTimeInformation128730SCUSPNRDataFeed132 getDateInfo() {
        return dateInfo;
    }

    /** 
     * Set the 'dateInfo' element value. This segment conveys the ticket issuance date
     * 
     * @param dateInfo
     */
    public void setDateInfo(
            StructuredDateTimeInformation128730SCUSPNRDataFeed132 dateInfo) {
        this.dateInfo = dateInfo;
    }
}
