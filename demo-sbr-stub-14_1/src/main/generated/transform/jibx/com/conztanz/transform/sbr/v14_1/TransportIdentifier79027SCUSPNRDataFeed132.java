
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the transport service(s) which is /are to be updated or cancelled
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransportIdentifier_79027_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompanyIdentification_121378_C_CUS_PNRDataFeed_132" name="companyIdentification"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransportIdentifier79027SCUSPNRDataFeed132
{
    private CompanyIdentification121378CCUSPNRDataFeed132 companyIdentification;

    /** 
     * Get the 'companyIdentification' element value. Carrier identification
     * 
     * @return value
     */
    public CompanyIdentification121378CCUSPNRDataFeed132 getCompanyIdentification() {
        return companyIdentification;
    }

    /** 
     * Set the 'companyIdentification' element value. Carrier identification
     * 
     * @param companyIdentification
     */
    public void setCompanyIdentification(
            CompanyIdentification121378CCUSPNRDataFeed132 companyIdentification) {
        this.companyIdentification = companyIdentification;
    }
}
