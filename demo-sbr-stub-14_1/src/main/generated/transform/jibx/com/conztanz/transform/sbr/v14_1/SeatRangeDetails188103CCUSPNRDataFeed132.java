
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the range of seats on a means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatRangeDetails_188103_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="seatRow"/>
 *     &lt;xs:element type="xs:decimal" name="maximumRange" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="seatColumn" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatRangeDetails188103CCUSPNRDataFeed132
{
    private BigDecimal seatRow;
    private BigDecimal maximumRange;
    private String seatColumn;

    /** 
     * Get the 'seatRow' element value.
     * 
     * @return value
     */
    public BigDecimal getSeatRow() {
        return seatRow;
    }

    /** 
     * Set the 'seatRow' element value.
     * 
     * @param seatRow
     */
    public void setSeatRow(BigDecimal seatRow) {
        this.seatRow = seatRow;
    }

    /** 
     * Get the 'maximumRange' element value.
     * 
     * @return value
     */
    public BigDecimal getMaximumRange() {
        return maximumRange;
    }

    /** 
     * Set the 'maximumRange' element value.
     * 
     * @param maximumRange
     */
    public void setMaximumRange(BigDecimal maximumRange) {
        this.maximumRange = maximumRange;
    }

    /** 
     * Get the 'seatColumn' element value.
     * 
     * @return value
     */
    public String getSeatColumn() {
        return seatColumn;
    }

    /** 
     * Set the 'seatColumn' element value.
     * 
     * @param seatColumn
     */
    public void setSeatColumn(String seatColumn) {
        this.seatColumn = seatColumn;
    }
}
