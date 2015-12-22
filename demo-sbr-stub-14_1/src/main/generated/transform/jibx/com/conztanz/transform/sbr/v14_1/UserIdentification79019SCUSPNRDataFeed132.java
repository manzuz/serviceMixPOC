
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to identify a user.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserIdentification_79019_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorIdentificationDetails_121364_C_CUS_PNRDataFeed_132" name="originIdentification"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserIdentification79019SCUSPNRDataFeed132
{
    private OriginatorIdentificationDetails121364CCUSPNRDataFeed132 originIdentification;

    /** 
     * Get the 'originIdentification' element value. Originator Identification Details - agent sign (C9900) - office name (C9902) - office AMID (C9902)(FOR TST ONLY)
     * 
     * @return value
     */
    public OriginatorIdentificationDetails121364CCUSPNRDataFeed132 getOriginIdentification() {
        return originIdentification;
    }

    /** 
     * Set the 'originIdentification' element value. Originator Identification Details - agent sign (C9900) - office name (C9902) - office AMID (C9902)(FOR TST ONLY)
     * 
     * @param originIdentification
     */
    public void setOriginIdentification(
            OriginatorIdentificationDetails121364CCUSPNRDataFeed132 originIdentification) {
        this.originIdentification = originIdentification;
    }
}
