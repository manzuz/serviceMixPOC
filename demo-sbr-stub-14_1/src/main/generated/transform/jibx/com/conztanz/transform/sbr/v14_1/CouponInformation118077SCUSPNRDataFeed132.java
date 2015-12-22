
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify data specific to a value (flight) coupon.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CouponInformation_118077_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CouponInformation_173488_C_CUS_PNRDataFeed_132" name="couponDetails" minOccurs="0"/>
 *     &lt;xs:element type="CouponInformation_173488_C_CUS_PNRDataFeed_132" name="otherCouponDetails" minOccurs="0" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CouponInformation118077SCUSPNRDataFeed132
{
    private CouponInformation173488CCUSPNRDataFeed132 couponDetails;
    private List<CouponInformation173488CCUSPNRDataFeed132> otherCouponDetailList = new ArrayList<CouponInformation173488CCUSPNRDataFeed132>();

    /** 
     * Get the 'couponDetails' element value.
     * 
     * @return value
     */
    public CouponInformation173488CCUSPNRDataFeed132 getCouponDetails() {
        return couponDetails;
    }

    /** 
     * Set the 'couponDetails' element value.
     * 
     * @param couponDetails
     */
    public void setCouponDetails(
            CouponInformation173488CCUSPNRDataFeed132 couponDetails) {
        this.couponDetails = couponDetails;
    }

    /** 
     * Get the list of 'otherCouponDetails' element items.
     * 
     * @return list
     */
    public List<CouponInformation173488CCUSPNRDataFeed132> getOtherCouponDetailList() {
        return otherCouponDetailList;
    }

    /** 
     * Set the list of 'otherCouponDetails' element items.
     * 
     * @param list
     */
    public void setOtherCouponDetailList(
            List<CouponInformation173488CCUSPNRDataFeed132> list) {
        otherCouponDetailList = list;
    }
}
