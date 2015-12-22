
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to identify a user.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserIdentification_70490_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorIdentificationDetails_109772_C_CUS_PNRDataFeed_132" name="originIdentification"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserIdentification70490SCUSPNRDataFeed132
{
    private OriginatorIdentificationDetails109772CCUSPNRDataFeed132 originIdentification;

    /** 
     * Get the 'originIdentification' element value. Originator Identification Details
     * 
     * @return value
     */
    public OriginatorIdentificationDetails109772CCUSPNRDataFeed132 getOriginIdentification() {
        return originIdentification;
    }

    /** 
     * Set the 'originIdentification' element value. Originator Identification Details
     * 
     * @param originIdentification
     */
    public void setOriginIdentification(
            OriginatorIdentificationDetails109772CCUSPNRDataFeed132 originIdentification) {
        this.originIdentification = originIdentification;
    }
}
