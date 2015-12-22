
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code or name to identify a company and any associated companies.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyIdentification_191420_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="marketingCompany" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="operatingCompany" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyIdentification191420CCUSPNRDataFeed132
{
    private String marketingCompany;
    private String operatingCompany;

    /** 
     * Get the 'marketingCompany' element value.
     * 
     * @return value
     */
    public String getMarketingCompany() {
        return marketingCompany;
    }

    /** 
     * Set the 'marketingCompany' element value.
     * 
     * @param marketingCompany
     */
    public void setMarketingCompany(String marketingCompany) {
        this.marketingCompany = marketingCompany;
    }

    /** 
     * Get the 'operatingCompany' element value.
     * 
     * @return value
     */
    public String getOperatingCompany() {
        return operatingCompany;
    }

    /** 
     * Set the 'operatingCompany' element value.
     * 
     * @param operatingCompany
     */
    public void setOperatingCompany(String operatingCompany) {
        this.operatingCompany = operatingCompany;
    }
}
