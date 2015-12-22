
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the action that should be taken on a selected reference number.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ActionDetails_128656_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProcessingInformation_187452_C_CUS_PNRDataFeed_132" name="numberOfItemsDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ActionDetails128656SCUSPNRDataFeed132
{
    private ProcessingInformation187452CCUSPNRDataFeed132 numberOfItemsDetails;

    /** 
     * Get the 'numberOfItemsDetails' element value. Contains the details about the product knowledge
     * 
     * @return value
     */
    public ProcessingInformation187452CCUSPNRDataFeed132 getNumberOfItemsDetails() {
        return numberOfItemsDetails;
    }

    /** 
     * Set the 'numberOfItemsDetails' element value. Contains the details about the product knowledge
     * 
     * @param numberOfItemsDetails
     */
    public void setNumberOfItemsDetails(
            ProcessingInformation187452CCUSPNRDataFeed132 numberOfItemsDetails) {
        this.numberOfItemsDetails = numberOfItemsDetails;
    }
}
