
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of the surname of a traveller, the type of traveller, number of travellers per surname and the action to be taken.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerSurnameInformation_91631_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="surname"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerSurnameInformation91631CCUSPNRDataFeed132
{
    private String surname;
    private String type;

    /** 
     * Get the 'surname' element value.
     * 
     * @return value
     */
    public String getSurname() {
        return surname;
    }

    /** 
     * Set the 'surname' element value.
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /** 
     * Get the 'type' element value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
