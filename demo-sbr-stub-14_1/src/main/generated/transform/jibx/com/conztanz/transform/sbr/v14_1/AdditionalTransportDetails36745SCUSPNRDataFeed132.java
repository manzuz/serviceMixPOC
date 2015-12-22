
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey additional information concerning a means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalTransportDetails_36745_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TerminalInformation_62867_C_CUS_PNRDataFeed_132" name="terminalInformation" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalTransportDetails36745SCUSPNRDataFeed132
{
    private List<TerminalInformation62867CCUSPNRDataFeed132> terminalInformationList = new ArrayList<TerminalInformation62867CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'terminalInformation' element items. Terminal Information
     * 
     * @return list
     */
    public List<TerminalInformation62867CCUSPNRDataFeed132> getTerminalInformationList() {
        return terminalInformationList;
    }

    /** 
     * Set the list of 'terminalInformation' element items. Terminal Information
     * 
     * @param list
     */
    public void setTerminalInformationList(
            List<TerminalInformation62867CCUSPNRDataFeed132> list) {
        terminalInformationList = list;
    }
}
