
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the name of a person or entity.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Name_87605_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NameInformation_132915_C_CUS_PNRDataFeed_132" name="nameInformation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Name87605SCUSPNRDataFeed132
{
    private NameInformation132915CCUSPNRDataFeed132 nameInformation;

    /** 
     * Get the 'nameInformation' element value. Name information
     * 
     * @return value
     */
    public NameInformation132915CCUSPNRDataFeed132 getNameInformation() {
        return nameInformation;
    }

    /** 
     * Set the 'nameInformation' element value. Name information
     * 
     * @param nameInformation
     */
    public void setNameInformation(
            NameInformation132915CCUSPNRDataFeed132 nameInformation) {
        this.nameInformation = nameInformation;
    }
}
