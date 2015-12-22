
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Seat group entity.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatEntityType_206134_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecialRequirementsDetails_32981_S_CUS_PNRDataFeed_132" name="seatRequest"/>
 *     &lt;xs:element type="SeatSelectionDetails_25828_S_CUS_PNRDataFeed_132" name="seatInformation" minOccurs="0"/>
 *     &lt;xs:element type="SeatEntityType_individualSeatGroup_206135_G_CUS_PNRDataFeed_132" name="individualSeatGroup" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="DateAndTimeInformation_26783_S_CUS_PNRDataFeed_132" name="dateGaugeChange" minOccurs="0"/>
 *     &lt;xs:element type="ReservationSecurityInformation_104624_S_CUS_PNRDataFeed_132" name="seatCreationInfo" minOccurs="0"/>
 *     &lt;xs:element type="PricingOrTicketingSubsequent_169135_S_CUS_PNRDataFeed_132" name="reasonForIssuanceCode" minOccurs="0"/>
 *     &lt;xs:element type="OriginatorOfRequestDetails_169138_S_CUS_PNRDataFeed_132" name="bookingChannel" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatEntityType206134GCUSPNRDataFeed132
{
    private SpecialRequirementsDetails32981SCUSPNRDataFeed132 seatRequest;
    private SeatSelectionDetails25828SCUSPNRDataFeed132 seatInformation;
    private List<SeatEntityTypeIndividualSeatGroup206135GCUSPNRDataFeed132> individualSeatGroupList = new ArrayList<SeatEntityTypeIndividualSeatGroup206135GCUSPNRDataFeed132>();
    private DateAndTimeInformation26783SCUSPNRDataFeed132 dateGaugeChange;
    private ReservationSecurityInformation104624SCUSPNRDataFeed132 seatCreationInfo;
    private PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 reasonForIssuanceCode;
    private OriginatorOfRequestDetails169138SCUSPNRDataFeed132 bookingChannel;

    /** 
     * Get the 'seatRequest' element value.
     * 
     * @return value
     */
    public SpecialRequirementsDetails32981SCUSPNRDataFeed132 getSeatRequest() {
        return seatRequest;
    }

    /** 
     * Set the 'seatRequest' element value.
     * 
     * @param seatRequest
     */
    public void setSeatRequest(
            SpecialRequirementsDetails32981SCUSPNRDataFeed132 seatRequest) {
        this.seatRequest = seatRequest;
    }

    /** 
     * Get the 'seatInformation' element value. This contains the seat request parameters.
     * 
     * @return value
     */
    public SeatSelectionDetails25828SCUSPNRDataFeed132 getSeatInformation() {
        return seatInformation;
    }

    /** 
     * Set the 'seatInformation' element value. This contains the seat request parameters.
     * 
     * @param seatInformation
     */
    public void setSeatInformation(
            SeatSelectionDetails25828SCUSPNRDataFeed132 seatInformation) {
        this.seatInformation = seatInformation;
    }

    /** 
     * Get the list of 'individualSeatGroup' element items. This group contains individual seat information
     * 
     * @return list
     */
    public List<SeatEntityTypeIndividualSeatGroup206135GCUSPNRDataFeed132> getIndividualSeatGroupList() {
        return individualSeatGroupList;
    }

    /** 
     * Set the list of 'individualSeatGroup' element items. This group contains individual seat information
     * 
     * @param list
     */
    public void setIndividualSeatGroupList(
            List<SeatEntityTypeIndividualSeatGroup206135GCUSPNRDataFeed132> list) {
        individualSeatGroupList = list;
    }

    /** 
     * Get the 'dateGaugeChange' element value. Date of a change of gauge.
     * 
     * @return value
     */
    public DateAndTimeInformation26783SCUSPNRDataFeed132 getDateGaugeChange() {
        return dateGaugeChange;
    }

    /** 
     * Set the 'dateGaugeChange' element value. Date of a change of gauge.
     * 
     * @param dateGaugeChange
     */
    public void setDateGaugeChange(
            DateAndTimeInformation26783SCUSPNRDataFeed132 dateGaugeChange) {
        this.dateGaugeChange = dateGaugeChange;
    }

    /** 
     * Get the 'seatCreationInfo' element value.
     * 
     * @return value
     */
    public ReservationSecurityInformation104624SCUSPNRDataFeed132 getSeatCreationInfo() {
        return seatCreationInfo;
    }

    /** 
     * Set the 'seatCreationInfo' element value.
     * 
     * @param seatCreationInfo
     */
    public void setSeatCreationInfo(
            ReservationSecurityInformation104624SCUSPNRDataFeed132 seatCreationInfo) {
        this.seatCreationInfo = seatCreationInfo;
    }

    /** 
     * Get the 'reasonForIssuanceCode' element value. To convey RFIC and RFISC at Seat level
     * 
     * @return value
     */
    public PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 getReasonForIssuanceCode() {
        return reasonForIssuanceCode;
    }

    /** 
     * Set the 'reasonForIssuanceCode' element value. To convey RFIC and RFISC at Seat level
     * 
     * @param reasonForIssuanceCode
     */
    public void setReasonForIssuanceCode(
            PricingOrTicketingSubsequent169135SCUSPNRDataFeed132 reasonForIssuanceCode) {
        this.reasonForIssuanceCode = reasonForIssuanceCode;
    }

    /** 
     * Get the 'bookingChannel' element value. To convey information about the channel responsible of the seat booking.
     * 
     * @return value
     */
    public OriginatorOfRequestDetails169138SCUSPNRDataFeed132 getBookingChannel() {
        return bookingChannel;
    }

    /** 
     * Set the 'bookingChannel' element value. To convey information about the channel responsible of the seat booking.
     * 
     * @param bookingChannel
     */
    public void setBookingChannel(
            OriginatorOfRequestDetails169138SCUSPNRDataFeed132 bookingChannel) {
        this.bookingChannel = bookingChannel;
    }
}
