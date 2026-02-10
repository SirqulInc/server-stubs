package api

import model.BigDecimal
import model.ListCountResponse
import model.OfferListResponse
import model.OfferResponse
import model.OfferShortResponse
import model.OfferTransactionResponse
import model.RetailerOfferResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[OfferApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class OfferApiImpl extends OfferApi {
  /**
    * @inheritdoc
    */
  override def batchUpdateOfferLocations(version: BigDecimal, data: String, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createOffer(version: BigDecimal, includeOfferLocations: Boolean, title: String, barcodeType: String, noExpiration: Boolean, availableLimit: Int, availableLimitPerUser: Int, addedLimit: Int, viewLimit: Int, maxPrints: Int, ticketPrice: Long, fullPrice: Double, discountPrice: Double, offerType: String, specialOfferType: String, offerVisibility: String, active: Boolean, deviceId: Option[String], accountId: Option[Long], tags: Option[String], parentOfferId: Option[Long], retailerLocationIds: Option[String], offerLocations: Option[String], subTitle: Option[String], details: Option[String], subDetails: Option[String], finePrint: Option[String], barcodeEntry: Option[String], externalRedeemOptions: Option[String], externalUrl: Option[String], externalId: Option[String], ticketsRewardType: Option[String], ticketsReward: Option[Long], activated: Option[Long], expires: Option[Long], ticketPriceType: Option[String], showRemaining: Option[Boolean], showRedeemed: Option[Boolean], replaced: Option[Boolean], featured: Option[Boolean], categoryIds: Option[String], filterIds: Option[String], barcodeAssetId: Option[Long], imageAssetId: Option[Long], imageAssetId1: Option[Long], imageAssetId2: Option[Long], imageAssetId3: Option[Long], imageAssetId4: Option[Long], imageAssetId5: Option[Long], publisher: Option[String], redeemableStart: Option[Long], redeemableEnd: Option[Long], brand: Option[String], productType: Option[String], conditionType: Option[String], isbn: Option[String], asin: Option[String], catalogNumbers: Option[String], department: Option[String], features: Option[String], minimumPrice: Option[Double], width: Option[Double], height: Option[Double], depth: Option[Double], weight: Option[Double], unit: Option[String], studio: Option[String], parentalRating: Option[String], publishDate: Option[Long], availabilityDate: Option[Long], sizeId: Option[Long], listingId: Option[Long], mediaType: Option[String], duration: Option[Int], author: Option[String], releaseDate: Option[Long], collectionIds: Option[String], rebootTimeHour: Option[Int], rebootTimeMinute: Option[Int], idleTimeoutInSecond: Option[Int], serialNumber: Option[String], udid: Option[String], deviceType: Option[String], devicePower: Option[Double], deviceInterference: Option[Double], availability: Option[String], availabilitySummary: Option[String]): RetailerOfferResponse = {
    // TODO: Implement better logic

    RetailerOfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteOffer(version: BigDecimal, offerId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteOfferLocation(version: BigDecimal, offerLocationId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getOffer(version: BigDecimal, offerId: Long, includeOfferLocations: Boolean, deviceId: Option[String], accountId: Option[Long]): RetailerOfferResponse = {
    // TODO: Implement better logic

    RetailerOfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getOfferDetails(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], distance: Option[Double], latitude: Option[Double], longitude: Option[Double], includeOfferLocations: Option[Boolean], includeRetailerLocations: Option[Boolean], includeChildOffers: Option[Boolean]): OfferResponse = {
    // TODO: Implement better logic

    OfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getOfferListCounts(version: BigDecimal, latitude: Double, longitude: Double, searchRange: Option[BigDecimal], distanceUnit: Option[String]): ListCountResponse = {
    // TODO: Implement better logic

    ListCountResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getOfferLocation(version: BigDecimal, offerLocationId: Option[Long], udid: Option[String]): OfferShortResponse = {
    // TODO: Implement better logic

    OfferShortResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getOfferLocationsForRetailers(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, includeRetailerLocation: Boolean, deviceId: Option[String], accountId: Option[Long], keyword: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], offerType: Option[String], specialOfferType: Option[String], barcodeType: Option[String], barcodeEntry: Option[String], isbn: Option[String], asin: Option[String], deviceStatus: Option[String], needsNotificationSent: Option[Boolean], lastNotificationSent: Option[Long]): List[OfferShortResponse] = {
    // TODO: Implement better logic

    List.empty[OfferShortResponse]
  }

  /**
    * @inheritdoc
    */
  override def getOffersForRetailers(version: BigDecimal, offerVisibility: String, sortField: String, descending: Boolean, start: Int, limit: Int, availableOnly: Boolean, activeOnly: Boolean, includeCategories: Boolean, includeFilters: Boolean, includeOfferLocations: Boolean, deviceId: Option[String], accountId: Option[Long], categoryIds: Option[String], filterIds: Option[String], q: Option[String], keyword: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], couponType: Option[String], offerType: Option[String], offerTypes: Option[String], specialOfferType: Option[String], i: Option[Int], l: Option[Int], barcodeType: Option[String], barcodeEntry: Option[String], isbn: Option[String], asin: Option[String], deviceStatus: Option[String], needsNotificationSent: Option[Boolean], lastNotificationSent: Option[Long]): List[OfferResponse] = {
    // TODO: Implement better logic

    List.empty[OfferResponse]
  }

  /**
    * @inheritdoc
    */
  override def redeemOfferTransaction(version: BigDecimal, offerTransactionId: Long, status: Int, deviceId: Option[String], accountId: Option[Long], offerLocationId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchOfferTransactionsForRetailers(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], redeemed: Option[Boolean], reservationsOnly: Option[Boolean], couponType: Option[String], offerType: Option[String], specialOfferType: Option[String], customerAccountIds: Option[String], categoryIds: Option[String], redeemableStartDate: Option[Long], redeemableEndDate: Option[Long], i: Option[Int], l: Option[Int]): List[OfferTransactionResponse] = {
    // TODO: Implement better logic

    List.empty[OfferTransactionResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchOffersForConsumer(version: BigDecimal, latitude: Double, longitude: Double, recommendationType: String, locationId: Long, start: Int, limit: Int, maxRecommendations: Int, distanceUnit: String, appKey: Option[String], deviceId: Option[String], accountId: Option[Long], searchRange: Option[Double], tags: Option[String], supportedPostalCodes: Option[String], keyword: Option[String], categories: Option[String], filters: Option[String], offerTypes: Option[String], `type`: Option[String], sortField: Option[String], recommendOfferIds: Option[String], retailerLocationIds: Option[String], offerId: Option[Long], includeMission: Option[Boolean], includeCategories: Option[Boolean], includeFilters: Option[Boolean], includeExpired: Option[Boolean], includeFavorite: Option[Boolean], closestOfferOnly: Option[Boolean], searchExpression: Option[String], groupBy: Option[String]): OfferListResponse = {
    // TODO: Implement better logic

    OfferListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def topOfferTransactions(version: BigDecimal, start: Option[Int], limit: Option[Int]): OfferListResponse = {
    // TODO: Implement better logic

    OfferListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateOffer(version: BigDecimal, offerId: Long, includeOfferLocations: Boolean, deviceId: Option[String], accountId: Option[Long], parentOfferId: Option[Long], retailerLocationIds: Option[String], offerLocations: Option[String], tags: Option[String], title: Option[String], subTitle: Option[String], details: Option[String], subDetails: Option[String], finePrint: Option[String], barcodeType: Option[String], barcodeEntry: Option[String], externalRedeemOptions: Option[String], externalUrl: Option[String], externalId: Option[String], ticketsRewardType: Option[String], ticketsReward: Option[Long], activated: Option[Long], expires: Option[Long], noExpiration: Option[Boolean], availableLimit: Option[Int], availableLimitPerUser: Option[Int], addedLimit: Option[Int], viewLimit: Option[Int], maxPrints: Option[Int], ticketPriceType: Option[String], ticketPrice: Option[Long], fullPrice: Option[Double], discountPrice: Option[Double], showRemaining: Option[Boolean], showRedeemed: Option[Boolean], replaced: Option[Boolean], featured: Option[Boolean], offerType: Option[String], specialOfferType: Option[String], offerVisibility: Option[String], categoryIds: Option[String], filterIds: Option[String], active: Option[Boolean], barcodeAssetId: Option[Long], imageAssetId: Option[Long], imageAssetId1: Option[Long], imageAssetId2: Option[Long], imageAssetId3: Option[Long], imageAssetId4: Option[Long], imageAssetId5: Option[Long], publisher: Option[String], redeemableStart: Option[Long], redeemableEnd: Option[Long], brand: Option[String], productType: Option[String], conditionType: Option[String], isbn: Option[String], asin: Option[String], catalogNumbers: Option[String], department: Option[String], features: Option[String], minimumPrice: Option[Double], width: Option[Double], height: Option[Double], depth: Option[Double], weight: Option[Double], unit: Option[String], studio: Option[String], parentalRating: Option[String], publishDate: Option[Long], availabilityDate: Option[Long], sizeId: Option[Long], listingId: Option[Long], mediaType: Option[String], duration: Option[Int], author: Option[String], releaseDate: Option[Long], collectionIds: Option[String], rebootTimeHour: Option[Int], rebootTimeMinute: Option[Int], idleTimeoutInSecond: Option[Int], serialNumber: Option[String], udid: Option[String], deviceType: Option[String], devicePower: Option[Double], deviceInterference: Option[Double], availability: Option[String], availabilitySummary: Option[String]): RetailerOfferResponse = {
    // TODO: Implement better logic

    RetailerOfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateOfferStatus(version: BigDecimal, offerIds: String, active: Boolean, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
