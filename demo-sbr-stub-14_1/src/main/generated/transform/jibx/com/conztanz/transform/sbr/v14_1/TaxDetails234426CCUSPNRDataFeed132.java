
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify a rate, type of tax, and currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxDetails_234426_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="currencyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxDetails234426CCUSPNRDataFeed132
{
    private String rate;
    private String currencyCode;
    private List<String> typeList = new ArrayList<String>();

    /** 
     * Get the 'rate' element value. rvAmount
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'rate' element value. rvAmount
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'currencyCode' element value. currencyCode
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'currencyCode' element value. currencyCode
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the list of 'type' element items. type
     * 
     * @return list
     */
    public List<String> getTypeList() {
        return typeList;
    }

    /** 
     * Set the list of 'type' element items. type
     * 
     * @param list
     */
    public void setTypeList(List<String> list) {
        typeList = list;
    }
}
