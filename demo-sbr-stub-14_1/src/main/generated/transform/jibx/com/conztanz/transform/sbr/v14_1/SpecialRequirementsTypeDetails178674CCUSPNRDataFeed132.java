
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * SPECIAL REQUIREMENTS TYPE DETAILS
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsTypeDetails_178674_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="ssrCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="actionCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="numberInParty" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="airlineCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="serviceType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="otherServiceType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="boardPoint" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="offPoint" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="serviceFreeText" minOccurs="0" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsTypeDetails178674CCUSPNRDataFeed132
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
     * Get the 'ssrCode' element value. To specify the Code of the SSR/OSI/SK.
     * 
     * @return value
     */
    public String getSsrCode() {
        return ssrCode;
    }

    /** 
     * Set the 'ssrCode' element value. To specify the Code of the SSR/OSI/SK.
     * 
     * @param ssrCode
     */
    public void setSsrCode(String ssrCode) {
        this.ssrCode = ssrCode;
    }

    /** 
     * Get the 'actionCode' element value. To specify the status of the Service: HK: Confirmed
     * 
     * @return value
     */
    public String getActionCode() {
        return actionCode;
    }

    /** 
     * Set the 'actionCode' element value. To specify the status of the Service: HK: Confirmed
     * 
     * @param actionCode
     */
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    /** 
     * Get the 'numberInParty' element value. To specify, for some SSR, the number of items involved  (e.g.: for PETS, BIKE....)
     * 
     * @return value
     */
    public BigDecimal getNumberInParty() {
        return numberInParty;
    }

    /** 
     * Set the 'numberInParty' element value. To specify, for some SSR, the number of items involved  (e.g.: for PETS, BIKE....)
     * 
     * @param numberInParty
     */
    public void setNumberInParty(BigDecimal numberInParty) {
        this.numberInParty = numberInParty;
    }

    /** 
     * Get the 'airlineCode' element value. To specify to which carrier the service applies.
     * 
     * @return value
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /** 
     * Set the 'airlineCode' element value. To specify to which carrier the service applies.
     * 
     * @param airlineCode
     */
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    /** 
     * Get the 'serviceType' element value. To specify if the service is an: - SSR - OSI - SK
     * 
     * @return value
     */
    public String getServiceType() {
        return serviceType;
    }

    /** 
     * Set the 'serviceType' element value. To specify if the service is an: - SSR - OSI - SK
     * 
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /** 
     * Get the 'otherServiceType' element value. Processing indicator, coded
     * 
     * @return value
     */
    public String getOtherServiceType() {
        return otherServiceType;
    }

    /** 
     * Set the 'otherServiceType' element value. Processing indicator, coded
     * 
     * @param otherServiceType
     */
    public void setOtherServiceType(String otherServiceType) {
        this.otherServiceType = otherServiceType;
    }

    /** 
     * Get the 'boardPoint' element value. Place/location identification
     * 
     * @return value
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /** 
     * Set the 'boardPoint' element value. Place/location identification
     * 
     * @param boardPoint
     */
    public void setBoardPoint(String boardPoint) {
        this.boardPoint = boardPoint;
    }

    /** 
     * Get the 'offPoint' element value. Place/location identification
     * 
     * @return value
     */
    public String getOffPoint() {
        return offPoint;
    }

    /** 
     * Set the 'offPoint' element value. Place/location identification
     * 
     * @param offPoint
     */
    public void setOffPoint(String offPoint) {
        this.offPoint = offPoint;
    }

    /** 
     * Get the list of 'serviceFreeText' element items. Free Text attached to the Service.
     * 
     * @return list
     */
    public List<String> getServiceFreeTextList() {
        return serviceFreeTextList;
    }

    /** 
     * Set the list of 'serviceFreeText' element items. Free Text attached to the Service.
     * 
     * @param list
     */
    public void setServiceFreeTextList(List<String> list) {
        serviceFreeTextList = list;
    }
}
