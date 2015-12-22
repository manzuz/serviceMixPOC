
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify specific credit card information returned by VISA link only
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificVisaLinkCreditCardInformation_94518_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MessageReference_142132_C_CUS_PNRDataFeed_132" name="msgRef" minOccurs="0"/>
 *     &lt;xs:element type="ResponseIdentification_142133_C_CUS_PNRDataFeed_132" name="respIdentification" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificVisaLinkCreditCardInformation94518SCUSPNRDataFeed132
{
    private MessageReference142132CCUSPNRDataFeed132 msgRef;
    private ResponseIdentification142133CCUSPNRDataFeed132 respIdentification;

    /** 
     * Get the 'msgRef' element value. ISO8583 specific info
     * 
     * @return value
     */
    public MessageReference142132CCUSPNRDataFeed132 getMsgRef() {
        return msgRef;
    }

    /** 
     * Set the 'msgRef' element value. ISO8583 specific info
     * 
     * @param msgRef
     */
    public void setMsgRef(MessageReference142132CCUSPNRDataFeed132 msgRef) {
        this.msgRef = msgRef;
    }

    /** 
     * Get the 'respIdentification' element value. Response identification
     * 
     * @return value
     */
    public ResponseIdentification142133CCUSPNRDataFeed132 getRespIdentification() {
        return respIdentification;
    }

    /** 
     * Set the 'respIdentification' element value. Response identification
     * 
     * @param respIdentification
     */
    public void setRespIdentification(
            ResponseIdentification142133CCUSPNRDataFeed132 respIdentification) {
        this.respIdentification = respIdentification;
    }
}
