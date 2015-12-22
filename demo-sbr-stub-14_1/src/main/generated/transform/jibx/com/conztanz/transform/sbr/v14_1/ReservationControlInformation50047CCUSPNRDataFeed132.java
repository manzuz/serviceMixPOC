
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the information required to identify a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_50047_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="controlNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation50047CCUSPNRDataFeed132
{
    private String controlNumber;

    /** 
     * Get the 'controlNumber' element value. PNR record locator
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'controlNumber' element value. PNR record locator
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }
}
