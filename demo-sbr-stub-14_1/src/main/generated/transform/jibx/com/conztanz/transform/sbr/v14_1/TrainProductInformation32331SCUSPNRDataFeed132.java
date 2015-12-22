
package com.conztanz.transform.sbr.v14_1;

/** 
 * Train Product Information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TrainProductInformation_32331_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="railCompany"/>
 *     &lt;xs:element type="TrainDetails_56429_C_CUS_PNRDataFeed_132" name="trainDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TrainProductInformation32331SCUSPNRDataFeed132
{
    private String railCompany;
    private TrainDetails56429CCUSPNRDataFeed132 trainDetails;
    private String type;

    /** 
     * Get the 'railCompany' element value. Rail Company
     * 
     * @return value
     */
    public String getRailCompany() {
        return railCompany;
    }

    /** 
     * Set the 'railCompany' element value. Rail Company
     * 
     * @param railCompany
     */
    public void setRailCompany(String railCompany) {
        this.railCompany = railCompany;
    }

    /** 
     * Get the 'trainDetails' element value. Train Details
     * 
     * @return value
     */
    public TrainDetails56429CCUSPNRDataFeed132 getTrainDetails() {
        return trainDetails;
    }

    /** 
     * Set the 'trainDetails' element value. Train Details
     * 
     * @param trainDetails
     */
    public void setTrainDetails(TrainDetails56429CCUSPNRDataFeed132 trainDetails) {
        this.trainDetails = trainDetails;
    }

    /** 
     * Get the 'type' element value. Train Equipment Type  (TGV,TGD,TGN...)
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Train Equipment Type  (TGV,TGD,TGN...)
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
