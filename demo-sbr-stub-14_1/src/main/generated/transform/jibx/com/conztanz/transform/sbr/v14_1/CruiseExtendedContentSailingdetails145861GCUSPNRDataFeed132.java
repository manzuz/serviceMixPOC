
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CruiseExtendedContent_sailingdetails_145861_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StructuredPeriodInformation_128716_S_CUS_PNRDataFeed_132" name="sailingDateInformation"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_128714_S_CUS_PNRDataFeed_132" name="checkintimeInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CruiseExtendedContentSailingdetails145861GCUSPNRDataFeed132
{
    private StructuredPeriodInformation128716SCUSPNRDataFeed132 sailingDateInformation;
    private StructuredDateTimeInformation128714SCUSPNRDataFeed132 checkintimeInfo;

    /** 
     * Get the 'sailingDateInformation' element value. Details of the departure and arrival dates of the sailing trip.
     * 
     * @return value
     */
    public StructuredPeriodInformation128716SCUSPNRDataFeed132 getSailingDateInformation() {
        return sailingDateInformation;
    }

    /** 
     * Set the 'sailingDateInformation' element value. Details of the departure and arrival dates of the sailing trip.
     * 
     * @param sailingDateInformation
     */
    public void setSailingDateInformation(
            StructuredPeriodInformation128716SCUSPNRDataFeed132 sailingDateInformation) {
        this.sailingDateInformation = sailingDateInformation;
    }

    /** 
     * Get the 'checkintimeInfo' element value. Sailing Check In time
     * 
     * @return value
     */
    public StructuredDateTimeInformation128714SCUSPNRDataFeed132 getCheckintimeInfo() {
        return checkintimeInfo;
    }

    /** 
     * Set the 'checkintimeInfo' element value. Sailing Check In time
     * 
     * @param checkintimeInfo
     */
    public void setCheckintimeInfo(
            StructuredDateTimeInformation128714SCUSPNRDataFeed132 checkintimeInfo) {
        this.checkintimeInfo = checkintimeInfo;
    }
}
