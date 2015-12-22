
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ResponsibilityInformation_6835_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="typeOfPnrElement"/>
 *     &lt;xs:element type="xs:string" name="agentId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="officeId" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="iataCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ResponsibilityInformation6835CCUSPNRDataFeed132
{
    private String typeOfPnrElement;
    private String agentId;
    private String officeId;
    private BigDecimal iataCode;

    /** 
     * Get the 'typeOfPnrElement' element value. Type of PNR element: - RR for Associated Cross Reference Record - SP for Split Party - RP for PNR Header line
     * 
     * @return value
     */
    public String getTypeOfPnrElement() {
        return typeOfPnrElement;
    }

    /** 
     * Set the 'typeOfPnrElement' element value. Type of PNR element: - RR for Associated Cross Reference Record - SP for Split Party - RP for PNR Header line
     * 
     * @param typeOfPnrElement
     */
    public void setTypeOfPnrElement(String typeOfPnrElement) {
        this.typeOfPnrElement = typeOfPnrElement;
    }

    /** 
     * Get the 'agentId' element value. 1. RR element: 2. SP element: 3. PNR Header:Agent initials and duty code (eg: AASU)
     * 
     * @return value
     */
    public String getAgentId() {
        return agentId;
    }

    /** 
     * Set the 'agentId' element value. 1. RR element: 2. SP element: 3. PNR Header:Agent initials and duty code (eg: AASU)
     * 
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /** 
     * Get the 'officeId' element value. 1. RR element office that copied the PNR 2. SP element: office that split the PNR 3. PNR Header: office responsibility or - OA office (City code + OA code)  which is 5 chars long
     * 
     * @return value
     */
    public String getOfficeId() {
        return officeId;
    }

    /** 
     * Set the 'officeId' element value. 1. RR element office that copied the PNR 2. SP element: office that split the PNR 3. PNR Header: office responsibility or - OA office (City code + OA code)  which is 5 chars long
     * 
     * @param officeId
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    /** 
     * Get the 'iataCode' element value. ATA/IATA reference number assigned to a travel agent
     * 
     * @return value
     */
    public BigDecimal getIataCode() {
        return iataCode;
    }

    /** 
     * Set the 'iataCode' element value. ATA/IATA reference number assigned to a travel agent
     * 
     * @param iataCode
     */
    public void setIataCode(BigDecimal iataCode) {
        this.iataCode = iataCode;
    }
}
