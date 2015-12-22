
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information related to agent terminal
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TerminalIdentificationDescription_94560_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="terminalID" minOccurs="0"/>
 *     &lt;xs:element type="DistributionChannel_142183_C_CUS_PNRDataFeed_132" name="distributionChannel"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TerminalIdentificationDescription94560SCUSPNRDataFeed132
{
    private String terminalID;
    private DistributionChannel142183CCUSPNRDataFeed132 distributionChannel;

    /** 
     * Get the 'terminalID' element value. Identification of the transaction initiator.
     * 
     * @return value
     */
    public String getTerminalID() {
        return terminalID;
    }

    /** 
     * Set the 'terminalID' element value. Identification of the transaction initiator.
     * 
     * @param terminalID
     */
    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    /** 
     * Get the 'distributionChannel' element value. The distribution channel.
     * 
     * @return value
     */
    public DistributionChannel142183CCUSPNRDataFeed132 getDistributionChannel() {
        return distributionChannel;
    }

    /** 
     * Set the 'distributionChannel' element value. The distribution channel.
     * 
     * @param distributionChannel
     */
    public void setDistributionChannel(
            DistributionChannel142183CCUSPNRDataFeed132 distributionChannel) {
        this.distributionChannel = distributionChannel;
    }
}
