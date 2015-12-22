
package com.conztanz.transform.sbr.v14_1;

/** 
 * Convey OND informations
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OndGroup_181045_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_76537_S_CUS_PNRDataFeed_132" name="yieldInformations"/>
 *     &lt;xs:element type="ProductInformation_76271_S_CUS_PNRDataFeed_132" name="classCombinaison" minOccurs="0"/>
 *     &lt;xs:element type="OriginAndDestinationDetails_76268_S_CUS_PNRDataFeed_132" name="ondyield"/>
 *     &lt;xs:element type="OriginAndDestinationDetails_76268_S_CUS_PNRDataFeed_132" name="tripOnD" minOccurs="0"/>
 *     &lt;xs:element type="PointOfCommencement_158823_S_CUS_PNRDataFeed_132" name="pointOfCommencement" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OndGroup181045GCUSPNRDataFeed132
{
    private MonetaryInformation76537SCUSPNRDataFeed132 yieldInformations;
    private ProductInformation76271SCUSPNRDataFeed132 classCombinaison;
    private OriginAndDestinationDetails76268SCUSPNRDataFeed132 ondyield;
    private OriginAndDestinationDetails76268SCUSPNRDataFeed132 tripOnD;
    private PointOfCommencement158823SCUSPNRDataFeed132 pointOfCommencement;

    /** 
     * Get the 'yieldInformations' element value. Yield informations:  Adjusted Yield Segment Bid Price Effective Yield Revenue Loss OND Yield
     * 
     * @return value
     */
    public MonetaryInformation76537SCUSPNRDataFeed132 getYieldInformations() {
        return yieldInformations;
    }

    /** 
     * Set the 'yieldInformations' element value. Yield informations:  Adjusted Yield Segment Bid Price Effective Yield Revenue Loss OND Yield
     * 
     * @param yieldInformations
     */
    public void setYieldInformations(
            MonetaryInformation76537SCUSPNRDataFeed132 yieldInformations) {
        this.yieldInformations = yieldInformations;
    }

    /** 
     * Get the 'classCombinaison' element value. Class code as defined in yield retrieved / Class combinaison of the yield retrieved
     * 
     * @return value
     */
    public ProductInformation76271SCUSPNRDataFeed132 getClassCombinaison() {
        return classCombinaison;
    }

    /** 
     * Set the 'classCombinaison' element value. Class code as defined in yield retrieved / Class combinaison of the yield retrieved
     * 
     * @param classCombinaison
     */
    public void setClassCombinaison(
            ProductInformation76271SCUSPNRDataFeed132 classCombinaison) {
        this.classCombinaison = classCombinaison;
    }

    /** 
     * Get the 'ondyield' element value. Origin and Destination of the Yield
     * 
     * @return value
     */
    public OriginAndDestinationDetails76268SCUSPNRDataFeed132 getOndyield() {
        return ondyield;
    }

    /** 
     * Set the 'ondyield' element value. Origin and Destination of the Yield
     * 
     * @param ondyield
     */
    public void setOndyield(
            OriginAndDestinationDetails76268SCUSPNRDataFeed132 ondyield) {
        this.ondyield = ondyield;
    }

    /** 
     * Get the 'tripOnD' element value. Origin And Destination of the Trip
     * 
     * @return value
     */
    public OriginAndDestinationDetails76268SCUSPNRDataFeed132 getTripOnD() {
        return tripOnD;
    }

    /** 
     * Set the 'tripOnD' element value. Origin And Destination of the Trip
     * 
     * @param tripOnD
     */
    public void setTripOnD(
            OriginAndDestinationDetails76268SCUSPNRDataFeed132 tripOnD) {
        this.tripOnD = tripOnD;
    }

    /** 
     * Get the 'pointOfCommencement' element value.
     * 
     * @return value
     */
    public PointOfCommencement158823SCUSPNRDataFeed132 getPointOfCommencement() {
        return pointOfCommencement;
    }

    /** 
     * Set the 'pointOfCommencement' element value.
     * 
     * @param pointOfCommencement
     */
    public void setPointOfCommencement(
            PointOfCommencement158823SCUSPNRDataFeed132 pointOfCommencement) {
        this.pointOfCommencement = pointOfCommencement;
    }
}
