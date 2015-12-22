
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a part of a country (eg county or part of              a city).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CountrySubEntityDetails_187472_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:string" name="name"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CountrySubEntityDetails187472CCUSPNRDataFeed132
{
    private String qualifier;
    private String name;

    /** 
     * Get the 'qualifier' element value. 84: state
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. 84: state
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'name' element value. Region or State of the given address
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Region or State of the given address
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
