
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the point of sale details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorOfRequestDetails_169138_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SystemDetails_239129_C_CUS_PNRDataFeed_132" name="fromSystemDetailsDetail"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorOfRequestDetails169138SCUSPNRDataFeed132
{
    private SystemDetails239129CCUSPNRDataFeed132 fromSystemDetailsDetail;

    /** 
     * Get the 'fromSystemDetailsDetail' element value. Details concerning the origin system
     * 
     * @return value
     */
    public SystemDetails239129CCUSPNRDataFeed132 getFromSystemDetailsDetail() {
        return fromSystemDetailsDetail;
    }

    /** 
     * Set the 'fromSystemDetailsDetail' element value. Details concerning the origin system
     * 
     * @param fromSystemDetailsDetail
     */
    public void setFromSystemDetailsDetail(
            SystemDetails239129CCUSPNRDataFeed132 fromSystemDetailsDetail) {
        this.fromSystemDetailsDetail = fromSystemDetailsDetail;
    }
}
