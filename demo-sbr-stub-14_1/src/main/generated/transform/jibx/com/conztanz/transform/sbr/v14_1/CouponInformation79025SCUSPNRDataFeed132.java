
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify data specific to a value (flight) coupon.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CouponInformation_79025_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CouponInformation_121376_C_CUS_PNRDataFeed_132" name="couponDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CouponInformation79025SCUSPNRDataFeed132
{
    private CouponInformation121376CCUSPNRDataFeed132 couponDetails;

    /** 
     * Get the 'couponDetails' element value. Coupon details
     * 
     * @return value
     */
    public CouponInformation121376CCUSPNRDataFeed132 getCouponDetails() {
        return couponDetails;
    }

    /** 
     * Set the 'couponDetails' element value. Coupon details
     * 
     * @param couponDetails
     */
    public void setCouponDetails(
            CouponInformation121376CCUSPNRDataFeed132 couponDetails) {
        this.couponDetails = couponDetails;
    }
}
