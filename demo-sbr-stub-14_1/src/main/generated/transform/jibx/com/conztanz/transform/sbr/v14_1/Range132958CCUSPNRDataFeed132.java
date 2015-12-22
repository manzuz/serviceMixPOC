
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Range minimum and maximum limits.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Range_132958_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="dataType"/>
 *     &lt;xs:element type="xs:decimal" name="min"/>
 *     &lt;xs:element type="xs:decimal" name="max"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Range132958CCUSPNRDataFeed132
{
    private String dataType;
    private BigDecimal min;
    private BigDecimal max;

    /** 
     * Get the 'dataType' element value. Duration qualifier: - DAY Duration in days - WE  Duration in weeks - MTH Duration in months - G Kilometers - M Mileage - A Age
     * 
     * @return value
     */
    public String getDataType() {
        return dataType;
    }

    /** 
     * Set the 'dataType' element value. Duration qualifier: - DAY Duration in days - WE  Duration in weeks - MTH Duration in months - G Kilometers - M Mileage - A Age
     * 
     * @param dataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /** 
     * Get the 'min' element value. Base of the Range
     * 
     * @return value
     */
    public BigDecimal getMin() {
        return min;
    }

    /** 
     * Set the 'min' element value. Base of the Range
     * 
     * @param min
     */
    public void setMin(BigDecimal min) {
        this.min = min;
    }

    /** 
     * Get the 'max' element value. Top of the Range
     * 
     * @return value
     */
    public BigDecimal getMax() {
        return max;
    }

    /** 
     * Set the 'max' element value. Top of the Range
     * 
     * @param max
     */
    public void setMax(BigDecimal max) {
        this.max = max;
    }
}
