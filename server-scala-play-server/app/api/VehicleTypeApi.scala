package api

import play.api.libs.json._
import model.BigDecimal
import model.VehicleType

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait VehicleTypeApi {
  /**
    * Create Vehicle Type
    * Create a new vehicle type
    * @param vehicleType A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    */
  def createVehicleType(version: BigDecimal, vehicleType: String, body: Option[VehicleType]): VehicleType

  /**
    * Delete Vehicle Type
    * Delete a vehicle type
    * @param vehicleTypeId The id of the requested vehicle type
    */
  def deleteVehicleType(version: BigDecimal, vehicleTypeId: Long): Unit

  /**
    * Get Vehicle Type
    * Get a vehicle type
    * @param vehicleTypeId The id of the requested vehicle type
    */
  def getVehicleType(version: BigDecimal, vehicleTypeId: Long): VehicleType

  /**
    * Search Vehicle Type
    * Search for types of vehicles
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param retailerId Filter by retailer
    * @param hubId Filter by service hub
    */
  def searchVehicleTypes(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, retailerId: Option[Long], hubId: Option[Long]): List[VehicleType]

  /**
    * Update Vehicle Type
    * Update a vehicle type
    * @param vehicleTypeId The id of the vehicle type to update
    * @param vehicleType The new data for the vehicle type to update to. A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    */
  def updateVehicleType(version: BigDecimal, vehicleTypeId: Long, vehicleType: String, body: Option[VehicleType]): VehicleType
}
