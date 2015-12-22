
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the name of a person or entity.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Name_128672_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NameInformation_187473_C_CUS_PNRDataFeed_132" name="nameInformation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Name128672SCUSPNRDataFeed132
{
    private NameInformation187473CCUSPNRDataFeed132 nameInformation;

    /** 
     * Get the 'nameInformation' element value. Used to specify the name field in the address field.
     * 
     * @return value
     */
    public NameInformation187473CCUSPNRDataFeed132 getNameInformation() {
        return nameInformation;
    }

    /** 
     * Set the 'nameInformation' element value. Used to specify the name field in the address field.
     * 
     * @param nameInformation
     */
    public void setNameInformation(
            NameInformation187473CCUSPNRDataFeed132 nameInformation) {
        this.nameInformation = nameInformation;
    }
}
