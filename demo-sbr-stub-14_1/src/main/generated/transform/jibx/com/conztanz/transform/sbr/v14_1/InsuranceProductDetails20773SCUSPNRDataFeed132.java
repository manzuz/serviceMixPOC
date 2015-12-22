
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Product Details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InsuranceProductDetails_20773_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="extraReference" minOccurs="0" maxOccurs="4"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InsuranceProductDetails20773SCUSPNRDataFeed132
{
    private String companyCode;
    private String countryCode;
    private List<String> extraReferenceList = new ArrayList<String>();

    /** 
     * Get the 'companyCode' element value. This data element is used to convey the company code of a non-air company
     * 
     * @return value
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /** 
     * Set the 'companyCode' element value. This data element is used to convey the company code of a non-air company
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /** 
     * Get the 'countryCode' element value. To identify the countrycode from the provider.
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value. To identify the countrycode from the provider.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the list of 'extraReference' element items. Authorization number provided by ht insurance company
     * 
     * @return list
     */
    public List<String> getExtraReferenceList() {
        return extraReferenceList;
    }

    /** 
     * Set the list of 'extraReference' element items. Authorization number provided by ht insurance company
     * 
     * @param list
     */
    public void setExtraReferenceList(List<String> list) {
        extraReferenceList = list;
    }
}
