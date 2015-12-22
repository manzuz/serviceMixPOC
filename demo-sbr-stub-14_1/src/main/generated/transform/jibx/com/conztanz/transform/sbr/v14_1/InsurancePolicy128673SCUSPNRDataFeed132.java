
package com.conztanz.transform.sbr.v14_1;

/** 
 * Insurance Policy Details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InsurancePolicy_128673_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="fareDiscount" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InsurancePolicy128673SCUSPNRDataFeed132
{
    private String fareDiscount;

    /** 
     * Get the 'fareDiscount' element value. to specify a discount for the insuree like if it's a family etc..
     * 
     * @return value
     */
    public String getFareDiscount() {
        return fareDiscount;
    }

    /** 
     * Set the 'fareDiscount' element value. to specify a discount for the insuree like if it's a family etc..
     * 
     * @param fareDiscount
     */
    public void setFareDiscount(String fareDiscount) {
        this.fareDiscount = fareDiscount;
    }
}
