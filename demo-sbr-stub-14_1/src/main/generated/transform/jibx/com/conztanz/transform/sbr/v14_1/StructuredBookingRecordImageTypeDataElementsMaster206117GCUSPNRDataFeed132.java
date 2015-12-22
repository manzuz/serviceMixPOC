
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_206117_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DummySegment_1962_S_CUS_PNRDataFeed_132" name="marker2"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_dataElementsIndiv_206120_G_CUS_PNRDataFeed_132" name="dataElementsIndiv" minOccurs="0" maxOccurs="9999"/>
 *     &lt;xs:element type="DummySegment_1962_S_CUS_PNRDataFeed_132" name="marker3"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_dataElementsStruct_206118_G_CUS_PNRDataFeed_132" name="dataElementsStruct" minOccurs="0" maxOccurs="236187"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMaster206117GCUSPNRDataFeed132
{
    private DummySegment1962SCUSPNRDataFeed132 marker2;
    private List<StructuredBookingRecordImageTypeDataElementsMasterDataElementsIndiv206120GCUSPNRDataFeed132> dataElementsIndivList = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterDataElementsIndiv206120GCUSPNRDataFeed132>();
    private DummySegment1962SCUSPNRDataFeed132 marker3;
    private List<StructuredBookingRecordImageTypeDataElementsMasterDataElementsStruct206118GCUSPNRDataFeed132> dataElementsStructList = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterDataElementsStruct206118GCUSPNRDataFeed132>();

    /** 
     * Get the 'marker2' element value. Marker
     * 
     * @return value
     */
    public DummySegment1962SCUSPNRDataFeed132 getMarker2() {
        return marker2;
    }

    /** 
     * Set the 'marker2' element value. Marker
     * 
     * @param marker2
     */
    public void setMarker2(DummySegment1962SCUSPNRDataFeed132 marker2) {
        this.marker2 = marker2;
    }

    /** 
     * Get the list of 'dataElementsIndiv' element items. All others  elements - Except Structured  elements
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterDataElementsIndiv206120GCUSPNRDataFeed132> getDataElementsIndivList() {
        return dataElementsIndivList;
    }

    /** 
     * Set the list of 'dataElementsIndiv' element items. All others  elements - Except Structured  elements
     * 
     * @param list
     */
    public void setDataElementsIndivList(
            List<StructuredBookingRecordImageTypeDataElementsMasterDataElementsIndiv206120GCUSPNRDataFeed132> list) {
        dataElementsIndivList = list;
    }

    /** 
     * Get the 'marker3' element value. To remove the ambiguity between SSR and Seat
     * 
     * @return value
     */
    public DummySegment1962SCUSPNRDataFeed132 getMarker3() {
        return marker3;
    }

    /** 
     * Set the 'marker3' element value. To remove the ambiguity between SSR and Seat
     * 
     * @param marker3
     */
    public void setMarker3(DummySegment1962SCUSPNRDataFeed132 marker3) {
        this.marker3 = marker3;
    }

    /** 
     * Get the list of 'dataElementsStruct' element items. All Structured elements  235679 + 508 (Remark) = 236187
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterDataElementsStruct206118GCUSPNRDataFeed132> getDataElementsStructList() {
        return dataElementsStructList;
    }

    /** 
     * Set the list of 'dataElementsStruct' element items. All Structured elements  235679 + 508 (Remark) = 236187
     * 
     * @param list
     */
    public void setDataElementsStructList(
            List<StructuredBookingRecordImageTypeDataElementsMasterDataElementsStruct206118GCUSPNRDataFeed132> list) {
        dataElementsStructList = list;
    }
}
