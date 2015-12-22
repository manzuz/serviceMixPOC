
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the action that should be taken on a selected reference number.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ActionDetails_10079_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProcessingInformation_18450_C_CUS_PNRDataFeed_132" name="numberOfItemsDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ActionDetails10079SCUSPNRDataFeed132
{
    private ProcessingInformation18450CCUSPNRDataFeed132 numberOfItemsDetails;

    /** 
     * Get the 'numberOfItemsDetails' element value. Contains the details about the product knowledge
     * 
     * @return value
     */
    public ProcessingInformation18450CCUSPNRDataFeed132 getNumberOfItemsDetails() {
        return numberOfItemsDetails;
    }

    /** 
     * Set the 'numberOfItemsDetails' element value. Contains the details about the product knowledge
     * 
     * @param numberOfItemsDetails
     */
    public void setNumberOfItemsDetails(
            ProcessingInformation18450CCUSPNRDataFeed132 numberOfItemsDetails) {
        this.numberOfItemsDetails = numberOfItemsDetails;
    }
}
