
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * will convey all credit card data needed for payment
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupForCreditCardData_112578_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CreditCardData_94502_S_CUS_PNRDataFeed_132" name="creditCardDetails"/>
 *     &lt;xs:element type="ReferenceInformation_94503_S_CUS_PNRDataFeed_132" name="fortknoxIds" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="Address_94501_S_CUS_PNRDataFeed_132" name="cardHolderAddress" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupForCreditCardData112578GCUSPNRDataFeed132
{
    private CreditCardData94502SCUSPNRDataFeed132 creditCardDetails;
    private List<ReferenceInformation94503SCUSPNRDataFeed132> fortknoxIdList = new ArrayList<ReferenceInformation94503SCUSPNRDataFeed132>();
    private Address94501SCUSPNRDataFeed132 cardHolderAddress;

    /** 
     * Get the 'creditCardDetails' element value. will convey all the data related to the credit card
     * 
     * @return value
     */
    public CreditCardData94502SCUSPNRDataFeed132 getCreditCardDetails() {
        return creditCardDetails;
    }

    /** 
     * Set the 'creditCardDetails' element value. will convey all the data related to the credit card
     * 
     * @param creditCardDetails
     */
    public void setCreditCardDetails(
            CreditCardData94502SCUSPNRDataFeed132 creditCardDetails) {
        this.creditCardDetails = creditCardDetails;
    }

    /** 
     * Get the list of 'fortknoxIds' element items. will convey both the CVV and the Credit card number Ids stored in the fortknox Database  it could also be used to store identifiers from external Tokenization Service Provider (TSP).
     * 
     * @return list
     */
    public List<ReferenceInformation94503SCUSPNRDataFeed132> getFortknoxIdList() {
        return fortknoxIdList;
    }

    /** 
     * Set the list of 'fortknoxIds' element items. will convey both the CVV and the Credit card number Ids stored in the fortknox Database  it could also be used to store identifiers from external Tokenization Service Provider (TSP).
     * 
     * @param list
     */
    public void setFortknoxIdList(
            List<ReferenceInformation94503SCUSPNRDataFeed132> list) {
        fortknoxIdList = list;
    }

    /** 
     * Get the 'cardHolderAddress' element value. Contains card holder's address information.
     * 
     * @return value
     */
    public Address94501SCUSPNRDataFeed132 getCardHolderAddress() {
        return cardHolderAddress;
    }

    /** 
     * Set the 'cardHolderAddress' element value. Contains card holder's address information.
     * 
     * @param cardHolderAddress
     */
    public void setCardHolderAddress(
            Address94501SCUSPNRDataFeed132 cardHolderAddress) {
        this.cardHolderAddress = cardHolderAddress;
    }
}
