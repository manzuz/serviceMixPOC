
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify departure/arrival information concerning a means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StationInformation_187260_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="terminal" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StationInformation187260CCUSPNRDataFeed132
{
    private String terminal;

    /** 
     * Get the 'terminal' element value.
     * 
     * @return value
     */
    public String getTerminal() {
        return terminal;
    }

    /** 
     * Set the 'terminal' element value.
     * 
     * @param terminal
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }
}
