
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to identify a user.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserIdentification_76803_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="originator"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserIdentification76803SCUSPNRDataFeed132
{
    private String originator;

    /** 
     * Get the 'originator' element value. Authority code of the requester If Sign Id : (Area Code)+(Numeric Sine)+(Agent Initials)+(Duty Code) ex : B0001XVSU).
     * 
     * @return value
     */
    public String getOriginator() {
        return originator;
    }

    /** 
     * Set the 'originator' element value. Authority code of the requester If Sign Id : (Area Code)+(Numeric Sine)+(Agent Initials)+(Duty Code) ex : B0001XVSU).
     * 
     * @param originator
     */
    public void setOriginator(String originator) {
        this.originator = originator;
    }
}
