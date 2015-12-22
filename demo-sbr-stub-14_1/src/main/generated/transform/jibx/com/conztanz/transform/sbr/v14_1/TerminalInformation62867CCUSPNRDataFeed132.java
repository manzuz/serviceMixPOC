
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify departure or arrival information relative  to a terminal.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TerminalInformation_62867_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="arrivalTerminal"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TerminalInformation62867CCUSPNRDataFeed132
{
    private String arrivalTerminal;

    /** 
     * Get the 'arrivalTerminal' element value. Arrival Terminal
     * 
     * @return value
     */
    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    /** 
     * Set the 'arrivalTerminal' element value. Arrival Terminal
     * 
     * @param arrivalTerminal
     */
    public void setArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }
}
