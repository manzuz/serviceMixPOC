
package com.conztanz.transform.sbr.v14_1;

/** 
 * Convey structured phone information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredTelephoneNumber_187626_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="telephoneNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredTelephoneNumber187626CCUSPNRDataFeed132
{
    private String telephoneNumber;

    /** 
     * Get the 'telephoneNumber' element value. Telephone or Fax number
     * 
     * @return value
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /** 
     * Set the 'telephoneNumber' element value. Telephone or Fax number
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
