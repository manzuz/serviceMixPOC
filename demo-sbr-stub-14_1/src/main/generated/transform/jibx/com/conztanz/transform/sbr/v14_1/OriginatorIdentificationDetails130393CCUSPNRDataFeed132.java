
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_130393_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="originatorId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails130393CCUSPNRDataFeed132
{
    private String originatorId;
    private String inHouseIdentification1;

    /** 
     * Get the 'originatorId' element value. is alphanum since the sine of an agent might contain his initials and duty code
     * 
     * @return value
     */
    public String getOriginatorId() {
        return originatorId;
    }

    /** 
     * Set the 'originatorId' element value. is alphanum since the sine of an agent might contain his initials and duty code
     * 
     * @param originatorId
     */
    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }

    /** 
     * Get the 'inHouseIdentification1' element value.
     * 
     * @return value
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /** 
     * Set the 'inHouseIdentification1' element value.
     * 
     * @param inHouseIdentification1
     */
    public void setInHouseIdentification1(String inHouseIdentification1) {
        this.inHouseIdentification1 = inHouseIdentification1;
    }
}
