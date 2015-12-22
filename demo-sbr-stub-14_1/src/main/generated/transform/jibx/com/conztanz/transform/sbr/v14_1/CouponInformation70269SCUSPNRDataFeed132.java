
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify data specific to a value (flight) coupon.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CouponInformation_70269_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CouponInformation_109514_C_CUS_PNRDataFeed_132" name="couponDetails"/>
 *     &lt;xs:element type="CouponInformation_109514_C_CUS_PNRDataFeed_132" name="otherCouponDetails" minOccurs="0" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CouponInformation70269SCUSPNRDataFeed132
{
    private CouponInformation109514CCUSPNRDataFeed132 couponDetails;
    private List<CouponInformation109514CCUSPNRDataFeed132> otherCouponDetailList = new ArrayList<CouponInformation109514CCUSPNRDataFeed132>();

    /** 
     * Get the 'couponDetails' element value. Conveys coupon details
     * 
     * @return value
     */
    public CouponInformation109514CCUSPNRDataFeed132 getCouponDetails() {
        return couponDetails;
    }

    /** 
     * Set the 'couponDetails' element value. Conveys coupon details
     * 
     * @param couponDetails
     */
    public void setCouponDetails(
            CouponInformation109514CCUSPNRDataFeed132 couponDetails) {
        this.couponDetails = couponDetails;
    }

    /** 
     * Get the list of 'otherCouponDetails' element items.
     * 
     * @return list
     */
    public List<CouponInformation109514CCUSPNRDataFeed132> getOtherCouponDetailList() {
        return otherCouponDetailList;
    }

    /** 
     * Set the list of 'otherCouponDetails' element items.
     * 
     * @param list
     */
    public void setOtherCouponDetailList(
            List<CouponInformation109514CCUSPNRDataFeed132> list) {
        otherCouponDetailList = list;
    }
}
