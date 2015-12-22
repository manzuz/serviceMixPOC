
package com.conztanz.transform.sbr.v14_1;

/** 
 * ACCOUNTING ELEMENT
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AccountingElement_4207_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="number" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="costNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="clientReference" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AccountingElement4207CCUSPNRDataFeed132
{
    private String number;
    private String costNumber;
    private String companyNumber;
    private String clientReference;

    /** 
     * Get the 'number' element value. Account number
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Account number
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'costNumber' element value. Cost Number
     * 
     * @return value
     */
    public String getCostNumber() {
        return costNumber;
    }

    /** 
     * Set the 'costNumber' element value. Cost Number
     * 
     * @param costNumber
     */
    public void setCostNumber(String costNumber) {
        this.costNumber = costNumber;
    }

    /** 
     * Get the 'companyNumber' element value. IATA company number
     * 
     * @return value
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /** 
     * Set the 'companyNumber' element value. IATA company number
     * 
     * @param companyNumber
     */
    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    /** 
     * Get the 'clientReference' element value. Client Reference Number
     * 
     * @return value
     */
    public String getClientReference() {
        return clientReference;
    }

    /** 
     * Set the 'clientReference' element value. Client Reference Number
     * 
     * @param clientReference
     */
    public void setClientReference(String clientReference) {
        this.clientReference = clientReference;
    }
}
