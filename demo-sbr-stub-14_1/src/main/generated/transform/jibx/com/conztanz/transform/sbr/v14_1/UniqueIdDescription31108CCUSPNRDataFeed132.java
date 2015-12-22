
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UniqueIdDescription_31108_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="systemQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="versionNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="referenceQualifier"/>
 *     &lt;xs:element type="xs:string" name="primeId"/>
 *     &lt;xs:element type="xs:string" name="secondaryId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="status" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UniqueIdDescription31108CCUSPNRDataFeed132
{
    private String systemQualifier;
    private BigDecimal versionNumber;
    private String referenceQualifier;
    private String primeId;
    private String secondaryId;
    private String status;

    /** 
     * Get the 'systemQualifier' element value. System responsible of the associated version number: - "1ARES" for CS RES system - "DCSLON" for current NGDCS in London -... New values may be added when needed
     * 
     * @return value
     */
    public String getSystemQualifier() {
        return systemQualifier;
    }

    /** 
     * Set the 'systemQualifier' element value. System responsible of the associated version number: - "1ARES" for CS RES system - "DCSLON" for current NGDCS in London -... New values may be added when needed
     * 
     * @param systemQualifier
     */
    public void setSystemQualifier(String systemQualifier) {
        this.systemQualifier = systemQualifier;
    }

    /** 
     * Get the 'versionNumber' element value. ID sequence number
     * 
     * @return value
     */
    public BigDecimal getVersionNumber() {
        return versionNumber;
    }

    /** 
     * Set the 'versionNumber' element value. ID sequence number
     * 
     * @param versionNumber
     */
    public void setVersionNumber(BigDecimal versionNumber) {
        this.versionNumber = versionNumber;
    }

    /** 
     * Get the 'referenceQualifier' element value. ID qualifier
     * 
     * @return value
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /** 
     * Set the 'referenceQualifier' element value. ID qualifier
     * 
     * @param referenceQualifier
     */
    public void setReferenceQualifier(String referenceQualifier) {
        this.referenceQualifier = referenceQualifier;
    }

    /** 
     * Get the 'primeId' element value. ID (DID, IID, SID number or any uniquer identifier)
     * 
     * @return value
     */
    public String getPrimeId() {
        return primeId;
    }

    /** 
     * Set the 'primeId' element value. ID (DID, IID, SID number or any uniquer identifier)
     * 
     * @param primeId
     */
    public void setPrimeId(String primeId) {
        this.primeId = primeId;
    }

    /** 
     * Get the 'secondaryId' element value. ID
     * 
     * @return value
     */
    public String getSecondaryId() {
        return secondaryId;
    }

    /** 
     * Set the 'secondaryId' element value. ID
     * 
     * @param secondaryId
     */
    public void setSecondaryId(String secondaryId) {
        this.secondaryId = secondaryId;
    }

    /** 
     * Get the 'status' element value. ID Status
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. ID Status
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
