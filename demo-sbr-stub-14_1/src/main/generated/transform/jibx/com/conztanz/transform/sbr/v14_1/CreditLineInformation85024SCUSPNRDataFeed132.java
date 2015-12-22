
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Describes an end of transaction and transmits information of  credit line of the history
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CreditLineInformation_85024_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TransactionOriginatorInformation_129405_C_CUS_PNRDataFeed_132" name="officeData" maxOccurs="2"/>
 *     &lt;xs:element type="xs:string" name="receiveFrom" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="pointOfSale" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="tripChoice" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CreditLineInformation85024SCUSPNRDataFeed132
{
    private List<TransactionOriginatorInformation129405CCUSPNRDataFeed132> officeDataList = new ArrayList<TransactionOriginatorInformation129405CCUSPNRDataFeed132>();
    private String receiveFrom;
    private String pointOfSale;
    private String tripChoice;

    /** 
     * Get the list of 'officeData' element items. BASIC TRANSACTION INFORMATION
     * 
     * @return list
     */
    public List<TransactionOriginatorInformation129405CCUSPNRDataFeed132> getOfficeDataList() {
        return officeDataList;
    }

    /** 
     * Set the list of 'officeData' element items. BASIC TRANSACTION INFORMATION
     * 
     * @param list
     */
    public void setOfficeDataList(
            List<TransactionOriginatorInformation129405CCUSPNRDataFeed132> list) {
        officeDataList = list;
    }

    /** 
     * Get the 'receiveFrom' element value. Received From information (automated of manual information)
     * 
     * @return value
     */
    public String getReceiveFrom() {
        return receiveFrom;
    }

    /** 
     * Set the 'receiveFrom' element value. Received From information (automated of manual information)
     * 
     * @param receiveFrom
     */
    public void setReceiveFrom(String receiveFrom) {
        this.receiveFrom = receiveFrom;
    }

    /** 
     * Get the 'pointOfSale' element value. Point of Sale information
     * 
     * @return value
     */
    public String getPointOfSale() {
        return pointOfSale;
    }

    /** 
     * Set the 'pointOfSale' element value. Point of Sale information
     * 
     * @param pointOfSale
     */
    public void setPointOfSale(String pointOfSale) {
        this.pointOfSale = pointOfSale;
    }

    /** 
     * Get the 'tripChoice' element value. Trip Choice Code (only for the first end of transaction)
     * 
     * @return value
     */
    public String getTripChoice() {
        return tripChoice;
    }

    /** 
     * Set the 'tripChoice' element value. Trip Choice Code (only for the first end of transaction)
     * 
     * @param tripChoice
     */
    public void setTripChoice(String tripChoice) {
        this.tripChoice = tripChoice;
    }
}
