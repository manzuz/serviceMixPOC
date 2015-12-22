
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * MISCELLANEOUS REMARKS
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MiscellaneousRemarks_10084_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="category" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="freetext" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="providerType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="amount" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="officeId" minOccurs="0" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MiscellaneousRemarks10084CCUSPNRDataFeed132
{
    private String type;
    private String category;
    private String freetext;
    private String providerType;
    private String currency;
    private BigDecimal amount;
    private List<String> officeIdList = new ArrayList<String>();

    /** 
     * Get the 'type' element value. RC for confidential remark  RI for invoice remark  RM for miscellaneous remark  RQ for quality control remark  RX for corporate remark
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. RC for confidential remark  RI for invoice remark  RM for miscellaneous remark  RQ for quality control remark  RX for corporate remark
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'category' element value. This is the 3rd character (x) of the remark title RIx or RMx, or 2 letter code for RMxx. Conditional for RM, not applicable for RC, RQ and RX
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'category' element value. This is the 3rd character (x) of the remark title RIx or RMx, or 2 letter code for RMxx. Conditional for RM, not applicable for RC, RQ and RX
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /** 
     * Get the 'freetext' element value. Free text and message sequence numbers of the remarks.
     * 
     * @return value
     */
    public String getFreetext() {
        return freetext;
    }

    /** 
     * Set the 'freetext' element value. Free text and message sequence numbers of the remarks.
     * 
     * @param freetext
     */
    public void setFreetext(String freetext) {
        this.freetext = freetext;
    }

    /** 
     * Get the 'providerType' element value. Provider type (element RIA):  1 for Air provider   2 for Car provider (CCR)  3 for Hotel Provider (HHL)  M for Miscellaneous
     * 
     * @return value
     */
    public String getProviderType() {
        return providerType;
    }

    /** 
     * Set the 'providerType' element value. Provider type (element RIA):  1 for Air provider   2 for Car provider (CCR)  3 for Hotel Provider (HHL)  M for Miscellaneous
     * 
     * @param providerType
     */
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /** 
     * Get the 'currency' element value. MCO element : Currency code
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. MCO element : Currency code
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'amount' element value. MCO element : total fee amount
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. MCO element : total fee amount
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the list of 'officeId' element items. Office Id (confidential remark RC)
     * 
     * @return list
     */
    public List<String> getOfficeIdList() {
        return officeIdList;
    }

    /** 
     * Set the list of 'officeId' element items. Office Id (confidential remark RC)
     * 
     * @param list
     */
    public void setOfficeIdList(List<String> list) {
        officeIdList = list;
    }
}
