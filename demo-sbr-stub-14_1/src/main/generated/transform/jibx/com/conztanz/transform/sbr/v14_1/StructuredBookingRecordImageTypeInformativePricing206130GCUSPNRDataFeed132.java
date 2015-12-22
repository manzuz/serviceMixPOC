
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_informativePricing_206130_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FareInformation_123141_S_CUS_PNRDataFeed_132" name="fareInformation"/>
 *     &lt;xs:element type="PqrData_139963_G_CUS_PNRDataFeed_132" name="productPricingQuotationRecord" minOccurs="0" maxOccurs="999"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeInformativePricing206130GCUSPNRDataFeed132
{
    private FareInformation123141SCUSPNRDataFeed132 fareInformation;
    private List<PqrData139963GCUSPNRDataFeed132> productPricingQuotationRecordList = new ArrayList<PqrData139963GCUSPNRDataFeed132>();

    /** 
     * Get the 'fareInformation' element value. This FAR segment is used as a trigger segment for the group conveying the BFE Informative pricing
     * 
     * @return value
     */
    public FareInformation123141SCUSPNRDataFeed132 getFareInformation() {
        return fareInformation;
    }

    /** 
     * Set the 'fareInformation' element value. This FAR segment is used as a trigger segment for the group conveying the BFE Informative pricing
     * 
     * @param fareInformation
     */
    public void setFareInformation(
            FareInformation123141SCUSPNRDataFeed132 fareInformation) {
        this.fareInformation = fareInformation;
    }

    /** 
     * Get the list of 'productPricingQuotationRecord' element items. To convey the TST (up to 999 TSTs) of the informative pricing
     * 
     * @return list
     */
    public List<PqrData139963GCUSPNRDataFeed132> getProductPricingQuotationRecordList() {
        return productPricingQuotationRecordList;
    }

    /** 
     * Set the list of 'productPricingQuotationRecord' element items. To convey the TST (up to 999 TSTs) of the informative pricing
     * 
     * @param list
     */
    public void setProductPricingQuotationRecordList(
            List<PqrData139963GCUSPNRDataFeed132> list) {
        productPricingQuotationRecordList = list;
    }
}
