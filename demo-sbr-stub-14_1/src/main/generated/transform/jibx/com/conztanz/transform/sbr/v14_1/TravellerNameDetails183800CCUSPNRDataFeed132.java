
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify all the names in different alphabets associated to a same traveller
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerNameDetails_183800_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="nameType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="referenceName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="displayedName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="romanizationMethod" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="surname" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="givenName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="title" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerNameDetails183800CCUSPNRDataFeed132
{
    private String nameType;
    private String referenceName;
    private String displayedName;
    private String romanizationMethod;
    private String surname;
    private String givenName;
    private List<String> titleList = new ArrayList<String>();

    /** 
     * Get the 'nameType' element value.
     * 
     * @return value
     */
    public String getNameType() {
        return nameType;
    }

    /** 
     * Set the 'nameType' element value.
     * 
     * @param nameType
     */
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    /** 
     * Get the 'referenceName' element value.
     * 
     * @return value
     */
    public String getReferenceName() {
        return referenceName;
    }

    /** 
     * Set the 'referenceName' element value.
     * 
     * @param referenceName
     */
    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    /** 
     * Get the 'displayedName' element value.
     * 
     * @return value
     */
    public String getDisplayedName() {
        return displayedName;
    }

    /** 
     * Set the 'displayedName' element value.
     * 
     * @param displayedName
     */
    public void setDisplayedName(String displayedName) {
        this.displayedName = displayedName;
    }

    /** 
     * Get the 'romanizationMethod' element value.
     * 
     * @return value
     */
    public String getRomanizationMethod() {
        return romanizationMethod;
    }

    /** 
     * Set the 'romanizationMethod' element value.
     * 
     * @param romanizationMethod
     */
    public void setRomanizationMethod(String romanizationMethod) {
        this.romanizationMethod = romanizationMethod;
    }

    /** 
     * Get the 'surname' element value. Passenger surname
     * 
     * @return value
     */
    public String getSurname() {
        return surname;
    }

    /** 
     * Set the 'surname' element value. Passenger surname
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /** 
     * Get the 'givenName' element value. Passenger firstname
     * 
     * @return value
     */
    public String getGivenName() {
        return givenName;
    }

    /** 
     * Set the 'givenName' element value. Passenger firstname
     * 
     * @param givenName
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /** 
     * Get the list of 'title' element items.
     * 
     * @return list
     */
    public List<String> getTitleList() {
        return titleList;
    }

    /** 
     * Set the list of 'title' element items.
     * 
     * @param list
     */
    public void setTitleList(List<String> list) {
        titleList = list;
    }
}
