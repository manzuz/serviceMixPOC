
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the information required to identify a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_18446_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="controlNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation18446CCUSPNRDataFeed132
{
    private String controlNumber;

    /** 
     * Get the 'controlNumber' element value. this is used to specify the confirmation number meaning that the booking was succesfull.
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'controlNumber' element value. this is used to specify the confirmation number meaning that the booking was succesfull.
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }
}
