
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DcsInformations_iatciInformation_139584_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompanyInformation_76096_S_CUS_PNRDataFeed_132" name="iatciOriginator"/>
 *     &lt;xs:element type="DcsInformations_iatciInformation_targets_139585_G_CUS_PNRDataFeed_132" name="targets"/>
 *     &lt;xs:element type="TravelProductInformation_76097_S_CUS_PNRDataFeed_132" name="onwardFlight"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DcsInformationsIatciInformation139584GCUSPNRDataFeed132
{
    private CompanyInformation76096SCUSPNRDataFeed132 iatciOriginator;
    private DcsInformationsIatciInformationTargets139585GCUSPNRDataFeed132 targets;
    private TravelProductInformation76097SCUSPNRDataFeed132 onwardFlight;

    /** 
     * Get the 'iatciOriginator' element value. identifies the company that is at the origin of the IATCI message.
     * 
     * @return value
     */
    public CompanyInformation76096SCUSPNRDataFeed132 getIatciOriginator() {
        return iatciOriginator;
    }

    /** 
     * Set the 'iatciOriginator' element value. identifies the company that is at the origin of the IATCI message.
     * 
     * @param iatciOriginator
     */
    public void setIatciOriginator(
            CompanyInformation76096SCUSPNRDataFeed132 iatciOriginator) {
        this.iatciOriginator = iatciOriginator;
    }

    /** 
     * Get the 'targets' element value. Information on target DCS system and target airline for IATCI message
     * 
     * @return value
     */
    public DcsInformationsIatciInformationTargets139585GCUSPNRDataFeed132 getTargets() {
        return targets;
    }

    /** 
     * Set the 'targets' element value. Information on target DCS system and target airline for IATCI message
     * 
     * @param targets
     */
    public void setTargets(
            DcsInformationsIatciInformationTargets139585GCUSPNRDataFeed132 targets) {
        this.targets = targets;
    }

    /** 
     * Get the 'onwardFlight' element value. onward flight information: - onward departure date - onward carrier - onward flight number - onward flight suffix
     * 
     * @return value
     */
    public TravelProductInformation76097SCUSPNRDataFeed132 getOnwardFlight() {
        return onwardFlight;
    }

    /** 
     * Set the 'onwardFlight' element value. onward flight information: - onward departure date - onward carrier - onward flight number - onward flight suffix
     * 
     * @param onwardFlight
     */
    public void setOnwardFlight(
            TravelProductInformation76097SCUSPNRDataFeed132 onwardFlight) {
        this.onwardFlight = onwardFlight;
    }
}
