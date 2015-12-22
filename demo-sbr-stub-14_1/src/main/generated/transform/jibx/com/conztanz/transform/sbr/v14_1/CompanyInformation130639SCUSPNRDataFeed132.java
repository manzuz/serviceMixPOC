
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to convey the company information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyInformation_130639_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyLongName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="profileReference" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyInformation130639SCUSPNRDataFeed132
{
    private String companyCode;
    private String companyName;
    private String companyLongName;
    private String profileReference;

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

    /** 
     * Get the 'companyLongName' element value. This data element is used to convey the long company code of a company
     * 
     * @return value
     */
    public String getCompanyLongName() {
        return companyLongName;
    }

    /** 
     * Set the 'companyLongName' element value. This data element is used to convey the long company code of a company
     * 
     * @param companyLongName
     */
    public void setCompanyLongName(String companyLongName) {
        this.companyLongName = companyLongName;
    }

    /** 
     * Get the 'profileReference' element value. This data element is used to convey the numeric company code
     * 
     * @return value
     */
    public String getProfileReference() {
        return profileReference;
    }

    /** 
     * Set the 'profileReference' element value. This data element is used to convey the numeric company code
     * 
     * @param profileReference
     */
    public void setProfileReference(String profileReference) {
        this.profileReference = profileReference;
    }
}
