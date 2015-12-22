
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the type of data to be sent and to qualify the data when required.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DataTypeInformation_121391_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DataTypeInformation121391CCUSPNRDataFeed132
{
    private String type;

    /** 
     * Get the 'type' element value. carrier fee type  ex T01 , R01
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. carrier fee type  ex T01 , R01
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
