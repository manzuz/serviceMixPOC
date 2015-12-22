
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details related to availability status or cabin configuration for a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductInformation_129123_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDetails_188147_C_CUS_PNRDataFeed_132" name="bookingClassDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductInformation129123SCUSPNRDataFeed132
{
    private ProductDetails188147CCUSPNRDataFeed132 bookingClassDetails;

    /** 
     * Get the 'bookingClassDetails' element value. Conveys the package details.
     * 
     * @return value
     */
    public ProductDetails188147CCUSPNRDataFeed132 getBookingClassDetails() {
        return bookingClassDetails;
    }

    /** 
     * Set the 'bookingClassDetails' element value. Conveys the package details.
     * 
     * @param bookingClassDetails
     */
    public void setBookingClassDetails(
            ProductDetails188147CCUSPNRDataFeed132 bookingClassDetails) {
        this.bookingClassDetails = bookingClassDetails;
    }
}
