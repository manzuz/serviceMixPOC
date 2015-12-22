
package com.conztanz.transform.sbr.v14_1;

/** 
 * Characteristics of the originator of a request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorDetails_47607_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="codedCountry"/>
 *     &lt;xs:element type="xs:string" name="codedCurrency" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="codedLanguage" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorDetails47607CCUSPNRDataFeed132
{
    private String codedCountry;
    private String codedCurrency;
    private String codedLanguage;

    /** 
     * Get the 'codedCountry' element value. Country code
     * 
     * @return value
     */
    public String getCodedCountry() {
        return codedCountry;
    }

    /** 
     * Set the 'codedCountry' element value. Country code
     * 
     * @param codedCountry
     */
    public void setCodedCountry(String codedCountry) {
        this.codedCountry = codedCountry;
    }

    /** 
     * Get the 'codedCurrency' element value. Currency code
     * 
     * @return value
     */
    public String getCodedCurrency() {
        return codedCurrency;
    }

    /** 
     * Set the 'codedCurrency' element value. Currency code
     * 
     * @param codedCurrency
     */
    public void setCodedCurrency(String codedCurrency) {
        this.codedCurrency = codedCurrency;
    }

    /** 
     * Get the 'codedLanguage' element value. Language code
     * 
     * @return value
     */
    public String getCodedLanguage() {
        return codedLanguage;
    }

    /** 
     * Set the 'codedLanguage' element value. Language code
     * 
     * @param codedLanguage
     */
    public void setCodedLanguage(String codedLanguage) {
        this.codedLanguage = codedLanguage;
    }
}
