
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey additional information related to a ticket
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingOrTicketingSubsequent_169135_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="specialCondition" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="otherSpecialCondition" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricingOrTicketingSubsequent169135SCUSPNRDataFeed132
{
    private String specialCondition;
    private String otherSpecialCondition;

    /** 
     * Get the 'specialCondition' element value. Reason for issuance code.
     * 
     * @return value
     */
    public String getSpecialCondition() {
        return specialCondition;
    }

    /** 
     * Set the 'specialCondition' element value. Reason for issuance code.
     * 
     * @param specialCondition
     */
    public void setSpecialCondition(String specialCondition) {
        this.specialCondition = specialCondition;
    }

    /** 
     * Get the 'otherSpecialCondition' element value. Reason for Issuance Sub code
     * 
     * @return value
     */
    public String getOtherSpecialCondition() {
        return otherSpecialCondition;
    }

    /** 
     * Set the 'otherSpecialCondition' element value. Reason for Issuance Sub code
     * 
     * @param otherSpecialCondition
     */
    public void setOtherSpecialCondition(String otherSpecialCondition) {
        this.otherSpecialCondition = otherSpecialCondition;
    }
}
