
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the type of name, the actual name or a code to identify the name, and the status of the              name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NameInformation_132915_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:string" name="name"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NameInformation132915CCUSPNRDataFeed132
{
    private String qualifier;
    private String name;

    /** 
     * Get the 'qualifier' element value. name qualifier
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. name qualifier
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'name' element value. name
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
