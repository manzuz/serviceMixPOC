
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DocumentDetails_18495_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="number"/>
 *     &lt;xs:element type="xs:string" name="countryOfIssue" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="expiryDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="issueDate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DocumentDetails18495CCUSPNRDataFeed132
{
    private String type;
    private String number;
    private String countryOfIssue;
    private String expiryDate;
    private String issueDate;

    /** 
     * Get the 'type' element value. Document type: PT for passport, VS for visa.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Document type: PT for passport, VS for visa.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'number' element value. Passport number.
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Passport number.
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'countryOfIssue' element value. Country where the document has been issued.
     * 
     * @return value
     */
    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    /** 
     * Set the 'countryOfIssue' element value. Country where the document has been issued.
     * 
     * @param countryOfIssue
     */
    public void setCountryOfIssue(String countryOfIssue) {
        this.countryOfIssue = countryOfIssue;
    }

    /** 
     * Get the 'expiryDate' element value. Expiry date of the document. YYYYMMDD
     * 
     * @return value
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /** 
     * Set the 'expiryDate' element value. Expiry date of the document. YYYYMMDD
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /** 
     * Get the 'issueDate' element value. Date of issue of the document. YYYYMMDD
     * 
     * @return value
     */
    public String getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'issueDate' element value. Date of issue of the document. YYYYMMDD
     * 
     * @param issueDate
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
