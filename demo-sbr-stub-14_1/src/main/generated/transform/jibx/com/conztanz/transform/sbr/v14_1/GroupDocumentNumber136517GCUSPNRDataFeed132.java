
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify the ticketing data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupDocumentNumber_136517_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_118076_S_CUS_PNRDataFeed_132" name="ticketInformation"/>
 *     &lt;xs:element type="CouponInformation_118077_S_CUS_PNRDataFeed_132" name="couponInformation" minOccurs="0"/>
 *     &lt;xs:element type="ElementManagementSegment_106214_S_CUS_PNRDataFeed_132" name="ticketReference" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupDocumentNumber136517GCUSPNRDataFeed132
{
    private TicketNumberDetails118076SCUSPNRDataFeed132 ticketInformation;
    private CouponInformation118077SCUSPNRDataFeed132 couponInformation;
    private ElementManagementSegment106214SCUSPNRDataFeed132 ticketReference;

    /** 
     * Get the 'ticketInformation' element value.
     * 
     * @return value
     */
    public TicketNumberDetails118076SCUSPNRDataFeed132 getTicketInformation() {
        return ticketInformation;
    }

    /** 
     * Set the 'ticketInformation' element value.
     * 
     * @param ticketInformation
     */
    public void setTicketInformation(
            TicketNumberDetails118076SCUSPNRDataFeed132 ticketInformation) {
        this.ticketInformation = ticketInformation;
    }

    /** 
     * Get the 'couponInformation' element value.
     * 
     * @return value
     */
    public CouponInformation118077SCUSPNRDataFeed132 getCouponInformation() {
        return couponInformation;
    }

    /** 
     * Set the 'couponInformation' element value.
     * 
     * @param couponInformation
     */
    public void setCouponInformation(
            CouponInformation118077SCUSPNRDataFeed132 couponInformation) {
        this.couponInformation = couponInformation;
    }

    /** 
     * Get the 'ticketReference' element value.
     * 
     * @return value
     */
    public ElementManagementSegment106214SCUSPNRDataFeed132 getTicketReference() {
        return ticketReference;
    }

    /** 
     * Set the 'ticketReference' element value.
     * 
     * @param ticketReference
     */
    public void setTicketReference(
            ElementManagementSegment106214SCUSPNRDataFeed132 ticketReference) {
        this.ticketReference = ticketReference;
    }
}
