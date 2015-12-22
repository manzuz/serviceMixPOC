
package com.conztanz.transform.sbr.v14_1;

/** 
 * to specify details relating to the transaction
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransactionInformationForTicketing_94517_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TransactionInformations_142131_C_CUS_PNRDataFeed_132" name="transactionDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransactionInformationForTicketing94517SCUSPNRDataFeed132
{
    private TransactionInformations142131CCUSPNRDataFeed132 transactionDetails;

    /** 
     * Get the 'transactionDetails' element value. Authorisation transaction details
     * 
     * @return value
     */
    public TransactionInformations142131CCUSPNRDataFeed132 getTransactionDetails() {
        return transactionDetails;
    }

    /** 
     * Set the 'transactionDetails' element value. Authorisation transaction details
     * 
     * @param transactionDetails
     */
    public void setTransactionDetails(
            TransactionInformations142131CCUSPNRDataFeed132 transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
