
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the name of a person or entity.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Name_10046_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NameInformation_9747_C_CUS_PNRDataFeed_132" name="nameInformation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Name10046SCUSPNRDataFeed132
{
    private NameInformation9747CCUSPNRDataFeed132 nameInformation;

    /** 
     * Get the 'nameInformation' element value. Used to specify the name field in the address field.
     * 
     * @return value
     */
    public NameInformation9747CCUSPNRDataFeed132 getNameInformation() {
        return nameInformation;
    }

    /** 
     * Set the 'nameInformation' element value. Used to specify the name field in the address field.
     * 
     * @param nameInformation
     */
    public void setNameInformation(
            NameInformation9747CCUSPNRDataFeed132 nameInformation) {
        this.nameInformation = nameInformation;
    }
}
