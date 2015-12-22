
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the commission conditions, amount, currency, party paying and any related free text.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommissionDetails_224026_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="rate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="dealNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="collectingAgencyIataNb" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommissionDetails224026CCUSPNRDataFeed132
{
    private String type;
    private BigDecimal amount;
    private BigDecimal rate;
    private String dealNumber;
    private BigDecimal collectingAgencyIataNb;

    /** 
     * Get the 'type' element value. Commission type : 'NEW' --) New commission 'OLD' --) Old Commission 'XLP' --) Commission on cancellation Penalty 'FMB' --) Secondary commission 'SUP' --) Supplementary commission amount 'CAP' --) Cap limit amount 'VAN' --) Vat on new commission 'VAO' --) Vat on old commission
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Commission type : 'NEW' --) New commission 'OLD' --) Old Commission 'XLP' --) Commission on cancellation Penalty 'FMB' --) Secondary commission 'SUP' --) Supplementary commission amount 'CAP' --) Cap limit amount 'VAN' --) Vat on new commission 'VAO' --) Vat on old commission
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'amount' element value. Commission amount
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Commission amount
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'rate' element value. Commission percentage
     * 
     * @return value
     */
    public BigDecimal getRate() {
        return rate;
    }

    /** 
     * Set the 'rate' element value. Commission percentage
     * 
     * @param rate
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'dealNumber' element value. Deal number associated to secondary commission
     * 
     * @return value
     */
    public String getDealNumber() {
        return dealNumber;
    }

    /** 
     * Set the 'dealNumber' element value. Deal number associated to secondary commission
     * 
     * @param dealNumber
     */
    public void setDealNumber(String dealNumber) {
        this.dealNumber = dealNumber;
    }

    /** 
     * Get the 'collectingAgencyIataNb' element value. Collecting agency IATA number associated to new or secondary commission
     * 
     * @return value
     */
    public BigDecimal getCollectingAgencyIataNb() {
        return collectingAgencyIataNb;
    }

    /** 
     * Set the 'collectingAgencyIataNb' element value. Collecting agency IATA number associated to new or secondary commission
     * 
     * @param collectingAgencyIataNb
     */
    public void setCollectingAgencyIataNb(BigDecimal collectingAgencyIataNb) {
        this.collectingAgencyIataNb = collectingAgencyIataNb;
    }
}
