
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Used to convey quota information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QuotaRelatedInformation_178675_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="quotaCounterName" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="maxQuantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="availability" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="quotaReachedReplyStatus" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class QuotaRelatedInformation178675CCUSPNRDataFeed132
{
    private String quotaCounterName;
    private BigDecimal maxQuantity;
    private BigDecimal availability;
    private String quotaReachedReplyStatus;

    /** 
     * Get the 'quotaCounterName' element value. Name of the quota counter, most of the time aligned with SSR type.
     * 
     * @return value
     */
    public String getQuotaCounterName() {
        return quotaCounterName;
    }

    /** 
     * Set the 'quotaCounterName' element value. Name of the quota counter, most of the time aligned with SSR type.
     * 
     * @param quotaCounterName
     */
    public void setQuotaCounterName(String quotaCounterName) {
        this.quotaCounterName = quotaCounterName;
    }

    /** 
     * Get the 'maxQuantity' element value. Maximum quantity that can be reached.
     * 
     * @return value
     */
    public BigDecimal getMaxQuantity() {
        return maxQuantity;
    }

    /** 
     * Set the 'maxQuantity' element value. Maximum quantity that can be reached.
     * 
     * @param maxQuantity
     */
    public void setMaxQuantity(BigDecimal maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    /** 
     * Get the 'availability' element value. Quantity that is available.
     * 
     * @return value
     */
    public BigDecimal getAvailability() {
        return availability;
    }

    /** 
     * Set the 'availability' element value. Quantity that is available.
     * 
     * @param availability
     */
    public void setAvailability(BigDecimal availability) {
        this.availability = availability;
    }

    /** 
     * Get the 'quotaReachedReplyStatus' element value. Status which should be replied when quota are reached, for example UN.
     * 
     * @return value
     */
    public String getQuotaReachedReplyStatus() {
        return quotaReachedReplyStatus;
    }

    /** 
     * Set the 'quotaReachedReplyStatus' element value. Status which should be replied when quota are reached, for example UN.
     * 
     * @param quotaReachedReplyStatus
     */
    public void setQuotaReachedReplyStatus(String quotaReachedReplyStatus) {
        this.quotaReachedReplyStatus = quotaReachedReplyStatus;
    }
}
