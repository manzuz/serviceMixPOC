
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UniqueIdDescription_141680_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="systemQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="versionNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="referenceQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="primeId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="secondaryId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="status" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="creationYear" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="creationMonth" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="creationDay" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="creationHour" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="creationMinutes" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UniqueIdDescription141680CCUSPNRDataFeed132
{
    private String systemQualifier;
    private String versionNumber;
    private String referenceQualifier;
    private String primeId;
    private String secondaryId;
    private String status;
    private String creationYear;
    private BigDecimal creationMonth;
    private BigDecimal creationDay;
    private BigDecimal creationHour;
    private BigDecimal creationMinutes;
    private String description;

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

    /** 
     * Get the 'creationYear' element value. Value of the year ex:2003
     * 
     * @return value
     */
    public String getCreationYear() {
        return creationYear;
    }

    /** 
     * Set the 'creationYear' element value. Value of the year ex:2003
     * 
     * @param creationYear
     */
    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }

    /** 
     * Get the 'creationMonth' element value. Value of the month ex:7
     * 
     * @return value
     */
    public BigDecimal getCreationMonth() {
        return creationMonth;
    }

    /** 
     * Set the 'creationMonth' element value. Value of the month ex:7
     * 
     * @param creationMonth
     */
    public void setCreationMonth(BigDecimal creationMonth) {
        this.creationMonth = creationMonth;
    }

    /** 
     * Get the 'creationDay' element value. Value of the day in the  month ex:30
     * 
     * @return value
     */
    public BigDecimal getCreationDay() {
        return creationDay;
    }

    /** 
     * Set the 'creationDay' element value. Value of the day in the  month ex:30
     * 
     * @param creationDay
     */
    public void setCreationDay(BigDecimal creationDay) {
        this.creationDay = creationDay;
    }

    /** 
     * Get the 'creationHour' element value. The time of the creation ex:13
     * 
     * @return value
     */
    public BigDecimal getCreationHour() {
        return creationHour;
    }

    /** 
     * Set the 'creationHour' element value. The time of the creation ex:13
     * 
     * @param creationHour
     */
    public void setCreationHour(BigDecimal creationHour) {
        this.creationHour = creationHour;
    }

    /** 
     * Get the 'creationMinutes' element value. the minutes of the creation time
     * 
     * @return value
     */
    public BigDecimal getCreationMinutes() {
        return creationMinutes;
    }

    /** 
     * Set the 'creationMinutes' element value. the minutes of the creation time
     * 
     * @param creationMinutes
     */
    public void setCreationMinutes(BigDecimal creationMinutes) {
        this.creationMinutes = creationMinutes;
    }

    /** 
     * Get the 'description' element value. ID Description
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. ID Description
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
