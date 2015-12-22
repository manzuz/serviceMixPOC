
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the point of sale details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorOfRequestDetails_79778_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorIdentificationDetails_122345_C_CUS_PNRDataFeed_132" name="originatorIdentificationDetail"/>
 *     &lt;xs:element type="SystemDetails_122347_C_CUS_PNRDataFeed_132" name="untoSystemDetailsDetail"/>
 *     &lt;xs:element type="xs:string" name="communicationNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorOfRequestDetails79778SCUSPNRDataFeed132
{
    private OriginatorIdentificationDetails122345CCUSPNRDataFeed132 originatorIdentificationDetail;
    private SystemDetails122347CCUSPNRDataFeed132 untoSystemDetailsDetail;
    private String communicationNumber;

    /** 
     * Get the 'originatorIdentificationDetail' element value. Originator specifications: Previous Office Owner of the PNR
     * 
     * @return value
     */
    public OriginatorIdentificationDetails122345CCUSPNRDataFeed132 getOriginatorIdentificationDetail() {
        return originatorIdentificationDetail;
    }

    /** 
     * Set the 'originatorIdentificationDetail' element value. Originator specifications: Previous Office Owner of the PNR
     * 
     * @param originatorIdentificationDetail
     */
    public void setOriginatorIdentificationDetail(
            OriginatorIdentificationDetails122345CCUSPNRDataFeed132 originatorIdentificationDetail) {
        this.originatorIdentificationDetail = originatorIdentificationDetail;
    }

    /** 
     * Get the 'untoSystemDetailsDetail' element value. Destination system details
     * 
     * @return value
     */
    public SystemDetails122347CCUSPNRDataFeed132 getUntoSystemDetailsDetail() {
        return untoSystemDetailsDetail;
    }

    /** 
     * Set the 'untoSystemDetailsDetail' element value. Destination system details
     * 
     * @param untoSystemDetailsDetail
     */
    public void setUntoSystemDetailsDetail(
            SystemDetails122347CCUSPNRDataFeed132 untoSystemDetailsDetail) {
        this.untoSystemDetailsDetail = untoSystemDetailsDetail;
    }

    /** 
     * Get the 'communicationNumber' element value. Terminal ID: NWLNIATA where: - NW=network id (09 for 1A) - LN=line - IA=interchange address - TA=terminal address
     * 
     * @return value
     */
    public String getCommunicationNumber() {
        return communicationNumber;
    }

    /** 
     * Set the 'communicationNumber' element value. Terminal ID: NWLNIATA where: - NW=network id (09 for 1A) - LN=line - IA=interchange address - TA=terminal address
     * 
     * @param communicationNumber
     */
    public void setCommunicationNumber(String communicationNumber) {
        this.communicationNumber = communicationNumber;
    }
}
