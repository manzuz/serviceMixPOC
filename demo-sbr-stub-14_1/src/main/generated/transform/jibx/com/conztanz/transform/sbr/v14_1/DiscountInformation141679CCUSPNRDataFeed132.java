
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the reason for, amount, the company granting, and a number related to the reason for a discount.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DiscountInformation_141679_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="discountCode"/>
 *     &lt;xs:element type="xs:decimal" name="percentage" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="beneficiary" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="unitQuantity" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DiscountInformation141679CCUSPNRDataFeed132
{
    private String discountCode;
    private BigDecimal percentage;
    private String beneficiary;
    private BigDecimal unitQuantity;

    /** 
     * Get the 'discountCode' element value. Discount Code.
     * 
     * @return value
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /** 
     * Set the 'discountCode' element value. Discount Code.
     * 
     * @param discountCode
     */
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    /** 
     * Get the 'percentage' element value. Discount percentage applicable to the ticket amount for the specified segment(s) and passenger(s).
     * 
     * @return value
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /** 
     * Set the 'percentage' element value. Discount percentage applicable to the ticket amount for the specified segment(s) and passenger(s).
     * 
     * @param percentage
     */
    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    /** 
     * Get the 'beneficiary' element value. Status code of the percentage.
     * 
     * @return value
     */
    public String getBeneficiary() {
        return beneficiary;
    }

    /** 
     * Set the 'beneficiary' element value. Status code of the percentage.
     * 
     * @param beneficiary
     */
    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    /** 
     * Get the 'unitQuantity' element value. Number of passengers concerned by the discount (i.e. passengers of a Group). This field can also contain the paying for 10 number.
     * 
     * @return value
     */
    public BigDecimal getUnitQuantity() {
        return unitQuantity;
    }

    /** 
     * Set the 'unitQuantity' element value. Number of passengers concerned by the discount (i.e. passengers of a Group). This field can also contain the paying for 10 number.
     * 
     * @param unitQuantity
     */
    public void setUnitQuantity(BigDecimal unitQuantity) {
        this.unitQuantity = unitQuantity;
    }
}
