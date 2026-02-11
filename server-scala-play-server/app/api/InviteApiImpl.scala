package api

import model.ConsumerInviteResponse
import model.InviteResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[InviteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class InviteApiImpl extends InviteApi {
  /**
    * @inheritdoc
    */
  override def acceptInvite(token: String, accountId: Long, albumId: Option[Long], missionId: Option[Long], albumContestId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], retailerLocationId: Option[Long], appKey: Option[String], autoFriend: Option[Boolean], autoAttendEvent: Option[Boolean], autoFavoriteOffer: Option[Boolean], autoFavoriteOfferLocation: Option[Boolean], autoFavoriteRetailerLocation: Option[Boolean]): ConsumerInviteResponse = {
    // TODO: Implement better logic

    ConsumerInviteResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def albumContestInvite(deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], albumContestId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def albumInvite(deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], albumId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def eventInvite(accountId: Long, appKey: String, listingId: Long, receiverAccountIds: Option[String], retailerLocationId: Option[Long]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def gameInvite(deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], gameLevelId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getInvite(accountId: Option[Long], token: Option[String], albumId: Option[Long], missionId: Option[Long], albumContestId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], retailerLocationId: Option[Long], appKey: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def missionInvite(deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], missionId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def offerInvite(accountId: Long, appKey: String, offerId: Long): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def offerLocationInvite(accountId: Long, appKey: String, offerLocationId: Long): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def retailerLocationInvite(accountId: Long, appKey: String, retailerLocationId: Long, albumId: Option[Long]): InviteResponse = {
    // TODO: Implement better logic

    InviteResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
