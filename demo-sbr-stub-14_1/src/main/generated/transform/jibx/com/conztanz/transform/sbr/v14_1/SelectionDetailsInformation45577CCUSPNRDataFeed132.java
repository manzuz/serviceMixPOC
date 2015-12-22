
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SelectionDetailsInformation_45577_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="option"/>
 *     &lt;xs:element type="xs:string" name="optionInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SelectionDetailsInformation45577CCUSPNRDataFeed132
{
    private String option;
    private String optionInformation;

    /** 
     * Get the 'option' element value. see code list
     * 
     * @return value
     */
    public String getOption() {
        return option;
    }

    /** 
     * Set the 'option' element value. see code list
     * 
     * @param option
     */
    public void setOption(String option) {
        this.option = option;
    }

    /** 
     * Get the 'optionInformation' element value. CRU segment - occurrence 1 : Duration of the cruise (saling length)  expressed in days.
     * 
     * @return value
     */
    public String getOptionInformation() {
        return optionInformation;
    }

    /** 
     * Set the 'optionInformation' element value. CRU segment - occurrence 1 : Duration of the cruise (saling length)  expressed in days.
     * 
     * @param optionInformation
     */
    public void setOptionInformation(String optionInformation) {
        this.optionInformation = optionInformation;
    }
}
