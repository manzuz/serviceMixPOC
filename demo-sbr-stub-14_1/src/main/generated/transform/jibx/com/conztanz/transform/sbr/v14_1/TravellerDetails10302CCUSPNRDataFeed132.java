
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerDetails_10302_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="firstName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="infantIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="identificationCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerDetails10302CCUSPNRDataFeed132
{
    private String firstName;
    private String type;
    private String infantIndicator;
    private String identificationCode;

    /** 
     * Get the 'firstName' element value. Traveler First Name
     * 
     * @return value
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * Set the 'firstName' element value. Traveler First Name
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * Get the 'type' element value. Traveler Type using  Amadeus codification.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Traveler Type using  Amadeus codification.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'infantIndicator' element value. Code '1' used to mention that the traveler is accompanied by an infant with no seat.
     * 
     * @return value
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /** 
     * Set the 'infantIndicator' element value. Code '1' used to mention that the traveler is accompanied by an infant with no seat.
     * 
     * @param infantIndicator
     */
    public void setInfantIndicator(String infantIndicator) {
        this.infantIndicator = infantIndicator;
    }

    /** 
     * Get the 'identificationCode' element value. Identification code, 2 cases: ID - 1 to 51 char free text CR - 1 to 40 char free text
     * 
     * @return value
     */
    public String getIdentificationCode() {
        return identificationCode;
    }

    /** 
     * Set the 'identificationCode' element value. Identification code, 2 cases: ID - 1 to 51 char free text CR - 1 to 40 char free text
     * 
     * @param identificationCode
     */
    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }
}
