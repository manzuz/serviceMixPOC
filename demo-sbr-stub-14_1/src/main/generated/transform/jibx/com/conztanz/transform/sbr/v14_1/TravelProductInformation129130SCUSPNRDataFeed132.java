
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify details related to a travel product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_129130_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateAndTime_188160_C_CUS_PNRDataFeed_132" name="flightDate" minOccurs="0"/>
 *     &lt;xs:element type="Location_188159_C_CUS_PNRDataFeed_132" name="boardPointDetails" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="xs:string" name="lineNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation129130SCUSPNRDataFeed132
{
    private ProductDateAndTime188160CCUSPNRDataFeed132 flightDate;
    private List<Location188159CCUSPNRDataFeed132> boardPointDetailList = new ArrayList<Location188159CCUSPNRDataFeed132>();
    private String lineNumber;

    /** 
     * Get the 'flightDate' element value.
     * 
     * @return value
     */
    public ProductDateAndTime188160CCUSPNRDataFeed132 getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'flightDate' element value.
     * 
     * @param flightDate
     */
    public void setFlightDate(
            ProductDateAndTime188160CCUSPNRDataFeed132 flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the list of 'boardPointDetails' element items.
     * 
     * @return list
     */
    public List<Location188159CCUSPNRDataFeed132> getBoardPointDetailList() {
        return boardPointDetailList;
    }

    /** 
     * Set the list of 'boardPointDetails' element items.
     * 
     * @param list
     */
    public void setBoardPointDetailList(
            List<Location188159CCUSPNRDataFeed132> list) {
        boardPointDetailList = list;
    }

    /** 
     * Get the 'lineNumber' element value.
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'lineNumber' element value.
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
}
