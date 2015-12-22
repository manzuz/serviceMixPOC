
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the current and/or original fare basis code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateTariffClassInformation_121369_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rateTariffClass" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="rateTariffIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="otherRateTariffClass" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="otherRateTariffIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RateTariffClassInformation121369CCUSPNRDataFeed132
{
    private String rateTariffClass;
    private String rateTariffIndicator;
    private String otherRateTariffClass;
    private String otherRateTariffIndicator;

    /** 
     * Get the 'rateTariffClass' element value. Ticket designator of the fare basis
     * 
     * @return value
     */
    public String getRateTariffClass() {
        return rateTariffClass;
    }

    /** 
     * Set the 'rateTariffClass' element value. Ticket designator of the fare basis
     * 
     * @param rateTariffClass
     */
    public void setRateTariffClass(String rateTariffClass) {
        this.rateTariffClass = rateTariffClass;
    }

    /** 
     * Get the 'rateTariffIndicator' element value. Primary code of the fare basis. This is not a codeset but a free flow text field.
     * 
     * @return value
     */
    public String getRateTariffIndicator() {
        return rateTariffIndicator;
    }

    /** 
     * Set the 'rateTariffIndicator' element value. Primary code of the fare basis. This is not a codeset but a free flow text field.
     * 
     * @param rateTariffIndicator
     */
    public void setRateTariffIndicator(String rateTariffIndicator) {
        this.rateTariffIndicator = rateTariffIndicator;
    }

    /** 
     * Get the 'otherRateTariffClass' element value. Fare basis code of the fare basis. This is not a codeset but a free flow text field.
     * 
     * @return value
     */
    public String getOtherRateTariffClass() {
        return otherRateTariffClass;
    }

    /** 
     * Set the 'otherRateTariffClass' element value. Fare basis code of the fare basis. This is not a codeset but a free flow text field.
     * 
     * @param otherRateTariffClass
     */
    public void setOtherRateTariffClass(String otherRateTariffClass) {
        this.otherRateTariffClass = otherRateTariffClass;
    }

    /** 
     * Get the 'otherRateTariffIndicator' element value. pricedPTC Discount code
     * 
     * @return value
     */
    public String getOtherRateTariffIndicator() {
        return otherRateTariffIndicator;
    }

    /** 
     * Set the 'otherRateTariffIndicator' element value. pricedPTC Discount code
     * 
     * @param otherRateTariffIndicator
     */
    public void setOtherRateTariffIndicator(String otherRateTariffIndicator) {
        this.otherRateTariffIndicator = otherRateTariffIndicator;
    }
}
