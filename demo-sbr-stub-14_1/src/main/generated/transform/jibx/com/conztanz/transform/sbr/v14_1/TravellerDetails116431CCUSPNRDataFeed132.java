
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerDetails_116431_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="givenName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="uniqueCustomerIdentifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="infantIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="title" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerDetails116431CCUSPNRDataFeed132
{
    private String givenName;
    private String type;
    private String uniqueCustomerIdentifier;
    private String infantIndicator;
    private List<String> titleList = new ArrayList<String>();

    /** 
     * Get the 'givenName' element value. given Name
     * 
     * @return value
     */
    public String getGivenName() {
        return givenName;
    }

    /** 
     * Set the 'givenName' element value. given Name
     * 
     * @param givenName
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /** 
     * Get the 'type' element value. type
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. type
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'uniqueCustomerIdentifier' element value. unique Customer Identifier
     * 
     * @return value
     */
    public String getUniqueCustomerIdentifier() {
        return uniqueCustomerIdentifier;
    }

    /** 
     * Set the 'uniqueCustomerIdentifier' element value. unique Customer Identifier
     * 
     * @param uniqueCustomerIdentifier
     */
    public void setUniqueCustomerIdentifier(String uniqueCustomerIdentifier) {
        this.uniqueCustomerIdentifier = uniqueCustomerIdentifier;
    }

    /** 
     * Get the 'infantIndicator' element value. infant Indicator
     * 
     * @return value
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /** 
     * Set the 'infantIndicator' element value. infant Indicator
     * 
     * @param infantIndicator
     */
    public void setInfantIndicator(String infantIndicator) {
        this.infantIndicator = infantIndicator;
    }

    /** 
     * Get the list of 'title' element items. title
     * 
     * @return list
     */
    public List<String> getTitleList() {
        return titleList;
    }

    /** 
     * Set the list of 'title' element items. title
     * 
     * @param list
     */
    public void setTitleList(List<String> list) {
        titleList = list;
    }
}
