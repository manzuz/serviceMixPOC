
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * In Connection With
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InConnectionWith_98380_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TransportIdentifier_79027_S_CUS_PNRDataFeed_132" name="carrier"/>
 *     &lt;xs:element type="TicketNumberDetails_79026_S_CUS_PNRDataFeed_132" name="identification"/>
 *     &lt;xs:element type="CouponInformation_79025_S_CUS_PNRDataFeed_132" name="couponList" minOccurs="0" maxOccurs="16"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InConnectionWith98380GCUSPNRDataFeed132
{
    private TransportIdentifier79027SCUSPNRDataFeed132 carrier;
    private TicketNumberDetails79026SCUSPNRDataFeed132 identification;
    private List<CouponInformation79025SCUSPNRDataFeed132> couponList = new ArrayList<CouponInformation79025SCUSPNRDataFeed132>();

    /** 
     * Get the 'carrier' element value. Carrier field of ICW
     * 
     * @return value
     */
    public TransportIdentifier79027SCUSPNRDataFeed132 getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'carrier' element value. Carrier field of ICW
     * 
     * @param carrier
     */
    public void setCarrier(TransportIdentifier79027SCUSPNRDataFeed132 carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'identification' element value. Mandatory doc serial number and optional ticket type for ICW
     * 
     * @return value
     */
    public TicketNumberDetails79026SCUSPNRDataFeed132 getIdentification() {
        return identification;
    }

    /** 
     * Set the 'identification' element value. Mandatory doc serial number and optional ticket type for ICW
     * 
     * @param identification
     */
    public void setIdentification(
            TicketNumberDetails79026SCUSPNRDataFeed132 identification) {
        this.identification = identification;
    }

    /** 
     * Get the list of 'couponList' element items. List of coupons for ICW
     * 
     * @return list
     */
    public List<CouponInformation79025SCUSPNRDataFeed132> getCouponList() {
        return couponList;
    }

    /** 
     * Set the list of 'couponList' element items. List of coupons for ICW
     * 
     * @param list
     */
    public void setCouponList(
            List<CouponInformation79025SCUSPNRDataFeed132> list) {
        couponList = list;
    }
}
