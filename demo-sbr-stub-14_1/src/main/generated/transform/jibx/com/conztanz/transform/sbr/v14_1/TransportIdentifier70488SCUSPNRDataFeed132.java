
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the transport service(s) which is /are to be updated or cancelled
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransportIdentifier_70488_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompanyIdentification_109769_C_CUS_PNRDataFeed_132" name="companyIdentification"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransportIdentifier70488SCUSPNRDataFeed132
{
    private CompanyIdentification109769CCUSPNRDataFeed132 companyIdentification;

    /** 
     * Get the 'companyIdentification' element value. Airline id.
     * 
     * @return value
     */
    public CompanyIdentification109769CCUSPNRDataFeed132 getCompanyIdentification() {
        return companyIdentification;
    }

    /** 
     * Set the 'companyIdentification' element value. Airline id.
     * 
     * @param companyIdentification
     */
    public void setCompanyIdentification(
            CompanyIdentification109769CCUSPNRDataFeed132 companyIdentification) {
        this.companyIdentification = companyIdentification;
    }
}
