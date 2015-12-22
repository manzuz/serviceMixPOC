
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyInformation_83028_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="travelSector"/>
 *     &lt;xs:element type="xs:string" name="companyCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyInformation83028SCUSPNRDataFeed132
{
    private String travelSector;
    private String companyCode;

    /** 
     * Get the 'travelSector' element value. This data element is used to qualify the company code, to identify the industry business it belongs.
     * 
     * @return value
     */
    public String getTravelSector() {
        return travelSector;
    }

    /** 
     * Set the 'travelSector' element value. This data element is used to qualify the company code, to identify the industry business it belongs.
     * 
     * @param travelSector
     */
    public void setTravelSector(String travelSector) {
        this.travelSector = travelSector;
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
