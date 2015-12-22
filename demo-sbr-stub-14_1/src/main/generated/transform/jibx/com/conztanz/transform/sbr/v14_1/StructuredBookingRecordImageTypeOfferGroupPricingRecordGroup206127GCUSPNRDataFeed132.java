
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_pricingRecordGroup_206127_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PricingTicketingDetails_71674_S_CUS_PNRDataFeed_132" name="pricingRecordData"/>
 *     &lt;xs:element type="MonetaryInformation_92068_S_CUS_PNRDataFeed_132" name="totalPrice" minOccurs="0"/>
 *     &lt;xs:element type="PqrData_139963_G_CUS_PNRDataFeed_132" name="productPricingQuotationRecord" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupPricingRecordGroup206127GCUSPNRDataFeed132
{
    private PricingTicketingDetails71674SCUSPNRDataFeed132 pricingRecordData;
    private MonetaryInformation92068SCUSPNRDataFeed132 totalPrice;
    private List<PqrData139963GCUSPNRDataFeed132> productPricingQuotationRecordList = new ArrayList<PqrData139963GCUSPNRDataFeed132>();

    /** 
     * Get the 'pricingRecordData' element value.
     * 
     * @return value
     */
    public PricingTicketingDetails71674SCUSPNRDataFeed132 getPricingRecordData() {
        return pricingRecordData;
    }

    /** 
     * Set the 'pricingRecordData' element value.
     * 
     * @param pricingRecordData
     */
    public void setPricingRecordData(
            PricingTicketingDetails71674SCUSPNRDataFeed132 pricingRecordData) {
        this.pricingRecordData = pricingRecordData;
    }

    /** 
     * Get the 'totalPrice' element value. Total price of the object.
     * 
     * @return value
     */
    public MonetaryInformation92068SCUSPNRDataFeed132 getTotalPrice() {
        return totalPrice;
    }

    /** 
     * Set the 'totalPrice' element value. Total price of the object.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(
            MonetaryInformation92068SCUSPNRDataFeed132 totalPrice) {
        this.totalPrice = totalPrice;
    }

    /** 
     * Get the list of 'productPricingQuotationRecord' element items. For Offer pricing record
     * 
     * @return list
     */
    public List<PqrData139963GCUSPNRDataFeed132> getProductPricingQuotationRecordList() {
        return productPricingQuotationRecordList;
    }

    /** 
     * Set the list of 'productPricingQuotationRecord' element items. For Offer pricing record
     * 
     * @param list
     */
    public void setProductPricingQuotationRecordList(
            List<PqrData139963GCUSPNRDataFeed132> list) {
        productPricingQuotationRecordList = list;
    }
}
