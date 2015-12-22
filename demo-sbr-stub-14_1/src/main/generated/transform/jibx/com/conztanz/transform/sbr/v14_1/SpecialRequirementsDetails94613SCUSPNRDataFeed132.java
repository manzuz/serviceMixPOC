
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify special requests or services information relating to a traveler.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDetails_94613_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecialRequirementsTypeDetails_142233_C_CUS_PNRDataFeed_132" name="specialRequirementsInfo"/>
 *     &lt;xs:element type="SpecialRequirementsDataDetails_142232_C_CUS_PNRDataFeed_132" name="seatDetails" minOccurs="0" maxOccurs="999"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDetails94613SCUSPNRDataFeed132
{
    private SpecialRequirementsTypeDetails142233CCUSPNRDataFeed132 specialRequirementsInfo;
    private List<SpecialRequirementsDataDetails142232CCUSPNRDataFeed132> seatDetailList = new ArrayList<SpecialRequirementsDataDetails142232CCUSPNRDataFeed132>();

    /** 
     * Get the 'specialRequirementsInfo' element value. Seat description.
     * 
     * @return value
     */
    public SpecialRequirementsTypeDetails142233CCUSPNRDataFeed132 getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /** 
     * Set the 'specialRequirementsInfo' element value. Seat description.
     * 
     * @param specialRequirementsInfo
     */
    public void setSpecialRequirementsInfo(
            SpecialRequirementsTypeDetails142233CCUSPNRDataFeed132 specialRequirementsInfo) {
        this.specialRequirementsInfo = specialRequirementsInfo;
    }

    /** 
     * Get the list of 'seatDetails' element items.
     * 
     * @return list
     */
    public List<SpecialRequirementsDataDetails142232CCUSPNRDataFeed132> getSeatDetailList() {
        return seatDetailList;
    }

    /** 
     * Set the list of 'seatDetails' element items.
     * 
     * @param list
     */
    public void setSeatDetailList(
            List<SpecialRequirementsDataDetails142232CCUSPNRDataFeed132> list) {
        seatDetailList = list;
    }
}
