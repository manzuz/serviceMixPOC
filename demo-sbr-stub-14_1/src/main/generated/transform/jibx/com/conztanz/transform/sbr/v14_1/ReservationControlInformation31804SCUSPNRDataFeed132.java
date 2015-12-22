
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a reference to a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_31804_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_55378_C_CUS_PNRDataFeed_132" name="referenceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation31804SCUSPNRDataFeed132
{
    private ReservationControlInformation55378CCUSPNRDataFeed132 referenceDetails;

    /** 
     * Get the 'referenceDetails' element value. The reference to the Provider Database
     * 
     * @return value
     */
    public ReservationControlInformation55378CCUSPNRDataFeed132 getReferenceDetails() {
        return referenceDetails;
    }

    /** 
     * Set the 'referenceDetails' element value. The reference to the Provider Database
     * 
     * @param referenceDetails
     */
    public void setReferenceDetails(
            ReservationControlInformation55378CCUSPNRDataFeed132 referenceDetails) {
        this.referenceDetails = referenceDetails;
    }
}
