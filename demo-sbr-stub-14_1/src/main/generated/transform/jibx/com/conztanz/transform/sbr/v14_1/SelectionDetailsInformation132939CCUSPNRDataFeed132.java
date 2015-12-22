
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a selected option and associated information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SelectionDetailsInformation_132939_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="option"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SelectionDetailsInformation132939CCUSPNRDataFeed132
{
    private String option;

    /** 
     * Get the 'option' element value. - P6 for seamless availability
     * 
     * @return value
     */
    public String getOption() {
        return option;
    }

    /** 
     * Set the 'option' element value. - P6 for seamless availability
     * 
     * @param option
     */
    public void setOption(String option) {
        this.option = option;
    }
}
