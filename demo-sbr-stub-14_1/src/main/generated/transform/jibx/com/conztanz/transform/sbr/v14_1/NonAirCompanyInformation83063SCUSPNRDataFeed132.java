
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the non-air company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NonAirCompanyInformation_83063_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="travelSector"/>
 *     &lt;xs:element type="xs:string" name="companyCodeContext"/>
 *     &lt;xs:element type="xs:string" name="companyCode"/>
 *     &lt;xs:element type="xs:string" name="companyName"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NonAirCompanyInformation83063SCUSPNRDataFeed132
{
    private String travelSector;
    private String companyCodeContext;
    private String companyCode;
    private String companyName;

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
     * Get the 'companyCode' element value. This data element is used to convey the company code of a non-air company
     * 
     * @return value
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /** 
     * Set the 'companyCode' element value. This data element is used to convey the company code of a non-air company
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /** 
     * Get the 'companyName' element value. This data element is used to convey the company name of a non-air company
     * 
     * @return value
     */
    public String getCompanyName() {
        return companyName;
    }

    /** 
     * Set the 'companyName' element value. This data element is used to convey the company name of a non-air company
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
