
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify details related to availability status or cabin configuration for a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductInformation_76271_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDetails_118108_C_CUS_PNRDataFeed_132" name="bookingClassDetails" minOccurs="0" maxOccurs="26"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductInformation76271SCUSPNRDataFeed132
{
    private List<ProductDetails118108CCUSPNRDataFeed132> bookingClassDetailList = new ArrayList<ProductDetails118108CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'bookingClassDetails' element items. Booking Class Details
     * 
     * @return list
     */
    public List<ProductDetails118108CCUSPNRDataFeed132> getBookingClassDetailList() {
        return bookingClassDetailList;
    }

    /** 
     * Set the list of 'bookingClassDetails' element items. Booking Class Details
     * 
     * @param list
     */
    public void setBookingClassDetailList(
            List<ProductDetails118108CCUSPNRDataFeed132> list) {
        bookingClassDetailList = list;
    }
}
