
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Identification of the frequent traveller number by company code with the capability to reference a specific traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FrequentTravellerIdentification_46444_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="carrier"/>
 *     &lt;xs:element type="xs:string" name="number"/>
 *     &lt;xs:element type="xs:string" name="tierLevel" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="priorityCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="tierDescription" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="customerValue" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FrequentTravellerIdentification46444CCUSPNRDataFeed132
{
    private String carrier;
    private String number;
    private String tierLevel;
    private String priorityCode;
    private String tierDescription;
    private String companyCode;
    private BigDecimal customerValue;

    /** 
     * Get the 'carrier' element value. Carrier where the FQTV is registered.
     * 
     * @return value
     */
    public String getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'carrier' element value. Carrier where the FQTV is registered.
     * 
     * @param carrier
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'number' element value. Frequent Traveller Identification Number
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Frequent Traveller Identification Number
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'tierLevel' element value. To specify a Tier linked to the FQTV
     * 
     * @return value
     */
    public String getTierLevel() {
        return tierLevel;
    }

    /** 
     * Set the 'tierLevel' element value. To specify a Tier linked to the FQTV
     * 
     * @param tierLevel
     */
    public void setTierLevel(String tierLevel) {
        this.tierLevel = tierLevel;
    }

    /** 
     * Get the 'priorityCode' element value. To specify the Priority of the FQTV.
     * 
     * @return value
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /** 
     * Set the 'priorityCode' element value. To specify the Priority of the FQTV.
     * 
     * @param priorityCode
     */
    public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    /** 
     * Get the 'tierDescription' element value. Full Text Tier description ex: EMERALD, SAPPHIRE
     * 
     * @return value
     */
    public String getTierDescription() {
        return tierDescription;
    }

    /** 
     * Set the 'tierDescription' element value. Full Text Tier description ex: EMERALD, SAPPHIRE
     * 
     * @param tierDescription
     */
    public void setTierDescription(String tierDescription) {
        this.tierDescription = tierDescription;
    }

    /** 
     * Get the 'companyCode' element value. Carrier of alliance
     * 
     * @return value
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /** 
     * Set the 'companyCode' element value. Carrier of alliance
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /** 
     * Get the 'customerValue' element value. Provide airline customer value of the frequent traveller.
     * 
     * @return value
     */
    public BigDecimal getCustomerValue() {
        return customerValue;
    }

    /** 
     * Set the 'customerValue' element value. Provide airline customer value of the frequent traveller.
     * 
     * @param customerValue
     */
    public void setCustomerValue(BigDecimal customerValue) {
        this.customerValue = customerValue;
    }
}
