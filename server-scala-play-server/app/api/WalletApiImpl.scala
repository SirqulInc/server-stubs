package api

import model.BigDecimal
import model.OfferTransactionResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[WalletApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class WalletApiImpl extends WalletApi {
  /**
    * @inheritdoc
    */
  override def createOfferTransaction(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], offerCart: Option[String], promoCode: Option[String], currencyType: Option[String], usePoints: Option[Boolean], metaData: Option[String], appKey: Option[String], status: Option[Int]): List[OfferTransactionResponse] = {
    // TODO: Implement better logic

    List.empty[OfferTransactionResponse]
  }

  /**
    * @inheritdoc
    */
  override def deleteOfferTransaction(version: BigDecimal, transactionId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getOfferTransaction(version: BigDecimal, transactionId: Long, deviceId: Option[String], accountId: Option[Long], includeMission: Option[Boolean], latitude: Option[Double], longitude: Option[Double], returnFullResponse: Option[Boolean]): OfferTransactionResponse = {
    // TODO: Implement better logic

    OfferTransactionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def previewOfferTransaction(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], offerCart: Option[String], promoCode: Option[String], currencyType: Option[String], usePoints: Option[Boolean], metaData: Option[String], appKey: Option[String]): List[OfferTransactionResponse] = {
    // TODO: Implement better logic

    List.empty[OfferTransactionResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchOfferTransactions(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], keyword: Option[String], retailerId: Option[Long], retailerIds: Option[String], retailerLocationId: Option[Long], retailerLocationIds: Option[String], excludeRetailerLocationIds: Option[String], offerId: Option[Long], offerIds: Option[String], offerLocationId: Option[Long], offerLocationIds: Option[String], offerType: Option[String], offerTypes: Option[String], specialOfferType: Option[String], specialOfferTypes: Option[String], categoryIds: Option[String], filterIds: Option[String], offerAudienceIds: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], latitude: Option[Double], longitude: Option[Double], redeemableStartDate: Option[Long], redeemableEndDate: Option[Long], filterByParentOffer: Option[Boolean], startedSince: Option[Long], startedBefore: Option[Long], endedSince: Option[Long], endedBefore: Option[Long], redeemed: Option[Boolean], statuses: Option[String], reservationsOnly: Option[Boolean], activeOnly: Option[Boolean], returnFullResponse: Option[Boolean], recurringStartedSince: Option[Long], recurringStartedBefore: Option[Long], recurringExpirationSince: Option[Long], recurringExpirationBefore: Option[Long]): List[OfferTransactionResponse] = {
    // TODO: Implement better logic

    List.empty[OfferTransactionResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateOfferTransaction(version: BigDecimal, transactionId: Long, status: Int, deviceId: Option[String], accountId: Option[Long], offerLocationId: Option[Long], currencyType: Option[String], usePoints: Option[Boolean], appKey: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], returnFullResponse: Option[Boolean], exceptionMembershipOfferIds: Option[String]): OfferTransactionResponse = {
    // TODO: Implement better logic

    OfferTransactionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
