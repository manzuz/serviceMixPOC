
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information about a reservation such as identification, date and time, and reasons of modifications.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationControlInformation_55378_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="value"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationControlInformation55378CCUSPNRDataFeed132
{
    private String value;

    /** 
     * Get the 'value' element value. The individual Passenger confirmation number in the Provider database.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. The individual Passenger confirmation number in the Provider database.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
