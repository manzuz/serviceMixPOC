
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details concerning seat selection and the associated security and processing information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatSelectionDetails_129096_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecificSeatDetails_188101_C_CUS_PNRDataFeed_132" name="specificSeatDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="noSmokingIndicator" minOccurs="0"/>
 *     &lt;xs:element type="SeatCharacteristicDetails_188102_C_CUS_PNRDataFeed_132" name="seatCharacteristicDetails" minOccurs="0"/>
 *     &lt;xs:element type="SeatRangeDetails_188103_C_CUS_PNRDataFeed_132" name="seatRangeDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="classDesignator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cabinClass" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatSelectionDetails129096SCUSPNRDataFeed132
{
    private SpecificSeatDetails188101CCUSPNRDataFeed132 specificSeatDetails;
    private String noSmokingIndicator;
    private SeatCharacteristicDetails188102CCUSPNRDataFeed132 seatCharacteristicDetails;
    private SeatRangeDetails188103CCUSPNRDataFeed132 seatRangeDetails;
    private String classDesignator;
    private String cabinClass;

    /** 
     * Get the 'specificSeatDetails' element value.
     * 
     * @return value
     */
    public SpecificSeatDetails188101CCUSPNRDataFeed132 getSpecificSeatDetails() {
        return specificSeatDetails;
    }

    /** 
     * Set the 'specificSeatDetails' element value.
     * 
     * @param specificSeatDetails
     */
    public void setSpecificSeatDetails(
            SpecificSeatDetails188101CCUSPNRDataFeed132 specificSeatDetails) {
        this.specificSeatDetails = specificSeatDetails;
    }

    /** 
     * Get the 'noSmokingIndicator' element value.
     * 
     * @return value
     */
    public String getNoSmokingIndicator() {
        return noSmokingIndicator;
    }

    /** 
     * Set the 'noSmokingIndicator' element value.
     * 
     * @param noSmokingIndicator
     */
    public void setNoSmokingIndicator(String noSmokingIndicator) {
        this.noSmokingIndicator = noSmokingIndicator;
    }

    /** 
     * Get the 'seatCharacteristicDetails' element value.
     * 
     * @return value
     */
    public SeatCharacteristicDetails188102CCUSPNRDataFeed132 getSeatCharacteristicDetails() {
        return seatCharacteristicDetails;
    }

    /** 
     * Set the 'seatCharacteristicDetails' element value.
     * 
     * @param seatCharacteristicDetails
     */
    public void setSeatCharacteristicDetails(
            SeatCharacteristicDetails188102CCUSPNRDataFeed132 seatCharacteristicDetails) {
        this.seatCharacteristicDetails = seatCharacteristicDetails;
    }

    /** 
     * Get the 'seatRangeDetails' element value.
     * 
     * @return value
     */
    public SeatRangeDetails188103CCUSPNRDataFeed132 getSeatRangeDetails() {
        return seatRangeDetails;
    }

    /** 
     * Set the 'seatRangeDetails' element value.
     * 
     * @param seatRangeDetails
     */
    public void setSeatRangeDetails(
            SeatRangeDetails188103CCUSPNRDataFeed132 seatRangeDetails) {
        this.seatRangeDetails = seatRangeDetails;
    }

    /** 
     * Get the 'classDesignator' element value.
     * 
     * @return value
     */
    public String getClassDesignator() {
        return classDesignator;
    }

    /** 
     * Set the 'classDesignator' element value.
     * 
     * @param classDesignator
     */
    public void setClassDesignator(String classDesignator) {
        this.classDesignator = classDesignator;
    }

    /** 
     * Get the 'cabinClass' element value.
     * 
     * @return value
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /** 
     * Set the 'cabinClass' element value.
     * 
     * @param cabinClass
     */
    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }
}
