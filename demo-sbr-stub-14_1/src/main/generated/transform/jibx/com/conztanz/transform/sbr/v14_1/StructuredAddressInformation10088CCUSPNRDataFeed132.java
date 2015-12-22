
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredAddressInformation_10088_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="option"/>
 *     &lt;xs:element type="xs:string" name="optionText"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredAddressInformation10088CCUSPNRDataFeed132
{
    private String option;
    private String optionText;

    /** 
     * Get the 'option' element value. Following values are : CY for Company NA for Name L1 for Address line 1 L2 for Address line 2 PO for P.O. BOX ZP for Postal code CI for City ST for State CO for Country
     * 
     * @return value
     */
    public String getOption() {
        return option;
    }

    /** 
     * Set the 'option' element value. Following values are : CY for Company NA for Name L1 for Address line 1 L2 for Address line 2 PO for P.O. BOX ZP for Postal code CI for City ST for State CO for Country
     * 
     * @param option
     */
    public void setOption(String option) {
        this.option = option;
    }

    /** 
     * Get the 'optionText' element value. Alphanumeric information related to the level code.  Each code has its own max length, an..50 corresponds to the max length among.
     * 
     * @return value
     */
    public String getOptionText() {
        return optionText;
    }

    /** 
     * Set the 'optionText' element value. Alphanumeric information related to the level code.  Each code has its own max length, an..50 corresponds to the max length among.
     * 
     * @param optionText
     */
    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }
}
