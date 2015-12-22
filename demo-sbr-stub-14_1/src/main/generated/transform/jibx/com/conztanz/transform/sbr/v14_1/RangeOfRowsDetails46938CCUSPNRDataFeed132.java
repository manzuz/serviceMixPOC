
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * To specify row information for a means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RangeOfRowsDetails_46938_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="seatRowNumber"/>
 *     &lt;xs:element type="xs:string" name="seatColumn" maxOccurs="20"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RangeOfRowsDetails46938CCUSPNRDataFeed132
{
    private BigDecimal seatRowNumber;
    private List<String> seatColumnList = new ArrayList<String>();

    /** 
     * Get the 'seatRowNumber' element value. This is the row number.
     * 
     * @return value
     */
    public BigDecimal getSeatRowNumber() {
        return seatRowNumber;
    }

    /** 
     * Set the 'seatRowNumber' element value. This is the row number.
     * 
     * @param seatRowNumber
     */
    public void setSeatRowNumber(BigDecimal seatRowNumber) {
        this.seatRowNumber = seatRowNumber;
    }

    /** 
     * Get the list of 'seatColumn' element items. This is the column number.
     * 
     * @return list
     */
    public List<String> getSeatColumnList() {
        return seatColumnList;
    }

    /** 
     * Set the list of 'seatColumn' element items. This is the column number.
     * 
     * @param list
     */
    public void setSeatColumnList(List<String> list) {
        seatColumnList = list;
    }
}
