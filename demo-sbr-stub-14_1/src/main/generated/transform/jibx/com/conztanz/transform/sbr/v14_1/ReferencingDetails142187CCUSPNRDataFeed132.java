
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide reference identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferencingDetails_142187_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="value" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferencingDetails142187CCUSPNRDataFeed132
{
    private String type;
    private String value;

    /** 
     * Get the 'type' element value. FOID document type
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. FOID document type
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'value' element value. FOID document number
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. FOID document number
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
