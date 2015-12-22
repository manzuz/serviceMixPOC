
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details related to a product
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_36746_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateOrTime_62874_C_CUS_PNRDataFeed_132" name="product" minOccurs="0"/>
 *     &lt;xs:element type="Location_62875_C_CUS_PNRDataFeed_132" name="boardpointDetail" minOccurs="0"/>
 *     &lt;xs:element type="Location_62876_C_CUS_PNRDataFeed_132" name="offpointDetail" minOccurs="0"/>
 *     &lt;xs:element type="CompanyIdentification_62871_C_CUS_PNRDataFeed_132" name="companyDetail" minOccurs="0"/>
 *     &lt;xs:element type="ProductIdentificationDetails_62872_C_CUS_PNRDataFeed_132" name="productDetails" minOccurs="0"/>
 *     &lt;xs:element type="ProductTypeDetails_62873_C_CUS_PNRDataFeed_132" name="typeDetail" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="processingIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation36746SCUSPNRDataFeed132
{
    private ProductDateOrTime62874CCUSPNRDataFeed132 product;
    private Location62875CCUSPNRDataFeed132 boardpointDetail;
    private Location62876CCUSPNRDataFeed132 offpointDetail;
    private CompanyIdentification62871CCUSPNRDataFeed132 companyDetail;
    private ProductIdentificationDetails62872CCUSPNRDataFeed132 productDetails;
    private ProductTypeDetails62873CCUSPNRDataFeed132 typeDetail;
    private String processingIndicator;

    /** 
     * Get the 'product' element value. To specify dates and times of the product
     * 
     * @return value
     */
    public ProductDateOrTime62874CCUSPNRDataFeed132 getProduct() {
        return product;
    }

    /** 
     * Set the 'product' element value. To specify dates and times of the product
     * 
     * @param product
     */
    public void setProduct(ProductDateOrTime62874CCUSPNRDataFeed132 product) {
        this.product = product;
    }

    /** 
     * Get the 'boardpointDetail' element value. Boarding point detail
     * 
     * @return value
     */
    public Location62875CCUSPNRDataFeed132 getBoardpointDetail() {
        return boardpointDetail;
    }

    /** 
     * Set the 'boardpointDetail' element value. Boarding point detail
     * 
     * @param boardpointDetail
     */
    public void setBoardpointDetail(
            Location62875CCUSPNRDataFeed132 boardpointDetail) {
        this.boardpointDetail = boardpointDetail;
    }

    /** 
     * Get the 'offpointDetail' element value. Off Point details
     * 
     * @return value
     */
    public Location62876CCUSPNRDataFeed132 getOffpointDetail() {
        return offpointDetail;
    }

    /** 
     * Set the 'offpointDetail' element value. Off Point details
     * 
     * @param offpointDetail
     */
    public void setOffpointDetail(Location62876CCUSPNRDataFeed132 offpointDetail) {
        this.offpointDetail = offpointDetail;
    }

    /** 
     * Get the 'companyDetail' element value. Company identification
     * 
     * @return value
     */
    public CompanyIdentification62871CCUSPNRDataFeed132 getCompanyDetail() {
        return companyDetail;
    }

    /** 
     * Set the 'companyDetail' element value. Company identification
     * 
     * @param companyDetail
     */
    public void setCompanyDetail(
            CompanyIdentification62871CCUSPNRDataFeed132 companyDetail) {
        this.companyDetail = companyDetail;
    }

    /** 
     * Get the 'productDetails' element value. Product identifications details
     * 
     * @return value
     */
    public ProductIdentificationDetails62872CCUSPNRDataFeed132 getProductDetails() {
        return productDetails;
    }

    /** 
     * Set the 'productDetails' element value. Product identifications details
     * 
     * @param productDetails
     */
    public void setProductDetails(
            ProductIdentificationDetails62872CCUSPNRDataFeed132 productDetails) {
        this.productDetails = productDetails;
    }

    /** 
     * Get the 'typeDetail' element value. Product Type details
     * 
     * @return value
     */
    public ProductTypeDetails62873CCUSPNRDataFeed132 getTypeDetail() {
        return typeDetail;
    }

    /** 
     * Set the 'typeDetail' element value. Product Type details
     * 
     * @param typeDetail
     */
    public void setTypeDetail(
            ProductTypeDetails62873CCUSPNRDataFeed132 typeDetail) {
        this.typeDetail = typeDetail;
    }

    /** 
     * Get the 'processingIndicator' element value. AIR segment : to indicate an Informational Air segment :  N for No action required.
     * 
     * @return value
     */
    public String getProcessingIndicator() {
        return processingIndicator;
    }

    /** 
     * Set the 'processingIndicator' element value. AIR segment : to indicate an Informational Air segment :  N for No action required.
     * 
     * @param processingIndicator
     */
    public void setProcessingIndicator(String processingIndicator) {
        this.processingIndicator = processingIndicator;
    }
}
