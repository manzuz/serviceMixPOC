
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RevenueManagementData_33010_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OverbookingDetails_57479_C_CUS_PNRDataFeed_132" name="overbooking"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RevenueManagementData33010SCUSPNRDataFeed132
{
    private OverbookingDetails57479CCUSPNRDataFeed132 overbooking;

    /** 
     * Get the 'overbooking' element value.
     * 
     * @return value
     */
    public OverbookingDetails57479CCUSPNRDataFeed132 getOverbooking() {
        return overbooking;
    }

    /** 
     * Set the 'overbooking' element value.
     * 
     * @param overbooking
     */
    public void setOverbooking(
            OverbookingDetails57479CCUSPNRDataFeed132 overbooking) {
        this.overbooking = overbooking;
    }
}
