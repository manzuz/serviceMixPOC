
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify transport service(s) or to specify transport service(s) which is/are to be updated or cancelled.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransportIdentifier_78651_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompanyIdentification_120899_C_CUS_PNRDataFeed_132" name="companyIdentification"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransportIdentifier78651SCUSPNRDataFeed132
{
    private CompanyIdentification120899CCUSPNRDataFeed132 companyIdentification;

    /** 
     * Get the 'companyIdentification' element value. airline code
     * 
     * @return value
     */
    public CompanyIdentification120899CCUSPNRDataFeed132 getCompanyIdentification() {
        return companyIdentification;
    }

    /** 
     * Set the 'companyIdentification' element value. airline code
     * 
     * @param companyIdentification
     */
    public void setCompanyIdentification(
            CompanyIdentification120899CCUSPNRDataFeed132 companyIdentification) {
        this.companyIdentification = companyIdentification;
    }
}
