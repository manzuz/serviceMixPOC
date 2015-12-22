
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Pasbcq1a044Group43_svcDetails_90295_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ServiceChargeInformation_70496_S_CUS_PNRDataFeed_132" name="svcType"/>
 *     &lt;xs:element type="SpecificTravellerDetails_70493_S_CUS_PNRDataFeed_132" name="passengers" minOccurs="0" maxOccurs="60"/>
 *     &lt;xs:element type="TicketNumberDetails_70495_S_CUS_PNRDataFeed_132" name="ticketNumber" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_70494_S_CUS_PNRDataFeed_132" name="sizeIndicator" minOccurs="0"/>
 *     &lt;xs:element type="CodedAttribute_70481_S_CUS_PNRDataFeed_132" name="mcoData" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="ConversionRate_70491_S_CUS_PNRDataFeed_132" name="bankerRate" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_70483_S_CUS_PNRDataFeed_132" name="mcoFares" minOccurs="0"/>
 *     &lt;xs:element type="TaxDetails_70489_S_CUS_PNRDataFeed_132" name="mcoTax" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Pasbcq1a044Group43SvcDetails90295GCUSPNRDataFeed132
{
    private ServiceChargeInformation70496SCUSPNRDataFeed132 svcType;
    private List<SpecificTravellerDetails70493SCUSPNRDataFeed132> passengerList = new ArrayList<SpecificTravellerDetails70493SCUSPNRDataFeed132>();
    private TicketNumberDetails70495SCUSPNRDataFeed132 ticketNumber;
    private StatusDetails70494SCUSPNRDataFeed132 sizeIndicator;
    private List<CodedAttribute70481SCUSPNRDataFeed132> mcoDataList = new ArrayList<CodedAttribute70481SCUSPNRDataFeed132>();
    private ConversionRate70491SCUSPNRDataFeed132 bankerRate;
    private MonetaryInformation70483SCUSPNRDataFeed132 mcoFares;
    private TaxDetails70489SCUSPNRDataFeed132 mcoTax;

    /** 
     * Get the 'svcType' element value. Trigger SVC functionality.
     * 
     * @return value
     */
    public ServiceChargeInformation70496SCUSPNRDataFeed132 getSvcType() {
        return svcType;
    }

    /** 
     * Set the 'svcType' element value. Trigger SVC functionality.
     * 
     * @param svcType
     */
    public void setSvcType(
            ServiceChargeInformation70496SCUSPNRDataFeed132 svcType) {
        this.svcType = svcType;
    }

    /** 
     * Get the list of 'passengers' element items. Conveys the passengers.
     * 
     * @return list
     */
    public List<SpecificTravellerDetails70493SCUSPNRDataFeed132> getPassengerList() {
        return passengerList;
    }

    /** 
     * Set the list of 'passengers' element items. Conveys the passengers.
     * 
     * @param list
     */
    public void setPassengerList(
            List<SpecificTravellerDetails70493SCUSPNRDataFeed132> list) {
        passengerList = list;
    }

    /** 
     * Get the 'ticketNumber' element value. MCO ticket Number.
     * 
     * @return value
     */
    public TicketNumberDetails70495SCUSPNRDataFeed132 getTicketNumber() {
        return ticketNumber;
    }

    /** 
     * Set the 'ticketNumber' element value. MCO ticket Number.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(
            TicketNumberDetails70495SCUSPNRDataFeed132 ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /** 
     * Get the 'sizeIndicator' element value. MCO sixe indicator (I for International or D for domestic).
     * 
     * @return value
     */
    public StatusDetails70494SCUSPNRDataFeed132 getSizeIndicator() {
        return sizeIndicator;
    }

    /** 
     * Set the 'sizeIndicator' element value. MCO sixe indicator (I for International or D for domestic).
     * 
     * @param sizeIndicator
     */
    public void setSizeIndicator(
            StatusDetails70494SCUSPNRDataFeed132 sizeIndicator) {
        this.sizeIndicator = sizeIndicator;
    }

    /** 
     * Get the list of 'mcoData' element items. Free flow for MCO remarks/presentTo/presentAt
     * 
     * @return list
     */
    public List<CodedAttribute70481SCUSPNRDataFeed132> getMcoDataList() {
        return mcoDataList;
    }

    /** 
     * Set the list of 'mcoData' element items. Free flow for MCO remarks/presentTo/presentAt
     * 
     * @param list
     */
    public void setMcoDataList(List<CodedAttribute70481SCUSPNRDataFeed132> list) {
        mcoDataList = list;
    }

    /** 
     * Get the 'bankerRate' element value. MCO banker rate
     * 
     * @return value
     */
    public ConversionRate70491SCUSPNRDataFeed132 getBankerRate() {
        return bankerRate;
    }

    /** 
     * Set the 'bankerRate' element value. MCO banker rate
     * 
     * @param bankerRate
     */
    public void setBankerRate(ConversionRate70491SCUSPNRDataFeed132 bankerRate) {
        this.bankerRate = bankerRate;
    }

    /** 
     * Get the 'mcoFares' element value. MCO specific fares including: -Other charges -Exchange value -Equivalent other charges -Equivalent exchange value -SVC charges -Net fare
     * 
     * @return value
     */
    public MonetaryInformation70483SCUSPNRDataFeed132 getMcoFares() {
        return mcoFares;
    }

    /** 
     * Set the 'mcoFares' element value. MCO specific fares including: -Other charges -Exchange value -Equivalent other charges -Equivalent exchange value -SVC charges -Net fare
     * 
     * @param mcoFares
     */
    public void setMcoFares(MonetaryInformation70483SCUSPNRDataFeed132 mcoFares) {
        this.mcoFares = mcoFares;
    }

    /** 
     * Get the 'mcoTax' element value. MCO specific tax.
     * 
     * @return value
     */
    public TaxDetails70489SCUSPNRDataFeed132 getMcoTax() {
        return mcoTax;
    }

    /** 
     * Set the 'mcoTax' element value. MCO specific tax.
     * 
     * @param mcoTax
     */
    public void setMcoTax(TaxDetails70489SCUSPNRDataFeed132 mcoTax) {
        this.mcoTax = mcoTax;
    }
}
