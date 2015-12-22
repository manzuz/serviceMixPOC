
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyInformation_76096_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyCodeContext" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyInformation76096SCUSPNRDataFeed132
{
    private String companyCodeContext;
    private String companyCode;

    /** 
     * Get the 'companyCodeContext' element value. This data element is used to convey the context in which the code applies
     * 
     * @return value
     */
    public String getCompanyCodeContext() {
        return companyCodeContext;
    }

    /** 
     * Set the 'companyCodeContext' element value. This data element is used to convey the context in which the code applies
     * 
     * @param companyCodeContext
     */
    public void setCompanyCodeContext(String companyCodeContext) {
        this.companyCodeContext = companyCodeContext;
    }

    /** 
     * Get the 'companyCode' element value. This data element is used to convey the company code of a company
     * 
     * @return value
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /** 
     * Set the 'companyCode' element value. This data element is used to convey the company code of a company
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
