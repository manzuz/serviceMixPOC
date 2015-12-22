
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_pricingRecordGroup_206129_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PricingTicketingDetails_71674_S_CUS_PNRDataFeed_132" name="pricingRecordData"/>
 *     &lt;xs:element type="MonetaryInformation_92068_S_CUS_PNRDataFeed_132" name="totalPrice" minOccurs="0"/>
 *     &lt;xs:element type="Pasbcq1a044Group43_90293_G_CUS_PNRDataFeed_132" name="miscellaneousDocDetails" minOccurs="0" maxOccurs="127"/>
 *     &lt;xs:element type="PqrData_139963_G_CUS_PNRDataFeed_132" name="productPricingQuotationRecord" minOccurs="0" maxOccurs="1998"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypePricingRecordGroup206129GCUSPNRDataFeed132
{
    private PricingTicketingDetails71674SCUSPNRDataFeed132 pricingRecordData;
    private MonetaryInformation92068SCUSPNRDataFeed132 totalPrice;
    private List<Pasbcq1a044Group4390293GCUSPNRDataFeed132> miscellaneousDocDetailList = new ArrayList<Pasbcq1a044Group4390293GCUSPNRDataFeed132>();
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
     * Get the list of 'miscellaneousDocDetails' element items. The purpose of this group is to convey the Misc Documents elements.
     * 
     * @return list
     */
    public List<Pasbcq1a044Group4390293GCUSPNRDataFeed132> getMiscellaneousDocDetailList() {
        return miscellaneousDocDetailList;
    }

    /** 
     * Set the list of 'miscellaneousDocDetails' element items. The purpose of this group is to convey the Misc Documents elements.
     * 
     * @param list
     */
    public void setMiscellaneousDocDetailList(
            List<Pasbcq1a044Group4390293GCUSPNRDataFeed132> list) {
        miscellaneousDocDetailList = list;
    }

    /** 
     * Get the list of 'productPricingQuotationRecord' element items. Handles the new Pricing records Repetition = 1998 (999 TSTs, 999 TSMs) Conveys TST tattoo number, increased Fare Calc Remark
     * 
     * @return list
     */
    public List<PqrData139963GCUSPNRDataFeed132> getProductPricingQuotationRecordList() {
        return productPricingQuotationRecordList;
    }

    /** 
     * Set the list of 'productPricingQuotationRecord' element items. Handles the new Pricing records Repetition = 1998 (999 TSTs, 999 TSMs) Conveys TST tattoo number, increased Fare Calc Remark
     * 
     * @param list
     */
    public void setProductPricingQuotationRecordList(
            List<PqrData139963GCUSPNRDataFeed132> list) {
        productPricingQuotationRecordList = list;
    }
}
