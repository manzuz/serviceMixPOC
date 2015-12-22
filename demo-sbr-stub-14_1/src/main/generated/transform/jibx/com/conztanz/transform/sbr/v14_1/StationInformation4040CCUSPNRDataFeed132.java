
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StationInformation_4040_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="departTerminal" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StationInformation4040CCUSPNRDataFeed132
{
    private String departTerminal;

    /** 
     * Get the 'departTerminal' element value. 1. Air segment: Terminal of departure information
     * 
     * @return value
     */
    public String getDepartTerminal() {
        return departTerminal;
    }

    /** 
     * Set the 'departTerminal' element value. 1. Air segment: Terminal of departure information
     * 
     * @param departTerminal
     */
    public void setDepartTerminal(String departTerminal) {
        this.departTerminal = departTerminal;
    }
}
