package api

import play.api.libs.json._
import model.BigDecimal
import model.FilterResponse
import model.FilterTreeResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait FilterApi {
  /**
    * Create Filter
    * Create a filter
    * @param accountId The account id of the user (must have permissions to the target application)
    * @param name The name of the filter
    * @param appKey The appKey of the application to assign the filter to, if not provided then the filter will be applied to the global application (if the account has permissions)
    * @param parentFilterId The ID of the parent filter, if not provided then the parent filter will be null
    * @param description The description of the filter
    * @param externalId A string identifier used by client applications to store external information
    * @param externalType A string type used by client applications to store external information
    * @param active Sets whether the filter is active or inactive (hidden from consumers)
    * @param metaData external custom client defined data
    */
  def createFilter(version: BigDecimal, accountId: Long, name: String, appKey: Option[String], parentFilterId: Option[Long], description: Option[String], externalId: Option[String], externalType: Option[String], active: Option[Boolean], metaData: Option[String]): FilterTreeResponse

  /**
    * Delete Filter
    * Delete a filter.
    * @param accountId The account id of the user (must have permissions to the filter&#39;s assigned application)
    * @param filterId The ID of the filter to delete
    */
  def deleteFilter(version: BigDecimal, accountId: Long, filterId: Long): SirqulResponse

  /**
    * Get Filter
    * Get the details of a specific filter. Recursively include all child filters and their children.
    * @param filterId the id of the filter to get
    */
  def getFilter(version: BigDecimal, filterId: Long): FilterTreeResponse

  /**
    * Search Filters
    * Search for filters.
    * @param accountId The account id of the user
    * @param keyword The string to search on
    * @param appKey the appKey of the application to retrieve filters for
    * @param responseGroup The group of filters to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    * @param rootOnly Restrict the search to only those filters with no parent filter assigned.
    * @param sortField The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param activeOnly Determines whether to return only active categories
    */
  def searchFilters(version: BigDecimal, accountId: Option[Long], keyword: Option[String], appKey: Option[String], responseGroup: Option[String], rootOnly: Option[Boolean], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[FilterResponse]

  /**
    * Update Filter
    * Update a filter.
    * @param accountId The account id of the user
    * @param filterId The ID of the filter to edit
    * @param parentFilterId The ID of the parent filter, if not provided then the parent filter will be null
    * @param name The name of the filter
    * @param description The description of the filter
    * @param externalId A string identifier used by client applications to store external information
    * @param externalType A string type used by client applications to store external information
    * @param active Sets whether the filter is active or inactive (hidden from consumers)
    * @param metaData external custom client defined data
    */
  def updateFilter(version: BigDecimal, accountId: Long, filterId: Long, parentFilterId: Option[Long], name: Option[String], description: Option[String], externalId: Option[String], externalType: Option[String], active: Option[Boolean], metaData: Option[String]): FilterTreeResponse
}
