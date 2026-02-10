package api

import model.BigDecimal
import model.RetailerLocationResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[RetailerLocationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RetailerLocationApiImpl extends RetailerLocationApi {
  /**
    * @inheritdoc
    */
  override def createRetailerLocationConsumer(version: BigDecimal, appKey: String, name: String, deviceId: Option[String], accountId: Option[Long], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], detailsHeader: Option[String], detailsBody: Option[String], hours: Option[String], tags: Option[String], logoAssetId: Option[Long], picture1AssetId: Option[Long], picture2AssetId: Option[Long], categoryIds: Option[String], filterIds: Option[String], metaData: Option[String], publicLocation: Option[Boolean], active: Option[Boolean], locationType: Option[String], latitude: Option[Double], longitude: Option[Double]): RetailerLocationResponse = {
    // TODO: Implement better logic

    RetailerLocationResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createRetailerLocations(version: BigDecimal, retailerId: Long, name: String, streetAddress: String, city: String, state: String, postalCode: String, deviceId: Option[String], accountId: Option[Long], streetAddress2: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], internalId: Option[String], detailsHeader: Option[String], detailsBody: Option[String], hours: Option[String], logo: Option[TemporaryFile], logoAssetId: Option[Long], picture1: Option[TemporaryFile], picture1AssetId: Option[Long], picture2: Option[TemporaryFile], picture2AssetId: Option[Long], categoryIds: Option[String], filterIds: Option[String], latitude: Option[Double], longitude: Option[Double], building: Option[String], googlePlaceId: Option[String], yelpId: Option[String], active: Option[Boolean], publicLocation: Option[Boolean], locationType: Option[String], audienceIds: Option[String], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], responseFormat: Option[String], responseIncludes: Option[String]): RetailerLocationResponse = {
    // TODO: Implement better logic

    RetailerLocationResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteRetailerLocation(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], retailerLocationId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRetailerLocation(version: BigDecimal, retailerLocationId: Long, deviceId: Option[String], accountId: Option[Long], retailerLocationToken: Option[String]): RetailerLocationResponse = {
    // TODO: Implement better logic

    RetailerLocationResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRetailerLocationConsumer(version: BigDecimal, retailerLocationId: Long, deviceId: Option[String], accountId: Option[Long]): RetailerLocationResponse = {
    // TODO: Implement better logic

    RetailerLocationResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def indexedRetailerLocationDistanceSearch(version: BigDecimal, latitude: Double, longitude: Double, searchRange: Double, start: Int, limit: Int, accountId: Option[Long], address: Option[String], hasOffers: Option[Boolean], categories: Option[String], filters: Option[String], audiences: Option[String], retailerIds: Option[String], retailerLocationIds: Option[String], tags: Option[String], locationType: Option[String], sortField: Option[String], descending: Option[Boolean], q: Option[String], keyword: Option[String], keywordOperator: Option[String], searchExpression: Option[String], distanceUnit: Option[String], returnFavorited: Option[Boolean], returnRetailer: Option[Boolean], returnAssets: Option[Boolean], returnOffers: Option[Boolean], returnCategories: Option[Boolean], returnFilters: Option[Boolean], returnAudiences: Option[Boolean], returnQrCode: Option[Boolean], returnExternalCategoryData: Option[Boolean], includeFavorite: Option[Boolean], includeLiked: Option[Boolean], includeRating: Option[Boolean]): List[RetailerLocationResponse] = {
    // TODO: Implement better logic

    List.empty[RetailerLocationResponse]
  }

  /**
    * @inheritdoc
    */
  override def indexedRetailerLocationSearch(version: BigDecimal, accountId: Option[Long], start: Option[Int], limit: Option[Int], hasOffers: Option[Boolean], categories: Option[String], filters: Option[String], audiences: Option[String], retailerIds: Option[String], retailerLocationIds: Option[String], tags: Option[String], locationType: Option[String], sortField: Option[String], descending: Option[Boolean], q: Option[String], keyword: Option[String], keywordOperator: Option[String], searchExpression: Option[String], returnRetailer: Option[Boolean], returnAssets: Option[Boolean], returnOffers: Option[Boolean], returnCategories: Option[Boolean], returnFilters: Option[Boolean], returnAudiences: Option[Boolean], returnQrCode: Option[Boolean], returnExternalCategoryData: Option[Boolean], includeFavorite: Option[Boolean], includeLiked: Option[Boolean], includeRating: Option[Boolean]): List[RetailerLocationResponse] = {
    // TODO: Implement better logic

    List.empty[RetailerLocationResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchRetailerLocations(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], retailerIds: Option[String], retailerLocationIds: Option[String], locationType: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], showPublicLocations: Option[Boolean], activeOnly: Option[Boolean], returnRetailer: Option[Boolean], returnAssets: Option[Boolean], returnOffers: Option[Boolean], returnCategories: Option[Boolean], returnFilters: Option[Boolean], returnAudiences: Option[Boolean], returnQrCode: Option[Boolean], includeFavorite: Option[Boolean], includeLiked: Option[Boolean], includeRating: Option[Boolean]): List[RetailerLocationResponse] = {
    // TODO: Implement better logic

    List.empty[RetailerLocationResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateRetailerLocations(version: BigDecimal, retailerLocationId: Long, deviceId: Option[String], accountId: Option[Long], name: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], internalId: Option[String], detailsHeader: Option[String], detailsBody: Option[String], hours: Option[String], logo: Option[TemporaryFile], logoAssetId: Option[Long], picture1: Option[TemporaryFile], picture1AssetId: Option[Long], picture2: Option[TemporaryFile], picture2AssetId: Option[Long], categoryIds: Option[String], filterIds: Option[String], latitude: Option[Double], longitude: Option[Double], building: Option[String], googlePlaceId: Option[String], yelpId: Option[String], metaData: Option[String], paymentProvider: Option[String], active: Option[Boolean], publicLocation: Option[Boolean], locationType: Option[String], audienceIds: Option[String], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], responseFormat: Option[String], tags: Option[String]): RetailerLocationResponse = {
    // TODO: Implement better logic

    RetailerLocationResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
