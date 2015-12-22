
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SubclassIdentification_42204_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="subclassId"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SubclassIdentification42204SCUSPNRDataFeed132
{
    private String subclassId;

    /** 
     * Get the 'subclassId' element value. Identification of the subclass with a letter+number code
     * 
     * @return value
     */
    public String getSubclassId() {
        return subclassId;
    }

    /** 
     * Set the 'subclassId' element value. Identification of the subclass with a letter+number code
     * 
     * @param subclassId
     */
    public void setSubclassId(String subclassId) {
        this.subclassId = subclassId;
    }
}
