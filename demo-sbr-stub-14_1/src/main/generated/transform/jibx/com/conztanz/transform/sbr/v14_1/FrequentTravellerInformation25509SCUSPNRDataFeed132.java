
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify frequent traveler information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FrequentTravellerInformation_25509_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FrequentTravellerIdentification_46444_C_CUS_PNRDataFeed_132" name="frequentTravellerDetails"/>
 *     &lt;xs:element type="FrequentTravellerIdentification_46444_C_CUS_PNRDataFeed_132" name="otherFrequentTravellerDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FrequentTravellerInformation25509SCUSPNRDataFeed132
{
    private FrequentTravellerIdentification46444CCUSPNRDataFeed132 frequentTravellerDetails;
    private FrequentTravellerIdentification46444CCUSPNRDataFeed132 otherFrequentTravellerDetails;

    /** 
     * Get the 'frequentTravellerDetails' element value. Airline Frequent Traveller Information
     * 
     * @return value
     */
    public FrequentTravellerIdentification46444CCUSPNRDataFeed132 getFrequentTravellerDetails() {
        return frequentTravellerDetails;
    }

    /** 
     * Set the 'frequentTravellerDetails' element value. Airline Frequent Traveller Information
     * 
     * @param frequentTravellerDetails
     */
    public void setFrequentTravellerDetails(
            FrequentTravellerIdentification46444CCUSPNRDataFeed132 frequentTravellerDetails) {
        this.frequentTravellerDetails = frequentTravellerDetails;
    }

    /** 
     * Get the 'otherFrequentTravellerDetails' element value. Alliance Frequent Traveller Information
     * 
     * @return value
     */
    public FrequentTravellerIdentification46444CCUSPNRDataFeed132 getOtherFrequentTravellerDetails() {
        return otherFrequentTravellerDetails;
    }

    /** 
     * Set the 'otherFrequentTravellerDetails' element value. Alliance Frequent Traveller Information
     * 
     * @param otherFrequentTravellerDetails
     */
    public void setOtherFrequentTravellerDetails(
            FrequentTravellerIdentification46444CCUSPNRDataFeed132 otherFrequentTravellerDetails) {
        this.otherFrequentTravellerDetails = otherFrequentTravellerDetails;
    }
}
