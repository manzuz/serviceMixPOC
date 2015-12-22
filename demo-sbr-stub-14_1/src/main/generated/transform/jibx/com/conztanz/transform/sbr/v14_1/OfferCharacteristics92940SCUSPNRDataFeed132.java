
package com.conztanz.transform.sbr.v14_1;

/** 
 * Offer elements description
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OfferCharacteristics_92940_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="offerStatus"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_139828_C_CUS_PNRDataFeed_132" name="offerValidityDate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OfferCharacteristics92940SCUSPNRDataFeed132
{
    private String offerStatus;
    private StructuredDateTimeInformation139828CCUSPNRDataFeed132 offerValidityDate;

    /** 
     * Get the 'offerStatus' element value. Provide the offer status
     * 
     * @return value
     */
    public String getOfferStatus() {
        return offerStatus;
    }

    /** 
     * Set the 'offerStatus' element value. Provide the offer status
     * 
     * @param offerStatus
     */
    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
    }

    /** 
     * Get the 'offerValidityDate' element value. This is the date after which the offer will be considered as expired.
     * 
     * @return value
     */
    public StructuredDateTimeInformation139828CCUSPNRDataFeed132 getOfferValidityDate() {
        return offerValidityDate;
    }

    /** 
     * Set the 'offerValidityDate' element value. This is the date after which the offer will be considered as expired.
     * 
     * @param offerValidityDate
     */
    public void setOfferValidityDate(
            StructuredDateTimeInformation139828CCUSPNRDataFeed132 offerValidityDate) {
        this.offerValidityDate = offerValidityDate;
    }
}
