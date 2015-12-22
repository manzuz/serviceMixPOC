
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketDocumentGroup_191475_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_70255_S_CUS_PNRDataFeed_132" name="tktNumber"/>
 *     &lt;xs:element type="TransportIdentifier_70275_S_CUS_PNRDataFeed_132" name="numAirlineCode"/>
 *     &lt;xs:element type="AdditionalBusinessSourceInformation_70268_S_CUS_PNRDataFeed_132" name="officeInfo" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_70272_S_CUS_PNRDataFeed_132" name="ticketingDate" minOccurs="0"/>
 *     &lt;xs:element type="MonetaryInformation_70270_S_CUS_PNRDataFeed_132" name="fareInformation" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_70276_S_CUS_PNRDataFeed_132" name="freeTextInformation" minOccurs="0"/>
 *     &lt;xs:element type="ReservationControlInformation_70271_S_CUS_PNRDataFeed_132" name="reservationNumber" minOccurs="0"/>
 *     &lt;xs:element type="CouponInformation_70269_S_CUS_PNRDataFeed_132" name="couponsInfo" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="TravellerInformation_70273_S_CUS_PNRDataFeed_132" name="infantOrAdultAssociation" minOccurs="0"/>
 *     &lt;xs:element type="Attribute_173823_S_CUS_PNRDataFeed_132" name="ticketBillingIndicators" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketDocumentGroup191475GCUSPNRDataFeed1321
{
    private TicketNumberDetails70255SCUSPNRDataFeed132 tktNumber;
    private TransportIdentifier70275SCUSPNRDataFeed132 numAirlineCode;
    private AdditionalBusinessSourceInformation70268SCUSPNRDataFeed132 officeInfo;
    private StructuredDateTimeInformation70272SCUSPNRDataFeed132 ticketingDate;
    private MonetaryInformation70270SCUSPNRDataFeed132 fareInformation;
    private FreeTextInformation70276SCUSPNRDataFeed132 freeTextInformation;
    private ReservationControlInformation70271SCUSPNRDataFeed132 reservationNumber;
    private List<CouponInformation70269SCUSPNRDataFeed132> couponsInfoList = new ArrayList<CouponInformation70269SCUSPNRDataFeed132>();
    private TravellerInformation70273SCUSPNRDataFeed132 infantOrAdultAssociation;
    private Attribute173823SCUSPNRDataFeed132 ticketBillingIndicators;

    /** 
     * Get the 'tktNumber' element value. Information on the ticket
     * 
     * @return value
     */
    public TicketNumberDetails70255SCUSPNRDataFeed132 getTktNumber() {
        return tktNumber;
    }

    /** 
     * Set the 'tktNumber' element value. Information on the ticket
     * 
     * @param tktNumber
     */
    public void setTktNumber(
            TicketNumberDetails70255SCUSPNRDataFeed132 tktNumber) {
        this.tktNumber = tktNumber;
    }

    /** 
     * Get the 'numAirlineCode' element value. Information on the Airline
     * 
     * @return value
     */
    public TransportIdentifier70275SCUSPNRDataFeed132 getNumAirlineCode() {
        return numAirlineCode;
    }

    /** 
     * Set the 'numAirlineCode' element value. Information on the Airline
     * 
     * @param numAirlineCode
     */
    public void setNumAirlineCode(
            TransportIdentifier70275SCUSPNRDataFeed132 numAirlineCode) {
        this.numAirlineCode = numAirlineCode;
    }

    /** 
     * Get the 'officeInfo' element value. Information about the ticketing office and the system code
     * 
     * @return value
     */
    public AdditionalBusinessSourceInformation70268SCUSPNRDataFeed132 getOfficeInfo() {
        return officeInfo;
    }

    /** 
     * Set the 'officeInfo' element value. Information about the ticketing office and the system code
     * 
     * @param officeInfo
     */
    public void setOfficeInfo(
            AdditionalBusinessSourceInformation70268SCUSPNRDataFeed132 officeInfo) {
        this.officeInfo = officeInfo;
    }

    /** 
     * Get the 'ticketingDate' element value. local ticketing date
     * 
     * @return value
     */
    public StructuredDateTimeInformation70272SCUSPNRDataFeed132 getTicketingDate() {
        return ticketingDate;
    }

    /** 
     * Set the 'ticketingDate' element value. local ticketing date
     * 
     * @param ticketingDate
     */
    public void setTicketingDate(
            StructuredDateTimeInformation70272SCUSPNRDataFeed132 ticketingDate) {
        this.ticketingDate = ticketingDate;
    }

    /** 
     * Get the 'fareInformation' element value. Information about the ticket fare
     * 
     * @return value
     */
    public MonetaryInformation70270SCUSPNRDataFeed132 getFareInformation() {
        return fareInformation;
    }

    /** 
     * Set the 'fareInformation' element value. Information about the ticket fare
     * 
     * @param fareInformation
     */
    public void setFareInformation(
            MonetaryInformation70270SCUSPNRDataFeed132 fareInformation) {
        this.fareInformation = fareInformation;
    }

    /** 
     * Get the 'freeTextInformation' element value. free flow information
     * 
     * @return value
     */
    public FreeTextInformation70276SCUSPNRDataFeed132 getFreeTextInformation() {
        return freeTextInformation;
    }

    /** 
     * Set the 'freeTextInformation' element value. free flow information
     * 
     * @param freeTextInformation
     */
    public void setFreeTextInformation(
            FreeTextInformation70276SCUSPNRDataFeed132 freeTextInformation) {
        this.freeTextInformation = freeTextInformation;
    }

    /** 
     * Get the 'reservationNumber' element value. Reservation Confirmation Number
     * 
     * @return value
     */
    public ReservationControlInformation70271SCUSPNRDataFeed132 getReservationNumber() {
        return reservationNumber;
    }

    /** 
     * Set the 'reservationNumber' element value. Reservation Confirmation Number
     * 
     * @param reservationNumber
     */
    public void setReservationNumber(
            ReservationControlInformation70271SCUSPNRDataFeed132 reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    /** 
     * Get the list of 'couponsInfo' element items. Information on coupons
     * 
     * @return list
     */
    public List<CouponInformation70269SCUSPNRDataFeed132> getCouponsInfoList() {
        return couponsInfoList;
    }

    /** 
     * Set the list of 'couponsInfo' element items. Information on coupons
     * 
     * @param list
     */
    public void setCouponsInfoList(
            List<CouponInformation70269SCUSPNRDataFeed132> list) {
        couponsInfoList = list;
    }

    /** 
     * Get the 'infantOrAdultAssociation' element value. Association type (infant or adult)
     * 
     * @return value
     */
    public TravellerInformation70273SCUSPNRDataFeed132 getInfantOrAdultAssociation() {
        return infantOrAdultAssociation;
    }

    /** 
     * Set the 'infantOrAdultAssociation' element value. Association type (infant or adult)
     * 
     * @param infantOrAdultAssociation
     */
    public void setInfantOrAdultAssociation(
            TravellerInformation70273SCUSPNRDataFeed132 infantOrAdultAssociation) {
        this.infantOrAdultAssociation = infantOrAdultAssociation;
    }

    /** 
     * Get the 'ticketBillingIndicators' element value. To convey some key/values at FA level used for Billing (stock type, ticketing channel for FA rail etc.)
     * 
     * @return value
     */
    public Attribute173823SCUSPNRDataFeed132 getTicketBillingIndicators() {
        return ticketBillingIndicators;
    }

    /** 
     * Set the 'ticketBillingIndicators' element value. To convey some key/values at FA level used for Billing (stock type, ticketing channel for FA rail etc.)
     * 
     * @param ticketBillingIndicators
     */
    public void setTicketBillingIndicators(
            Attribute173823SCUSPNRDataFeed132 ticketBillingIndicators) {
        this.ticketBillingIndicators = ticketBillingIndicators;
    }
}
