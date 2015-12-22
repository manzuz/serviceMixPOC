
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of the surname of a traveller, the type of traveller, number of travellers per surname and the action to be taken.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerSurnameInformation_116430_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="surname"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerSurnameInformation116430CCUSPNRDataFeed132
{
    private String surname;

    /** 
     * Get the 'surname' element value. surname
     * 
     * @return value
     */
    public String getSurname() {
        return surname;
    }

    /** 
     * Set the 'surname' element value. surname
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
