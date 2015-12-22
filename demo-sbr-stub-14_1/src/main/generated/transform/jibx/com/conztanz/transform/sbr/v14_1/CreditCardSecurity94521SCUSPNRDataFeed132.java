
package com.conztanz.transform.sbr.v14_1;

/** 
 * Conveys data of the credit card authentication
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CreditCardSecurity_94521_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AuthenticationData_142138_C_CUS_PNRDataFeed_132" name="authenticationDataDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CreditCardSecurity94521SCUSPNRDataFeed132
{
    private AuthenticationData142138CCUSPNRDataFeed132 authenticationDataDetails;

    /** 
     * Get the 'authenticationDataDetails' element value. Conveys all data of authentication process. Only used today for "Verified by Visa" process
     * 
     * @return value
     */
    public AuthenticationData142138CCUSPNRDataFeed132 getAuthenticationDataDetails() {
        return authenticationDataDetails;
    }

    /** 
     * Set the 'authenticationDataDetails' element value. Conveys all data of authentication process. Only used today for "Verified by Visa" process
     * 
     * @param authenticationDataDetails
     */
    public void setAuthenticationDataDetails(
            AuthenticationData142138CCUSPNRDataFeed132 authenticationDataDetails) {
        this.authenticationDataDetails = authenticationDataDetails;
    }
}
