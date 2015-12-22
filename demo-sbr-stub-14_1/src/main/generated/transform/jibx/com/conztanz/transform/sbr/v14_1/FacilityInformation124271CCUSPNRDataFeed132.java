
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FacilityInformation_124271_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="identifier"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FacilityInformation124271CCUSPNRDataFeed132
{
    private String type;
    private String identifier;
    private String description;

    /** 
     * Get the 'type' element value. Type of the Facility, coded. E.g.: - Check-In Desk - Gate... The codeset is not yet defined.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Type of the Facility, coded. E.g.: - Check-In Desk - Gate... The codeset is not yet defined.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'identifier' element value. Unique Reference to a Facility of a given Type in a terminal. This can be several kind of values. E.g.: - 25 (means Gate 25 when associated  Facility Type= Gate, or Check-in Desk 25 when associated Facility Type= Check-In Desk) - BAEXC: means Ba-Executive Club Lounge when associated to
     * 
     * @return value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** 
     * Set the 'identifier' element value. Unique Reference to a Facility of a given Type in a terminal. This can be several kind of values. E.g.: - 25 (means Gate 25 when associated  Facility Type= Gate, or Check-in Desk 25 when associated Facility Type= Check-In Desk) - BAEXC: means Ba-Executive Club Lounge when associated to
     * 
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /** 
     * Get the 'description' element value. Full text description of the facility. E.g: - 'LHR Terminal 1 Gate 25' - 'LHR Terminal 1 Check-In Desk 25' - 'British Airways Executive Club Lounge'
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. Full text description of the facility. E.g: - 'LHR Terminal 1 Gate 25' - 'LHR Terminal 1 Check-In Desk 25' - 'British Airways Executive Club Lounge'
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
