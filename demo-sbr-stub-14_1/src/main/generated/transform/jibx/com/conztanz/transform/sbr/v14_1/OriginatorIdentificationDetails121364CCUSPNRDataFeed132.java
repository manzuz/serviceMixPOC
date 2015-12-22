
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_121364_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="originatorId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification1" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification2" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails121364CCUSPNRDataFeed132
{
    private BigDecimal originatorId;
    private String inHouseIdentification1;
    private String inHouseIdentification2;

    /** 
     * Get the 'originatorId' element value. Agent Id
     * 
     * @return value
     */
    public BigDecimal getOriginatorId() {
        return originatorId;
    }

    /** 
     * Set the 'originatorId' element value. Agent Id
     * 
     * @param originatorId
     */
    public void setOriginatorId(BigDecimal originatorId) {
        this.originatorId = originatorId;
    }

    /** 
     * Get the 'inHouseIdentification1' element value. Office Id
     * 
     * @return value
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /** 
     * Set the 'inHouseIdentification1' element value. Office Id
     * 
     * @param inHouseIdentification1
     */
    public void setInHouseIdentification1(String inHouseIdentification1) {
        this.inHouseIdentification1 = inHouseIdentification1;
    }

    /** 
     * Get the 'inHouseIdentification2' element value. Office AMID
     * 
     * @return value
     */
    public String getInHouseIdentification2() {
        return inHouseIdentification2;
    }

    /** 
     * Set the 'inHouseIdentification2' element value. Office AMID
     * 
     * @param inHouseIdentification2
     */
    public void setInHouseIdentification2(String inHouseIdentification2) {
        this.inHouseIdentification2 = inHouseIdentification2;
    }
}
