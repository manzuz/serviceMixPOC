
package com.conztanz.transform.sbr.v14_1;

/** 
 * Conveys an excess baggage's details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcessBaggage_70500_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExcessBaggage70500SCUSPNRDataFeed132
{
    private String type;

    /** 
     * Get the 'type' element value. Type of service
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Type of service
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}