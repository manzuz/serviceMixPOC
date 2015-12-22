
package com.conztanz.transform.sbr.v14_1;

/** 
 * Describes communication channel
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommunicationContact_94522_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CommunicationContact_142139_C_CUS_PNRDataFeed_132" name="communication"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommunicationContact94522SCUSPNRDataFeed132
{
    private CommunicationContact142139CCUSPNRDataFeed132 communication;

    /** 
     * Get the 'communication' element value. Communication channel
     * 
     * @return value
     */
    public CommunicationContact142139CCUSPNRDataFeed132 getCommunication() {
        return communication;
    }

    /** 
     * Set the 'communication' element value. Communication channel
     * 
     * @param communication
     */
    public void setCommunication(
            CommunicationContact142139CCUSPNRDataFeed132 communication) {
        this.communication = communication;
    }
}
