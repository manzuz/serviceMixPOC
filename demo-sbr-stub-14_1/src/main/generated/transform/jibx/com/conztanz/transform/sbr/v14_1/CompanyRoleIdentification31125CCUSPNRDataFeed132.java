
package com.conztanz.transform.sbr.v14_1;

/** 
 * To indicate commercial agreements related to the service being provided.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyRoleIdentification_31125_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="transportStageQualifier"/>
 *     &lt;xs:element type="xs:string" name="airlineDesignator"/>
 *     &lt;xs:element type="xs:string" name="flightNumber"/>
 *     &lt;xs:element type="xs:string" name="operationalSuffix" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyRoleIdentification31125CCUSPNRDataFeed132
{
    private String transportStageQualifier;
    private String airlineDesignator;
    private String flightNumber;
    private String operationalSuffix;

    /** 
     * Get the 'transportStageQualifier' element value. Type of codeshare: - codeset [O] if operating info, - codeset [M] if marketing info.
     * 
     * @return value
     */
    public String getTransportStageQualifier() {
        return transportStageQualifier;
    }

    /** 
     * Set the 'transportStageQualifier' element value. Type of codeshare: - codeset [O] if operating info, - codeset [M] if marketing info.
     * 
     * @param transportStageQualifier
     */
    public void setTransportStageQualifier(String transportStageQualifier) {
        this.transportStageQualifier = transportStageQualifier;
    }

    /** 
     * Get the 'airlineDesignator' element value. Codeshare partner Carrier Code
     * 
     * @return value
     */
    public String getAirlineDesignator() {
        return airlineDesignator;
    }

    /** 
     * Set the 'airlineDesignator' element value. Codeshare partner Carrier Code
     * 
     * @param airlineDesignator
     */
    public void setAirlineDesignator(String airlineDesignator) {
        this.airlineDesignator = airlineDesignator;
    }

    /** 
     * Get the 'flightNumber' element value. Flight number
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'flightNumber' element value. Flight number
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'operationalSuffix' element value. Flight suffix
     * 
     * @return value
     */
    public String getOperationalSuffix() {
        return operationalSuffix;
    }

    /** 
     * Set the 'operationalSuffix' element value. Flight suffix
     * 
     * @param operationalSuffix
     */
    public void setOperationalSuffix(String operationalSuffix) {
        this.operationalSuffix = operationalSuffix;
    }
}
