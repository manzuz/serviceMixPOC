
package com.conztanz.transform.sbr.v14_1;

/** 
 * To indicate a priority.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PriorityDetails_118780_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="description"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PriorityDetails118780CCUSPNRDataFeed132
{
    private String description;

    /** 
     * Get the 'description' element value. Contain the regarde priority
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. Contain the regarde priority
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
