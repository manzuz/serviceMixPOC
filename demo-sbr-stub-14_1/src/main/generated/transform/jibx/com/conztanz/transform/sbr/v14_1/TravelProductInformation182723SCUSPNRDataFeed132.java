
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details related to a product
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_182723_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateOrTime_256708_C_CUS_PNRDataFeed_132" name="product" minOccurs="0"/>
 *     &lt;xs:element type="Location_2784_C_CUS_PNRDataFeed_132" name="boardpointDetail" minOccurs="0"/>
 *     &lt;xs:element type="Location_2794_C_CUS_PNRDataFeed_132" name="offpointDetail" minOccurs="0"/>
 *     &lt;xs:element type="CompanyIdentification_2785_C_CUS_PNRDataFeed_132" name="companyDetail" minOccurs="0"/>
 *     &lt;xs:element type="ProductIdentificationDetails_2786_C_CUS_PNRDataFeed_132" name="productDetails" minOccurs="0"/>
 *     &lt;xs:element type="ProductTypeDetails_48265_C_CUS_PNRDataFeed_132" name="typeDetail" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="processingIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation182723SCUSPNRDataFeed132
{
    private ProductDateOrTime256708CCUSPNRDataFeed132 product;
    private Location2784CCUSPNRDataFeed132 boardpointDetail;
    private Location2794CCUSPNRDataFeed132 offpointDetail;
    private CompanyIdentification2785CCUSPNRDataFeed132 companyDetail;
    private ProductIdentificationDetails2786CCUSPNRDataFeed132 productDetails;
    private ProductTypeDetails48265CCUSPNRDataFeed132 typeDetail;
    private String processingIndicator;

    /** 
     * Get the 'product' element value. To specify dates and times of the product
     * 
     * @return value
     */
    public ProductDateOrTime256708CCUSPNRDataFeed132 getProduct() {
        return product;
    }

    /** 
     * Set the 'product' element value. To specify dates and times of the product
     * 
     * @param product
     */
    public void setProduct(ProductDateOrTime256708CCUSPNRDataFeed132 product) {
        this.product = product;
    }

    /** 
     * Get the 'boardpointDetail' element value. Boarding point detail
     * 
     * @return value
     */
    public Location2784CCUSPNRDataFeed132 getBoardpointDetail() {
        return boardpointDetail;
    }

    /** 
     * Set the 'boardpointDetail' element value. Boarding point detail
     * 
     * @param boardpointDetail
     */
    public void setBoardpointDetail(
            Location2784CCUSPNRDataFeed132 boardpointDetail) {
        this.boardpointDetail = boardpointDetail;
    }

    /** 
     * Get the 'offpointDetail' element value. Off Point details
     * 
     * @return value
     */
    public Location2794CCUSPNRDataFeed132 getOffpointDetail() {
        return offpointDetail;
    }

    /** 
     * Set the 'offpointDetail' element value. Off Point details
     * 
     * @param offpointDetail
     */
    public void setOffpointDetail(Location2794CCUSPNRDataFeed132 offpointDetail) {
        this.offpointDetail = offpointDetail;
    }

    /** 
     * Get the 'companyDetail' element value. Company identification
     * 
     * @return value
     */
    public CompanyIdentification2785CCUSPNRDataFeed132 getCompanyDetail() {
        return companyDetail;
    }

    /** 
     * Set the 'companyDetail' element value. Company identification
     * 
     * @param companyDetail
     */
    public void setCompanyDetail(
            CompanyIdentification2785CCUSPNRDataFeed132 companyDetail) {
        this.companyDetail = companyDetail;
    }

    /** 
     * Get the 'productDetails' element value. Product identifications details
     * 
     * @return value
     */
    public ProductIdentificationDetails2786CCUSPNRDataFeed132 getProductDetails() {
        return productDetails;
    }

    /** 
     * Set the 'productDetails' element value. Product identifications details
     * 
     * @param productDetails
     */
    public void setProductDetails(
            ProductIdentificationDetails2786CCUSPNRDataFeed132 productDetails) {
        this.productDetails = productDetails;
    }

    /** 
     * Get the 'typeDetail' element value. Product Type details
     * 
     * @return value
     */
    public ProductTypeDetails48265CCUSPNRDataFeed132 getTypeDetail() {
        return typeDetail;
    }

    /** 
     * Set the 'typeDetail' element value. Product Type details
     * 
     * @param typeDetail
     */
    public void setTypeDetail(
            ProductTypeDetails48265CCUSPNRDataFeed132 typeDetail) {
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
