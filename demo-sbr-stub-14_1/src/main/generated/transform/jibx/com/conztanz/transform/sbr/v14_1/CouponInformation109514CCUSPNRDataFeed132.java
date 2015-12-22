
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the coupon number, status, value, and other related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CouponInformation_109514_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="cpnNumber"/>
 *     &lt;xs:element type="xs:string" name="cpnStatus" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="cpnSequenceNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CouponInformation109514CCUSPNRDataFeed132
{
    private BigDecimal cpnNumber;
    private String cpnStatus;
    private BigDecimal cpnSequenceNumber;

    /** 
     * Get the 'cpnNumber' element value. Conveys coupon number
     * 
     * @return value
     */
    public BigDecimal getCpnNumber() {
        return cpnNumber;
    }

    /** 
     * Set the 'cpnNumber' element value. Conveys coupon number
     * 
     * @param cpnNumber
     */
    public void setCpnNumber(BigDecimal cpnNumber) {
        this.cpnNumber = cpnNumber;
    }

    /** 
     * Get the 'cpnStatus' element value. Conveys coupon status
     * 
     * @return value
     */
    public String getCpnStatus() {
        return cpnStatus;
    }

    /** 
     * Set the 'cpnStatus' element value. Conveys coupon status
     * 
     * @param cpnStatus
     */
    public void setCpnStatus(String cpnStatus) {
        this.cpnStatus = cpnStatus;
    }

    /** 
     * Get the 'cpnSequenceNumber' element value. segment tattoo associated to this coupon
     * 
     * @return value
     */
    public BigDecimal getCpnSequenceNumber() {
        return cpnSequenceNumber;
    }

    /** 
     * Set the 'cpnSequenceNumber' element value. segment tattoo associated to this coupon
     * 
     * @param cpnSequenceNumber
     */
    public void setCpnSequenceNumber(BigDecimal cpnSequenceNumber) {
        this.cpnSequenceNumber = cpnSequenceNumber;
    }
}
