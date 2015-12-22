
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a phone or email address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PhoneAndEmailAddress_32298_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="phoneOrEmailType"/>
 *     &lt;xs:element type="StructuredTelephoneNumber_48448_C_CUS_PNRDataFeed_132" name="telephoneNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="emailAddress" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PhoneAndEmailAddress32298SCUSPNRDataFeed132
{
    private String phoneOrEmailType;
    private StructuredTelephoneNumber48448CCUSPNRDataFeed132 telephoneNumber;
    private String emailAddress;

    /** 
     * Get the 'phoneOrEmailType' element value. Phone or Email contact type
     * 
     * @return value
     */
    public String getPhoneOrEmailType() {
        return phoneOrEmailType;
    }

    /** 
     * Set the 'phoneOrEmailType' element value. Phone or Email contact type
     * 
     * @param phoneOrEmailType
     */
    public void setPhoneOrEmailType(String phoneOrEmailType) {
        this.phoneOrEmailType = phoneOrEmailType;
    }

    /** 
     * Get the 'telephoneNumber' element value. Structured telephone number
     * 
     * @return value
     */
    public StructuredTelephoneNumber48448CCUSPNRDataFeed132 getTelephoneNumber() {
        return telephoneNumber;
    }

    /** 
     * Set the 'telephoneNumber' element value. Structured telephone number
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(
            StructuredTelephoneNumber48448CCUSPNRDataFeed132 telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
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
