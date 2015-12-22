
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_52416_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="controlNumber"/>
 *     &lt;xs:element type="xs:string" name="controlType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation52416CCUSPNRDataFeed132
{
    private String controlNumber;
    private String controlType;

    /** 
     * Get the 'controlNumber' element value. Contains the Nego Block ID value
     * 
     * @return value
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /** 
     * Set the 'controlNumber' element value. Contains the Nego Block ID value
     * 
     * @param controlNumber
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    /** 
     * Get the 'controlType' element value. D for DBID type.
     * 
     * @return value
     */
    public String getControlType() {
        return controlType;
    }

    /** 
     * Set the 'controlType' element value. D for DBID type.
     * 
     * @param controlType
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }
}
