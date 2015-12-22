
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DcsInformations_iatciInformation_targets_139585_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SystemDetailsInfo_76098_S_CUS_PNRDataFeed_132" name="targetDcs"/>
 *     &lt;xs:element type="CompanyInformation_76096_S_CUS_PNRDataFeed_132" name="targetCarrier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DcsInformationsIatciInformationTargets139585GCUSPNRDataFeed132
{
    private SystemDetailsInfo76098SCUSPNRDataFeed132 targetDcs;
    private CompanyInformation76096SCUSPNRDataFeed132 targetCarrier;

    /** 
     * Get the 'targetDcs' element value. contains identification of the DCS system to which Through check-in message have been sent
     * 
     * @return value
     */
    public SystemDetailsInfo76098SCUSPNRDataFeed132 getTargetDcs() {
        return targetDcs;
    }

    /** 
     * Set the 'targetDcs' element value. contains identification of the DCS system to which Through check-in message have been sent
     * 
     * @param targetDcs
     */
    public void setTargetDcs(SystemDetailsInfo76098SCUSPNRDataFeed132 targetDcs) {
        this.targetDcs = targetDcs;
    }

    /** 
     * Get the 'targetCarrier' element value. contains the identification of the carrier company that receive through check-in information
     * 
     * @return value
     */
    public CompanyInformation76096SCUSPNRDataFeed132 getTargetCarrier() {
        return targetCarrier;
    }

    /** 
     * Set the 'targetCarrier' element value. contains the identification of the carrier company that receive through check-in information
     * 
     * @param targetCarrier
     */
    public void setTargetCarrier(
            CompanyInformation76096SCUSPNRDataFeed132 targetCarrier) {
        this.targetCarrier = targetCarrier;
    }
}
