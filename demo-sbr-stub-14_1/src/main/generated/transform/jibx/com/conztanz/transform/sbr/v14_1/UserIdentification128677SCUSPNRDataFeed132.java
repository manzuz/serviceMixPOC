
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to identify a user.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserIdentification_128677_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="originator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserIdentification128677SCUSPNRDataFeed132
{
    private String originator;

    /** 
     * Get the 'originator' element value. contains the client reference/signature.
     * 
     * @return value
     */
    public String getOriginator() {
        return originator;
    }

    /** 
     * Set the 'originator' element value. contains the client reference/signature.
     * 
     * @param originator
     */
    public void setOriginator(String originator) {
        this.originator = originator;
    }
}
