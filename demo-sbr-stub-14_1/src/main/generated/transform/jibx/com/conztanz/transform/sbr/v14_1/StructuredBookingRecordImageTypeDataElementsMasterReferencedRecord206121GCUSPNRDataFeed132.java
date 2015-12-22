
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_referencedRecord_206121_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_22991_S_CUS_PNRDataFeed_132" name="referencedReservationInfo"/>
 *     &lt;xs:element type="ReservationSecurityInformation_4193_S_CUS_PNRDataFeed_132" name="dataSecurityInformation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterReferencedRecord206121GCUSPNRDataFeed132
{
    private ReservationControlInformation22991SCUSPNRDataFeed132 referencedReservationInfo;
    private ReservationSecurityInformation4193SCUSPNRDataFeed132 dataSecurityInformation;

    /** 
     * Get the 'referencedReservationInfo' element value. Reference to a reservation
     * 
     * @return value
     */
    public ReservationControlInformation22991SCUSPNRDataFeed132 getReferencedReservationInfo() {
        return referencedReservationInfo;
    }

    /** 
     * Set the 'referencedReservationInfo' element value. Reference to a reservation
     * 
     * @param referencedReservationInfo
     */
    public void setReferencedReservationInfo(
            ReservationControlInformation22991SCUSPNRDataFeed132 referencedReservationInfo) {
        this.referencedReservationInfo = referencedReservationInfo;
    }

    /** 
     * Get the 'dataSecurityInformation' element value. Amadeus PNR record locator security information for different PNR elements
     * 
     * @return value
     */
    public ReservationSecurityInformation4193SCUSPNRDataFeed132 getDataSecurityInformation() {
        return dataSecurityInformation;
    }

    /** 
     * Set the 'dataSecurityInformation' element value. Amadeus PNR record locator security information for different PNR elements
     * 
     * @param dataSecurityInformation
     */
    public void setDataSecurityInformation(
            ReservationSecurityInformation4193SCUSPNRDataFeed132 dataSecurityInformation) {
        this.dataSecurityInformation = dataSecurityInformation;
    }
}
