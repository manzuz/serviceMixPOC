
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify purge dates of profiles
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PnrTechnicalData_30050_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="pnrPurgeDate"/>
 *     &lt;xs:element type="xs:decimal" name="number"/>
 *     &lt;xs:element type="xs:decimal" name="lastTransmittedEnvelopeNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PnrTechnicalData30050SCUSPNRDataFeed132
{
    private String pnrPurgeDate;
    private BigDecimal number;
    private BigDecimal lastTransmittedEnvelopeNumber;

    /** 
     * Get the 'pnrPurgeDate' element value. PNR Purge date
     * 
     * @return value
     */
    public String getPnrPurgeDate() {
        return pnrPurgeDate;
    }

    /** 
     * Set the 'pnrPurgeDate' element value. PNR Purge date
     * 
     * @param pnrPurgeDate
     */
    public void setPnrPurgeDate(String pnrPurgeDate) {
        this.pnrPurgeDate = pnrPurgeDate;
    }

    /** 
     * Get the 'number' element value. Current PNR envelop
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Current PNR envelop
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /** 
     * Get the 'lastTransmittedEnvelopeNumber' element value. Last transmitted envelope number
     * 
     * @return value
     */
    public BigDecimal getLastTransmittedEnvelopeNumber() {
        return lastTransmittedEnvelopeNumber;
    }

    /** 
     * Set the 'lastTransmittedEnvelopeNumber' element value. Last transmitted envelope number
     * 
     * @param lastTransmittedEnvelopeNumber
     */
    public void setLastTransmittedEnvelopeNumber(
            BigDecimal lastTransmittedEnvelopeNumber) {
        this.lastTransmittedEnvelopeNumber = lastTransmittedEnvelopeNumber;
    }
}
