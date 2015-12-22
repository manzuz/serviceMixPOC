
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify data specific to a value (flight) coupon.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CouponInformation_76070_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CouponInformation_117827_C_CUS_PNRDataFeed_132" name="couponDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CouponInformation76070SCUSPNRDataFeed132
{
    private CouponInformation117827CCUSPNRDataFeed132 couponDetails;

    /** 
     * Get the 'couponDetails' element value. Contain the data regarding given ticket coupon
     * 
     * @return value
     */
    public CouponInformation117827CCUSPNRDataFeed132 getCouponDetails() {
        return couponDetails;
    }

    /** 
     * Set the 'couponDetails' element value. Contain the data regarding given ticket coupon
     * 
     * @param couponDetails
     */
    public void setCouponDetails(
            CouponInformation117827CCUSPNRDataFeed132 couponDetails) {
        this.couponDetails = couponDetails;
    }
}
