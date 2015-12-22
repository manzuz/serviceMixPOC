
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyInformation_71102_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyName"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyInformation71102SCUSPNRDataFeed132
{
    private String companyName;

    /** 
     * Get the 'companyName' element value. This data element is used to convey the company name of a company
     * 
     * @return value
     */
    public String getCompanyName() {
        return companyName;
    }

    /** 
     * Set the 'companyName' element value. This data element is used to convey the company name of a company
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
