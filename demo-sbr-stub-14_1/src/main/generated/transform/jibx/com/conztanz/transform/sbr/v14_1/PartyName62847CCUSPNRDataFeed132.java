
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of a transaction party by name, one to five lines. Party name may be formatted.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PartyName_62847_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="name1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PartyName62847CCUSPNRDataFeed132
{
    private String name1;

    /** 
     * Get the 'name1' element value. name
     * 
     * @return value
     */
    public String getName1() {
        return name1;
    }

    /** 
     * Set the 'name1' element value. name
     * 
     * @param name1
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }
}
