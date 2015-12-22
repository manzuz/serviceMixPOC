
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Pasbcq1a044Group43_xsbDetails_90296_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ExcessBaggage_70500_S_CUS_PNRDataFeed_132" name="xsb"/>
 *     &lt;xs:element type="ExcessBaggageDetails_70497_S_CUS_PNRDataFeed_132" name="xsbWeight" minOccurs="0"/>
 *     &lt;xs:element type="TicketNumberDetails_70495_S_CUS_PNRDataFeed_132" name="ticketNumber" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_70483_S_CUS_PNRDataFeed_132" name="xsbRate" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_70494_S_CUS_PNRDataFeed_132" name="globalIndicator" minOccurs="0"/>
 *     &lt;xs:element type="Pasbcq1a044Group43_xsbDetails_pricingRouting_90297_G_CUS_PNRDataFeed_132" name="pricingRouting" minOccurs="0"/>
 *     &lt;xs:element type="Pasbcq1a044Group43_xsbDetails_routingDetails_90298_G_CUS_PNRDataFeed_132" name="routingDetails" minOccurs="0" maxOccurs="16"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Pasbcq1a044Group43XsbDetails90296GCUSPNRDataFeed132
{
    private ExcessBaggage70500SCUSPNRDataFeed132 xsb;
    private ExcessBaggageDetails70497SCUSPNRDataFeed132 xsbWeight;
    private TicketNumberDetails70495SCUSPNRDataFeed132 ticketNumber;
    private MonetaryInformation70483SCUSPNRDataFeed132 xsbRate;
    private StatusDetails70494SCUSPNRDataFeed132 globalIndicator;
    private Pasbcq1a044Group43XsbDetailsPricingRouting90297GCUSPNRDataFeed132 pricingRouting;
    private List<Pasbcq1a044Group43XsbDetailsRoutingDetails90298GCUSPNRDataFeed132> routingDetailList = new ArrayList<Pasbcq1a044Group43XsbDetailsRoutingDetails90298GCUSPNRDataFeed132>();

    /** 
     * Get the 'xsb' element value. Trigger XSB.
     * 
     * @return value
     */
    public ExcessBaggage70500SCUSPNRDataFeed132 getXsb() {
        return xsb;
    }

    /** 
     * Set the 'xsb' element value. Trigger XSB.
     * 
     * @param xsb
     */
    public void setXsb(ExcessBaggage70500SCUSPNRDataFeed132 xsb) {
        this.xsb = xsb;
    }

    /** 
     * Get the 'xsbWeight' element value. XSB excess baggage (PC or KG).
     * 
     * @return value
     */
    public ExcessBaggageDetails70497SCUSPNRDataFeed132 getXsbWeight() {
        return xsbWeight;
    }

    /** 
     * Set the 'xsbWeight' element value. XSB excess baggage (PC or KG).
     * 
     * @param xsbWeight
     */
    public void setXsbWeight(
            ExcessBaggageDetails70497SCUSPNRDataFeed132 xsbWeight) {
        this.xsbWeight = xsbWeight;
    }

    /** 
     * Get the 'ticketNumber' element value. XSB ticket Number.
     * 
     * @return value
     */
    public TicketNumberDetails70495SCUSPNRDataFeed132 getTicketNumber() {
        return ticketNumber;
    }

    /** 
     * Set the 'ticketNumber' element value. XSB ticket Number.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(
            TicketNumberDetails70495SCUSPNRDataFeed132 ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /** 
     * Get the 'xsbRate' element value. XSB rate.
     * 
     * @return value
     */
    public MonetaryInformation70483SCUSPNRDataFeed132 getXsbRate() {
        return xsbRate;
    }

    /** 
     * Set the 'xsbRate' element value. XSB rate.
     * 
     * @param xsbRate
     */
    public void setXsbRate(MonetaryInformation70483SCUSPNRDataFeed132 xsbRate) {
        this.xsbRate = xsbRate;
    }

    /** 
     * Get the 'globalIndicator' element value. XBS global indicator.
     * 
     * @return value
     */
    public StatusDetails70494SCUSPNRDataFeed132 getGlobalIndicator() {
        return globalIndicator;
    }

    /** 
     * Set the 'globalIndicator' element value. XBS global indicator.
     * 
     * @param globalIndicator
     */
    public void setGlobalIndicator(
            StatusDetails70494SCUSPNRDataFeed132 globalIndicator) {
        this.globalIndicator = globalIndicator;
    }

    /** 
     * Get the 'pricingRouting' element value. XSB pricing routing.
     * 
     * @return value
     */
    public Pasbcq1a044Group43XsbDetailsPricingRouting90297GCUSPNRDataFeed132 getPricingRouting() {
        return pricingRouting;
    }

    /** 
     * Set the 'pricingRouting' element value. XSB pricing routing.
     * 
     * @param pricingRouting
     */
    public void setPricingRouting(
            Pasbcq1a044Group43XsbDetailsPricingRouting90297GCUSPNRDataFeed132 pricingRouting) {
        this.pricingRouting = pricingRouting;
    }

    /** 
     * Get the list of 'routingDetails' element items. Pricing routing details.
     * 
     * @return list
     */
    public List<Pasbcq1a044Group43XsbDetailsRoutingDetails90298GCUSPNRDataFeed132> getRoutingDetailList() {
        return routingDetailList;
    }

    /** 
     * Set the list of 'routingDetails' element items. Pricing routing details.
     * 
     * @param list
     */
    public void setRoutingDetailList(
            List<Pasbcq1a044Group43XsbDetailsRoutingDetails90298GCUSPNRDataFeed132> list) {
        routingDetailList = list;
    }
}
