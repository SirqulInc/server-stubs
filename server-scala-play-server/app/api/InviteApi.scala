package api

import play.api.libs.json._
import model.BigDecimal
import model.ConsumerInviteResponse
import model.InviteResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait InviteApi {
  /**
    * Accept Invite
    * Allows a user to accept an invite. The user could also become the inviter&#39;s friend.
    * @param token the invite token
    * @param accountId the accountId of the user who is accepting the invite
    * @param albumId the album id associated with this invite (if applicable)
    * @param missionId the mission id associated with this invite (if applicable)
    * @param albumContestId the album contest id associated with this invite (if applicable)
    * @param offerId the offer id associated with this invite (if applicable)
    * @param offerLocationId the offer location id associated with this invite (if applicable)
    * @param retailerLocationId the retailer location id associated with this invite (if applicable)
    * @param appKey the application key
    * @param autoFriend whether to auto-friend the invite sender and receiver
    * @param autoAttendEvent whether to mark the event as attending automatically after invite is accepted
    * @param autoFavoriteOffer whether to mark the offer as favorited automatically after invite is accepted
    * @param autoFavoriteOfferLocation whether to mark the offer location as favorited automatically after invite is accepted
    * @param autoFavoriteRetailerLocation whether to mark the retailer location as favorited automatically after invite is accepted
    */
  def acceptInvite(version: BigDecimal, token: String, accountId: Long, albumId: Option[Long], missionId: Option[Long], albumContestId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], retailerLocationId: Option[Long], appKey: Option[String], autoFriend: Option[Boolean], autoAttendEvent: Option[Boolean], autoFavoriteOffer: Option[Boolean], autoFavoriteOfferLocation: Option[Boolean], autoFavoriteRetailerLocation: Option[Boolean]): ConsumerInviteResponse

  /**
    * Invite to Contest
    * Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param appId This parameter is deprecated.
    * @param appKey the application key
    * @param albumContestId the album contest to share
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def albumContestInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], albumContestId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse

  /**
    * Invite to Collection
    * Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param appId This parameter is deprecated.
    * @param appKey the application key
    * @param albumId the album to share
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def albumInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], albumId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse

  /**
    * Invite to Event
    * Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.
    * @param accountId the account ID of the user making the share
    * @param appKey the application key
    * @param listingId The ID of the event listing
    * @param receiverAccountIds the account ID of a Sirqul user they would like to share an event with
    * @param retailerLocationId The retailer location id of where the event will take place
    */
  def eventInvite(version: BigDecimal, accountId: Long, appKey: String, listingId: Long, receiverAccountIds: Option[String], retailerLocationId: Option[Long]): InviteResponse

  /**
    * Invite to Game Level
    * Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param appId This parameter is deprecated.
    * @param appKey the application key
    * @param gameLevelId the game level that the user owns and is giving access to
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def gameInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], gameLevelId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse

  /**
    * Get Invite
    * This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.
    * @param accountId Account ID of the user if they are logged in
    * @param token the invite token
    * @param albumId album id to match the invite against (if applicable)
    * @param missionId mission id to match the invite against (if applicable)
    * @param albumContestId album contest id to match the invite against (if applicable)
    * @param offerId offer id to match the invite against (if applicable)
    * @param offerLocationId offer location id to match the invite against (if applicable)
    * @param retailerLocationId retailer location id to match the invite against (if applicable)
    * @param appKey the application key
    */
  def getInvite(version: BigDecimal, accountId: Option[Long], token: Option[String], albumId: Option[Long], missionId: Option[Long], albumContestId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], retailerLocationId: Option[Long], appKey: Option[String]): SirqulResponse

  /**
    * Invite to Mission
    * Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param appId This parameter is deprecated.
    * @param appKey the application key
    * @param missionId the mission to share
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def missionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appId: Option[Long], appKey: Option[String], missionId: Option[Long], latitude: Option[Double], longitude: Option[Double]): InviteResponse

  /**
    * Invite to Offer
    * Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite&#39;s list.
    * @param accountId the account ID of the user making the share
    * @param appKey the application key
    * @param offerId the ID of the offer used to invite to favorite
    */
  def offerInvite(version: BigDecimal, accountId: Long, appKey: String, offerId: Long): InviteResponse

  /**
    * Invite to Offer Location
    * Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite&#39;s list.
    * @param accountId the account ID of the user making the share
    * @param appKey the application key
    * @param offerLocationId the id of the offer location to share
    */
  def offerLocationInvite(version: BigDecimal, accountId: Long, appKey: String, offerLocationId: Long): InviteResponse

  /**
    * Invite to Retailer Location
    * Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite&#39;s list.
    * @param accountId the account ID of the user making the share
    * @param appKey the application key
    * @param retailerLocationId The retailer location id of where the event will take place
    * @param albumId Optional album id to link with the invite
    */
  def retailerLocationInvite(version: BigDecimal, accountId: Long, appKey: String, retailerLocationId: Long, albumId: Option[Long]): InviteResponse
}
