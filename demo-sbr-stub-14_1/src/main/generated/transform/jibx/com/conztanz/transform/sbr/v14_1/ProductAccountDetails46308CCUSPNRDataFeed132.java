
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify frequent traveller card information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductAccountDetails_46308_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="frequentTravellerId"/>
 *     &lt;xs:element type="xs:string" name="category" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="sequenceNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="versionNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="rateClass" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="approvalCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductAccountDetails46308CCUSPNRDataFeed132
{
    private String frequentTravellerId;
    private String category;
    private String sequenceNumber;
    private String versionNumber;
    private String rateClass;
    private String approvalCode;

    /** 
     * Get the 'frequentTravellerId' element value. Frequent Traveller Reference Number
     * 
     * @return value
     */
    public String getFrequentTravellerId() {
        return frequentTravellerId;
    }

    /** 
     * Set the 'frequentTravellerId' element value. Frequent Traveller Reference Number
     * 
     * @param frequentTravellerId
     */
    public void setFrequentTravellerId(String frequentTravellerId) {
        this.frequentTravellerId = frequentTravellerId;
    }

    /** 
     * Get the 'category' element value. The award code returned by loyalty system in booking time and send to loyalty system in ticketing time.
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'category' element value. The award code returned by loyalty system in booking time and send to loyalty system in ticketing time.
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /** 
     * Get the 'sequenceNumber' element value. Sequence number to ordonate frequent flyer number. The first is the one for validation. Others are the ones associated to segment.
     * 
     * @return value
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /** 
     * Set the 'sequenceNumber' element value. Sequence number to ordonate frequent flyer number. The first is the one for validation. Others are the ones associated to segment.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /** 
     * Get the 'versionNumber' element value. Certificate number
     * 
     * @return value
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /** 
     * Set the 'versionNumber' element value. Certificate number
     * 
     * @param versionNumber
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    /** 
     * Get the 'rateClass' element value. Pricing in miles
     * 
     * @return value
     */
    public String getRateClass() {
        return rateClass;
    }

    /** 
     * Set the 'rateClass' element value. Pricing in miles
     * 
     * @param rateClass
     */
    public void setRateClass(String rateClass) {
        this.rateClass = rateClass;
    }

    /** 
     * Get the 'approvalCode' element value. Stock control number
     * 
     * @return value
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /** 
     * Set the 'approvalCode' element value. Stock control number
     * 
     * @param approvalCode
     */
    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }
}
