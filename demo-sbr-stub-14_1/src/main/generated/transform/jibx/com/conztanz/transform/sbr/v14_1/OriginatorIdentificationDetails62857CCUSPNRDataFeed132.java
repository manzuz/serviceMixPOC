
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_62857_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="originatorId"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails62857CCUSPNRDataFeed132
{
    private BigDecimal originatorId;

    /** 
     * Get the 'originatorId' element value. This data element is used to convey the bouking source.
     * 
     * @return value
     */
    public BigDecimal getOriginatorId() {
        return originatorId;
    }

    /** 
     * Set the 'originatorId' element value. This data element is used to convey the bouking source.
     * 
     * @param originatorId
     */
    public void setOriginatorId(BigDecimal originatorId) {
        this.originatorId = originatorId;
    }
}
