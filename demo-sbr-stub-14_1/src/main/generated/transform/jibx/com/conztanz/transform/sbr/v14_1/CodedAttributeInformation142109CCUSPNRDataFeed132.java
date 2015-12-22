
package com.conztanz.transform.sbr.v14_1;

/** 
 * Convey coded key and corresponding value
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodedAttributeInformation_142109_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="attributeType"/>
 *     &lt;xs:element type="xs:string" name="attributeDescription"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CodedAttributeInformation142109CCUSPNRDataFeed132
{
    private String attributeType;
    private String attributeDescription;

    /** 
     * Get the 'attributeType' element value. will convey the following QF data:  ONOD onoData     Order Number(Qantas specific)  GWTD gwtData     Government Warrant number(Qantas specific)  HOLDN ccHolderName    Conveys the CN (company name) (Qantas specific).This has sense only in case of automatic creation of attribute record (cards is a bets card). In the other cases this information cannot be filled.  ONOR onoRequired    This ONO indicator indicates whether or not ONO data is mandatory.(Information provided by Qantas IGW link) This has sense only in case of automatic creation of attribute record (cards is a bets card)  GWTR gwtRequired     This GWT indicator indicates whether or not GWT data is mandatory.(Information provided by Qantas IGW link) This has sense only in case of automatic creation of attribute record (cards is a bets card)  CIND cind     Conveys CIND indicator : - MANU - AUTO This indicates whether attributes records have been created manually (no bets card) or automatically (bets card).  BFAREC bestFareCandidate     Conveys best fare indicator: - Yes - No This indicates whether or not the card is best fare candidate. (this implies card is a bets card)
     * 
     * @return value
     */
    public String getAttributeType() {
        return attributeType;
    }

    /** 
     * Set the 'attributeType' element value. will convey the following QF data:  ONOD onoData     Order Number(Qantas specific)  GWTD gwtData     Government Warrant number(Qantas specific)  HOLDN ccHolderName    Conveys the CN (company name) (Qantas specific).This has sense only in case of automatic creation of attribute record (cards is a bets card). In the other cases this information cannot be filled.  ONOR onoRequired    This ONO indicator indicates whether or not ONO data is mandatory.(Information provided by Qantas IGW link) This has sense only in case of automatic creation of attribute record (cards is a bets card)  GWTR gwtRequired     This GWT indicator indicates whether or not GWT data is mandatory.(Information provided by Qantas IGW link) This has sense only in case of automatic creation of attribute record (cards is a bets card)  CIND cind     Conveys CIND indicator : - MANU - AUTO This indicates whether attributes records have been created manually (no bets card) or automatically (bets card).  BFAREC bestFareCandidate     Conveys best fare indicator: - Yes - No This indicates whether or not the card is best fare candidate. (this implies card is a bets card)
     * 
     * @param attributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /** 
     * Get the 'attributeDescription' element value. onoData   Order Number(Qantas specific)  gwtData   Government Warrant number  ccHolderName  Conveys the CN   onoRequired  YES - NO  gwtRequired   YES - NO  cind    MANU - AUTO  bestFareCandidate   YES - NO
     * 
     * @return value
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /** 
     * Set the 'attributeDescription' element value. onoData   Order Number(Qantas specific)  gwtData   Government Warrant number  ccHolderName  Conveys the CN   onoRequired  YES - NO  gwtRequired   YES - NO  cind    MANU - AUTO  bestFareCandidate   YES - NO
     * 
     * @param attributeDescription
     */
    public void setAttributeDescription(String attributeDescription) {
        this.attributeDescription = attributeDescription;
    }
}
