package api

import play.api.libs.json._
import model.BigDecimal
import model.JsObject
import model.ServiceHub

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ServiceHubApi {
  /**
    * Create Service Hub
    * Create new service hub
    */
  def createServiceHub(version: BigDecimal, body: Option[ServiceHub]): ServiceHub

  /**
    * Delete Service Hub
    * Delete an existing service hub
    * @param id the id of the service hub to delete
    */
  def deleteServiceHub(version: BigDecimal, id: Long): Unit

  /**
    * Get Service Hub
    * Get an existing service hub
    * @param id the id of the service hub to get
    */
  def getServiceHub(version: BigDecimal, id: Long): JsObject

  /**
    * Update Service Hub
    * Update an existing service hub
    * @param id the id of the service hub
    */
  def postServiceHub(version: BigDecimal, id: Long, body: Option[ServiceHub]): ServiceHub

  /**
    * Update Service Hub
    * Update an existing service hub
    * @param id the id of the service hub
    */
  def putServiceHub(version: BigDecimal, id: Long, body: Option[ServiceHub]): ServiceHub

  /**
    * Search Service Hubs
    * Search for service hubs.
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param keyword The keyword to search for
    * @param retailerId The retailer belongs to
    */
  def searchServiceHubs(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String], retailerId: Option[Long]): List[ServiceHub]
}
