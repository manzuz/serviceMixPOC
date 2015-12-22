
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Generic group to convey payment related data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentAttributesData_112575_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CodedAttribute_94496_S_CUS_PNRDataFeed_132" name="groupUsage"/>
 *     &lt;xs:element type="PaymentDataGroup_112600_G_CUS_PNRDataFeed_132" name="paymentData" minOccurs="0"/>
 *     &lt;xs:element type="CodedAttribute_94497_S_CUS_PNRDataFeed_132" name="paymentSupplementaryData" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="MeanOfPaymentData_112576_G_CUS_PNRDataFeed_132" name="mopInformation" minOccurs="0"/>
 *     &lt;xs:element type="DummySegment_94498_S_CUS_PNRDataFeed_132" name="dummy"/>
 *     &lt;xs:element type="DetailedPaymentData_112583_G_CUS_PNRDataFeed_132" name="mopDetailedData" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentAttributesData112575GCUSPNRDataFeed132
{
    private CodedAttribute94496SCUSPNRDataFeed132 groupUsage;
    private PaymentDataGroup112600GCUSPNRDataFeed132 paymentData;
    private List<CodedAttribute94497SCUSPNRDataFeed132> paymentSupplementaryDataList = new ArrayList<CodedAttribute94497SCUSPNRDataFeed132>();
    private MeanOfPaymentData112576GCUSPNRDataFeed132 mopInformation;
    private DummySegment94498SCUSPNRDataFeed132 dummy;
    private DetailedPaymentData112583GCUSPNRDataFeed132 mopDetailedData;

    /** 
     * Get the 'groupUsage' element value. Used to describe the element on which the action is performed : FP/FC/PAY and in which context integrated/non integrated
     * 
     * @return value
     */
    public CodedAttribute94496SCUSPNRDataFeed132 getGroupUsage() {
        return groupUsage;
    }

    /** 
     * Set the 'groupUsage' element value. Used to describe the element on which the action is performed : FP/FC/PAY and in which context integrated/non integrated
     * 
     * @param groupUsage
     */
    public void setGroupUsage(CodedAttribute94496SCUSPNRDataFeed132 groupUsage) {
        this.groupUsage = groupUsage;
    }

    /** 
     * Get the 'paymentData' element value. will convey all data necessary for the paiment and not dependant from the Mean Of Payment
     * 
     * @return value
     */
    public PaymentDataGroup112600GCUSPNRDataFeed132 getPaymentData() {
        return paymentData;
    }

    /** 
     * Set the 'paymentData' element value. will convey all data necessary for the paiment and not dependant from the Mean Of Payment
     * 
     * @param paymentData
     */
    public void setPaymentData(
            PaymentDataGroup112600GCUSPNRDataFeed132 paymentData) {
        this.paymentData = paymentData;
    }

    /** 
     * Get the list of 'paymentSupplementaryData' element items. it will convey the Descriptive Billing Information: ONO, GWT, best Fare indicator....
     * 
     * @return list
     */
    public List<CodedAttribute94497SCUSPNRDataFeed132> getPaymentSupplementaryDataList() {
        return paymentSupplementaryDataList;
    }

    /** 
     * Set the list of 'paymentSupplementaryData' element items. it will convey the Descriptive Billing Information: ONO, GWT, best Fare indicator....
     * 
     * @param list
     */
    public void setPaymentSupplementaryDataList(
            List<CodedAttribute94497SCUSPNRDataFeed132> list) {
        paymentSupplementaryDataList = list;
    }

    /** 
     * Get the 'mopInformation' element value. will convey all the specificities of the Mean of Payment
     * 
     * @return value
     */
    public MeanOfPaymentData112576GCUSPNRDataFeed132 getMopInformation() {
        return mopInformation;
    }

    /** 
     * Set the 'mopInformation' element value. will convey all the specificities of the Mean of Payment
     * 
     * @param mopInformation
     */
    public void setMopInformation(
            MeanOfPaymentData112576GCUSPNRDataFeed132 mopInformation) {
        this.mopInformation = mopInformation;
    }

    /** 
     * Get the 'dummy' element value. will allow the usage of FOP segment as trigger for MOPD and MOPS groups
     * 
     * @return value
     */
    public DummySegment94498SCUSPNRDataFeed132 getDummy() {
        return dummy;
    }

    /** 
     * Set the 'dummy' element value. will allow the usage of FOP segment as trigger for MOPD and MOPS groups
     * 
     * @param dummy
     */
    public void setDummy(DummySegment94498SCUSPNRDataFeed132 dummy) {
        this.dummy = dummy;
    }

    /** 
     * Get the 'mopDetailedData' element value. will convey the result of the payment and related to the detailed Mean Of Payment
     * 
     * @return value
     */
    public DetailedPaymentData112583GCUSPNRDataFeed132 getMopDetailedData() {
        return mopDetailedData;
    }

    /** 
     * Set the 'mopDetailedData' element value. will convey the result of the payment and related to the detailed Mean Of Payment
     * 
     * @param mopDetailedData
     */
    public void setMopDetailedData(
            DetailedPaymentData112583GCUSPNRDataFeed132 mopDetailedData) {
        this.mopDetailedData = mopDetailedData;
    }
}
