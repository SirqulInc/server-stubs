package api

import play.api.libs.json._
import model.AccountResponse
import model.BigDecimal
import model.SearchResponse
import model.SirqulResponse
import model.WrappedResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait FavoriteApi {
  /**
    * Create Favorite
    * Adds an offer, offer location, retailer location, or category to your favorites.
    * @param favoritableId The ID of the object to favorite {offerId, offerLocationId, retailerLocationId, categoryId}
    * @param favoritableType The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY, ALBUM}
    * @param deviceId The unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def addFavorite(version: BigDecimal, favoritableId: Long, favoritableType: String, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): WrappedResponse

  /**
    * Delete Favorite
    * Removes a favorited item from the user&#39;s favorites list.
    * @param deviceId The unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param favoriteId The ID of the favorite reference record (only optional if favoritableId &amp; favoritableType is pass in instead)
    * @param favoritableId The ID of the object to un-favorite {offerId, offerLocationId, retailerLocationId, categoryId} (this is required if favoriteId is NOT passed in)
    * @param favoritableType The type of the object to un-favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY} (this is required if favoriteId is NOT passed in)
    */
  def deleteFavorite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], favoriteId: Option[Long], favoritableId: Option[Long], favoritableType: Option[String]): SirqulResponse

  /**
    * Get Favorite
    * Retrieves a single favorited item.
    * @param favoriteId The ID of the favorite reference record
    * @param deviceId The unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def getFavorite(version: BigDecimal, favoriteId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): WrappedResponse

  /**
    * Search Favorites
    * Searches on the user&#39;s favorites.
    * @param favoritableType The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}
    * @param sortField Determines what to sort the results by {CREATED, UPDATED, DISPLAY}
    * @param descending Determines whether the results are in descending order
    * @param start The start index for pagination
    * @param limit The limit for pagination (there is a hard limit of 1000)
    * @param activeOnly Determines whether to only return active favorites
    * @param returnFullResponse Determines whether to return a detailed version of the response list
    * @param deviceId The unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param connectionAccountId The ID of an account the user would like to view favorites for
    * @param secondaryType 
    * @param keyword The keyword to search for
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def searchFavorites(version: BigDecimal, favoritableType: String, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, returnFullResponse: Boolean, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], secondaryType: Option[String], keyword: Option[String], latitude: Option[Double], longitude: Option[Double]): SearchResponse

  /**
    * Who has Favorited
    * Searches for everyone that has favorited an item
    * @param favoritableId The ID of the favoritableType to search on
    * @param favoritableType The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param deviceId The unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    * @param keyword The keyword to limit that account list
    */
  def whoHasFavorited(version: BigDecimal, favoritableId: Long, favoritableType: String, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], keyword: Option[String]): List[AccountResponse]
}
