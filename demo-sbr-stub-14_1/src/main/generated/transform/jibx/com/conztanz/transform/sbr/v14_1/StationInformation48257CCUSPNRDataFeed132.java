
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StationInformation_48257_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="arrivalTerminal" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StationInformation48257CCUSPNRDataFeed132
{
    private String arrivalTerminal;

    /** 
     * Get the 'arrivalTerminal' element value. 1. Air segment: Terminal of arrival information
     * 
     * @return value
     */
    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    /** 
     * Set the 'arrivalTerminal' element value. 1. Air segment: Terminal of arrival information
     * 
     * @param arrivalTerminal
     */
    public void setArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }
}
