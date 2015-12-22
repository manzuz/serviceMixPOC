
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_87623_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_132940_C_CUS_PNRDataFeed_132" name="tariffInfo" minOccurs="0"/>
 *     &lt;xs:element type="AssociatedChargesInformation_132942_C_CUS_PNRDataFeed_132" name="chargeDetails" maxOccurs="4"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation87623SCUSPNRDataFeed132
{
    private TariffInformation132940CCUSPNRDataFeed132 tariffInfo;
    private List<AssociatedChargesInformation132942CCUSPNRDataFeed132> chargeDetailList = new ArrayList<AssociatedChargesInformation132942CCUSPNRDataFeed132>();

    /** 
     * Get the 'tariffInfo' element value. tariff conversion indicator associated to the charge
     * 
     * @return value
     */
    public TariffInformation132940CCUSPNRDataFeed132 getTariffInfo() {
        return tariffInfo;
    }

    /** 
     * Set the 'tariffInfo' element value. tariff conversion indicator associated to the charge
     * 
     * @param tariffInfo
     */
    public void setTariffInfo(
            TariffInformation132940CCUSPNRDataFeed132 tariffInfo) {
        this.tariffInfo = tariffInfo;
    }

    /** 
     * Get the list of 'chargeDetails' element items. Tax, Surcharge, Coverage, Coupon details
     * 
     * @return list
     */
    public List<AssociatedChargesInformation132942CCUSPNRDataFeed132> getChargeDetailList() {
        return chargeDetailList;
    }

    /** 
     * Set the list of 'chargeDetails' element items. Tax, Surcharge, Coverage, Coupon details
     * 
     * @param list
     */
    public void setChargeDetailList(
            List<AssociatedChargesInformation132942CCUSPNRDataFeed132> list) {
        chargeDetailList = list;
    }
}
