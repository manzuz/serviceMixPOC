
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an Amadeus PNR Option element
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OptionElement_54064_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OptionElementInformation_87450_C_CUS_PNRDataFeed_132" name="optionElementInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OptionElement54064SCUSPNRDataFeed132
{
    private OptionElementInformation87450CCUSPNRDataFeed132 optionElementInfo;

    /** 
     * Get the 'optionElementInfo' element value. Option element Information
     * 
     * @return value
     */
    public OptionElementInformation87450CCUSPNRDataFeed132 getOptionElementInfo() {
        return optionElementInfo;
    }

    /** 
     * Set the 'optionElementInfo' element value. Option element Information
     * 
     * @param optionElementInfo
     */
    public void setOptionElementInfo(
            OptionElementInformation87450CCUSPNRDataFeed132 optionElementInfo) {
        this.optionElementInfo = optionElementInfo;
    }
}
