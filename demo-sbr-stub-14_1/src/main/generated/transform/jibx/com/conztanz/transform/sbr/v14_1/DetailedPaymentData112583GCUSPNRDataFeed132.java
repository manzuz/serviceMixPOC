
package com.conztanz.transform.sbr.v14_1;

/** 
 * will convey the Detailed Payment Data associated to a MOP
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DetailedPaymentData_112583_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FormOfPayment_94499_S_CUS_PNRDataFeed_132" name="fopInformation"/>
 *     &lt;xs:element type="DummySegment_94498_S_CUS_PNRDataFeed_132" name="dummy"/>
 *     &lt;xs:element type="GroupForCreditCardStatus_112585_G_CUS_PNRDataFeed_132" name="creditCardDetailedData" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DetailedPaymentData112583GCUSPNRDataFeed132
{
    private FormOfPayment94499SCUSPNRDataFeed132 fopInformation;
    private DummySegment94498SCUSPNRDataFeed132 dummy;
    private GroupForCreditCardStatus112585GCUSPNRDataFeed132 creditCardDetailedData;

    /** 
     * Get the 'fopInformation' element value. This segment will convey the type of the FOP. Exple : CC credit card CA cash CH cheque WW web
     * 
     * @return value
     */
    public FormOfPayment94499SCUSPNRDataFeed132 getFopInformation() {
        return fopInformation;
    }

    /** 
     * Set the 'fopInformation' element value. This segment will convey the type of the FOP. Exple : CC credit card CA cash CH cheque WW web
     * 
     * @param fopInformation
     */
    public void setFopInformation(
            FormOfPayment94499SCUSPNRDataFeed132 fopInformation) {
        this.fopInformation = fopInformation;
    }

    /** 
     * Get the 'dummy' element value. will allow the usage of FOP segment as trigger for GASS and GIVR groups
     * 
     * @return value
     */
    public DummySegment94498SCUSPNRDataFeed132 getDummy() {
        return dummy;
    }

    /** 
     * Set the 'dummy' element value. will allow the usage of FOP segment as trigger for GASS and GIVR groups
     * 
     * @param dummy
     */
    public void setDummy(DummySegment94498SCUSPNRDataFeed132 dummy) {
        this.dummy = dummy;
    }

    /** 
     * Get the 'creditCardDetailedData' element value. This group will convey the detailed status of the credit card payment
     * 
     * @return value
     */
    public GroupForCreditCardStatus112585GCUSPNRDataFeed132 getCreditCardDetailedData() {
        return creditCardDetailedData;
    }

    /** 
     * Set the 'creditCardDetailedData' element value. This group will convey the detailed status of the credit card payment
     * 
     * @param creditCardDetailedData
     */
    public void setCreditCardDetailedData(
            GroupForCreditCardStatus112585GCUSPNRDataFeed132 creditCardDetailedData) {
        this.creditCardDetailedData = creditCardDetailedData;
    }
}
