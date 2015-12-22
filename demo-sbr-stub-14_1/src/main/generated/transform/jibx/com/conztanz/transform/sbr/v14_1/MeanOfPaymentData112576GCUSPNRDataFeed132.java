
package com.conztanz.transform.sbr.v14_1;

/** 
 * will convey Mean Of Payment specific data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MeanOfPaymentData_112576_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FormOfPayment_94499_S_CUS_PNRDataFeed_132" name="fopInformation"/>
 *     &lt;xs:element type="DummySegment_94498_S_CUS_PNRDataFeed_132" name="dummy"/>
 *     &lt;xs:element type="GroupForCreditCardData_112578_G_CUS_PNRDataFeed_132" name="creditCardData" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MeanOfPaymentData112576GCUSPNRDataFeed132
{
    private FormOfPayment94499SCUSPNRDataFeed132 fopInformation;
    private DummySegment94498SCUSPNRDataFeed132 dummy;
    private GroupForCreditCardData112578GCUSPNRDataFeed132 creditCardData;

    /** 
     * Get the 'fopInformation' element value. This segment will convey the type of the FOP. Exple : CC credit card CA cash CH cheque SWI swipe card WA web account WB web bank(fund tranfer)
     * 
     * @return value
     */
    public FormOfPayment94499SCUSPNRDataFeed132 getFopInformation() {
        return fopInformation;
    }

    /** 
     * Set the 'fopInformation' element value. This segment will convey the type of the FOP. Exple : CC credit card CA cash CH cheque SWI swipe card WA web account WB web bank(fund tranfer)
     * 
     * @param fopInformation
     */
    public void setFopInformation(
            FormOfPayment94499SCUSPNRDataFeed132 fopInformation) {
        this.fopInformation = fopInformation;
    }

    /** 
     * Get the 'dummy' element value. will allow the usage of FOP segment as trigger for GASY and GINV groups
     * 
     * @return value
     */
    public DummySegment94498SCUSPNRDataFeed132 getDummy() {
        return dummy;
    }

    /** 
     * Set the 'dummy' element value. will allow the usage of FOP segment as trigger for GASY and GINV groups
     * 
     * @param dummy
     */
    public void setDummy(DummySegment94498SCUSPNRDataFeed132 dummy) {
        this.dummy = dummy;
    }

    /** 
     * Get the 'creditCardData' element value. will convey all credit card data needed for the payment
     * 
     * @return value
     */
    public GroupForCreditCardData112578GCUSPNRDataFeed132 getCreditCardData() {
        return creditCardData;
    }

    /** 
     * Set the 'creditCardData' element value. will convey all credit card data needed for the payment
     * 
     * @param creditCardData
     */
    public void setCreditCardData(
            GroupForCreditCardData112578GCUSPNRDataFeed132 creditCardData) {
        this.creditCardData = creditCardData;
    }
}
