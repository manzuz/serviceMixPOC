
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to identify a user.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserIdentification_85800_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorIdentificationDetails_130388_C_CUS_PNRDataFeed_132" name="originIdentification"/>
 *     &lt;xs:element type="xs:string" name="originatorTypeCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserIdentification85800SCUSPNRDataFeed132
{
    private OriginatorIdentificationDetails130388CCUSPNRDataFeed132 originIdentification;
    private String originatorTypeCode;

    /** 
     * Get the 'originIdentification' element value. Originator Identification Details
     * 
     * @return value
     */
    public OriginatorIdentificationDetails130388CCUSPNRDataFeed132 getOriginIdentification() {
        return originIdentification;
    }

    /** 
     * Set the 'originIdentification' element value. Originator Identification Details
     * 
     * @param originIdentification
     */
    public void setOriginIdentification(
            OriginatorIdentificationDetails130388CCUSPNRDataFeed132 originIdentification) {
        this.originIdentification = originIdentification;
    }

    /** 
     * Get the 'originatorTypeCode' element value. Agent type (A, T, E)
     * 
     * @return value
     */
    public String getOriginatorTypeCode() {
        return originatorTypeCode;
    }

    /** 
     * Set the 'originatorTypeCode' element value. Agent type (A, T, E)
     * 
     * @param originatorTypeCode
     */
    public void setOriginatorTypeCode(String originatorTypeCode) {
        this.originatorTypeCode = originatorTypeCode;
    }
}
