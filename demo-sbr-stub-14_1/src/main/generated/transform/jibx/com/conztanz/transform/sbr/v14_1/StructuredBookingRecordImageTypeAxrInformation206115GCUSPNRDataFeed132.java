
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_axrInformation_206115_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReservationControlInformation_22991_S_CUS_PNRDataFeed_132" name="axrInfo"/>
 *     &lt;xs:element type="LongFreeText_24804_S_CUS_PNRDataFeed_132" name="axrName"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeAxrInformation206115GCUSPNRDataFeed132
{
    private ReservationControlInformation22991SCUSPNRDataFeed132 axrInfo;
    private LongFreeText24804SCUSPNRDataFeed132 axrName;

    /** 
     * Get the 'axrInfo' element value. Provides record locator information involved in this association
     * 
     * @return value
     */
    public ReservationControlInformation22991SCUSPNRDataFeed132 getAxrInfo() {
        return axrInfo;
    }

    /** 
     * Set the 'axrInfo' element value. Provides record locator information involved in this association
     * 
     * @param axrInfo
     */
    public void setAxrInfo(
            ReservationControlInformation22991SCUSPNRDataFeed132 axrInfo) {
        this.axrInfo = axrInfo;
    }

    /** 
     * Get the 'axrName' element value. Provides free form or coded long free text information
     * 
     * @return value
     */
    public LongFreeText24804SCUSPNRDataFeed132 getAxrName() {
        return axrName;
    }

    /** 
     * Set the 'axrName' element value. Provides free form or coded long free text information
     * 
     * @param axrName
     */
    public void setAxrName(LongFreeText24804SCUSPNRDataFeed132 axrName) {
        this.axrName = axrName;
    }
}
