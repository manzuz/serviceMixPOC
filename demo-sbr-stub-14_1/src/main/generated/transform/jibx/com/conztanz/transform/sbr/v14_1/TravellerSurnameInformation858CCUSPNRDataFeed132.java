
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerSurnameInformation_858_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="surname" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="gender" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerSurnameInformation858CCUSPNRDataFeed132
{
    private String surname;
    private String type;
    private String gender;

    /** 
     * Get the 'surname' element value. Passenger name
     * 
     * @return value
     */
    public String getSurname() {
        return surname;
    }

    /** 
     * Set the 'surname' element value. Passenger name
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /** 
     * Get the 'type' element value. Customer type: A=adult C=child IN = infant
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Customer type: A=adult C=child IN = infant
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'gender' element value. to indicate if it's a man or a female.
     * 
     * @return value
     */
    public String getGender() {
        return gender;
    }

    /** 
     * Set the 'gender' element value. to indicate if it's a man or a female.
     * 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
