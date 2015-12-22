
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide frequent traveller information for mileage accrual and account updating.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FrequentTravellerVerification_25415_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="actionRequest"/>
 *     &lt;xs:element type="ProductAccountDetails_46308_C_CUS_PNRDataFeed_132" name="accountDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FrequentTravellerVerification25415SCUSPNRDataFeed132
{
    private String actionRequest;
    private ProductAccountDetails46308CCUSPNRDataFeed132 accountDetails;

    /** 
     * Get the 'actionRequest' element value. Unsignificant value (kept to be conformed to the IATA standard)
     * 
     * @return value
     */
    public String getActionRequest() {
        return actionRequest;
    }

    /** 
     * Set the 'actionRequest' element value. Unsignificant value (kept to be conformed to the IATA standard)
     * 
     * @param actionRequest
     */
    public void setActionRequest(String actionRequest) {
        this.actionRequest = actionRequest;
    }

    /** 
     * Get the 'accountDetails' element value. Specify the redemption information
     * 
     * @return value
     */
    public ProductAccountDetails46308CCUSPNRDataFeed132 getAccountDetails() {
        return accountDetails;
    }

    /** 
     * Set the 'accountDetails' element value. Specify the redemption information
     * 
     * @param accountDetails
     */
    public void setAccountDetails(
            ProductAccountDetails46308CCUSPNRDataFeed132 accountDetails) {
        this.accountDetails = accountDetails;
    }
}
