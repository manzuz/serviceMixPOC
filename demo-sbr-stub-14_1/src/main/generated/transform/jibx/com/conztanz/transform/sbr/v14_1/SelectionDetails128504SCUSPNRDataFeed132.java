
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the details for making a selection.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SelectionDetails_128504_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SelectionDetailsInformation_187268_C_CUS_PNRDataFeed_132" name="bookingChannel" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SelectionDetails128504SCUSPNRDataFeed132
{
    private List<SelectionDetailsInformation187268CCUSPNRDataFeed132> bookingChannelList = new ArrayList<SelectionDetailsInformation187268CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'bookingChannel' element items. Provides information about how the EC was booked.
     * 
     * @return list
     */
    public List<SelectionDetailsInformation187268CCUSPNRDataFeed132> getBookingChannelList() {
        return bookingChannelList;
    }

    /** 
     * Set the list of 'bookingChannel' element items. Provides information about how the EC was booked.
     * 
     * @param list
     */
    public void setBookingChannelList(
            List<SelectionDetailsInformation187268CCUSPNRDataFeed132> list) {
        bookingChannelList = list;
    }
}
