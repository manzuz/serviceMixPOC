
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyInformation_79020_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyInformation79020SCUSPNRDataFeed132
{
    private String companyCode;

    /** 
     * Get the 'companyCode' element value. Fee Owner
     * 
     * @return value
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /** 
     * Set the 'companyCode' element value. Fee Owner
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
