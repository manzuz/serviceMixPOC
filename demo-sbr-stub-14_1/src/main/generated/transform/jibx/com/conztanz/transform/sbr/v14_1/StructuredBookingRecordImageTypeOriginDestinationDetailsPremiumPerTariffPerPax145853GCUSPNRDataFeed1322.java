
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_premiumPerTariffPerPax_145853_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceProductDetails_128684_S_CUS_PNRDataFeed_132" name="tariffCodeInfo"/>
 *     &lt;xs:element type="MonetaryInformation_128661_S_CUS_PNRDataFeed_132" name="tariffCodePerPaxAmount" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsPremiumPerTariffPerPax145853GCUSPNRDataFeed1322
{
    private InsuranceProductDetails128684SCUSPNRDataFeed132 tariffCodeInfo;
    private MonetaryInformation128661SCUSPNRDataFeed132 tariffCodePerPaxAmount;

    /** 
     * Get the 'tariffCodeInfo' element value. To convey the tariffcode information per passenger.
     * 
     * @return value
     */
    public InsuranceProductDetails128684SCUSPNRDataFeed132 getTariffCodeInfo() {
        return tariffCodeInfo;
    }

    /** 
     * Set the 'tariffCodeInfo' element value. To convey the tariffcode information per passenger.
     * 
     * @param tariffCodeInfo
     */
    public void setTariffCodeInfo(
            InsuranceProductDetails128684SCUSPNRDataFeed132 tariffCodeInfo) {
        this.tariffCodeInfo = tariffCodeInfo;
    }

    /** 
     * Get the 'tariffCodePerPaxAmount' element value. to specify the amount/currency  per passenger and tariff code.
     * 
     * @return value
     */
    public MonetaryInformation128661SCUSPNRDataFeed132 getTariffCodePerPaxAmount() {
        return tariffCodePerPaxAmount;
    }

    /** 
     * Set the 'tariffCodePerPaxAmount' element value. to specify the amount/currency  per passenger and tariff code.
     * 
     * @param tariffCodePerPaxAmount
     */
    public void setTariffCodePerPaxAmount(
            MonetaryInformation128661SCUSPNRDataFeed132 tariffCodePerPaxAmount) {
        this.tariffCodePerPaxAmount = tariffCodePerPaxAmount;
    }
}
