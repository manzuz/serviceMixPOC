
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_22057_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_39533_C_CUS_PNRDataFeed_132" name="tariffInfo" minOccurs="0"/>
 *     &lt;xs:element type="AssociatedChargesInformation_39535_C_CUS_PNRDataFeed_132" name="chargeDetails" minOccurs="0" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation22057SCUSPNRDataFeed132
{
    private TariffInformation39533CCUSPNRDataFeed132 tariffInfo;
    private List<AssociatedChargesInformation39535CCUSPNRDataFeed132> chargeDetailList = new ArrayList<AssociatedChargesInformation39535CCUSPNRDataFeed132>();

    /** 
     * Get the 'tariffInfo' element value. total price and net premium
     * 
     * @return value
     */
    public TariffInformation39533CCUSPNRDataFeed132 getTariffInfo() {
        return tariffInfo;
    }

    /** 
     * Set the 'tariffInfo' element value. total price and net premium
     * 
     * @param tariffInfo
     */
    public void setTariffInfo(
            TariffInformation39533CCUSPNRDataFeed132 tariffInfo) {
        this.tariffInfo = tariffInfo;
    }

    /** 
     * Get the list of 'chargeDetails' element items. to specify the taxes and their values and converted values into other currencies if specified.
     * 
     * @return list
     */
    public List<AssociatedChargesInformation39535CCUSPNRDataFeed132> getChargeDetailList() {
        return chargeDetailList;
    }

    /** 
     * Set the list of 'chargeDetails' element items. to specify the taxes and their values and converted values into other currencies if specified.
     * 
     * @param list
     */
    public void setChargeDetailList(
            List<AssociatedChargesInformation39535CCUSPNRDataFeed132> list) {
        chargeDetailList = list;
    }
}
