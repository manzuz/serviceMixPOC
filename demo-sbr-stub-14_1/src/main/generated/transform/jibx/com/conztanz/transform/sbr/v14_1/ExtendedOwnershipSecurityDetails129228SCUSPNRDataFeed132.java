
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify security between offices
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedOwnershipSecurityDetails_129228_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ExtendedSecurityDetails_188288_C_CUS_PNRDataFeed_132" name="securityDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedOwnershipSecurityDetails129228SCUSPNRDataFeed132
{
    private ExtendedSecurityDetails188288CCUSPNRDataFeed132 securityDetails;

    /** 
     * Get the 'securityDetails' element value. This composite contains security data between entities or related to one entity.
     * 
     * @return value
     */
    public ExtendedSecurityDetails188288CCUSPNRDataFeed132 getSecurityDetails() {
        return securityDetails;
    }

    /** 
     * Set the 'securityDetails' element value. This composite contains security data between entities or related to one entity.
     * 
     * @param securityDetails
     */
    public void setSecurityDetails(
            ExtendedSecurityDetails188288CCUSPNRDataFeed132 securityDetails) {
        this.securityDetails = securityDetails;
    }
}
