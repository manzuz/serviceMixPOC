
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * To convey additional information related to a ticket
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PricingOrTicketingSubsequent_123364_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="itemNumber" minOccurs="0"/>
 *     &lt;xs:element type="RateTariffClassInformation_180258_C_CUS_PNRDataFeed_132" name="fareBasisDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="fareValue" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="xs:string" name="priceType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="specialCondition" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="otherSpecialCondition" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="additionalSpecialCondition" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="taxCategory" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PricingOrTicketingSubsequent123364SCUSPNRDataFeed132
{
    private String itemNumber;
    private RateTariffClassInformation180258CCUSPNRDataFeed132 fareBasisDetails;
    private List<BigDecimal> fareValueList = new ArrayList<BigDecimal>();
    private String priceType;
    private String specialCondition;
    private String otherSpecialCondition;
    private String additionalSpecialCondition;
    private List<String> taxCategoryList = new ArrayList<String>();

    /** 
     * Get the 'itemNumber' element value. Item Number
     * 
     * @return value
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /** 
     * Set the 'itemNumber' element value. Item Number
     * 
     * @param itemNumber
     */
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    /** 
     * Get the 'fareBasisDetails' element value. RATE OR TARIFF CLASS INFORMATION
     * 
     * @return value
     */
    public RateTariffClassInformation180258CCUSPNRDataFeed132 getFareBasisDetails() {
        return fareBasisDetails;
    }

    /** 
     * Set the 'fareBasisDetails' element value. RATE OR TARIFF CLASS INFORMATION
     * 
     * @param fareBasisDetails
     */
    public void setFareBasisDetails(
            RateTariffClassInformation180258CCUSPNRDataFeed132 fareBasisDetails) {
        this.fareBasisDetails = fareBasisDetails;
    }

    /** 
     * Get the list of 'fareValue' element items. Notional fare value and actual Coupon fare value
     * 
     * @return list
     */
    public List<BigDecimal> getFareValueList() {
        return fareValueList;
    }

    /** 
     * Set the list of 'fareValue' element items. Notional fare value and actual Coupon fare value
     * 
     * @param list
     */
    public void setFareValueList(List<BigDecimal> list) {
        fareValueList = list;
    }

    /** 
     * Get the 'priceType' element value.
     * 
     * @return value
     */
    public String getPriceType() {
        return priceType;
    }

    /** 
     * Set the 'priceType' element value.
     * 
     * @param priceType
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    /** 
     * Get the 'specialCondition' element value. Special condition, coded
     * 
     * @return value
     */
    public String getSpecialCondition() {
        return specialCondition;
    }

    /** 
     * Set the 'specialCondition' element value. Special condition, coded
     * 
     * @param specialCondition
     */
    public void setSpecialCondition(String specialCondition) {
        this.specialCondition = specialCondition;
    }

    /** 
     * Get the 'otherSpecialCondition' element value. Special condition, coded
     * 
     * @return value
     */
    public String getOtherSpecialCondition() {
        return otherSpecialCondition;
    }

    /** 
     * Set the 'otherSpecialCondition' element value. Special condition, coded
     * 
     * @param otherSpecialCondition
     */
    public void setOtherSpecialCondition(String otherSpecialCondition) {
        this.otherSpecialCondition = otherSpecialCondition;
    }

    /** 
     * Get the 'additionalSpecialCondition' element value. Special condition, coded
     * 
     * @return value
     */
    public String getAdditionalSpecialCondition() {
        return additionalSpecialCondition;
    }

    /** 
     * Set the 'additionalSpecialCondition' element value. Special condition, coded
     * 
     * @param additionalSpecialCondition
     */
    public void setAdditionalSpecialCondition(String additionalSpecialCondition) {
        this.additionalSpecialCondition = additionalSpecialCondition;
    }

    /** 
     * Get the list of 'taxCategory' element items.
     * 
     * @return list
     */
    public List<String> getTaxCategoryList() {
        return taxCategoryList;
    }

    /** 
     * Set the list of 'taxCategory' element items.
     * 
     * @param list
     */
    public void setTaxCategoryList(List<String> list) {
        taxCategoryList = list;
    }
}
