
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide reference identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferencingDetails_121390_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="value"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferencingDetails121390CCUSPNRDataFeed132
{
    private String type;
    private String value;

    /** 
     * Get the 'type' element value. Identifier for Nego References segment: - CAR:Commercial Agreement Reference - NRS: Net Remit Scheme
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Identifier for Nego References segment: - CAR:Commercial Agreement Reference - NRS: Net Remit Scheme
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'value' element value. COMMERCIAL AGREEMENT REFERENCE
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'value' element value. COMMERCIAL AGREEMENT REFERENCE
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
