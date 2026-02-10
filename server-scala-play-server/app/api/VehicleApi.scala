package api

import play.api.libs.json._
import model.BigDecimal
import model.Vehicle

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait VehicleApi {
  /**
    * Create Vehicle
    * Create new vehicle
    * @param vehicle A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    */
  def createVehicle(version: BigDecimal, vehicle: String, body: Option[Vehicle]): Vehicle

  /**
    * Delete Vehicle
    * Delete an existing vehicle
    * @param id The id of the vehicle to delete
    */
  def deleteVehicle(version: BigDecimal, id: Long): Unit

  /**
    * Get Vehicle
    * Get an existing vehicle
    * @param id The id of the vehicle requested
    */
  def getVehicle(version: BigDecimal, id: Long): Vehicle

  /**
    * Search Vehicle
    * Search for vehicles
    * @param hubId Filter by service hub
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param keyword The keyword to search for
    */
  def searchVehicle(version: BigDecimal, hubId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String]): List[Vehicle]

  /**
    * Update Vehicle
    * Update an existing vehicle
    * @param id The id of the vehicle to update
    * @param vehicle A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    */
  def updateVehicle(version: BigDecimal, id: Long, vehicle: String, body: Option[Vehicle]): Vehicle
}
