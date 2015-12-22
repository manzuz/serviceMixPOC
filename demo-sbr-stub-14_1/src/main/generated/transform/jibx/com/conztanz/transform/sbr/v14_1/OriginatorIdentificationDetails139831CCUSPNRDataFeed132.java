
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_139831_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="originatorId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification1"/>
 *     &lt;xs:element type="xs:decimal" name="inHouseIdentification2" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails139831CCUSPNRDataFeed132
{
    private String originatorId;
    private String inHouseIdentification1;
    private BigDecimal inHouseIdentification2;

    /** 
     * Get the 'originatorId' element value. IATA Code
     * 
     * @return value
     */
    public String getOriginatorId() {
        return originatorId;
    }

    /** 
     * Set the 'originatorId' element value. IATA Code
     * 
     * @param originatorId
     */
    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }

    /** 
     * Get the 'inHouseIdentification1' element value. Office ID of the Offer owner.
     * 
     * @return value
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /** 
     * Set the 'inHouseIdentification1' element value. Office ID of the Offer owner.
     * 
     * @param inHouseIdentification1
     */
    public void setInHouseIdentification1(String inHouseIdentification1) {
        this.inHouseIdentification1 = inHouseIdentification1;
    }

    /** 
     * Get the 'inHouseIdentification2' element value. Amid of the owner of the SBR.
     * 
     * @return value
     */
    public BigDecimal getInHouseIdentification2() {
        return inHouseIdentification2;
    }

    /** 
     * Set the 'inHouseIdentification2' element value. Amid of the owner of the SBR.
     * 
     * @param inHouseIdentification2
     */
    public void setInHouseIdentification2(BigDecimal inHouseIdentification2) {
        this.inHouseIdentification2 = inHouseIdentification2;
    }
}
