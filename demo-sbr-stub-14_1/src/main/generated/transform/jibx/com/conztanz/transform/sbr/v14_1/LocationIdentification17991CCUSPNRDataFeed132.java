
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationIdentification_17991_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:string" name="name"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LocationIdentification17991CCUSPNRDataFeed132
{
    private String qualifier;
    private String name;

    /** 
     * Get the 'qualifier' element value. 162: country
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. 162: country
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'name' element value. Country name
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Country name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
