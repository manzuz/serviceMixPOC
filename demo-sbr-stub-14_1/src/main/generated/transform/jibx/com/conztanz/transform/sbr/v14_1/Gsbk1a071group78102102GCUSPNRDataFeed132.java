
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Gsbk1a071group78_102102_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ElementManagementSegment_83037_S_CUS_PNRDataFeed_132" name="elementManagement"/>
 *     &lt;xs:element type="PackageDescription_83039_S_CUS_PNRDataFeed_132" name="deliveryDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Gsbk1a071group78102102GCUSPNRDataFeed132
{
    private ElementManagementSegment83037SCUSPNRDataFeed132 elementManagement;
    private PackageDescription83039SCUSPNRDataFeed132 deliveryDetails;

    /** 
     * Get the 'elementManagement' element value. Identification and semantic attached to the reference description (E.g: a customer can have multiple roles: payer, traveller, insured...)
     * 
     * @return value
     */
    public ElementManagementSegment83037SCUSPNRDataFeed132 getElementManagement() {
        return elementManagement;
    }

    /** 
     * Set the 'elementManagement' element value. Identification and semantic attached to the reference description (E.g: a customer can have multiple roles: payer, traveller, insured...)
     * 
     * @param elementManagement
     */
    public void setElementManagement(
            ElementManagementSegment83037SCUSPNRDataFeed132 elementManagement) {
        this.elementManagement = elementManagement;
    }

    /** 
     * Get the 'deliveryDetails' element value. Describes the details around this mode of delivery
     * 
     * @return value
     */
    public PackageDescription83039SCUSPNRDataFeed132 getDeliveryDetails() {
        return deliveryDetails;
    }

    /** 
     * Set the 'deliveryDetails' element value. Describes the details around this mode of delivery
     * 
     * @param deliveryDetails
     */
    public void setDeliveryDetails(
            PackageDescription83039SCUSPNRDataFeed132 deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }
}
