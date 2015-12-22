
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the coupon number, status, value, and other related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CouponInformation_121376_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="cpnNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CouponInformation121376CCUSPNRDataFeed132
{
    private String cpnNumber;

    /** 
     * Get the 'cpnNumber' element value. Coupon number
     * 
     * @return value
     */
    public String getCpnNumber() {
        return cpnNumber;
    }

    /** 
     * Set the 'cpnNumber' element value. Coupon number
     * 
     * @param cpnNumber
     */
    public void setCpnNumber(String cpnNumber) {
        this.cpnNumber = cpnNumber;
    }
}
