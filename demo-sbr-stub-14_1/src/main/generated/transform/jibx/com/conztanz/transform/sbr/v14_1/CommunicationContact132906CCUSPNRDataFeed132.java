
package com.conztanz.transform.sbr.v14_1;

/** 
 * Communication number of a department or employee in a specified channel.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommunicationContact_132906_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="email"/>
 *     &lt;xs:element type="xs:string" name="contactQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommunicationContact132906CCUSPNRDataFeed132
{
    private String email;
    private String contactQualifier;

    /** 
     * Get the 'email' element value. Email
     * 
     * @return value
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Set the 'email' element value. Email
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Get the 'contactQualifier' element value. Contact qualifier. EM for Electronic mail
     * 
     * @return value
     */
    public String getContactQualifier() {
        return contactQualifier;
    }

    /** 
     * Set the 'contactQualifier' element value. Contact qualifier. EM for Electronic mail
     * 
     * @param contactQualifier
     */
    public void setContactQualifier(String contactQualifier) {
        this.contactQualifier = contactQualifier;
    }
}
