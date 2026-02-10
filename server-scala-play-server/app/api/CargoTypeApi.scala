package api

import play.api.libs.json._
import model.BigDecimal
import model.CargoType

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait CargoTypeApi {
  /**
    * Create Cargo Type
    * Create new cargo type
    */
  def createCargoType(version: BigDecimal, body: Option[CargoType]): CargoType

  /**
    * Delete Cargo Type
    * Delete a type of cargo
    * @param cargoTypeId the ID of the cargo type
    */
  def deleteCargoType(version: BigDecimal, cargoTypeId: Long): Unit

  /**
    * Get Cargo Type
    * Get an existing cargo type
    * @param cargoTypeId the cargo type ID
    */
  def getCargoType(version: BigDecimal, cargoTypeId: Long): CargoType

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
  def searchCargoTypes(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, retailerId: Option[Long], hubId: Option[Long]): List[CargoType]

  /**
    * Update Cargo Type
    * Update an existing cargo type
    * @param cargoTypeId the ID of the cargo type
    */
  def updateCargoType(version: BigDecimal, cargoTypeId: Long, body: Option[CargoType]): CargoType
}
