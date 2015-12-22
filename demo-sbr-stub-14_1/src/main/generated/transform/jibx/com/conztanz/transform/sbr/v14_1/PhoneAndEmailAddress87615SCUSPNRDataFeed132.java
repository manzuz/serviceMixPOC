
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a phone or email address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PhoneAndEmailAddress_87615_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="phoneOrEmailType"/>
 *     &lt;xs:element type="StructuredTelephoneNumber_132933_C_CUS_PNRDataFeed_132" name="telephoneNumberDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PhoneAndEmailAddress87615SCUSPNRDataFeed132
{
    private String phoneOrEmailType;
    private StructuredTelephoneNumber132933CCUSPNRDataFeed132 telephoneNumberDetails;

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
     * Get the 'telephoneNumberDetails' element value. Structured telephone number
     * 
     * @return value
     */
    public StructuredTelephoneNumber132933CCUSPNRDataFeed132 getTelephoneNumberDetails() {
        return telephoneNumberDetails;
    }

    /** 
     * Set the 'telephoneNumberDetails' element value. Structured telephone number
     * 
     * @param telephoneNumberDetails
     */
    public void setTelephoneNumberDetails(
            StructuredTelephoneNumber132933CCUSPNRDataFeed132 telephoneNumberDetails) {
        this.telephoneNumberDetails = telephoneNumberDetails;
    }
}
