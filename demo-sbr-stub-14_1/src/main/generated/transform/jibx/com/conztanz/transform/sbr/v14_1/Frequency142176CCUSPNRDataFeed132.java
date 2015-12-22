
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify a frequency and the time window in which              it applies
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Frequency_142176_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="instalmentsNumber"/>
 *     &lt;xs:element type="xs:string" name="instalmentsFrequency" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="instalmentsStartDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="instalmentsDatrDateFormat" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Frequency142176CCUSPNRDataFeed132
{
    private BigDecimal instalmentsNumber;
    private String instalmentsFrequency;
    private String instalmentsStartDate;
    private String instalmentsDatrDateFormat;

    /** 
     * Get the 'instalmentsNumber' element value. Indicates number of instalments for the payment
     * 
     * @return value
     */
    public BigDecimal getInstalmentsNumber() {
        return instalmentsNumber;
    }

    /** 
     * Set the 'instalmentsNumber' element value. Indicates number of instalments for the payment
     * 
     * @param instalmentsNumber
     */
    public void setInstalmentsNumber(BigDecimal instalmentsNumber) {
        this.instalmentsNumber = instalmentsNumber;
    }

    /** 
     * Get the 'instalmentsFrequency' element value. Indicates frequency of instalments for the payment D daily M monthly W weekly
     * 
     * @return value
     */
    public String getInstalmentsFrequency() {
        return instalmentsFrequency;
    }

    /** 
     * Set the 'instalmentsFrequency' element value. Indicates frequency of instalments for the payment D daily M monthly W weekly
     * 
     * @param instalmentsFrequency
     */
    public void setInstalmentsFrequency(String instalmentsFrequency) {
        this.instalmentsFrequency = instalmentsFrequency;
    }

    /** 
     * Get the 'instalmentsStartDate' element value. Indicates when first instalment should take place
     * 
     * @return value
     */
    public String getInstalmentsStartDate() {
        return instalmentsStartDate;
    }

    /** 
     * Set the 'instalmentsStartDate' element value. Indicates when first instalment should take place
     * 
     * @param instalmentsStartDate
     */
    public void setInstalmentsStartDate(String instalmentsStartDate) {
        this.instalmentsStartDate = instalmentsStartDate;
    }

    /** 
     * Get the 'instalmentsDatrDateFormat' element value. indicates extended payment start date format
     * 
     * @return value
     */
    public String getInstalmentsDatrDateFormat() {
        return instalmentsDatrDateFormat;
    }

    /** 
     * Set the 'instalmentsDatrDateFormat' element value. indicates extended payment start date format
     * 
     * @param instalmentsDatrDateFormat
     */
    public void setInstalmentsDatrDateFormat(String instalmentsDatrDateFormat) {
        this.instalmentsDatrDateFormat = instalmentsDatrDateFormat;
    }
}
