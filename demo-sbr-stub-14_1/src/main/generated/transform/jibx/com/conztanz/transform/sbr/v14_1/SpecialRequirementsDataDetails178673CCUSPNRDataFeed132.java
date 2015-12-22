
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Special requirements data details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDataDetails_178673_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="seatNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="measureUnitQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="crossRef" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="seatCharacteristics" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDataDetails178673CCUSPNRDataFeed132
{
    private String seatNumber;
    private String measureUnitQualifier;
    private String crossRef;
    private List<String> seatCharacteristicList = new ArrayList<String>();

    /** 
     * Get the 'seatNumber' element value. Seat number
     * 
     * @return value
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /** 
     * Set the 'seatNumber' element value. Seat number
     * 
     * @param seatNumber
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /** 
     * Get the 'measureUnitQualifier' element value. Mesure unit qualifier
     * 
     * @return value
     */
    public String getMeasureUnitQualifier() {
        return measureUnitQualifier;
    }

    /** 
     * Set the 'measureUnitQualifier' element value. Mesure unit qualifier
     * 
     * @param measureUnitQualifier
     */
    public void setMeasureUnitQualifier(String measureUnitQualifier) {
        this.measureUnitQualifier = measureUnitQualifier;
    }

    /** 
     * Get the 'crossRef' element value. Customer ranking value
     * 
     * @return value
     */
    public String getCrossRef() {
        return crossRef;
    }

    /** 
     * Set the 'crossRef' element value. Customer ranking value
     * 
     * @param crossRef
     */
    public void setCrossRef(String crossRef) {
        this.crossRef = crossRef;
    }

    /** 
     * Get the list of 'seatCharacteristics' element items. SSR seat characteristic
     * 
     * @return list
     */
    public List<String> getSeatCharacteristicList() {
        return seatCharacteristicList;
    }

    /** 
     * Set the list of 'seatCharacteristics' element items. SSR seat characteristic
     * 
     * @param list
     */
    public void setSeatCharacteristicList(List<String> list) {
        seatCharacteristicList = list;
    }
}
