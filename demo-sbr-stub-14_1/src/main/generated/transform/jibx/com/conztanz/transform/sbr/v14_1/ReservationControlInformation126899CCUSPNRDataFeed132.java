
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the information required to identify a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_126899_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="controlNumber"/>
 *     &lt;xs:element type="xs:string" name="controlType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation126899CCUSPNRDataFeed132
{
    private String controlNumber;
    private String controlType;

    /** 
     * Get the 'controlNumber' element value. Conveys the booking number.
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'controlNumber' element value. Conveys the booking number.
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    /** 
     * Get the 'controlType' element value. Conveys the booking number qualifier.
     * 
     * @return value
     */
    public String getControlType() {
        return controlType;
    }

    /** 
     * Set the 'controlType' element value. Conveys the booking number qualifier.
     * 
     * @param controlType
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }
}
