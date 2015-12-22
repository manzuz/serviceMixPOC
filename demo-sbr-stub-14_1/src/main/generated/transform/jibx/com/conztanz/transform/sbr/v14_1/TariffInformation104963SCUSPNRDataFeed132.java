
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_104963_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_155833_C_CUS_PNRDataFeed_132" name="tariffInfo" minOccurs="0"/>
 *     &lt;xs:element type="RateInformation_155834_C_CUS_PNRDataFeed_132" name="rateInformation" minOccurs="0"/>
 *     &lt;xs:element type="AssociatedChargesInformation_155835_C_CUS_PNRDataFeed_132" name="chargeDetails" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation104963SCUSPNRDataFeed132
{
    private TariffInformation155833CCUSPNRDataFeed132 tariffInfo;
    private RateInformation155834CCUSPNRDataFeed132 rateInformation;
    private List<AssociatedChargesInformation155835CCUSPNRDataFeed132> chargeDetailList = new ArrayList<AssociatedChargesInformation155835CCUSPNRDataFeed132>();

    /** 
     * Get the 'tariffInfo' element value. In case of Leisure Fee
     * 
     * @return value
     */
    public TariffInformation155833CCUSPNRDataFeed132 getTariffInfo() {
        return tariffInfo;
    }

    /** 
     * Set the 'tariffInfo' element value. In case of Leisure Fee
     * 
     * @param tariffInfo
     */
    public void setTariffInfo(
            TariffInformation155833CCUSPNRDataFeed132 tariffInfo) {
        this.tariffInfo = tariffInfo;
    }

    /** 
     * Get the 'rateInformation' element value. Original channel code in case of IT Fees
     * 
     * @return value
     */
    public RateInformation155834CCUSPNRDataFeed132 getRateInformation() {
        return rateInformation;
    }

    /** 
     * Set the 'rateInformation' element value. Original channel code in case of IT Fees
     * 
     * @param rateInformation
     */
    public void setRateInformation(
            RateInformation155834CCUSPNRDataFeed132 rateInformation) {
        this.rateInformation = rateInformation;
    }

    /** 
     * Get the list of 'chargeDetails' element items. We can have several Fee type at the same type.
     * 
     * @return list
     */
    public List<AssociatedChargesInformation155835CCUSPNRDataFeed132> getChargeDetailList() {
        return chargeDetailList;
    }

    /** 
     * Set the list of 'chargeDetails' element items. We can have several Fee type at the same type.
     * 
     * @param list
     */
    public void setChargeDetailList(
            List<AssociatedChargesInformation155835CCUSPNRDataFeed132> list) {
        chargeDetailList = list;
    }
}
