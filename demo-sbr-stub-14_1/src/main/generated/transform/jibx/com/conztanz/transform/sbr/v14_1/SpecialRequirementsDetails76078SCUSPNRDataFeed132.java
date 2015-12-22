
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify special requests or service s information relating to a traveller
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDetails_76078_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecialRequirementsDataDetails_117833_C_CUS_PNRDataFeed_132" name="seatDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDetails76078SCUSPNRDataFeed132
{
    private SpecialRequirementsDataDetails117833CCUSPNRDataFeed132 seatDetails;

    /** 
     * Get the 'seatDetails' element value. To specify the Seat Number.
     * 
     * @return value
     */
    public SpecialRequirementsDataDetails117833CCUSPNRDataFeed132 getSeatDetails() {
        return seatDetails;
    }

    /** 
     * Set the 'seatDetails' element value. To specify the Seat Number.
     * 
     * @param seatDetails
     */
    public void setSeatDetails(
            SpecialRequirementsDataDetails117833CCUSPNRDataFeed132 seatDetails) {
        this.seatDetails = seatDetails;
    }
}
