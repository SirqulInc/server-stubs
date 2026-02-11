package api

import play.api.libs.json._
import model.JsObject
import model.ServiceHub

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ServiceHubApi {
  /**
    * Create Service Hub
    * Create new service hub
    */
  def createServiceHub(body: Option[ServiceHub]): ServiceHub

  /**
    * Delete Service Hub
    * Delete an existing service hub
    * @param id the id of the service hub to delete
    */
  def deleteServiceHub(id: Long): Unit

  /**
    * Get Service Hub
    * Get an existing service hub
    * @param id the id of the service hub to get
    */
  def getServiceHub(id: Long): JsObject

  /**
    * Update Service Hub
    * Update an existing service hub
    * @param id the id of the service hub
    */
  def postServiceHub(id: Long, body: Option[ServiceHub]): ServiceHub

  /**
    * Update Service Hub
    * Update an existing service hub
    * @param id the id of the service hub
    */
  def putServiceHub(id: Long, body: Option[ServiceHub]): ServiceHub

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
  def searchServiceHubs(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String], retailerId: Option[Long]): List[ServiceHub]
}
