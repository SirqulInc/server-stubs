package api

import play.api.libs.json._
import model.BigDecimal
import model.JsObject
import model.RouteSettings

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RouteSettingApi {
  /**
    * Create Route Setting
    * Create a new route setting
    */
  def createRouteSettings(version: BigDecimal, body: Option[RouteSettings]): RouteSettings

  /**
    * Delete Route Setting
    * Delete an existing route setting
    * @param routeSettingsId the id of the route setting to delete
    */
  def deleteRouteSettings(version: BigDecimal, routeSettingsId: Long): JsObject

  /**
    * Get Route Setting
    * Get an existing route settings
    * @param routeSettingsId the id of the route settings to get
    */
  def getRouteSettings(version: BigDecimal, routeSettingsId: Long): RouteSettings

  /**
    * Search Route Settings
    * Search for route settings
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param hubId The service hub that the route belongs under
    * @param programId The program that the route belongs under
    * @param keyword The keyword to search for the route
    */
  def searchRouteSettings(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, hubId: Option[Long], programId: Option[Long], keyword: Option[String]): List[RouteSettings]

  /**
    * Update Route Setting
    * Update an existing route setting
    * @param routeSettingsId the id of the route settings to update
    */
  def updateRouteSettings(version: BigDecimal, routeSettingsId: Long, body: Option[RouteSettings]): RouteSettings
}
