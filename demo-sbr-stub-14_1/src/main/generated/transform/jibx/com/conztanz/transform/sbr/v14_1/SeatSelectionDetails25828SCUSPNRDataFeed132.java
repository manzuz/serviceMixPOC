
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details concerning seat selection and the associated security and processing information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatSelectionDetails_25828_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecificSeatDetails_46933_C_CUS_PNRDataFeed_132" name="specificSeatDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="noSmokingIndicator" minOccurs="0"/>
 *     &lt;xs:element type="SeatCharacteristicDetails_46934_C_CUS_PNRDataFeed_132" name="seatCharacteristicDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatSelectionDetails25828SCUSPNRDataFeed132
{
    private SpecificSeatDetails46933CCUSPNRDataFeed132 specificSeatDetails;
    private String noSmokingIndicator;
    private SeatCharacteristicDetails46934CCUSPNRDataFeed132 seatCharacteristicDetails;

    /** 
     * Get the 'specificSeatDetails' element value. Details about the seat itself.
     * 
     * @return value
     */
    public SpecificSeatDetails46933CCUSPNRDataFeed132 getSpecificSeatDetails() {
        return specificSeatDetails;
    }

    /** 
     * Set the 'specificSeatDetails' element value. Details about the seat itself.
     * 
     * @param specificSeatDetails
     */
    public void setSpecificSeatDetails(
            SpecificSeatDetails46933CCUSPNRDataFeed132 specificSeatDetails) {
        this.specificSeatDetails = specificSeatDetails;
    }

    /** 
     * Get the 'noSmokingIndicator' element value. Smoking/Non-Smoking indicator
     * 
     * @return value
     */
    public String getNoSmokingIndicator() {
        return noSmokingIndicator;
    }

    /** 
     * Set the 'noSmokingIndicator' element value. Smoking/Non-Smoking indicator
     * 
     * @param noSmokingIndicator
     */
    public void setNoSmokingIndicator(String noSmokingIndicator) {
        this.noSmokingIndicator = noSmokingIndicator;
    }

    /** 
     * Get the 'seatCharacteristicDetails' element value. This is the characterirstics of the seat.
     * 
     * @return value
     */
    public SeatCharacteristicDetails46934CCUSPNRDataFeed132 getSeatCharacteristicDetails() {
        return seatCharacteristicDetails;
    }

    /** 
     * Set the 'seatCharacteristicDetails' element value. This is the characterirstics of the seat.
     * 
     * @param seatCharacteristicDetails
     */
    public void setSeatCharacteristicDetails(
            SeatCharacteristicDetails46934CCUSPNRDataFeed132 seatCharacteristicDetails) {
        this.seatCharacteristicDetails = seatCharacteristicDetails;
    }
}
