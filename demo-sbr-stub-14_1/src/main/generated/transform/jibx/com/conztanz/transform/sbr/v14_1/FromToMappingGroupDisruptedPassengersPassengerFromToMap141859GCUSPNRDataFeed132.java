
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FromToMappingGroup_disruptedPassengers_passengerFromToMap_141859_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NumberOfUnits_121361_S_CUS_PNRDataFeed_132" name="numberOfUnitsType"/>
 *     &lt;xs:element type="ReaccommodationSegmentDescriptionGroup_139415_G_CUS_PNRDataFeed_132" name="fromSegmentsInformation" maxOccurs="3"/>
 *     &lt;xs:element type="DummySegment_11095_S_CUS_PNRDataFeed_132" name="fromToSeparator"/>
 *     &lt;xs:element type="ReaccommodationSegmentDescriptionGroup_139415_G_CUS_PNRDataFeed_132" name="toSegmentsInformation" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FromToMappingGroupDisruptedPassengersPassengerFromToMap141859GCUSPNRDataFeed132
{
    private NumberOfUnits121361SCUSPNRDataFeed132 numberOfUnitsType;
    private List<ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132> fromSegmentsInformationList = new ArrayList<ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132>();
    private DummySegment11095SCUSPNRDataFeed132 fromToSeparator;
    private List<ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132> toSegmentsInformationList = new ArrayList<ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132>();

    /** 
     * Get the 'numberOfUnitsType' element value. Number of From and To segments
     * 
     * @return value
     */
    public NumberOfUnits121361SCUSPNRDataFeed132 getNumberOfUnitsType() {
        return numberOfUnitsType;
    }

    /** 
     * Set the 'numberOfUnitsType' element value. Number of From and To segments
     * 
     * @param numberOfUnitsType
     */
    public void setNumberOfUnitsType(
            NumberOfUnits121361SCUSPNRDataFeed132 numberOfUnitsType) {
        this.numberOfUnitsType = numberOfUnitsType;
    }

    /** 
     * Get the list of 'fromSegmentsInformation' element items.
     * 
     * @return list
     */
    public List<ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132> getFromSegmentsInformationList() {
        return fromSegmentsInformationList;
    }

    /** 
     * Set the list of 'fromSegmentsInformation' element items.
     * 
     * @param list
     */
    public void setFromSegmentsInformationList(
            List<ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132> list) {
        fromSegmentsInformationList = list;
    }

    /** 
     * Get the 'fromToSeparator' element value.
     * 
     * @return value
     */
    public DummySegment11095SCUSPNRDataFeed132 getFromToSeparator() {
        return fromToSeparator;
    }

    /** 
     * Set the 'fromToSeparator' element value.
     * 
     * @param fromToSeparator
     */
    public void setFromToSeparator(
            DummySegment11095SCUSPNRDataFeed132 fromToSeparator) {
        this.fromToSeparator = fromToSeparator;
    }

    /** 
     * Get the list of 'toSegmentsInformation' element items.
     * 
     * @return list
     */
    public List<ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132> getToSegmentsInformationList() {
        return toSegmentsInformationList;
    }

    /** 
     * Set the list of 'toSegmentsInformation' element items.
     * 
     * @param list
     */
    public void setToSegmentsInformationList(
            List<ReaccommodationSegmentDescriptionGroup139415GCUSPNRDataFeed132> list) {
        toSegmentsInformationList = list;
    }
}
