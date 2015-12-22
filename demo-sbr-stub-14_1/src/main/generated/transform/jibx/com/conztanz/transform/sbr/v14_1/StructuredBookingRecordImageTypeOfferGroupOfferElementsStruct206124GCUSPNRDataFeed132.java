
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_offerElementsStruct_206124_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ElementManagementSegment_129757_S_CUS_PNRDataFeed_132" name="elementManagementData"/>
 *     &lt;xs:element type="ReferenceInformation_75336_S_CUS_PNRDataFeed_132" name="referenceForDataElement" minOccurs="0"/>
 *     &lt;xs:element type="SeatEntity_112674_G_CUS_PNRDataFeed_132" name="offerSeatData" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupOfferElementsStruct206124GCUSPNRDataFeed132
{
    private ElementManagementSegment129757SCUSPNRDataFeed132 elementManagementData;
    private ReferenceInformation75336SCUSPNRDataFeed132 referenceForDataElement;
    private SeatEntity112674GCUSPNRDataFeed132 offerSeatData;

    /** 
     * Get the 'elementManagementData' element value.
     * 
     * @return value
     */
    public ElementManagementSegment129757SCUSPNRDataFeed132 getElementManagementData() {
        return elementManagementData;
    }

    /** 
     * Set the 'elementManagementData' element value.
     * 
     * @param elementManagementData
     */
    public void setElementManagementData(
            ElementManagementSegment129757SCUSPNRDataFeed132 elementManagementData) {
        this.elementManagementData = elementManagementData;
    }

    /** 
     * Get the 'referenceForDataElement' element value. provide specific reference identification
     * 
     * @return value
     */
    public ReferenceInformation75336SCUSPNRDataFeed132 getReferenceForDataElement() {
        return referenceForDataElement;
    }

    /** 
     * Set the 'referenceForDataElement' element value. provide specific reference identification
     * 
     * @param referenceForDataElement
     */
    public void setReferenceForDataElement(
            ReferenceInformation75336SCUSPNRDataFeed132 referenceForDataElement) {
        this.referenceForDataElement = referenceForDataElement;
    }

    /** 
     * Get the 'offerSeatData' element value. This group conveys the Seat request information associated to an offer
     * 
     * @return value
     */
    public SeatEntity112674GCUSPNRDataFeed132 getOfferSeatData() {
        return offerSeatData;
    }

    /** 
     * Set the 'offerSeatData' element value. This group conveys the Seat request information associated to an offer
     * 
     * @param offerSeatData
     */
    public void setOfferSeatData(
            SeatEntity112674GCUSPNRDataFeed132 offerSeatData) {
        this.offerSeatData = offerSeatData;
    }
}
