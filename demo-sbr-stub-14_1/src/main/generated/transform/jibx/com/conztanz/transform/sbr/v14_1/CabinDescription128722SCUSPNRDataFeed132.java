
package com.conztanz.transform.sbr.v14_1;

/** 
 * To describe a Cabin in a ship
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinDescription_128722_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CabinIdentification_187535_C_CUS_PNRDataFeed_132" name="cabinDetails" minOccurs="0"/>
 *     &lt;xs:element type="CabinDescription_187536_C_CUS_PNRDataFeed_132" name="cabinDescription" minOccurs="0"/>
 *     &lt;xs:element type="Deck_187537_C_CUS_PNRDataFeed_132" name="deckPlanName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cabinStatus" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CabinDescription128722SCUSPNRDataFeed132
{
    private CabinIdentification187535CCUSPNRDataFeed132 cabinDetails;
    private CabinDescription187536CCUSPNRDataFeed132 cabinDescription;
    private Deck187537CCUSPNRDataFeed132 deckPlanName;
    private String cabinStatus;

    /** 
     * Get the 'cabinDetails' element value.
     * 
     * @return value
     */
    public CabinIdentification187535CCUSPNRDataFeed132 getCabinDetails() {
        return cabinDetails;
    }

    /** 
     * Set the 'cabinDetails' element value.
     * 
     * @param cabinDetails
     */
    public void setCabinDetails(
            CabinIdentification187535CCUSPNRDataFeed132 cabinDetails) {
        this.cabinDetails = cabinDetails;
    }

    /** 
     * Get the 'cabinDescription' element value.
     * 
     * @return value
     */
    public CabinDescription187536CCUSPNRDataFeed132 getCabinDescription() {
        return cabinDescription;
    }

    /** 
     * Set the 'cabinDescription' element value.
     * 
     * @param cabinDescription
     */
    public void setCabinDescription(
            CabinDescription187536CCUSPNRDataFeed132 cabinDescription) {
        this.cabinDescription = cabinDescription;
    }

    /** 
     * Get the 'deckPlanName' element value.
     * 
     * @return value
     */
    public Deck187537CCUSPNRDataFeed132 getDeckPlanName() {
        return deckPlanName;
    }

    /** 
     * Set the 'deckPlanName' element value.
     * 
     * @param deckPlanName
     */
    public void setDeckPlanName(Deck187537CCUSPNRDataFeed132 deckPlanName) {
        this.deckPlanName = deckPlanName;
    }

    /** 
     * Get the 'cabinStatus' element value. Status of the cabin
     * 
     * @return value
     */
    public String getCabinStatus() {
        return cabinStatus;
    }

    /** 
     * Set the 'cabinStatus' element value. Status of the cabin
     * 
     * @param cabinStatus
     */
    public void setCabinStatus(String cabinStatus) {
        this.cabinStatus = cabinStatus;
    }
}
