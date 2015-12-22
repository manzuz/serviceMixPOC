
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide details which restrict traffic
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TrafficRestrictionDetails_126846_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TrafficRestrictionDetails126846CCUSPNRDataFeed132
{
    private String code;
    private String type;
    private String description;

    /** 
     * Get the 'code' element value. restriction code.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. restriction code.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'type' element value. restriction type
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. restriction type
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'description' element value. traffic restriction description
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. traffic restriction description
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
