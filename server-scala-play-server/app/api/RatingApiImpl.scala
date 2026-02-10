package api

import model.BigDecimal
import model.RatingIndexResponse
import model.RatingResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[RatingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RatingApiImpl extends RatingApi {
  /**
    * @inheritdoc
    */
  override def createRating(version: BigDecimal, ratableType: String, ratableId: Long, ratingValue: Int, deviceId: Option[String], accountId: Option[Long], categoryId: Option[Long], display: Option[String], description: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double]): RatingResponse = {
    // TODO: Implement better logic

    RatingResponse(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteRating(version: BigDecimal, ratingId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchLocationRatingIndexes(version: BigDecimal, categoryIds: Option[String], keyword: Option[String], locationType: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], searchRange: Option[Double], latitude: Option[Double], longitude: Option[Double], returnOverallRating: Option[Boolean], distanceUnit: Option[String], returnRetailer: Option[Boolean], returnAssets: Option[Boolean], returnOffers: Option[Boolean], returnCategories: Option[Boolean], returnFilters: Option[Boolean]): List[RatingIndexResponse] = {
    // TODO: Implement better logic

    List.empty[RatingIndexResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchRatingIndexes(version: BigDecimal, ratableType: String, ratableIds: Option[String], categoryIds: Option[String], secondaryType: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], latitude: Option[Double], longitude: Option[Double], returnRatable: Option[Boolean], returnOverallRating: Option[Boolean]): List[RatingIndexResponse] = {
    // TODO: Implement better logic

    List.empty[RatingIndexResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchRatings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], filterAccountId: Option[Long], ratableType: Option[String], ratableId: Option[Long], categoryIds: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[RatingResponse] = {
    // TODO: Implement better logic

    List.empty[RatingResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateRating(version: BigDecimal, ratingId: Long, deviceId: Option[String], accountId: Option[Long], ratingValue: Option[Int], categoryId: Option[Long], display: Option[String], description: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double]): RatingResponse = {
    // TODO: Implement better logic

    RatingResponse(None, None, None, None, None, None, None)
  }
}
