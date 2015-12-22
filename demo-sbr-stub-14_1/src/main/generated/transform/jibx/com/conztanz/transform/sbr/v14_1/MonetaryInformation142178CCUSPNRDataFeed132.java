
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_142178_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="typeQualifier"/>
 *     &lt;xs:element type="xs:decimal" name="amount"/>
 *     &lt;xs:element type="xs:string" name="currency" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation142178CCUSPNRDataFeed132
{
    private String typeQualifier;
    private BigDecimal amount;
    private String currency;

    /** 
     * Get the 'typeQualifier' element value. Here is the list and the purpose of each amount today stored in the FP: I Transaction total amount  Total amount authorized in authorization transaction  IPC Transaction total amount in PNR currency Total amount authorized is also stored in PNR currency. Indeed, reversal must be done with the rate of exchange valid at time of authorization and therefore this avoids storing the rate of exchange and performing amount conversion at reversal time.  IT Initial TST total amount  Amount of TST multiplied by the number of passengers associated to the TST  ITC Initial TST total amount in PNR currency   IT amount in PNR currency for same reason as IPC amount  R Total amount / Remaining amount  Current authorized amount. Originally it is the total amount authorized and then this amount  may decrease in case of total/partial reversal.  T Initial Tst Individual amount  Amount of TST  TPC Initial Tst Individual amount in PNR currency  Amount of TST in PNR currency for same reason as IPC amount  AUT Authorized Amount Maybe different from the one given in input(for exple, if on input we have 2pax and the amount per pax. In case of bulk, we will authorize the sum of both amounts) It can also be used for:  Total Fare Amount 712 or additional collection amount A
     * 
     * @return value
     */
    public String getTypeQualifier() {
        return typeQualifier;
    }

    /** 
     * Set the 'typeQualifier' element value. Here is the list and the purpose of each amount today stored in the FP: I Transaction total amount  Total amount authorized in authorization transaction  IPC Transaction total amount in PNR currency Total amount authorized is also stored in PNR currency. Indeed, reversal must be done with the rate of exchange valid at time of authorization and therefore this avoids storing the rate of exchange and performing amount conversion at reversal time.  IT Initial TST total amount  Amount of TST multiplied by the number of passengers associated to the TST  ITC Initial TST total amount in PNR currency   IT amount in PNR currency for same reason as IPC amount  R Total amount / Remaining amount  Current authorized amount. Originally it is the total amount authorized and then this amount  may decrease in case of total/partial reversal.  T Initial Tst Individual amount  Amount of TST  TPC Initial Tst Individual amount in PNR currency  Amount of TST in PNR currency for same reason as IPC amount  AUT Authorized Amount Maybe different from the one given in input(for exple, if on input we have 2pax and the amount per pax. In case of bulk, we will authorize the sum of both amounts) It can also be used for:  Total Fare Amount 712 or additional collection amount A
     * 
     * @param typeQualifier
     */
    public void setTypeQualifier(String typeQualifier) {
        this.typeQualifier = typeQualifier;
    }

    /** 
     * Get the 'amount' element value. Value of the amount.  This is conveyed as a 'string' and therefore several strings can stand for the  same amount (eg. 14 , 1400, 14.00... could potentially stand for 14.00 EUR). This  means that sender/receiver of this message will need to come to an agreement  concerning the way the amount is transferred in this segment.
     * 
     * @return value
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /** 
     * Set the 'amount' element value. Value of the amount.  This is conveyed as a 'string' and therefore several strings can stand for the  same amount (eg. 14 , 1400, 14.00... could potentially stand for 14.00 EUR). This  means that sender/receiver of this message will need to come to an agreement  concerning the way the amount is transferred in this segment.
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'currency' element value. IATA alphabetic currency code.  Eg: USD,GBP,EUR...
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'currency' element value. IATA alphabetic currency code.  Eg: USD,GBP,EUR...
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
