package api

import model.BigDecimal
import model.MediaOfferResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[MediaApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class MediaApiImpl extends MediaApi {
  /**
    * @inheritdoc
    */
  override def createMedia(version: BigDecimal, accountId: Long, title: String, barcodeType: String, noExpiration: Boolean, availableLimit: Int, availableLimitPerUser: Int, addedLimit: Int, viewLimit: Int, maxPrints: Int, ticketPrice: Long, fullPrice: Double, discountPrice: Double, specialOfferType: String, offerVisibility: String, active: Boolean, retailerLocationIds: Option[String], subTitle: Option[String], details: Option[String], subDetails: Option[String], finePrint: Option[String], barcodeEntry: Option[String], externalRedeemOptions: Option[String], externalUrl: Option[String], ticketsRewardType: Option[String], ticketsReward: Option[Long], activated: Option[Long], expires: Option[Long], ticketPriceType: Option[String], showRemaining: Option[Boolean], showRedeemed: Option[Boolean], replaced: Option[Boolean], featured: Option[Boolean], categoryIds: Option[String], filterIds: Option[String], barcodeAssetId: Option[Long], imageAssetId: Option[Long], imageAssetId1: Option[Long], imageAssetId2: Option[Long], imageAssetId3: Option[Long], imageAssetId4: Option[Long], imageAssetId5: Option[Long], publisher: Option[String], redeemableStart: Option[Long], redeemableEnd: Option[Long], conditionType: Option[String], isbn: Option[String], asin: Option[String], catalogNumbers: Option[String], parentalRating: Option[String], availabilityDate: Option[Long], mediaType: Option[String], duration: Option[Int], author: Option[String], releaseDate: Option[Long], collectionIds: Option[String], availability: Option[String], availabilitySummary: Option[String]): MediaOfferResponse = {
    // TODO: Implement better logic

    MediaOfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteMedia(version: BigDecimal, accountId: Long, mediaId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getMedia(version: BigDecimal, accountId: Long, mediaId: Long): MediaOfferResponse = {
    // TODO: Implement better logic

    MediaOfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchMedia(version: BigDecimal, accountId: Long, activeOnly: Boolean, sortField: String, descending: Boolean, keyword: Option[String], categoryIds: Option[String], filterIds: Option[String], start: Option[Int], limit: Option[Int]): List[MediaOfferResponse] = {
    // TODO: Implement better logic

    List.empty[MediaOfferResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateMedia(version: BigDecimal, accountId: Long, mediaId: Long, retailerLocationIds: Option[String], offerLocations: Option[String], title: Option[String], subTitle: Option[String], details: Option[String], subDetails: Option[String], finePrint: Option[String], barcodeType: Option[String], barcodeEntry: Option[String], externalRedeemOptions: Option[String], externalUrl: Option[String], ticketsRewardType: Option[String], ticketsReward: Option[Long], activated: Option[Long], expires: Option[Long], noExpiration: Option[Boolean], availableLimit: Option[Int], availableLimitPerUser: Option[Int], addedLimit: Option[Int], viewLimit: Option[Int], maxPrints: Option[Int], ticketPriceType: Option[String], ticketPrice: Option[Long], fullPrice: Option[Double], discountPrice: Option[Double], showRemaining: Option[Boolean], showRedeemed: Option[Boolean], replaced: Option[Boolean], featured: Option[Boolean], specialOfferType: Option[String], offerVisibility: Option[String], categoryIds: Option[String], filterIds: Option[String], active: Option[Boolean], barcodeAssetId: Option[Long], imageAssetId: Option[Long], imageAssetId1: Option[Long], imageAssetId2: Option[Long], imageAssetId3: Option[Long], imageAssetId4: Option[Long], imageAssetId5: Option[Long], publisher: Option[String], redeemableStart: Option[Long], redeemableEnd: Option[Long], conditionType: Option[String], isbn: Option[String], asin: Option[String], catalogNumbers: Option[String], availabilityDate: Option[Long], parentalRating: Option[String], mediaType: Option[String], duration: Option[Int], author: Option[String], releaseDate: Option[Long], collectionIds: Option[String], availability: Option[String], availabilitySummary: Option[String]): MediaOfferResponse = {
    // TODO: Implement better logic

    MediaOfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
