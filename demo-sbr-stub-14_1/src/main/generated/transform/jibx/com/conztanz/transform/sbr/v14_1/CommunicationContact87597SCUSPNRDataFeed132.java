
package com.conztanz.transform.sbr.v14_1;

/** 
 * email
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommunicationContact_87597_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CommunicationContact_132906_C_CUS_PNRDataFeed_132" name="contact"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommunicationContact87597SCUSPNRDataFeed132
{
    private CommunicationContact132906CCUSPNRDataFeed132 contact;

    /** 
     * Get the 'contact' element value. Customer contact
     * 
     * @return value
     */
    public CommunicationContact132906CCUSPNRDataFeed132 getContact() {
        return contact;
    }

    /** 
     * Set the 'contact' element value. Customer contact
     * 
     * @param contact
     */
    public void setContact(CommunicationContact132906CCUSPNRDataFeed132 contact) {
        this.contact = contact;
    }
}
