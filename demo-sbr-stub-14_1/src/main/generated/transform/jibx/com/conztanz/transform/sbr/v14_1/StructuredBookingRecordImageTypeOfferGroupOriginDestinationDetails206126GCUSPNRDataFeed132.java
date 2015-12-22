
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_originDestinationDetails_206126_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginAndDestinationDetails_24810_S_CUS_PNRDataFeed_132" name="originDestination"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_itineraryInfo_207668_G_CUS_PNRDataFeed_1321" name="itineraryInfo" minOccurs="0" maxOccurs="198"/>
 *     &lt;xs:element type="ExtendedContentGroup_149407_G_CUS_PNRDataFeed_1323" name="extendedContentInfos" minOccurs="0" maxOccurs="198"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupOriginDestinationDetails206126GCUSPNRDataFeed132
{
    private OriginAndDestinationDetails24810SCUSPNRDataFeed132 originDestination;
    private List<StructuredBookingRecordImageTypeOfferGroupItineraryInfo207668GCUSPNRDataFeed1321> itineraryInfoList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupItineraryInfo207668GCUSPNRDataFeed1321>();
    private List<ExtendedContentGroup149407GCUSPNRDataFeed1323> extendedContentInfoList = new ArrayList<ExtendedContentGroup149407GCUSPNRDataFeed1323>();

    /** 
     * Get the 'originDestination' element value. The ODI is a marker before the segments.
     * 
     * @return value
     */
    public OriginAndDestinationDetails24810SCUSPNRDataFeed132 getOriginDestination() {
        return originDestination;
    }

    /** 
     * Set the 'originDestination' element value. The ODI is a marker before the segments.
     * 
     * @param originDestination
     */
    public void setOriginDestination(
            OriginAndDestinationDetails24810SCUSPNRDataFeed132 originDestination) {
        this.originDestination = originDestination;
    }

    /** 
     * Get the list of 'itineraryInfo' element items.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupItineraryInfo207668GCUSPNRDataFeed1321> getItineraryInfoList() {
        return itineraryInfoList;
    }

    /** 
     * Set the list of 'itineraryInfo' element items.
     * 
     * @param list
     */
    public void setItineraryInfoList(
            List<StructuredBookingRecordImageTypeOfferGroupItineraryInfo207668GCUSPNRDataFeed1321> list) {
        itineraryInfoList = list;
    }

    /** 
     * Get the list of 'extendedContentInfos' element items. This group contains extended contents details.
     * 
     * @return list
     */
    public List<ExtendedContentGroup149407GCUSPNRDataFeed1323> getExtendedContentInfoList() {
        return extendedContentInfoList;
    }

    /** 
     * Set the list of 'extendedContentInfos' element items. This group contains extended contents details.
     * 
     * @param list
     */
    public void setExtendedContentInfoList(
            List<ExtendedContentGroup149407GCUSPNRDataFeed1323> list) {
        extendedContentInfoList = list;
    }
}
