
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide reference identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferencingDetails_142140_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="value"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferencingDetails142140CCUSPNRDataFeed132
{
    private String value;

    /** 
     * Get the 'value' element value. will have the following values: XID  Transaction identifier of the 3DS process CAAV authentication verification code for Visa AAV  authentication verification code for MasterCard PAREQ authentication message PARES authentication response message
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. will have the following values: XID  Transaction identifier of the 3DS process CAAV authentication verification code for Visa AAV  authentication verification code for MasterCard PAREQ authentication message PARES authentication response message
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
