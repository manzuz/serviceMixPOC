
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyInformation_94554_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyNumericCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyInformation94554SCUSPNRDataFeed132
{
    private String companyCode;
    private String companyNumericCode;

    /** 
     * Get the 'companyCode' element value. This data element is used to convey the company code of a company  Ex:  AF for Air France MIL for millenium foundation
     * 
     * @return value
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /** 
     * Set the 'companyCode' element value. This data element is used to convey the company code of a company  Ex:  AF for Air France MIL for millenium foundation
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /** 
     * Get the 'companyNumericCode' element value. This data element is used to convey the numeric merchant ID.
     * 
     * @return value
     */
    public String getCompanyNumericCode() {
        return companyNumericCode;
    }

    /** 
     * Set the 'companyNumericCode' element value. This data element is used to convey the numeric merchant ID.
     * 
     * @param companyNumericCode
     */
    public void setCompanyNumericCode(String companyNumericCode) {
        this.companyNumericCode = companyNumericCode;
    }
}
