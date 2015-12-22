
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the Amadeus Accounting Information element (AI element).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AccountingInformationElement_1653_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="AccountingElement_4207_C_CUS_PNRDataFeed_132" name="account" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="accountNumberOfUnits" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AccountingInformationElement1653SCUSPNRDataFeed132
{
    private AccountingElement4207CCUSPNRDataFeed132 account;
    private String accountNumberOfUnits;

    /** 
     * Get the 'account' element value. One of these 4 data elements is mandatory , but non in particular
     * 
     * @return value
     */
    public AccountingElement4207CCUSPNRDataFeed132 getAccount() {
        return account;
    }

    /** 
     * Set the 'account' element value. One of these 4 data elements is mandatory , but non in particular
     * 
     * @param account
     */
    public void setAccount(AccountingElement4207CCUSPNRDataFeed132 account) {
        this.account = account;
    }

    /** 
     * Get the 'accountNumberOfUnits' element value. Number of units qualifier
     * 
     * @return value
     */
    public String getAccountNumberOfUnits() {
        return accountNumberOfUnits;
    }

    /** 
     * Set the 'accountNumberOfUnits' element value. Number of units qualifier
     * 
     * @param accountNumberOfUnits
     */
    public void setAccountNumberOfUnits(String accountNumberOfUnits) {
        this.accountNumberOfUnits = accountNumberOfUnits;
    }
}
