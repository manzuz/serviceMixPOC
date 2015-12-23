
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a selected option and associated              information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SelectionDetailsInformation_187268_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="option"/>
 *     &lt;xs:element type="xs:string" name="optionInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SelectionDetailsInformation187268CCUSPNRDataFeed132
{
    private String option;
    private String optionInformation;

    /** 
     * Get the 'option' element value.
     * 
     * @return value
     */
    public String getOption() {
        return option;
    }

    /** 
     * Set the 'option' element value.
     * 
     * @param option
     */
    public void setOption(String option) {
        this.option = option;
    }

    /** 
     * Get the 'optionInformation' element value.
     * 
     * @return value
     */
    public String getOptionInformation() {
        return optionInformation;
    }

    /** 
     * Set the 'optionInformation' element value.
     * 
     * @param optionInformation
     */
    public void setOptionInformation(String optionInformation) {
        this.optionInformation = optionInformation;
    }
}