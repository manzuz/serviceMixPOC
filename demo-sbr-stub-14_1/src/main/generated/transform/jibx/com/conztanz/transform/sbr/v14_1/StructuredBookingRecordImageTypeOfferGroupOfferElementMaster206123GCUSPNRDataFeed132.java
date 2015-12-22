
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_offerElementMaster_206123_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DummySegment_1962_S_CUS_PNRDataFeed_132" name="offerMarker1"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_offerElementsIndiv_206125_G_CUS_PNRDataFeed_132" name="offerElementsIndiv" minOccurs="0" maxOccurs="3819"/>
 *     &lt;xs:element type="DummySegment_1962_S_CUS_PNRDataFeed_132" name="offerMarker2"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_offerElementsStruct_206124_G_CUS_PNRDataFeed_132" name="offerElementsStruct" minOccurs="0" maxOccurs="127"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupOfferElementMaster206123GCUSPNRDataFeed132
{
    private DummySegment1962SCUSPNRDataFeed132 offerMarker1;
    private List<StructuredBookingRecordImageTypeOfferGroupOfferElementsIndiv206125GCUSPNRDataFeed132> offerElementsIndivList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupOfferElementsIndiv206125GCUSPNRDataFeed132>();
    private DummySegment1962SCUSPNRDataFeed132 offerMarker2;
    private List<StructuredBookingRecordImageTypeOfferGroupOfferElementsStruct206124GCUSPNRDataFeed132> offerElementsStructList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupOfferElementsStruct206124GCUSPNRDataFeed132>();

    /** 
     * Get the 'offerMarker1' element value. Marker
     * 
     * @return value
     */
    public DummySegment1962SCUSPNRDataFeed132 getOfferMarker1() {
        return offerMarker1;
    }

    /** 
     * Set the 'offerMarker1' element value. Marker
     * 
     * @param offerMarker1
     */
    public void setOfferMarker1(DummySegment1962SCUSPNRDataFeed132 offerMarker1) {
        this.offerMarker1 = offerMarker1;
    }

    /** 
     * Get the list of 'offerElementsIndiv' element items. All others  Offer elements - Except Structured  elements
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupOfferElementsIndiv206125GCUSPNRDataFeed132> getOfferElementsIndivList() {
        return offerElementsIndivList;
    }

    /** 
     * Set the list of 'offerElementsIndiv' element items. All others  Offer elements - Except Structured  elements
     * 
     * @param list
     */
    public void setOfferElementsIndivList(
            List<StructuredBookingRecordImageTypeOfferGroupOfferElementsIndiv206125GCUSPNRDataFeed132> list) {
        offerElementsIndivList = list;
    }

    /** 
     * Get the 'offerMarker2' element value. To remove the ambiguity between SSR and Seat
     * 
     * @return value
     */
    public DummySegment1962SCUSPNRDataFeed132 getOfferMarker2() {
        return offerMarker2;
    }

    /** 
     * Set the 'offerMarker2' element value. To remove the ambiguity between SSR and Seat
     * 
     * @param offerMarker2
     */
    public void setOfferMarker2(DummySegment1962SCUSPNRDataFeed132 offerMarker2) {
        this.offerMarker2 = offerMarker2;
    }

    /** 
     * Get the list of 'offerElementsStruct' element items. All Offer Structured elements  For the moment, the number of SSR seat items in a PNR is limited to 100
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupOfferElementsStruct206124GCUSPNRDataFeed132> getOfferElementsStructList() {
        return offerElementsStructList;
    }

    /** 
     * Set the list of 'offerElementsStruct' element items. All Offer Structured elements  For the moment, the number of SSR seat items in a PNR is limited to 100
     * 
     * @param list
     */
    public void setOfferElementsStructList(
            List<StructuredBookingRecordImageTypeOfferGroupOfferElementsStruct206124GCUSPNRDataFeed132> list) {
        offerElementsStructList = list;
    }
}
