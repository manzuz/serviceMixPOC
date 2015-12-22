
package com.conztanz.transform.sbr.v14_1;

/** 
 * Description of the rail advanced seat request
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RailSeatPreferences_37034_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="seatRequestFunction" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="smokingIndicator" minOccurs="0"/>
 *     &lt;xs:element type="ClassDetails_63308_C_CUS_PNRDataFeed_132" name="classDetails" minOccurs="0"/>
 *     &lt;xs:element type="RailSeatConfiguration_63309_C_CUS_PNRDataFeed_132" name="seatConfiguration" minOccurs="0"/>
 *     &lt;xs:element type="RailSleeperDescription_63310_C_CUS_PNRDataFeed_132" name="sleeperDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RailSeatPreferences37034SCUSPNRDataFeed132
{
    private String seatRequestFunction;
    private String smokingIndicator;
    private ClassDetails63308CCUSPNRDataFeed132 classDetails;
    private RailSeatConfiguration63309CCUSPNRDataFeed132 seatConfiguration;
    private RailSleeperDescription63310CCUSPNRDataFeed132 sleeperDescription;

    /** 
     * Get the 'seatRequestFunction' element value. Selection of the type of seat request.
     * 
     * @return value
     */
    public String getSeatRequestFunction() {
        return seatRequestFunction;
    }

    /** 
     * Set the 'seatRequestFunction' element value. Selection of the type of seat request.
     * 
     * @param seatRequestFunction
     */
    public void setSeatRequestFunction(String seatRequestFunction) {
        this.seatRequestFunction = seatRequestFunction;
    }

    /** 
     * Get the 'smokingIndicator' element value. Seat smoking zone indicator.
     * 
     * @return value
     */
    public String getSmokingIndicator() {
        return smokingIndicator;
    }

    /** 
     * Set the 'smokingIndicator' element value. Seat smoking zone indicator.
     * 
     * @param smokingIndicator
     */
    public void setSmokingIndicator(String smokingIndicator) {
        this.smokingIndicator = smokingIndicator;
    }

    /** 
     * Get the 'classDetails' element value. Seat class details.
     * 
     * @return value
     */
    public ClassDetails63308CCUSPNRDataFeed132 getClassDetails() {
        return classDetails;
    }

    /** 
     * Set the 'classDetails' element value. Seat class details.
     * 
     * @param classDetails
     */
    public void setClassDetails(ClassDetails63308CCUSPNRDataFeed132 classDetails) {
        this.classDetails = classDetails;
    }

    /** 
     * Get the 'seatConfiguration' element value. Seat configuration details.
     * 
     * @return value
     */
    public RailSeatConfiguration63309CCUSPNRDataFeed132 getSeatConfiguration() {
        return seatConfiguration;
    }

    /** 
     * Set the 'seatConfiguration' element value. Seat configuration details.
     * 
     * @param seatConfiguration
     */
    public void setSeatConfiguration(
            RailSeatConfiguration63309CCUSPNRDataFeed132 seatConfiguration) {
        this.seatConfiguration = seatConfiguration;
    }

    /** 
     * Get the 'sleeperDescription' element value.
     * 
     * @return value
     */
    public RailSleeperDescription63310CCUSPNRDataFeed132 getSleeperDescription() {
        return sleeperDescription;
    }

    /** 
     * Set the 'sleeperDescription' element value.
     * 
     * @param sleeperDescription
     */
    public void setSleeperDescription(
            RailSleeperDescription63310CCUSPNRDataFeed132 sleeperDescription) {
        this.sleeperDescription = sleeperDescription;
    }
}
