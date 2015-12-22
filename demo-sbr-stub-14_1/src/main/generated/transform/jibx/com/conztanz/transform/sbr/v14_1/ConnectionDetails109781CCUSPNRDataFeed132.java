
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the location, product supplier and time for a connection with the next means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConnectionDetails_109781_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="processIndicator"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConnectionDetails109781CCUSPNRDataFeed132
{
    private String processIndicator;

    /** 
     * Get the 'processIndicator' element value. Stop over indicator X or O.
     * 
     * @return value
     */
    public String getProcessIndicator() {
        return processIndicator;
    }

    /** 
     * Set the 'processIndicator' element value. Stop over indicator X or O.
     * 
     * @param processIndicator
     */
    public void setProcessIndicator(String processIndicator) {
        this.processIndicator = processIndicator;
    }
}
