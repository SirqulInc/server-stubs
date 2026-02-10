package api

import play.api.libs.json._
import model.BigDecimal
import model.RatingIndexResponse
import model.RatingResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RatingApi {
  /**
    * Create Rating
    * This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object.
    * @param ratableType The ratable object type {RETAILER_LOCATION}
    * @param ratableId The id of the ratable object
    * @param ratingValue The integer value of 0-100
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param categoryId 
    * @param display A subject title for the user rating (limited to 255 characters)
    * @param description The description of the rating
    * @param locationDescription The description of the location
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    */
  def createRating(version: BigDecimal, ratableType: String, ratableId: Long, ratingValue: Int, deviceId: Option[String], accountId: Option[Long], categoryId: Option[Long], display: Option[String], description: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double]): RatingResponse

  /**
    * Delete Rating
    * Sets a rating as deleted.
    * @param ratingId The ID of the rating to delete
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    */
  def deleteRating(version: BigDecimal, ratingId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Search Location Rating Indexes
    * Search for retailer locations by averages near you.
    * @param categoryIds Comma separated list of category ids to filter the results by
    * @param keyword The keyword used to search
    * @param locationType The type of location to filter the results by
    * @param sortField The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param searchRange The search radius in kilometers to filter results
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    * @param returnOverallRating Determines whether to return the overall rating record instead
    * @param distanceUnit 
    * @param returnRetailer whether to return the retailer or not
    * @param returnAssets whether to return the assets or not
    * @param returnOffers whether to return the offers or not
    * @param returnCategories whether to return the categories or not
    * @param returnFilters whether to return the filters or not
    */
  def searchLocationRatingIndexes(version: BigDecimal, categoryIds: Option[String], keyword: Option[String], locationType: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], searchRange: Option[Double], latitude: Option[Double], longitude: Option[Double], returnOverallRating: Option[Boolean], distanceUnit: Option[String], returnRetailer: Option[Boolean], returnAssets: Option[Boolean], returnOffers: Option[Boolean], returnCategories: Option[Boolean], returnFilters: Option[Boolean]): List[RatingIndexResponse]

  /**
    * Search Rating Indexes
    * Search for ratable items by averages.
    * @param ratableType Filter results by a ratable type {RETAILER_LOCATION}
    * @param ratableIds Comma separated list of ratable ids to filter the resuts by
    * @param categoryIds Comma separated list of category ids to filter the results by
    * @param secondaryType 
    * @param keyword The keyword used to search
    * @param sortField The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param latitude 
    * @param longitude 
    * @param returnRatable Determines whether to return the ratable object in the response
    * @param returnOverallRating Determines whether to return the overall rating record instead
    */
  def searchRatingIndexes(version: BigDecimal, ratableType: String, ratableIds: Option[String], categoryIds: Option[String], secondaryType: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], latitude: Option[Double], longitude: Option[Double], returnRatable: Option[Boolean], returnOverallRating: Option[Boolean]): List[RatingIndexResponse]

  /**
    * Search Ratings
    * Search for ratings on a ratable object.
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param filterAccountId Filter results for a particular account
    * @param ratableType The ratable object type {RETAILER_LOCATION}
    * @param ratableId The id of the ratable object
    * @param categoryIds Comma separated list of category ids to filter the results by
    * @param keyword The keyword used to search
    * @param sortField The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE}
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    */
  def searchRatings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], filterAccountId: Option[Long], ratableType: Option[String], ratableId: Option[Long], categoryIds: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[RatingResponse]

  /**
    * Update Rating
    * Update an existing rating. Only the creator of the rating have permission to update.
    * @param ratingId The id of the rating (Note: this is not the ratable object id)
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param ratingValue The rating value to update
    * @param categoryId 
    * @param display A subject title for the user rating (limited to 255 characters)
    * @param description The description of the rating
    * @param locationDescription The description of the location
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    */
  def updateRating(version: BigDecimal, ratingId: Long, deviceId: Option[String], accountId: Option[Long], ratingValue: Option[Int], categoryId: Option[Long], display: Option[String], description: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double]): RatingResponse
}
