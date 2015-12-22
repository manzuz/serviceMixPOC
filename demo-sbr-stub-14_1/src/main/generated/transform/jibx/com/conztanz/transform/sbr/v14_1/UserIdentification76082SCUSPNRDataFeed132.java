
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identify acceptance origin.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserIdentification_76082_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="originatorTypeCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserIdentification76082SCUSPNRDataFeed132
{
    private String originatorTypeCode;

    /** 
     * Get the 'originatorTypeCode' element value. 1 character code for airline agent (A), travel agent (T), etc...
     * 
     * @return value
     */
    public String getOriginatorTypeCode() {
        return originatorTypeCode;
    }

    /** 
     * Set the 'originatorTypeCode' element value. 1 character code for airline agent (A), travel agent (T), etc...
     * 
     * @param originatorTypeCode
     */
    public void setOriginatorTypeCode(String originatorTypeCode) {
        this.originatorTypeCode = originatorTypeCode;
    }
}
