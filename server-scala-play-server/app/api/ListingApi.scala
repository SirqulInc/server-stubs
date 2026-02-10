package api

import play.api.libs.json._
import model.BigDecimal
import model.ListingFullResponse
import model.ListingGroupResponse
import model.ListingResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ListingApi {
  /**
    * Create Listing
    * Creates a listing.
    * @param accountId the user&#39;s account ID
    * @param name the name of the listing
    * @param filterIds comma separated list of filter IDs
    * @param description the description of the listing
    * @param start the start date of the listing
    * @param end the end date of the listing
    * @param locationName the name of the location the listing will be held at
    * @param locationDescription the description of the location the listing will be held at
    * @param isPrivate determines whether the listing is public or private
    * @param externalId external identifier used by a third party
    * @param externalId2 secondary external identifier used by a third party
    * @param externalGroupId external group identifier used by a third party
    * @param active Sets the active flag
    * @param metaData external custom client defined data
    */
  def createListing(version: BigDecimal, accountId: Long, name: String, filterIds: Option[String], description: Option[String], start: Option[Long], end: Option[Long], locationName: Option[String], locationDescription: Option[String], isPrivate: Option[Boolean], externalId: Option[String], externalId2: Option[String], externalGroupId: Option[String], active: Option[Boolean], metaData: Option[String]): ListingFullResponse

  /**
    * Delete Listing
    * Delete a listing.
    * @param accountId the id of the logged in user
    * @param listingId the id of the listing to delete
    */
  def deleteListing(version: BigDecimal, accountId: Long, listingId: Long): SirqulResponse

  /**
    * Get Listing
    * Get a listing by id.
    * @param listingId the id of the listing to get
    */
  def getListing(version: BigDecimal, listingId: Long): ListingFullResponse

  /**
    * Search Listings
    * Search for event listings from the start time to end time
    * @param accountId the account id of the user
    * @param keyword search the event name and description for this keyword
    * @param start the record to begin the return set on
    * @param limit the number of records to return
    * @param activeOnly whether to search on active listings only
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    * @param startDate the start date to search from
    * @param endDate the end date to search to
    * @param categoryIds only return items of these categories
    * @param filterIds 
    * @param useListingOrderIds determines whether to use configured listing order ids
    * @param externalId external identifier used by a third party
    * @param externalId2 secondary external identifier used by a third party
    * @param externalGroupId external group identifier used by a third party
    */
  def searchListing(version: BigDecimal, accountId: Option[Long], keyword: Option[String], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], latitude: Option[Double], longitude: Option[Double], startDate: Option[Long], endDate: Option[Long], categoryIds: Option[String], filterIds: Option[String], useListingOrderIds: Option[Boolean], externalId: Option[String], externalId2: Option[String], externalGroupId: Option[String]): List[ListingResponse]

  /**
    * Summary Listing
    * Search for a list of summary listings from the start time up to 8 days out.
    * @param accountId the account id of the user
    * @param startDate the start date to search from
    * @param categoryIds the list of categories to search on
    * @param daysToInclude how far out to search, in days
    * @param useListingOrderIds determines whether to use configured listing order ids
    */
  def summaryListing(version: BigDecimal, accountId: Option[Long], startDate: Option[Long], categoryIds: Option[String], daysToInclude: Option[Int], useListingOrderIds: Option[Boolean]): List[ListingGroupResponse]

  /**
    * Update Listing
    * Updates a listing.
    * @param accountId the user&#39;s account ID
    * @param listingId the listing to update
    * @param filterIds comma separated list of filter IDs
    * @param name the name of the listing
    * @param description the description of the listing
    * @param start the start date of the listing
    * @param end the end date of the listing
    * @param locationName the name of the location the listing will be held at
    * @param locationDescription the description of the location the listing will be held at
    * @param isPrivate determines whether the listing is public or private
    * @param externalId external identifier used by a third party
    * @param externalId2 secondary external identifier used by a third party
    * @param externalGroupId external group identifier used by a third party
    * @param active Sets the active flag
    * @param metaData external custom client defined data
    */
  def updateListing(version: BigDecimal, accountId: Long, listingId: Long, filterIds: Option[String], name: Option[String], description: Option[String], start: Option[Long], end: Option[Long], locationName: Option[String], locationDescription: Option[String], isPrivate: Option[Boolean], externalId: Option[String], externalId2: Option[String], externalGroupId: Option[String], active: Option[Boolean], metaData: Option[String]): ListingFullResponse
}
