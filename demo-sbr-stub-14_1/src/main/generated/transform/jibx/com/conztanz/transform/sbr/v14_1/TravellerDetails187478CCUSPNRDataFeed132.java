
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerDetails_187478_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="givenName"/>
 *     &lt;xs:element type="xs:string" name="title" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerDetails187478CCUSPNRDataFeed132
{
    private String givenName;
    private String title;

    /** 
     * Get the 'givenName' element value. firstname
     * 
     * @return value
     */
    public String getGivenName() {
        return givenName;
    }

    /** 
     * Set the 'givenName' element value. firstname
     * 
     * @param givenName
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /** 
     * Get the 'title' element value. Title (Mr, Mrs)
     * 
     * @return value
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Set the 'title' element value. Title (Mr, Mrs)
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
