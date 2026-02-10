package api

import model.BigDecimal
import model.CountResponse
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.TicketListResponse
import model.TicketOfferResponse

/**
  * Provides a default implementation for [[TicketApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TicketApiImpl extends TicketApi {
  /**
    * @inheritdoc
    */
  override def getTicketCount(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], ticketType: Option[String]): CountResponse = {
    // TODO: Implement better logic

    CountResponse(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTicketList(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], ticketObjectType: Option[String], actionType: Option[String], ticketIds: Option[String], objectIds: Option[String], receiptTokens: Option[String], gameType: Option[String], appKey: Option[String]): TicketListResponse = {
    // TODO: Implement better logic

    TicketListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def giftPurchase(version: BigDecimal, receiverAccountId: Long, ticketId: Long, deviceId: Option[String], accountId: Option[Long], assetId: Option[Long], customMessage: Option[String], gameType: Option[String], appKey: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def saveTicket(version: BigDecimal, actionType: String, ticketObjectType: String, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], objectId: Option[Long], purchaseCode: Option[String], receiptToken: Option[String], receiptData: Option[String], count: Option[Long], ticketType: Option[String], purchaseProvider: Option[String], purchaseType: Option[String], returnProfileResponse: Option[Boolean], includeProfileResponse: Option[Boolean], appVersion: Option[String]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def saveTicketViaFileUpload(version: BigDecimal, actionType: String, ticketObjectType: String, receiptData: TemporaryFile, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], objectId: Option[Long], purchaseCode: Option[String], receiptToken: Option[String], count: Option[Long], ticketType: Option[String], purchaseProvider: Option[String], purchaseType: Option[String], returnProfileResponse: Option[Boolean], includeProfileResponse: Option[Boolean], appVersion: Option[String]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def ticketOffers(version: BigDecimal): TicketOfferResponse = {
    // TODO: Implement better logic

    TicketOfferResponse(None, None, None, None, None)
  }
}
