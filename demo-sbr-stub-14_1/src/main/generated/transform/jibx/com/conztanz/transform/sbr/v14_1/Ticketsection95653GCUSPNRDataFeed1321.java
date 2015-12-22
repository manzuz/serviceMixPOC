
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Ticketsection_95653_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DummySegment_11395_S_CUS_PNRDataFeed_132" name="markerTktGrp"/>
 *     &lt;xs:element type="TicketNumberDetails_75987_S_CUS_PNRDataFeed_132" name="ticketNumber"/>
 *     &lt;xs:element type="TicketNumberDetails_76105_S_CUS_PNRDataFeed_132" name="ticketCunjonctionNumber" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_76104_S_CUS_PNRDataFeed_132" name="blackListCategory" minOccurs="0"/>
 *     &lt;xs:element type="CouponInformation_76070_S_CUS_PNRDataFeed_132" name="couponNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Ticketsection95653GCUSPNRDataFeed1321
{
    private DummySegment11395SCUSPNRDataFeed132 markerTktGrp;
    private TicketNumberDetails75987SCUSPNRDataFeed132 ticketNumber;
    private TicketNumberDetails76105SCUSPNRDataFeed132 ticketCunjonctionNumber;
    private FreeTextInformation76104SCUSPNRDataFeed132 blackListCategory;
    private CouponInformation76070SCUSPNRDataFeed132 couponNumber;

    /** 
     * Get the 'markerTktGrp' element value. Trigger of the ticket group
     * 
     * @return value
     */
    public DummySegment11395SCUSPNRDataFeed132 getMarkerTktGrp() {
        return markerTktGrp;
    }

    /** 
     * Set the 'markerTktGrp' element value. Trigger of the ticket group
     * 
     * @param markerTktGrp
     */
    public void setMarkerTktGrp(DummySegment11395SCUSPNRDataFeed132 markerTktGrp) {
        this.markerTktGrp = markerTktGrp;
    }

    /** 
     * Get the 'ticketNumber' element value. Ticket number per pax and flight
     * 
     * @return value
     */
    public TicketNumberDetails75987SCUSPNRDataFeed132 getTicketNumber() {
        return ticketNumber;
    }

    /** 
     * Set the 'ticketNumber' element value. Ticket number per pax and flight
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(
            TicketNumberDetails75987SCUSPNRDataFeed132 ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /** 
     * Get the 'ticketCunjonctionNumber' element value. Hold the ticket conjunction number
     * 
     * @return value
     */
    public TicketNumberDetails76105SCUSPNRDataFeed132 getTicketCunjonctionNumber() {
        return ticketCunjonctionNumber;
    }

    /** 
     * Set the 'ticketCunjonctionNumber' element value. Hold the ticket conjunction number
     * 
     * @param ticketCunjonctionNumber
     */
    public void setTicketCunjonctionNumber(
            TicketNumberDetails76105SCUSPNRDataFeed132 ticketCunjonctionNumber) {
        this.ticketCunjonctionNumber = ticketCunjonctionNumber;
    }

    /** 
     * Get the 'blackListCategory' element value. To specify the blacklist category * freeTextDetails/textSubjectQualifier = "3" * freeTextDetails/source = "M" * freeTextDetails/encoding = "1" * freeText = blacklist category
     * 
     * @return value
     */
    public FreeTextInformation76104SCUSPNRDataFeed132 getBlackListCategory() {
        return blackListCategory;
    }

    /** 
     * Set the 'blackListCategory' element value. To specify the blacklist category * freeTextDetails/textSubjectQualifier = "3" * freeTextDetails/source = "M" * freeTextDetails/encoding = "1" * freeText = blacklist category
     * 
     * @param blackListCategory
     */
    public void setBlackListCategory(
            FreeTextInformation76104SCUSPNRDataFeed132 blackListCategory) {
        this.blackListCategory = blackListCategory;
    }

    /** 
     * Get the 'couponNumber' element value. Coupon number for given pax and flight
     * 
     * @return value
     */
    public CouponInformation76070SCUSPNRDataFeed132 getCouponNumber() {
        return couponNumber;
    }

    /** 
     * Set the 'couponNumber' element value. Coupon number for given pax and flight
     * 
     * @param couponNumber
     */
    public void setCouponNumber(
            CouponInformation76070SCUSPNRDataFeed132 couponNumber) {
        this.couponNumber = couponNumber;
    }
}
