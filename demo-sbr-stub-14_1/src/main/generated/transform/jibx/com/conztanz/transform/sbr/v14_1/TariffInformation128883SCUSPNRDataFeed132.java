
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_128883_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_187784_C_CUS_PNRDataFeed_132" name="tariffInfo" minOccurs="0"/>
 *     &lt;xs:element type="AssociatedChargesInformation_187786_C_CUS_PNRDataFeed_132" name="chargeDetails" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation128883SCUSPNRDataFeed132
{
    private TariffInformation187784CCUSPNRDataFeed132 tariffInfo;
    private List<AssociatedChargesInformation187786CCUSPNRDataFeed132> chargeDetailList = new ArrayList<AssociatedChargesInformation187786CCUSPNRDataFeed132>();

    /** 
     * Get the 'tariffInfo' element value. tariff conversion indicator associated to the charge
     * 
     * @return value
     */
    public TariffInformation187784CCUSPNRDataFeed132 getTariffInfo() {
        return tariffInfo;
    }

    /** 
     * Set the 'tariffInfo' element value. tariff conversion indicator associated to the charge
     * 
     * @param tariffInfo
     */
    public void setTariffInfo(
            TariffInformation187784CCUSPNRDataFeed132 tariffInfo) {
        this.tariffInfo = tariffInfo;
    }

    /** 
     * Get the list of 'chargeDetails' element items. Tax, Surcharge, Coverage, Coupon details  Repetition are used to carry: - General Info (estimated + name...) - Tariff per day / Max - Tariff per weekend / Max - Tariff per week / Max - Tariff per month / Max - Tariff per rental / Max - Excess amount - Liability amount
     * 
     * @return list
     */
    public List<AssociatedChargesInformation187786CCUSPNRDataFeed132> getChargeDetailList() {
        return chargeDetailList;
    }

    /** 
     * Set the list of 'chargeDetails' element items. Tax, Surcharge, Coverage, Coupon details  Repetition are used to carry: - General Info (estimated + name...) - Tariff per day / Max - Tariff per weekend / Max - Tariff per week / Max - Tariff per month / Max - Tariff per rental / Max - Excess amount - Liability amount
     * 
     * @param list
     */
    public void setChargeDetailList(
            List<AssociatedChargesInformation187786CCUSPNRDataFeed132> list) {
        chargeDetailList = list;
    }
}
