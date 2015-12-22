
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerDetails_126898_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="givenName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="title" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerDetails126898CCUSPNRDataFeed132
{
    private String givenName;
    private String title;

    /** 
     * Get the 'givenName' element value. Conveys passenger first name.
     * 
     * @return value
     */
    public String getGivenName() {
        return givenName;
    }

    /** 
     * Set the 'givenName' element value. Conveys passenger first name.
     * 
     * @param givenName
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /** 
     * Get the 'title' element value.
     * 
     * @return value
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Set the 'title' element value.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
