
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * This segment is used to convey the company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyInformation_19450_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyCode"/>
 *     &lt;xs:element type="xs:decimal" name="companyNumericCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyInformation19450SCUSPNRDataFeed132
{
    private String companyCode;
    private BigDecimal companyNumericCode;

    /** 
     * Get the 'companyCode' element value. This data element is used to convey the company code
     * 
     * @return value
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /** 
     * Set the 'companyCode' element value. This data element is used to convey the company code
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /** 
     * Get the 'companyNumericCode' element value. This data element is used to convey the UIC code
     * 
     * @return value
     */
    public BigDecimal getCompanyNumericCode() {
        return companyNumericCode;
    }

    /** 
     * Set the 'companyNumericCode' element value. This data element is used to convey the UIC code
     * 
     * @param companyNumericCode
     */
    public void setCompanyNumericCode(BigDecimal companyNumericCode) {
        this.companyNumericCode = companyNumericCode;
    }
}
