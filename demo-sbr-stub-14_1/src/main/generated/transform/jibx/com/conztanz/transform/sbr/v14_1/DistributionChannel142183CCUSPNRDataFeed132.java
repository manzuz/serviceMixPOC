
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Distribution channel
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DistributionChannel_142183_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="distributionChannelField"/>
 *     &lt;xs:element type="xs:decimal" name="subGroup" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="accessType" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DistributionChannel142183CCUSPNRDataFeed132
{
    private BigDecimal distributionChannelField;
    private BigDecimal subGroup;
    private BigDecimal accessType;

    /** 
     * Get the 'distributionChannelField' element value. This field is used to indicate the type of channel used for authorization process: e-commerce (web / Internet), MOTO (Mail Order / telephone Order), Face to face ...) Example:  05 for API 0=MOTO (Mail Order / Telephone Order) 1=e-Commerce (Internet)
     * 
     * @return value
     */
    public BigDecimal getDistributionChannelField() {
        return distributionChannelField;
    }

    /** 
     * Set the 'distributionChannelField' element value. This field is used to indicate the type of channel used for authorization process: e-commerce (web / Internet), MOTO (Mail Order / telephone Order), Face to face ...) Example:  05 for API 0=MOTO (Mail Order / Telephone Order) 1=e-Commerce (Internet)
     * 
     * @param distributionChannelField
     */
    public void setDistributionChannelField(BigDecimal distributionChannelField) {
        this.distributionChannelField = distributionChannelField;
    }

    /** 
     * Get the 'subGroup' element value. Subgroup field.
     * 
     * @return value
     */
    public BigDecimal getSubGroup() {
        return subGroup;
    }

    /** 
     * Set the 'subGroup' element value. Subgroup field.
     * 
     * @param subGroup
     */
    public void setSubGroup(BigDecimal subGroup) {
        this.subGroup = subGroup;
    }

    /** 
     * Get the 'accessType' element value. Access Type.
     * 
     * @return value
     */
    public BigDecimal getAccessType() {
        return accessType;
    }

    /** 
     * Set the 'accessType' element value. Access Type.
     * 
     * @param accessType
     */
    public void setAccessType(BigDecimal accessType) {
        this.accessType = accessType;
    }
}
