
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the information required to identify a reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_187248_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="controlNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="controlType" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation187248CCUSPNRDataFeed132
{
    private String controlNumber;
    private String controlType;

    /** 
     * Get the 'controlNumber' element value. Confirmation and/or Cancellation number
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'controlNumber' element value. Confirmation and/or Cancellation number
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    /** 
     * Get the 'controlType' element value. Confirmation or Cancellation reference
     * 
     * @return value
     */
    public String getControlType() {
        return controlType;
    }

    /** 
     * Set the 'controlType' element value. Confirmation or Cancellation reference
     * 
     * @param controlType
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }
}
