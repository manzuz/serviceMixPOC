
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FrequentTravellerIdentification_132909_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="company"/>
 *     &lt;xs:element type="xs:string" name="membershipNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FrequentTravellerIdentification132909CCUSPNRDataFeed132
{
    private String company;
    private String membershipNumber;

    /** 
     * Get the 'company' element value. Carrier where the FQTV is registered.
     * 
     * @return value
     */
    public String getCompany() {
        return company;
    }

    /** 
     * Set the 'company' element value. Carrier where the FQTV is registered.
     * 
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /** 
     * Get the 'membershipNumber' element value. Frequent Traveller Reference Number
     * 
     * @return value
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /** 
     * Set the 'membershipNumber' element value. Frequent Traveller Reference Number
     * 
     * @param membershipNumber
     */
    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }
}
