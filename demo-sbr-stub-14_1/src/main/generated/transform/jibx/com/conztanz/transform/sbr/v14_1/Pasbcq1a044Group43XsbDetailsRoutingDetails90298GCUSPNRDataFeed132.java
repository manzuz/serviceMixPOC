
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Pasbcq1a044Group43_xsbDetails_routingDetails_90298_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ConnectionDetails_70499_S_CUS_PNRDataFeed_132" name="connectionPoint"/>
 *     &lt;xs:element type="OriginAndDestinationDetails_70484_S_CUS_PNRDataFeed_132" name="routingCities"/>
 *     &lt;xs:element type="TransportIdentifier_70488_S_CUS_PNRDataFeed_132" name="routingCarrier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Pasbcq1a044Group43XsbDetailsRoutingDetails90298GCUSPNRDataFeed132
{
    private ConnectionDetails70499SCUSPNRDataFeed132 connectionPoint;
    private OriginAndDestinationDetails70484SCUSPNRDataFeed132 routingCities;
    private TransportIdentifier70488SCUSPNRDataFeed132 routingCarrier;

    /** 
     * Get the 'connectionPoint' element value. XSB connection point in routing detail.
     * 
     * @return value
     */
    public ConnectionDetails70499SCUSPNRDataFeed132 getConnectionPoint() {
        return connectionPoint;
    }

    /** 
     * Set the 'connectionPoint' element value. XSB connection point in routing detail.
     * 
     * @param connectionPoint
     */
    public void setConnectionPoint(
            ConnectionDetails70499SCUSPNRDataFeed132 connectionPoint) {
        this.connectionPoint = connectionPoint;
    }

    /** 
     * Get the 'routingCities' element value. City from/to for detail routing.
     * 
     * @return value
     */
    public OriginAndDestinationDetails70484SCUSPNRDataFeed132 getRoutingCities() {
        return routingCities;
    }

    /** 
     * Set the 'routingCities' element value. City from/to for detail routing.
     * 
     * @param routingCities
     */
    public void setRoutingCities(
            OriginAndDestinationDetails70484SCUSPNRDataFeed132 routingCities) {
        this.routingCities = routingCities;
    }

    /** 
     * Get the 'routingCarrier' element value. Routing detail carrier.
     * 
     * @return value
     */
    public TransportIdentifier70488SCUSPNRDataFeed132 getRoutingCarrier() {
        return routingCarrier;
    }

    /** 
     * Set the 'routingCarrier' element value. Routing detail carrier.
     * 
     * @param routingCarrier
     */
    public void setRoutingCarrier(
            TransportIdentifier70488SCUSPNRDataFeed132 routingCarrier) {
        this.routingCarrier = routingCarrier;
    }
}
