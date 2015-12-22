
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the information required to identify a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_49124_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="controlNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation49124CCUSPNRDataFeed132
{
    private String controlNumber;

    /** 
     * Get the 'controlNumber' element value. Identifier of the negociated space block (DBID).
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'controlNumber' element value. Identifier of the negociated space block (DBID).
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }
}
