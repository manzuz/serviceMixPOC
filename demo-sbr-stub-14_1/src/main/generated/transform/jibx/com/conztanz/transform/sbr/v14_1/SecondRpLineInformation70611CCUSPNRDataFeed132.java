
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SecondRpLineInformation_70611_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="creationOfficeId"/>
 *     &lt;xs:element type="xs:string" name="agentSignature" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="creationDate"/>
 *     &lt;xs:element type="xs:decimal" name="creatorIataCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="creationTime" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SecondRpLineInformation70611CCUSPNRDataFeed132
{
    private String creationOfficeId;
    private String agentSignature;
    private String creationDate;
    private BigDecimal creatorIataCode;
    private String creationTime;

    /** 
     * Get the 'creationOfficeId' element value. Creation office
     * 
     * @return value
     */
    public String getCreationOfficeId() {
        return creationOfficeId;
    }

    /** 
     * Set the 'creationOfficeId' element value. Creation office
     * 
     * @param creationOfficeId
     */
    public void setCreationOfficeId(String creationOfficeId) {
        this.creationOfficeId = creationOfficeId;
    }

    /** 
     * Get the 'agentSignature' element value. Creation agent sine/queue category (1234AA)
     * 
     * @return value
     */
    public String getAgentSignature() {
        return agentSignature;
    }

    /** 
     * Set the 'agentSignature' element value. Creation agent sine/queue category (1234AA)
     * 
     * @param agentSignature
     */
    public void setAgentSignature(String agentSignature) {
        this.agentSignature = agentSignature;
    }

    /** 
     * Get the 'creationDate' element value. Creation date
     * 
     * @return value
     */
    public String getCreationDate() {
        return creationDate;
    }

    /** 
     * Set the 'creationDate' element value. Creation date
     * 
     * @param creationDate
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /** 
     * Get the 'creatorIataCode' element value. ATA/IATA number assigned to a travel agent
     * 
     * @return value
     */
    public BigDecimal getCreatorIataCode() {
        return creatorIataCode;
    }

    /** 
     * Set the 'creatorIataCode' element value. ATA/IATA number assigned to a travel agent
     * 
     * @param creatorIataCode
     */
    public void setCreatorIataCode(BigDecimal creatorIataCode) {
        this.creatorIataCode = creatorIataCode;
    }

    /** 
     * Get the 'creationTime' element value. First Time
     * 
     * @return value
     */
    public String getCreationTime() {
        return creationTime;
    }

    /** 
     * Set the 'creationTime' element value. First Time
     * 
     * @param creationTime
     */
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
