
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedTaxi_145935_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StructuredPeriodInformation_128780_S_CUS_PNRDataFeed_132" name="pickUpDropOffDateTime"/>
 *     &lt;xs:element type="AdditionalProductDetails_128495_S_CUS_PNRDataFeed_132" name="additionalProductDetails" minOccurs="0"/>
 *     &lt;xs:element type="Address_129098_S_CUS_PNRDataFeed_132" name="eventAddress" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="TravellerBaggageDetails_129119_S_CUS_PNRDataFeed_132" name="baggage" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedTaxi145935GCUSPNRDataFeed1323
{
    private StructuredPeriodInformation128780SCUSPNRDataFeed132 pickUpDropOffDateTime;
    private AdditionalProductDetails128495SCUSPNRDataFeed132 additionalProductDetails;
    private List<Address129098SCUSPNRDataFeed132> eventAddressList = new ArrayList<Address129098SCUSPNRDataFeed132>();
    private TravellerBaggageDetails129119SCUSPNRDataFeed132 baggage;

    /** 
     * Get the 'pickUpDropOffDateTime' element value.
     * 
     * @return value
     */
    public StructuredPeriodInformation128780SCUSPNRDataFeed132 getPickUpDropOffDateTime() {
        return pickUpDropOffDateTime;
    }

    /** 
     * Set the 'pickUpDropOffDateTime' element value.
     * 
     * @param pickUpDropOffDateTime
     */
    public void setPickUpDropOffDateTime(
            StructuredPeriodInformation128780SCUSPNRDataFeed132 pickUpDropOffDateTime) {
        this.pickUpDropOffDateTime = pickUpDropOffDateTime;
    }

    /** 
     * Get the 'additionalProductDetails' element value.
     * 
     * @return value
     */
    public AdditionalProductDetails128495SCUSPNRDataFeed132 getAdditionalProductDetails() {
        return additionalProductDetails;
    }

    /** 
     * Set the 'additionalProductDetails' element value.
     * 
     * @param additionalProductDetails
     */
    public void setAdditionalProductDetails(
            AdditionalProductDetails128495SCUSPNRDataFeed132 additionalProductDetails) {
        this.additionalProductDetails = additionalProductDetails;
    }

    /** 
     * Get the list of 'eventAddress' element items. Address of the event location
     * 
     * @return list
     */
    public List<Address129098SCUSPNRDataFeed132> getEventAddressList() {
        return eventAddressList;
    }

    /** 
     * Set the list of 'eventAddress' element items. Address of the event location
     * 
     * @param list
     */
    public void setEventAddressList(List<Address129098SCUSPNRDataFeed132> list) {
        eventAddressList = list;
    }

    /** 
     * Get the 'baggage' element value. Baggage info
     * 
     * @return value
     */
    public TravellerBaggageDetails129119SCUSPNRDataFeed132 getBaggage() {
        return baggage;
    }

    /** 
     * Set the 'baggage' element value. Baggage info
     * 
     * @param baggage
     */
    public void setBaggage(
            TravellerBaggageDetails129119SCUSPNRDataFeed132 baggage) {
        this.baggage = baggage;
    }
}
