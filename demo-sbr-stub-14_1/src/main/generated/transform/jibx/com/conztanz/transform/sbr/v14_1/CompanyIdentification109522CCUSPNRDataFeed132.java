
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code or name to identify a company and any associated companies.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyIdentification_109522_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="otherCompany"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyIdentification109522CCUSPNRDataFeed132
{
    private String otherCompany;

    /** 
     * Get the 'otherCompany' element value. Provides Carrier Code of the ticket
     * 
     * @return value
     */
    public String getOtherCompany() {
        return otherCompany;
    }

    /** 
     * Set the 'otherCompany' element value. Provides Carrier Code of the ticket
     * 
     * @param otherCompany
     */
    public void setOtherCompany(String otherCompany) {
        this.otherCompany = otherCompany;
    }
}
