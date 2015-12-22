
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InventoryData_60369_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SegmentCabinIdentification_42205_S_CUS_PNRDataFeed_132" name="cabinInformation"/>
 *     &lt;xs:element type="SubclassIdentification_42204_S_CUS_PNRDataFeed_132" name="subClassInformation" minOccurs="0"/>
 *     &lt;xs:element type="AdditionalBusinessSourceInformation_42203_S_CUS_PNRDataFeed_132" name="subClassClassification" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InventoryData60369GCUSPNRDataFeed132
{
    private SegmentCabinIdentification42205SCUSPNRDataFeed132 cabinInformation;
    private SubclassIdentification42204SCUSPNRDataFeed132 subClassInformation;
    private AdditionalBusinessSourceInformation42203SCUSPNRDataFeed132 subClassClassification;

    /** 
     * Get the 'cabinInformation' element value. The cabin related information.
     * 
     * @return value
     */
    public SegmentCabinIdentification42205SCUSPNRDataFeed132 getCabinInformation() {
        return cabinInformation;
    }

    /** 
     * Set the 'cabinInformation' element value. The cabin related information.
     * 
     * @param cabinInformation
     */
    public void setCabinInformation(
            SegmentCabinIdentification42205SCUSPNRDataFeed132 cabinInformation) {
        this.cabinInformation = cabinInformation;
    }

    /** 
     * Get the 'subClassInformation' element value. The sub-class related information.
     * 
     * @return value
     */
    public SubclassIdentification42204SCUSPNRDataFeed132 getSubClassInformation() {
        return subClassInformation;
    }

    /** 
     * Set the 'subClassInformation' element value. The sub-class related information.
     * 
     * @param subClassInformation
     */
    public void setSubClassInformation(
            SubclassIdentification42204SCUSPNRDataFeed132 subClassInformation) {
        this.subClassInformation = subClassInformation;
    }

    /** 
     * Get the 'subClassClassification' element value. The classification of the sub-class.
     * 
     * @return value
     */
    public AdditionalBusinessSourceInformation42203SCUSPNRDataFeed132 getSubClassClassification() {
        return subClassClassification;
    }

    /** 
     * Set the 'subClassClassification' element value. The classification of the sub-class.
     * 
     * @param subClassClassification
     */
    public void setSubClassClassification(
            AdditionalBusinessSourceInformation42203SCUSPNRDataFeed132 subClassClassification) {
        this.subClassClassification = subClassClassification;
    }
}
