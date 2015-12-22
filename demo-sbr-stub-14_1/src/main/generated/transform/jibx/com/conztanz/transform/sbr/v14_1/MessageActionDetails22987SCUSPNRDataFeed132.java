
package com.conztanz.transform.sbr.v14_1;

/** 
 * Message type and business function
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MessageActionDetails_22987_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MessageFunctionOrBusinessDetails_45517_C_CUS_PNRDataFeed_132" name="business"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MessageActionDetails22987SCUSPNRDataFeed132
{
    private MessageFunctionOrBusinessDetails45517CCUSPNRDataFeed132 business;

    /** 
     * Get the 'business' element value. Message function or Business details
     * 
     * @return value
     */
    public MessageFunctionOrBusinessDetails45517CCUSPNRDataFeed132 getBusiness() {
        return business;
    }

    /** 
     * Set the 'business' element value. Message function or Business details
     * 
     * @param business
     */
    public void setBusiness(
            MessageFunctionOrBusinessDetails45517CCUSPNRDataFeed132 business) {
        this.business = business;
    }
}
