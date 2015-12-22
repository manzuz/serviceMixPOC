
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a phone or email address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PhoneAndEmailAddress_128774_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="phoneOrEmailType"/>
 *     &lt;xs:element type="StructuredTelephoneNumber_187626_C_CUS_PNRDataFeed_132" name="telephoneNumberDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PhoneAndEmailAddress128774SCUSPNRDataFeed132
{
    private String phoneOrEmailType;
    private StructuredTelephoneNumber187626CCUSPNRDataFeed132 telephoneNumberDetails;

    /** 
     * Get the 'phoneOrEmailType' element value. Allows to choose whether information sent is :  - 3   a phone number  - FAX a fax number
     * 
     * @return value
     */
    public String getPhoneOrEmailType() {
        return phoneOrEmailType;
    }

    /** 
     * Set the 'phoneOrEmailType' element value. Allows to choose whether information sent is :  - 3   a phone number  - FAX a fax number
     * 
     * @param phoneOrEmailType
     */
    public void setPhoneOrEmailType(String phoneOrEmailType) {
        this.phoneOrEmailType = phoneOrEmailType;
    }

    /** 
     * Get the 'telephoneNumberDetails' element value. Structured telephone or fax number
     * 
     * @return value
     */
    public StructuredTelephoneNumber187626CCUSPNRDataFeed132 getTelephoneNumberDetails() {
        return telephoneNumberDetails;
    }

    /** 
     * Set the 'telephoneNumberDetails' element value. Structured telephone or fax number
     * 
     * @param telephoneNumberDetails
     */
    public void setTelephoneNumberDetails(
            StructuredTelephoneNumber187626CCUSPNRDataFeed132 telephoneNumberDetails) {
        this.telephoneNumberDetails = telephoneNumberDetails;
    }
}
