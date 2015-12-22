
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MessageFunctionOrBusinessDetails_45517_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="function"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MessageFunctionOrBusinessDetails45517CCUSPNRDataFeed132
{
    private String function;

    /** 
     * Get the 'function' element value. - Message function: REG for regular feed - Itinerary type: see codeset list: air/car/hotel/taxi/train/tour/surface...
     * 
     * @return value
     */
    public String getFunction() {
        return function;
    }

    /** 
     * Set the 'function' element value. - Message function: REG for regular feed - Itinerary type: see codeset list: air/car/hotel/taxi/train/tour/surface...
     * 
     * @param function
     */
    public void setFunction(String function) {
        this.function = function;
    }
}
