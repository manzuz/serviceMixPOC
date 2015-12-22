
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Identification of facilities for a product or a service by type or description
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductFacilities_48593_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="entertainement" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="entertainementDescription" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="productQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="productExtensionCode" minOccurs="0" maxOccurs="26"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductFacilities48593CCUSPNRDataFeed132
{
    private String entertainement;
    private String entertainementDescription;
    private String productQualifier;
    private List<String> productExtensionCodeList = new ArrayList<String>();

    /** 
     * Get the 'entertainement' element value. 1. Air segment: - Entertainment code or Meal code (before EOT only)  E for entertainment  M for meal service
     * 
     * @return value
     */
    public String getEntertainement() {
        return entertainement;
    }

    /** 
     * Set the 'entertainement' element value. 1. Air segment: - Entertainment code or Meal code (before EOT only)  E for entertainment  M for meal service
     * 
     * @param entertainement
     */
    public void setEntertainement(String entertainement) {
        this.entertainement = entertainement;
    }

    /** 
     * Get the 'entertainementDescription' element value. 1. Air segment: 2 characters of meal service code for AF if entertainement  is M
     * 
     * @return value
     */
    public String getEntertainementDescription() {
        return entertainementDescription;
    }

    /** 
     * Set the 'entertainementDescription' element value. 1. Air segment: 2 characters of meal service code for AF if entertainement  is M
     * 
     * @param entertainementDescription
     */
    public void setEntertainementDescription(String entertainementDescription) {
        this.entertainementDescription = entertainementDescription;
    }

    /** 
     * Get the 'productQualifier' element value. Product qualifier
     * 
     * @return value
     */
    public String getProductQualifier() {
        return productQualifier;
    }

    /** 
     * Set the 'productQualifier' element value. Product qualifier
     * 
     * @param productQualifier
     */
    public void setProductQualifier(String productQualifier) {
        this.productQualifier = productQualifier;
    }

    /** 
     * Get the list of 'productExtensionCode' element items. Product extension code
     * 
     * @return list
     */
    public List<String> getProductExtensionCodeList() {
        return productExtensionCodeList;
    }

    /** 
     * Set the list of 'productExtensionCode' element items. Product extension code
     * 
     * @param list
     */
    public void setProductExtensionCodeList(List<String> list) {
        productExtensionCodeList = list;
    }
}
