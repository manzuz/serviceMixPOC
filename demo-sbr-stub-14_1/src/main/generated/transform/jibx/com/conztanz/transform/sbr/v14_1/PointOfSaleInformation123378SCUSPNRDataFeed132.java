
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify point of sale information by party identification or location identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PointOfSaleInformation_123378_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PartyIdentification_180264_C_CUS_PNRDataFeed_132" name="pointOfSale"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PointOfSaleInformation123378SCUSPNRDataFeed132
{
    private PartyIdentification180264CCUSPNRDataFeed132 pointOfSale;

    /** 
     * Get the 'pointOfSale' element value. The point of sale segment indicates the type of POS.
     * 
     * @return value
     */
    public PartyIdentification180264CCUSPNRDataFeed132 getPointOfSale() {
        return pointOfSale;
    }

    /** 
     * Set the 'pointOfSale' element value. The point of sale segment indicates the type of POS.
     * 
     * @param pointOfSale
     */
    public void setPointOfSale(
            PartyIdentification180264CCUSPNRDataFeed132 pointOfSale) {
        this.pointOfSale = pointOfSale;
    }
}
