package api

import model.BigDecimal
import model.ConsumerInviteResponse
import model.InviteResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[InviteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class InviteApiImpl extends InviteApi {
  /**
    * @inheritdoc
    */
  override def acceptInvite(version: BigDecimal, token: String, accountId: Long, albumId: Option[Long], missionId: Option[Long], albumContestId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], retailerLocationId: Option[Long], appKey: Option[String], autoFriend: Option[Boolean], autoAttendEvent: Option[Boolean], autoFavoriteOffer: Option[Boolean], autoFavoriteOfferLocation: Option[Boolean], autoFavoriteRetailerLocation: Option[Boolean]): ConsumerInviteResponse = {
    // TODO: Implement better logic

    ConsumerInviteResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def albumContestInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], albumContestId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def albumInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], albumId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def eventInvite(version: BigDecimal, accountId: Long, appKey: String, listingId: Long, receiverAccountIds: Option[String], retailerLocationId: Option[Long]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def gameInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], gameLevelId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getInvite(version: BigDecimal, accountId: Option[Long], token: Option[String], albumId: Option[Long], missionId: Option[Long], albumContestId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], retailerLocationId: Option[Long], appKey: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def missionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], missionId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def offerInvite(version: BigDecimal, accountId: Long, appKey: String, offerId: Long): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def offerLocationInvite(version: BigDecimal, accountId: Long, appKey: String, offerLocationId: Long): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def retailerLocationInvite(version: BigDecimal, accountId: Long, appKey: String, retailerLocationId: Long, albumId: Option[Long]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
