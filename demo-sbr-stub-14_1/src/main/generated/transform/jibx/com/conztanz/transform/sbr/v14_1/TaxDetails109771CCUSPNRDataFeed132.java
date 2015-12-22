
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify a rate, type of tax, and currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxDetails_109771_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currencyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxDetails109771CCUSPNRDataFeed132
{
    private String rate;
    private String currencyCode;
    private List<String> typeList = new ArrayList<String>();

    /** 
     * Get the 'rate' element value. Amount of the tax.
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'rate' element value. Amount of the tax.
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'currencyCode' element value. Tax currency.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'currencyCode' element value. Tax currency.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the list of 'type' element items. Nature Code and ISO code.
     * 
     * @return list
     */
    public List<String> getTypeList() {
        return typeList;
    }

    /** 
     * Set the list of 'type' element items. Nature Code and ISO code.
     * 
     * @param list
     */
    public void setTypeList(List<String> list) {
        typeList = list;
    }
}
