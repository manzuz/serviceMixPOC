
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_206116_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginAndDestinationDetails_24810_S_CUS_PNRDataFeed_132" name="originDestination"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_itineraryInfo_207668_G_CUS_PNRDataFeed_132" name="itineraryInfo" minOccurs="0" maxOccurs="198"/>
 *     &lt;xs:element type="ExtendedContentGroup_149407_G_CUS_PNRDataFeed_1322" name="extendedContentGroup" minOccurs="0" maxOccurs="198"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetails206116GCUSPNRDataFeed132
{
    private OriginAndDestinationDetails24810SCUSPNRDataFeed132 originDestination;
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsItineraryInfo207668GCUSPNRDataFeed132> itineraryInfoList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsItineraryInfo207668GCUSPNRDataFeed132>();
    private List<ExtendedContentGroup149407GCUSPNRDataFeed1322> extendedContentGroupList = new ArrayList<ExtendedContentGroup149407GCUSPNRDataFeed1322>();

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
     * Get the list of 'itineraryInfo' element items. Contains the PNR segments (Air, Hotels etc)
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsItineraryInfo207668GCUSPNRDataFeed132> getItineraryInfoList() {
        return itineraryInfoList;
    }

    /** 
     * Set the list of 'itineraryInfo' element items. Contains the PNR segments (Air, Hotels etc)
     * 
     * @param list
     */
    public void setItineraryInfoList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsItineraryInfo207668GCUSPNRDataFeed132> list) {
        itineraryInfoList = list;
    }

    /** 
     * Get the list of 'extendedContentGroup' element items. This group contains extended content details.
     * 
     * @return list
     */
    public List<ExtendedContentGroup149407GCUSPNRDataFeed1322> getExtendedContentGroupList() {
        return extendedContentGroupList;
    }

    /** 
     * Set the list of 'extendedContentGroup' element items. This group contains extended content details.
     * 
     * @param list
     */
    public void setExtendedContentGroupList(
            List<ExtendedContentGroup149407GCUSPNRDataFeed1322> list) {
        extendedContentGroupList = list;
    }
}
