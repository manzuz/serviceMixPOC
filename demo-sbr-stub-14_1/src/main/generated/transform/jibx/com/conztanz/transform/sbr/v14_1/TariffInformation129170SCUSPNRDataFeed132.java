
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify tariff details relating to a service or product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_129170_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TariffInformation_188214_C_CUS_PNRDataFeed_132" name="tariffInfo" minOccurs="0"/>
 *     &lt;xs:element type="RateInformation_188215_C_CUS_PNRDataFeed_132" name="rateInformation" minOccurs="0"/>
 *     &lt;xs:element type="AssociatedChargesInformation_188216_C_CUS_PNRDataFeed_132" name="chargeDetails" minOccurs="0" maxOccurs="30"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation129170SCUSPNRDataFeed132
{
    private TariffInformation188214CCUSPNRDataFeed132 tariffInfo;
    private RateInformation188215CCUSPNRDataFeed132 rateInformation;
    private List<AssociatedChargesInformation188216CCUSPNRDataFeed132> chargeDetailList = new ArrayList<AssociatedChargesInformation188216CCUSPNRDataFeed132>();

    /** 
     * Get the 'tariffInfo' element value. This composite is used to convey the tariff information
     * 
     * @return value
     */
    public TariffInformation188214CCUSPNRDataFeed132 getTariffInfo() {
        return tariffInfo;
    }

    /** 
     * Set the 'tariffInfo' element value. This composite is used to convey the tariff information
     * 
     * @param tariffInfo
     */
    public void setTariffInfo(
            TariffInformation188214CCUSPNRDataFeed132 tariffInfo) {
        this.tariffInfo = tariffInfo;
    }

    /** 
     * Get the 'rateInformation' element value. Additional rate type information
     * 
     * @return value
     */
    public RateInformation188215CCUSPNRDataFeed132 getRateInformation() {
        return rateInformation;
    }

    /** 
     * Set the 'rateInformation' element value. Additional rate type information
     * 
     * @param rateInformation
     */
    public void setRateInformation(
            RateInformation188215CCUSPNRDataFeed132 rateInformation) {
        this.rateInformation = rateInformation;
    }

    /** 
     * Get the list of 'chargeDetails' element items. This composite is used to convey all the extra charge information.
     * 
     * @return list
     */
    public List<AssociatedChargesInformation188216CCUSPNRDataFeed132> getChargeDetailList() {
        return chargeDetailList;
    }

    /** 
     * Set the list of 'chargeDetails' element items. This composite is used to convey all the extra charge information.
     * 
     * @param list
     */
    public void setChargeDetailList(
            List<AssociatedChargesInformation188216CCUSPNRDataFeed132> list) {
        chargeDetailList = list;
    }
}
