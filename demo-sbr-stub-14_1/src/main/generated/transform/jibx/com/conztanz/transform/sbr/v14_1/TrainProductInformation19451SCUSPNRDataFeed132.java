
package com.conztanz.transform.sbr.v14_1;

/** 
 * Train Product Information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TrainProductInformation_19451_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TrainDetails_33866_C_CUS_PNRDataFeed_132" name="trainDetails" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TrainProductInformation19451SCUSPNRDataFeed132
{
    private TrainDetails33866CCUSPNRDataFeed132 trainDetails;
    private String type;

    /** 
     * Get the 'trainDetails' element value. Train Details
     * 
     * @return value
     */
    public TrainDetails33866CCUSPNRDataFeed132 getTrainDetails() {
        return trainDetails;
    }

    /** 
     * Set the 'trainDetails' element value. Train Details
     * 
     * @param trainDetails
     */
    public void setTrainDetails(TrainDetails33866CCUSPNRDataFeed132 trainDetails) {
        this.trainDetails = trainDetails;
    }

    /** 
     * Get the 'type' element value. Transportation mode (BUS, SHIP, TRAIN, TGV etc)
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Transportation mode (BUS, SHIP, TRAIN, TGV etc)
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
