
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * convey FOP data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GeneralFopRepresentation_112574_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TicketingFormOfPayment_94493_S_CUS_PNRDataFeed_132" name="fopPNRDetails"/>
 *     &lt;xs:element type="SequenceDetails_94494_S_CUS_PNRDataFeed_132" name="fopSequenceNumber" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_94495_S_CUS_PNRDataFeed_132" name="fopFreeflow" minOccurs="0"/>
 *     &lt;xs:element type="PnrSupplementaryData_112604_G_CUS_PNRDataFeed_132" name="pnrSupplementaryData" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="PaymentAttributesData_112575_G_CUS_PNRDataFeed_132" name="paymentModule" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GeneralFopRepresentation112574GCUSPNRDataFeed132
{
    private TicketingFormOfPayment94493SCUSPNRDataFeed132 fopPNRDetails;
    private SequenceDetails94494SCUSPNRDataFeed132 fopSequenceNumber;
    private FreeTextInformation94495SCUSPNRDataFeed132 fopFreeflow;
    private List<PnrSupplementaryData112604GCUSPNRDataFeed132> pnrSupplementaryDataList = new ArrayList<PnrSupplementaryData112604GCUSPNRDataFeed132>();
    private PaymentAttributesData112575GCUSPNRDataFeed132 paymentModule;

    /** 
     * Get the 'fopPNRDetails' element value. will convey all the data related to the various codes used by the FOP package, billing, ETS...
     * 
     * @return value
     */
    public TicketingFormOfPayment94493SCUSPNRDataFeed132 getFopPNRDetails() {
        return fopPNRDetails;
    }

    /** 
     * Set the 'fopPNRDetails' element value. will convey all the data related to the various codes used by the FOP package, billing, ETS...
     * 
     * @param fopPNRDetails
     */
    public void setFopPNRDetails(
            TicketingFormOfPayment94493SCUSPNRDataFeed132 fopPNRDetails) {
        this.fopPNRDetails = fopPNRDetails;
    }

    /** 
     * Get the 'fopSequenceNumber' element value. Conveys the sequence number of the Form of Payment in the FP Line. It must be set to 1 if there is only 1 FOP in the FOP  Old FOP are referenced with sequence number: 0
     * 
     * @return value
     */
    public SequenceDetails94494SCUSPNRDataFeed132 getFopSequenceNumber() {
        return fopSequenceNumber;
    }

    /** 
     * Set the 'fopSequenceNumber' element value. Conveys the sequence number of the Form of Payment in the FP Line. It must be set to 1 if there is only 1 FOP in the FOP  Old FOP are referenced with sequence number: 0
     * 
     * @param fopSequenceNumber
     */
    public void setFopSequenceNumber(
            SequenceDetails94494SCUSPNRDataFeed132 fopSequenceNumber) {
        this.fopSequenceNumber = fopSequenceNumber;
    }

    /** 
     * Get the 'fopFreeflow' element value. This segment conveys Form of Payment FreeText.   Old FOP(s) are considered as one freeflow text even if there is more than one old form of payment.  e.g.: FP O/CA+CCVI+/CH CA and CCVI are considered as freeflow text.
     * 
     * @return value
     */
    public FreeTextInformation94495SCUSPNRDataFeed132 getFopFreeflow() {
        return fopFreeflow;
    }

    /** 
     * Set the 'fopFreeflow' element value. This segment conveys Form of Payment FreeText.   Old FOP(s) are considered as one freeflow text even if there is more than one old form of payment.  e.g.: FP O/CA+CCVI+/CH CA and CCVI are considered as freeflow text.
     * 
     * @param fopFreeflow
     */
    public void setFopFreeflow(
            FreeTextInformation94495SCUSPNRDataFeed132 fopFreeflow) {
        this.fopFreeflow = fopFreeflow;
    }

    /** 
     * Get the list of 'pnrSupplementaryData' element items. will convey the switches and data associated to the FOP table
     * 
     * @return list
     */
    public List<PnrSupplementaryData112604GCUSPNRDataFeed132> getPnrSupplementaryDataList() {
        return pnrSupplementaryDataList;
    }

    /** 
     * Set the list of 'pnrSupplementaryData' element items. will convey the switches and data associated to the FOP table
     * 
     * @param list
     */
    public void setPnrSupplementaryDataList(
            List<PnrSupplementaryData112604GCUSPNRDataFeed132> list) {
        pnrSupplementaryDataList = list;
    }

    /** 
     * Get the 'paymentModule' element value. will contain all the data related to the payment transaction
     * 
     * @return value
     */
    public PaymentAttributesData112575GCUSPNRDataFeed132 getPaymentModule() {
        return paymentModule;
    }

    /** 
     * Set the 'paymentModule' element value. will contain all the data related to the payment transaction
     * 
     * @param paymentModule
     */
    public void setPaymentModule(
            PaymentAttributesData112575GCUSPNRDataFeed132 paymentModule) {
        this.paymentModule = paymentModule;
    }
}
