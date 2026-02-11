package api

import play.api.libs.json._
import model.CargoType

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait CargoTypeApi {
  /**
    * Create Cargo Type
    * Create new cargo type
    */
  def createCargoType(body: Option[CargoType]): CargoType

  /**
    * Delete Cargo Type
    * Delete a type of cargo
    * @param cargoTypeId the ID of the cargo type
    */
  def deleteCargoType(cargoTypeId: Long): Unit

  /**
    * Get Cargo Type
    * Get an existing cargo type
    * @param cargoTypeId the cargo type ID
    */
  def getCargoType(cargoTypeId: Long): CargoType

  /**
    * Search Cargo Type
    * Search for types of cargo
    * @param sortField the sort field to use for the cargo type
    * @param descending if the cargo type should be should be in descending order
    * @param start the start of the search
    * @param limit the limit of the search
    * @param activeOnly if search should be on active only
    * @param retailerId the id of the retailer location
    * @param hubId the ID of the hub
    */
  def searchCargoTypes(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, retailerId: Option[Long], hubId: Option[Long]): List[CargoType]

  /**
    * Update Cargo Type
    * Update an existing cargo type
    * @param cargoTypeId the ID of the cargo type
    */
  def updateCargoType(cargoTypeId: Long, body: Option[CargoType]): CargoType
}
