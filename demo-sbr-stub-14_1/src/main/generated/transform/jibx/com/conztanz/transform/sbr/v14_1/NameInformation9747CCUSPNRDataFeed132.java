
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the type of name, the actual name or a code to identify the name, and the status of the              name
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NameInformation_9747_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="identifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NameInformation9747CCUSPNRDataFeed132
{
    private String qualifier;
    private String name;
    private String identifier;

    /** 
     * Get the 'qualifier' element value. to convey to who the address applies
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. to convey to who the address applies
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'name' element value. Company name
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Company name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'identifier' element value. Insuree name
     * 
     * @return value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** 
     * Set the 'identifier' element value. Insuree name
     * 
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
