
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FrequentTravellerIdentification_62840_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="company"/>
 *     &lt;xs:element type="xs:string" name="membershipNumber"/>
 *     &lt;xs:element type="xs:string" name="tierLevel" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="priorityCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="tierDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FrequentTravellerIdentification62840CCUSPNRDataFeed132
{
    private String company;
    private String membershipNumber;
    private String tierLevel;
    private String priorityCode;
    private String tierDescription;

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

    /** 
     * Get the 'tierLevel' element value. To specify a Tier linked to the FQTV
     * 
     * @return value
     */
    public String getTierLevel() {
        return tierLevel;
    }

    /** 
     * Set the 'tierLevel' element value. To specify a Tier linked to the FQTV
     * 
     * @param tierLevel
     */
    public void setTierLevel(String tierLevel) {
        this.tierLevel = tierLevel;
    }

    /** 
     * Get the 'priorityCode' element value. To specify the Priority of the FQTV.
     * 
     * @return value
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /** 
     * Set the 'priorityCode' element value. To specify the Priority of the FQTV.
     * 
     * @param priorityCode
     */
    public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    /** 
     * Get the 'tierDescription' element value. Full Text Tier description ex: EMERALD, SAPPHIRE
     * 
     * @return value
     */
    public String getTierDescription() {
        return tierDescription;
    }

    /** 
     * Set the 'tierDescription' element value. Full Text Tier description ex: EMERALD, SAPPHIRE
     * 
     * @param tierDescription
     */
    public void setTierDescription(String tierDescription) {
        this.tierDescription = tierDescription;
    }
}
