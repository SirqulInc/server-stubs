package api

import play.api.libs.json._
import model.BigDecimal
import model.OfferTransactionStatusResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait OfferStatusApi {
  /**
    * Create Offer Status
    * Create an offer status record
    * @param name The name of the status
    * @param code The status code, must be unique 
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude Used to update the user&#39;s current location
    * @param longitude Used to update the user&#39;s current location
    * @param description The description of the status
    * @param role The actor that uses the status
    * @param active The active status
    * @param applicationIds The applications to associate the status with, if null then for all.
    */
  def createOfferTransactionStatus(version: BigDecimal, name: String, code: Int, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], description: Option[String], role: Option[String], active: Option[Boolean], applicationIds: Option[String]): OfferTransactionStatusResponse

  /**
    * Delete Offer Status
    * Mark an offer status record as deleted
    * @param statusId The id of the record to delete
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude Used to update the user&#39;s current location
    * @param longitude Used to update the user&#39;s current location
    */
  def deleteOfferTransactionStatus(version: BigDecimal, statusId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Get Offer Status
    * Get an offer status record
    * @param statusId The id of the record to get 
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude Used to update the user&#39;s current location
    * @param longitude Used to update the user&#39;s current location
    */
  def getOfferTransactionStatus(version: BigDecimal, statusId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): OfferTransactionStatusResponse

  /**
    * Search Offer Status
    * Search for the available offer statuses
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude Used to update the user&#39;s current location
    * @param longitude Used to update the user&#39;s current location
    * @param keyword Search the name and description fields
    * @param role The actors role, possible values are: CUSTOMER, RETAILER, or ANY
    * @param appKey The application making the request
    * @param sortField The field to sort on, possible values are: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, CODE, ROLE
    * @param descending Determines whether the results are in descending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param includeInactive If true include inactive items
    */
  def searchOfferTransactionStatuses(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], keyword: Option[String], role: Option[String], appKey: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], includeInactive: Option[Boolean]): List[OfferTransactionStatusResponse]

  /**
    * Update Offer Status
    * Update an offer status record
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude Used to update the user&#39;s current location
    * @param longitude Used to update the user&#39;s current location
    * @param statusId The id of the record to update 
    * @param name The name of th status
    * @param description The description of the status
    * @param code The status code, must be unique 
    * @param role The actor that uses the status
    * @param active The active status
    * @param applicationIds The applications to associate the status with, if null then for all.
    */
  def updateOfferTransactionStatus(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], statusId: Option[Long], name: Option[String], description: Option[String], code: Option[Int], role: Option[String], active: Option[Boolean], applicationIds: Option[String]): OfferTransactionStatusResponse
}
