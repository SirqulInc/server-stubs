package api

import model.AccountResponse
import model.BigDecimal
import model.SearchResponse
import model.SirqulResponse
import model.WrappedResponse

/**
  * Provides a default implementation for [[FavoriteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class FavoriteApiImpl extends FavoriteApi {
  /**
    * @inheritdoc
    */
  override def addFavorite(version: BigDecimal, favoritableId: Long, favoritableType: String, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): WrappedResponse = {
    // TODO: Implement better logic

    WrappedResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteFavorite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], favoriteId: Option[Long], favoritableId: Option[Long], favoritableType: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getFavorite(version: BigDecimal, favoriteId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): WrappedResponse = {
    // TODO: Implement better logic

    WrappedResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchFavorites(version: BigDecimal, favoritableType: String, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, returnFullResponse: Boolean, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], secondaryType: Option[String], keyword: Option[String], latitude: Option[Double], longitude: Option[Double]): SearchResponse = {
    // TODO: Implement better logic

    SearchResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def whoHasFavorited(version: BigDecimal, favoritableId: Long, favoritableType: String, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], keyword: Option[String]): List[AccountResponse] = {
    // TODO: Implement better logic

    List.empty[AccountResponse]
  }
}
