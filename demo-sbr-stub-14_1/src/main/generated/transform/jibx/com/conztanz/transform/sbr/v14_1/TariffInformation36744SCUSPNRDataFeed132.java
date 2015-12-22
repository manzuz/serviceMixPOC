
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_36744_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_62863_C_CUS_PNRDataFeed_132" name="tariffInfo"/>
 *     &lt;xs:element type="RateInformation_62864_C_CUS_PNRDataFeed_132" name="rateInformation" minOccurs="0"/>
 *     &lt;xs:element type="AssociatedChargesInformation_62865_C_CUS_PNRDataFeed_132" name="chargeDetails" minOccurs="0" maxOccurs="30"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation36744SCUSPNRDataFeed132
{
    private TariffInformation62863CCUSPNRDataFeed132 tariffInfo;
    private RateInformation62864CCUSPNRDataFeed132 rateInformation;
    private List<AssociatedChargesInformation62865CCUSPNRDataFeed132> chargeDetailList = new ArrayList<AssociatedChargesInformation62865CCUSPNRDataFeed132>();

    /** 
     * Get the 'tariffInfo' element value. This composite is used to convey the tariff information
     * 
     * @return value
     */
    public TariffInformation62863CCUSPNRDataFeed132 getTariffInfo() {
        return tariffInfo;
    }

    /** 
     * Set the 'tariffInfo' element value. This composite is used to convey the tariff information
     * 
     * @param tariffInfo
     */
    public void setTariffInfo(
            TariffInformation62863CCUSPNRDataFeed132 tariffInfo) {
        this.tariffInfo = tariffInfo;
    }

    /** 
     * Get the 'rateInformation' element value. Additional rate type information
     * 
     * @return value
     */
    public RateInformation62864CCUSPNRDataFeed132 getRateInformation() {
        return rateInformation;
    }

    /** 
     * Set the 'rateInformation' element value. Additional rate type information
     * 
     * @param rateInformation
     */
    public void setRateInformation(
            RateInformation62864CCUSPNRDataFeed132 rateInformation) {
        this.rateInformation = rateInformation;
    }

    /** 
     * Get the list of 'chargeDetails' element items. This composite is used to convey all the extra charge information.
     * 
     * @return list
     */
    public List<AssociatedChargesInformation62865CCUSPNRDataFeed132> getChargeDetailList() {
        return chargeDetailList;
    }

    /** 
     * Set the list of 'chargeDetails' element items. This composite is used to convey all the extra charge information.
     * 
     * @param list
     */
    public void setChargeDetailList(
            List<AssociatedChargesInformation62865CCUSPNRDataFeed132> list) {
        chargeDetailList = list;
    }
}
