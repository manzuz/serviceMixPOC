
package com.conztanz.transform.sbr.v14_1;

/** 
 * Provides detailed information regarding each award program used by this hotel.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Award_142693_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="provider" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="rating" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Award142693CCUSPNRDataFeed132
{
    private String provider;
    private String rating;

    /** 
     * Get the 'provider' element value. The name of the award or ratings provider.
     * 
     * @return value
     */
    public String getProvider() {
        return provider;
    }

    /** 
     * Set the 'provider' element value. The name of the award or ratings provider.
     * 
     * @param provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /** 
     * Get the 'rating' element value. The actual award or rating received by the hotel facility.
     * 
     * @return value
     */
    public String getRating() {
        return rating;
    }

    /** 
     * Set the 'rating' element value. The actual award or rating received by the hotel facility.
     * 
     * @param rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }
}
