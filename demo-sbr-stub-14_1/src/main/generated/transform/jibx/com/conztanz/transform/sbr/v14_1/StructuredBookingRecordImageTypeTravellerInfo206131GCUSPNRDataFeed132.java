
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_travellerInfo_206131_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ElementManagementSegment_129491_S_CUS_PNRDataFeed_132" name="elementManagementPassenger"/>
 *     &lt;xs:element type="ReferenceInformation_24862_S_CUS_PNRDataFeed_132" name="referenceForPassenger" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_travellerInfo_passengerData_206132_G_CUS_PNRDataFeed_132" name="passengerData" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_travellerInfo_enhancedPassengerData_206133_G_CUS_PNRDataFeed_132" name="enhancedPassengerData" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeTravellerInfo206131GCUSPNRDataFeed132
{
    private ElementManagementSegment129491SCUSPNRDataFeed132 elementManagementPassenger;
    private ReferenceInformation24862SCUSPNRDataFeed132 referenceForPassenger;
    private List<StructuredBookingRecordImageTypeTravellerInfoPassengerData206132GCUSPNRDataFeed132> passengerDataList = new ArrayList<StructuredBookingRecordImageTypeTravellerInfoPassengerData206132GCUSPNRDataFeed132>();
    private List<StructuredBookingRecordImageTypeTravellerInfoEnhancedPassengerData206133GCUSPNRDataFeed132> enhancedPassengerDataList = new ArrayList<StructuredBookingRecordImageTypeTravellerInfoEnhancedPassengerData206133GCUSPNRDataFeed132>();

    /** 
     * Get the 'elementManagementPassenger' element value. PNR segments/elements references
     * 
     * @return value
     */
    public ElementManagementSegment129491SCUSPNRDataFeed132 getElementManagementPassenger() {
        return elementManagementPassenger;
    }

    /** 
     * Set the 'elementManagementPassenger' element value. PNR segments/elements references
     * 
     * @param elementManagementPassenger
     */
    public void setElementManagementPassenger(
            ElementManagementSegment129491SCUSPNRDataFeed132 elementManagementPassenger) {
        this.elementManagementPassenger = elementManagementPassenger;
    }

    /** 
     * Get the 'referenceForPassenger' element value. provide specific reference identification
     * 
     * @return value
     */
    public ReferenceInformation24862SCUSPNRDataFeed132 getReferenceForPassenger() {
        return referenceForPassenger;
    }

    /** 
     * Set the 'referenceForPassenger' element value. provide specific reference identification
     * 
     * @param referenceForPassenger
     */
    public void setReferenceForPassenger(
            ReferenceInformation24862SCUSPNRDataFeed132 referenceForPassenger) {
        this.referenceForPassenger = referenceForPassenger;
    }

    /** 
     * Get the list of 'passengerData' element items. This group contains passenger related information:  - name  - date of birth First repetition is usually for adult and second for related infant.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeTravellerInfoPassengerData206132GCUSPNRDataFeed132> getPassengerDataList() {
        return passengerDataList;
    }

    /** 
     * Set the list of 'passengerData' element items. This group contains passenger related information:  - name  - date of birth First repetition is usually for adult and second for related infant.
     * 
     * @param list
     */
    public void setPassengerDataList(
            List<StructuredBookingRecordImageTypeTravellerInfoPassengerData206132GCUSPNRDataFeed132> list) {
        passengerDataList = list;
    }

    /** 
     * Get the list of 'enhancedPassengerData' element items.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeTravellerInfoEnhancedPassengerData206133GCUSPNRDataFeed132> getEnhancedPassengerDataList() {
        return enhancedPassengerDataList;
    }

    /** 
     * Set the list of 'enhancedPassengerData' element items.
     * 
     * @param list
     */
    public void setEnhancedPassengerDataList(
            List<StructuredBookingRecordImageTypeTravellerInfoEnhancedPassengerData206133GCUSPNRDataFeed132> list) {
        enhancedPassengerDataList = list;
    }
}
