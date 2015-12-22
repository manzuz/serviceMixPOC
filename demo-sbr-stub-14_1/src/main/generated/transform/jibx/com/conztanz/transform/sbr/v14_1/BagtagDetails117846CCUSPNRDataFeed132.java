
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify baggage by company identification, serial numbers, and destination.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BagtagDetails_117846_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="identifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="number" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="location" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="specialRequirement" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BagtagDetails117846CCUSPNRDataFeed132
{
    private String identifier;
    private BigDecimal number;
    private String location;
    private String companyNumber;
    private String specialRequirement;
    private String description;

    /** 
     * Get the 'identifier' element value. Standard IATA 1 digit code used to refer to the type of a bag tag.
     * 
     * @return value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** 
     * Set the 'identifier' element value. Standard IATA 1 digit code used to refer to the type of a bag tag.
     * 
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /** 
     * Get the 'number' element value. Bag Tag number (6 generated digits).
     * 
     * @return value
     */
    public BigDecimal getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Bag Tag number (6 generated digits).
     * 
     * @param number
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /** 
     * Get the 'location' element value. Bag tag final destination.
     * 
     * @return value
     */
    public String getLocation() {
        return location;
    }

    /** 
     * Set the 'location' element value. Bag tag final destination.
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /** 
     * Get the 'companyNumber' element value. Airline number for the company issuing the tag.
     * 
     * @return value
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /** 
     * Set the 'companyNumber' element value. Airline number for the company issuing the tag.
     * 
     * @param companyNumber
     */
    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    /** 
     * Get the 'specialRequirement' element value. Bag exception data: where the agent needs to specify a special requirement against an individual bag (e.g. BIKE)
     * 
     * @return value
     */
    public String getSpecialRequirement() {
        return specialRequirement;
    }

    /** 
     * Set the 'specialRequirement' element value. Bag exception data: where the agent needs to specify a special requirement against an individual bag (e.g. BIKE)
     * 
     * @param specialRequirement
     */
    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement;
    }

    /** 
     * Get the 'description' element value. To specify a comment on the baggage (e.g. damaged baggage)
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. To specify a comment on the baggage (e.g. damaged baggage)
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
