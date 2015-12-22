
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_122345_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification1" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails122345CCUSPNRDataFeed132
{
    private String inHouseIdentification1;

    /** 
     * Get the 'inHouseIdentification1' element value. Previous Office Owner of the PNR
     * 
     * @return value
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /** 
     * Set the 'inHouseIdentification1' element value. Previous Office Owner of the PNR
     * 
     * @param inHouseIdentification1
     */
    public void setInHouseIdentification1(String inHouseIdentification1) {
        this.inHouseIdentification1 = inHouseIdentification1;
    }
}
