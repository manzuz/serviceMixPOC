
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UniqueIdDescription_117818_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="systemQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="versionNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="referenceQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="primeId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UniqueIdDescription117818CCUSPNRDataFeed132
{
    private String systemQualifier;
    private String versionNumber;
    private String referenceQualifier;
    private String primeId;

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
    public String getVersionNumber() {
        return versionNumber;
    }

    /** 
     * Set the 'versionNumber' element value. ID sequence number
     * 
     * @param versionNumber
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    /** 
     * Get the 'referenceQualifier' element value. Provides the type of reference used
     * 
     * @return value
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /** 
     * Set the 'referenceQualifier' element value. Provides the type of reference used
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
}
