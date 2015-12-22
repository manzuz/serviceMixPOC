
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify the rates or tariff details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TariffInformation_126841_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="priceAmount"/>
 *     &lt;xs:element type="xs:string" name="priceQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TariffInformation126841CCUSPNRDataFeed132
{
    private BigDecimal priceAmount;
    private String priceQualifier;

    /** 
     * Get the 'priceAmount' element value. Prive value. The value conveyed equals 100 times the original value in order to avoid transporting decimal placement information.
     * 
     * @return value
     */
    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    /** 
     * Set the 'priceAmount' element value. Prive value. The value conveyed equals 100 times the original value in order to avoid transporting decimal placement information.
     * 
     * @param priceAmount
     */
    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    /** 
     * Get the 'priceQualifier' element value. Gives the type of amount.
     * 
     * @return value
     */
    public String getPriceQualifier() {
        return priceQualifier;
    }

    /** 
     * Set the 'priceQualifier' element value. Gives the type of amount.
     * 
     * @param priceQualifier
     */
    public void setPriceQualifier(String priceQualifier) {
        this.priceQualifier = priceQualifier;
    }
}
