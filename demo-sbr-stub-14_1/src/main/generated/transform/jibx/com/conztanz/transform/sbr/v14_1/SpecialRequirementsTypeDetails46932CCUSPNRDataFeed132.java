
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * To specify special requests/services, the quantity required, action to be taken and where the request/service should be administered.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsTypeDetails_46932_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="ssrCode"/>
 *     &lt;xs:element type="xs:string" name="actionCode"/>
 *     &lt;xs:element type="xs:decimal" name="numberInParty"/>
 *     &lt;xs:element type="xs:string" name="airlineCode"/>
 *     &lt;xs:element type="xs:string" name="serviceType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="otherServiceType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="boardPoint" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="offPoint" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="serviceFreeText" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsTypeDetails46932CCUSPNRDataFeed132
{
    private String ssrCode;
    private String actionCode;
    private BigDecimal numberInParty;
    private String airlineCode;
    private String serviceType;
    private String otherServiceType;
    private String boardPoint;
    private String offPoint;
    private List<String> serviceFreeTextList = new ArrayList<String>();

    /** 
     * Get the 'ssrCode' element value. This is the seat code: ex NSST, NGST.
     * 
     * @return value
     */
    public String getSsrCode() {
        return ssrCode;
    }

    /** 
     * Set the 'ssrCode' element value. This is the seat code: ex NSST, NGST.
     * 
     * @param ssrCode
     */
    public void setSsrCode(String ssrCode) {
        this.ssrCode = ssrCode;
    }

    /** 
     * Get the 'actionCode' element value. The status code of the seat.
     * 
     * @return value
     */
    public String getActionCode() {
        return actionCode;
    }

    /** 
     * Set the 'actionCode' element value. The status code of the seat.
     * 
     * @param actionCode
     */
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    /** 
     * Get the 'numberInParty' element value. This is the number of passengers contained in the seat.
     * 
     * @return value
     */
    public BigDecimal getNumberInParty() {
        return numberInParty;
    }

    /** 
     * Set the 'numberInParty' element value. This is the number of passengers contained in the seat.
     * 
     * @param numberInParty
     */
    public void setNumberInParty(BigDecimal numberInParty) {
        this.numberInParty = numberInParty;
    }

    /** 
     * Get the 'airlineCode' element value. The company code.
     * 
     * @return value
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /** 
     * Set the 'airlineCode' element value. The company code.
     * 
     * @param airlineCode
     */
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    /** 
     * Get the 'serviceType' element value. Application specific indicators.
     * 
     * @return value
     */
    public String getServiceType() {
        return serviceType;
    }

    /** 
     * Set the 'serviceType' element value. Application specific indicators.
     * 
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /** 
     * Get the 'otherServiceType' element value. Application specific indicator.
     * 
     * @return value
     */
    public String getOtherServiceType() {
        return otherServiceType;
    }

    /** 
     * Set the 'otherServiceType' element value. Application specific indicator.
     * 
     * @param otherServiceType
     */
    public void setOtherServiceType(String otherServiceType) {
        this.otherServiceType = otherServiceType;
    }

    /** 
     * Get the 'boardPoint' element value. Point of departure.
     * 
     * @return value
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /** 
     * Set the 'boardPoint' element value. Point of departure.
     * 
     * @param boardPoint
     */
    public void setBoardPoint(String boardPoint) {
        this.boardPoint = boardPoint;
    }

    /** 
     * Get the 'offPoint' element value. Point of Arrival.
     * 
     * @return value
     */
    public String getOffPoint() {
        return offPoint;
    }

    /** 
     * Set the 'offPoint' element value. Point of Arrival.
     * 
     * @param offPoint
     */
    public void setOffPoint(String offPoint) {
        this.offPoint = offPoint;
    }

    /** 
     * Get the list of 'serviceFreeText' element items. Free text common to the entire seat.
     * 
     * @return list
     */
    public List<String> getServiceFreeTextList() {
        return serviceFreeTextList;
    }

    /** 
     * Set the list of 'serviceFreeText' element items. Free text common to the entire seat.
     * 
     * @param list
     */
    public void setServiceFreeTextList(List<String> list) {
        serviceFreeTextList = list;
    }
}
