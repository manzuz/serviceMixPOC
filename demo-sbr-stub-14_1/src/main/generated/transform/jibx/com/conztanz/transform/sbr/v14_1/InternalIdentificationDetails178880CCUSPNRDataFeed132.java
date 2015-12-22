
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an internal identification and the type of identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InternalIdentificationDetails_178880_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="inhouseId"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InternalIdentificationDetails178880CCUSPNRDataFeed132
{
    private String inhouseId;
    private String type;

    /** 
     * Get the 'inhouseId' element value.
     * 
     * @return value
     */
    public String getInhouseId() {
        return inhouseId;
    }

    /** 
     * Set the 'inhouseId' element value.
     * 
     * @param inhouseId
     */
    public void setInhouseId(String inhouseId) {
        this.inhouseId = inhouseId;
    }

    /** 
     * Get the 'type' element value. Type of agent identifier. UID: LSS user id SGN: Agent sign
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Type of agent identifier. UID: LSS user id SGN: Agent sign
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
