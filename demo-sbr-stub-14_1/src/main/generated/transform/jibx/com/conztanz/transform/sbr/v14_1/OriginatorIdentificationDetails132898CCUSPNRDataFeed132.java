
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_132898_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="originatorId"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails132898CCUSPNRDataFeed132
{
    private String originatorId;

    /** 
     * Get the 'originatorId' element value. Agency Iata code
     * 
     * @return value
     */
    public String getOriginatorId() {
        return originatorId;
    }

    /** 
     * Set the 'originatorId' element value. Agency Iata code
     * 
     * @param originatorId
     */
    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }
}
