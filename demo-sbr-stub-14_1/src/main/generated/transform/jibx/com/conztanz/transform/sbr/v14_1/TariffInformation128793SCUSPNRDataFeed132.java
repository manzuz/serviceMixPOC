
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_128793_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_187651_C_CUS_PNRDataFeed_132" name="tariffInfo" minOccurs="0"/>
 *     &lt;xs:element type="RateInformation_187652_C_CUS_PNRDataFeed_132" name="rateInformation" minOccurs="0"/>
 *     &lt;xs:element type="AssociatedChargesInformation_187653_C_CUS_PNRDataFeed_132" name="chargeDetails" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation128793SCUSPNRDataFeed132
{
    private TariffInformation187651CCUSPNRDataFeed132 tariffInfo;
    private RateInformation187652CCUSPNRDataFeed132 rateInformation;
    private List<AssociatedChargesInformation187653CCUSPNRDataFeed132> chargeDetailList = new ArrayList<AssociatedChargesInformation187653CCUSPNRDataFeed132>();

    /** 
     * Get the 'tariffInfo' element value. Used to convey all types of Tariff information.
     * 
     * @return value
     */
    public TariffInformation187651CCUSPNRDataFeed132 getTariffInfo() {
        return tariffInfo;
    }

    /** 
     * Set the 'tariffInfo' element value. Used to convey all types of Tariff information.
     * 
     * @param tariffInfo
     */
    public void setTariffInfo(
            TariffInformation187651CCUSPNRDataFeed132 tariffInfo) {
        this.tariffInfo = tariffInfo;
    }

    /** 
     * Get the 'rateInformation' element value. additional Rate information.
     * 
     * @return value
     */
    public RateInformation187652CCUSPNRDataFeed132 getRateInformation() {
        return rateInformation;
    }

    /** 
     * Set the 'rateInformation' element value. additional Rate information.
     * 
     * @param rateInformation
     */
    public void setRateInformation(
            RateInformation187652CCUSPNRDataFeed132 rateInformation) {
        this.rateInformation = rateInformation;
    }

    /** 
     * Get the list of 'chargeDetails' element items. Allows to convey all additional charges information.
     * 
     * @return list
     */
    public List<AssociatedChargesInformation187653CCUSPNRDataFeed132> getChargeDetailList() {
        return chargeDetailList;
    }

    /** 
     * Set the list of 'chargeDetails' element items. Allows to convey all additional charges information.
     * 
     * @param list
     */
    public void setChargeDetailList(
            List<AssociatedChargesInformation187653CCUSPNRDataFeed132> list) {
        chargeDetailList = list;
    }
}
