
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a phone or email address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PhoneAndEmailAddress_87627_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="phoneOrEmailType"/>
 *     &lt;xs:element type="xs:string" name="emailAddress"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PhoneAndEmailAddress87627SCUSPNRDataFeed132
{
    private String phoneOrEmailType;
    private String emailAddress;

    /** 
     * Get the 'phoneOrEmailType' element value. - PHO phone number - FAX fax number - MAI
     * 
     * @return value
     */
    public String getPhoneOrEmailType() {
        return phoneOrEmailType;
    }

    /** 
     * Set the 'phoneOrEmailType' element value. - PHO phone number - FAX fax number - MAI
     * 
     * @param phoneOrEmailType
     */
    public void setPhoneOrEmailType(String phoneOrEmailType) {
        this.phoneOrEmailType = phoneOrEmailType;
    }

    /** 
     * Get the 'emailAddress' element value. Email address
     * 
     * @return value
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /** 
     * Set the 'emailAddress' element value. Email address
     * 
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
