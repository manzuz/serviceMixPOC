
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the information required to identify a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_109516_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="controlNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation109516CCUSPNRDataFeed132
{
    private String controlNumber;

    /** 
     * Get the 'controlNumber' element value. returned confirmation number for electronic ticket
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'controlNumber' element value. returned confirmation number for electronic ticket
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }
}
