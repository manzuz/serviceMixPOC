
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code or name to identify a company and any associated companies.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyIdentification_122338_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="marketingCompany"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyIdentification122338CCUSPNRDataFeed132
{
    private String marketingCompany;

    /** 
     * Get the 'marketingCompany' element value. Company identifier
     * 
     * @return value
     */
    public String getMarketingCompany() {
        return marketingCompany;
    }

    /** 
     * Set the 'marketingCompany' element value. Company identifier
     * 
     * @param marketingCompany
     */
    public void setMarketingCompany(String marketingCompany) {
        this.marketingCompany = marketingCompany;
    }
}