
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_orgAnd4Exchange_190050_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketNumberDetails_163726_S_CUS_PNRDataFeed_132" name="tkt"/>
 *     &lt;xs:element type="RangeDetails_165523_S_CUS_PNRDataFeed_132" name="rng" minOccurs="0"/>
 *     &lt;xs:element type="SelectionDetails_163729_S_CUS_PNRDataFeed_132" name="sdt" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterOrgAnd4Exchange190050GCUSPNRDataFeed1321
{
    private TicketNumberDetails163726SCUSPNRDataFeed132 tkt;
    private RangeDetails165523SCUSPNRDataFeed132 rng;
    private SelectionDetails163729SCUSPNRDataFeed132 sdt;

    /** 
     * Get the 'tkt' element value. tkt
     * 
     * @return value
     */
    public TicketNumberDetails163726SCUSPNRDataFeed132 getTkt() {
        return tkt;
    }

    /** 
     * Set the 'tkt' element value. tkt
     * 
     * @param tkt
     */
    public void setTkt(TicketNumberDetails163726SCUSPNRDataFeed132 tkt) {
        this.tkt = tkt;
    }

    /** 
     * Get the 'rng' element value. rng
     * 
     * @return value
     */
    public RangeDetails165523SCUSPNRDataFeed132 getRng() {
        return rng;
    }

    /** 
     * Set the 'rng' element value. rng
     * 
     * @param rng
     */
    public void setRng(RangeDetails165523SCUSPNRDataFeed132 rng) {
        this.rng = rng;
    }

    /** 
     * Get the 'sdt' element value. sdt
     * 
     * @return value
     */
    public SelectionDetails163729SCUSPNRDataFeed132 getSdt() {
        return sdt;
    }

    /** 
     * Set the 'sdt' element value. sdt
     * 
     * @param sdt
     */
    public void setSdt(SelectionDetails163729SCUSPNRDataFeed132 sdt) {
        this.sdt = sdt;
    }
}
