
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_109511_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification1"/>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails109511CCUSPNRDataFeed132
{
    private String inHouseIdentification1;
    private String inHouseIdentification2;

    /** 
     * Get the 'inHouseIdentification1' element value. Office ID issuing the ticket request
     * 
     * @return value
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /** 
     * Set the 'inHouseIdentification1' element value. Office ID issuing the ticket request
     * 
     * @param inHouseIdentification1
     */
    public void setInHouseIdentification1(String inHouseIdentification1) {
        this.inHouseIdentification1 = inHouseIdentification1;
    }

    /** 
     * Get the 'inHouseIdentification2' element value. Iata Number of the office issuing the ticket request
     * 
     * @return value
     */
    public String getInHouseIdentification2() {
        return inHouseIdentification2;
    }

    /** 
     * Set the 'inHouseIdentification2' element value. Iata Number of the office issuing the ticket request
     * 
     * @param inHouseIdentification2
     */
    public void setInHouseIdentification2(String inHouseIdentification2) {
        this.inHouseIdentification2 = inHouseIdentification2;
    }
}
