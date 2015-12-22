
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify main information about the discount.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DiscountInformation_94068_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DiscountInformation_141679_C_CUS_PNRDataFeed_132" name="discountDetails"/>
 *     &lt;xs:element type="DiscountInformation_141679_C_CUS_PNRDataFeed_132" name="otherDiscountDetails" minOccurs="0" maxOccurs="19"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DiscountInformation94068SCUSPNRDataFeed132
{
    private DiscountInformation141679CCUSPNRDataFeed132 discountDetails;
    private List<DiscountInformation141679CCUSPNRDataFeed132> otherDiscountDetailList = new ArrayList<DiscountInformation141679CCUSPNRDataFeed132>();

    /** 
     * Get the 'discountDetails' element value. Contains the mandatory discount code, the discount percentage and the number of passengers taking benefit of the discount or concerned by the "paying for" discount.
     * 
     * @return value
     */
    public DiscountInformation141679CCUSPNRDataFeed132 getDiscountDetails() {
        return discountDetails;
    }

    /** 
     * Set the 'discountDetails' element value. Contains the mandatory discount code, the discount percentage and the number of passengers taking benefit of the discount or concerned by the "paying for" discount.
     * 
     * @param discountDetails
     */
    public void setDiscountDetails(
            DiscountInformation141679CCUSPNRDataFeed132 discountDetails) {
        this.discountDetails = discountDetails;
    }

    /** 
     * Get the list of 'otherDiscountDetails' element items. In case more than one discount code has been used.
     * 
     * @return list
     */
    public List<DiscountInformation141679CCUSPNRDataFeed132> getOtherDiscountDetailList() {
        return otherDiscountDetailList;
    }

    /** 
     * Set the list of 'otherDiscountDetails' element items. In case more than one discount code has been used.
     * 
     * @param list
     */
    public void setOtherDiscountDetailList(
            List<DiscountInformation141679CCUSPNRDataFeed132> list) {
        otherDiscountDetailList = list;
    }
}
