
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_taxCovSurchargeGroup_106547_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_87620_S_CUS_PNRDataFeed_132" name="taxSurchargeCoverageInfo"/>
 *     &lt;xs:element type="FreeTextInformation_87612_S_CUS_PNRDataFeed_132" name="additionalInfo" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_offerGroup_surchargePeriods_106548_G_CUS_PNRDataFeed_1323" name="surchargePeriods" minOccurs="0" maxOccurs="10"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupTaxCovSurchargeGroup106547GCUSPNRDataFeed1323
{
    private TariffInformation87620SCUSPNRDataFeed132 taxSurchargeCoverageInfo;
    private FreeTextInformation87612SCUSPNRDataFeed132 additionalInfo;
    private List<StructuredBookingRecordImageTypeOfferGroupSurchargePeriods106548GCUSPNRDataFeed1323> surchargePeriodList = new ArrayList<StructuredBookingRecordImageTypeOfferGroupSurchargePeriods106548GCUSPNRDataFeed1323>();

    /** 
     * Get the 'taxSurchargeCoverageInfo' element value. This segment is used to convey Tax, Coverage, Coupon, Surcharge or Delivery and collection information  (If period associated to the surcharge, tariff and period definition conveyed in group 6)
     * 
     * @return value
     */
    public TariffInformation87620SCUSPNRDataFeed132 getTaxSurchargeCoverageInfo() {
        return taxSurchargeCoverageInfo;
    }

    /** 
     * Set the 'taxSurchargeCoverageInfo' element value. This segment is used to convey Tax, Coverage, Coupon, Surcharge or Delivery and collection information  (If period associated to the surcharge, tariff and period definition conveyed in group 6)
     * 
     * @param taxSurchargeCoverageInfo
     */
    public void setTaxSurchargeCoverageInfo(
            TariffInformation87620SCUSPNRDataFeed132 taxSurchargeCoverageInfo) {
        this.taxSurchargeCoverageInfo = taxSurchargeCoverageInfo;
    }

    /** 
     * Get the 'additionalInfo' element value. Additional information for Tax, Surcharge or Coverage section
     * 
     * @return value
     */
    public FreeTextInformation87612SCUSPNRDataFeed132 getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'additionalInfo' element value. Additional information for Tax, Surcharge or Coverage section
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(
            FreeTextInformation87612SCUSPNRDataFeed132 additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the list of 'surchargePeriods' element items. The new Surcharge/Coverage format allows up to 5 periods items for Surcharges and up to 10 periods items for Coverages.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOfferGroupSurchargePeriods106548GCUSPNRDataFeed1323> getSurchargePeriodList() {
        return surchargePeriodList;
    }

    /** 
     * Set the list of 'surchargePeriods' element items. The new Surcharge/Coverage format allows up to 5 periods items for Surcharges and up to 10 periods items for Coverages.
     * 
     * @param list
     */
    public void setSurchargePeriodList(
            List<StructuredBookingRecordImageTypeOfferGroupSurchargePeriods106548GCUSPNRDataFeed1323> list) {
        surchargePeriodList = list;
    }
}
