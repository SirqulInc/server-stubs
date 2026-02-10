package api

import play.api.libs.json._
import model.BigDecimal

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait VatomApi {
  /**
    * Create following
    * Create following.
    * @param accountId Sirqul Account Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def createFollowing(version: BigDecimal, accountId: Long, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Create Vatom Space
    * Create a Vatom space.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def createSpace(version: BigDecimal, accountId: Long, appKey: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Create Vatom Event
    * Create a Vatom event.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def createVatomEvent(version: BigDecimal, accountId: Long, appKey: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Delete following
    * Delete following.
    * @param accountId Sirqul Account Id
    * @param vatomRelsKey Vatom Rels Key
    * @param returnRawResponse Return raw response
    */
  def deleteFollowing(version: BigDecimal, accountId: Long, vatomRelsKey: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Reset All Points Balance
    * Reset All Points Balance.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomCampaignId Vatom Campaign Id
    * @param returnRawResponse Return raw response
    */
  def deletePointsBalance(version: BigDecimal, accountId: Long, appKey: String, vatomCampaignId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Delete Vatom Space
    * Delete a Vatom space.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomSpaceId Vatom Space Id
    * @param returnRawResponse Return raw response
    */
  def deleteSpace(version: BigDecimal, accountId: Long, appKey: String, vatomSpaceId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Delete Vatom Event
    * Delete a Vatom event.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomEventId Vatom Event Id
    * @param returnRawResponse Return raw response
    */
  def deleteVatomEvent(version: BigDecimal, accountId: Long, appKey: String, vatomEventId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Delete Vatom NFT
    * Delete Vatom NFT
    * @param accountId Sirqul Account Id
    * @param vatomId Vatom NFT Id
    * @param returnRawResponse Return raw response
    */
  def deleteVatomNFT(version: BigDecimal, accountId: Long, vatomId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Execute Action on NFT
    * Execute Action on NFT.
    * @param accountId Sirqul Account Id
    * @param vatomId Vatom NFT Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def executeActionOnNFT(version: BigDecimal, accountId: Long, vatomId: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Search Vatom Geo Map
    * Search Vatom Geo Map
    * @param accountId Sirqul Account Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def geomapSearch(version: BigDecimal, accountId: Long, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom Business Behaviors
    * Gets the behaviors of a business.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param returnRawResponse Return raw response
    */
  def getBusinessBehaviors(version: BigDecimal, accountId: Long, appKey: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get the coins for a Business
    * Get the coins for a Businesss.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param returnRawResponse Return raw response
    */
  def getBusinessCoinsBalance(version: BigDecimal, accountId: Long, appKey: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get the user business ids
    * Get the business ids the logged in user has access to.
    * @param accountId Sirqul Account Id
    * @param returnRawResponse Return raw response
    */
  def getBusinessIds(version: BigDecimal, accountId: Long, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom Business Info
    * Gets the business info tied to this account.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def getBusinessInfo(version: BigDecimal, accountId: Long, appKey: String, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom Business Users
    * Gets the users of a business.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param returnRawResponse Return raw response
    */
  def getBusinessUsers(version: BigDecimal, accountId: Long, appKey: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Campaign Group Entities
    * Get campaign group entities.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomCampaignId Vatom Campaign Id
    * @param returnRawResponse Return raw response
    */
  def getCampaignGroupEntities(version: BigDecimal, accountId: Long, appKey: String, vatomCampaignId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Campaign Group Rules
    * Get campaign group rules.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomCampaignId Vatom Campaign Id
    * @param returnRawResponse Return raw response
    */
  def getCampaignGroupRules(version: BigDecimal, accountId: Long, appKey: String, vatomCampaignId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Campaign Group Stats
    * Get campaign group stats.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomCampaignId Vatom Campaign Id
    * @param returnRawResponse Return raw response
    */
  def getCampaignGroupStats(version: BigDecimal, accountId: Long, appKey: String, vatomCampaignId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Campaign Info
    * Gets the info on a campaign.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomCampaignId Vatom Campaign Id
    * @param returnRawResponse Return raw response
    */
  def getCampaignInfo(version: BigDecimal, accountId: Long, appKey: String, vatomCampaignId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom Event Guest List
    * Gets the guest list of an event.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomEventId Vatom Event Id
    * @param returnRawResponse Return raw response
    */
  def getEventGuestList(version: BigDecimal, accountId: Long, appKey: String, vatomEventId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom User&#39;s Inventory
    * Gets the logged in user&#39;s Vatom Inventory.
    * @param accountId Sirqul Account Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def getInventory(version: BigDecimal, accountId: Long, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get following
    * Get following.
    * @param accountId Sirqul Account Id
    * @param returnRawResponse Return raw response
    */
  def getMyFollowing(version: BigDecimal, accountId: Long, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Points Balance
    * Gets the points balance of a Vatom user.
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param vatomCampaignId Vatom Campaign Id
    * @param returnRawResponse Return raw response
    */
  def getPointsBalance(version: BigDecimal, accountId: Long, vatomUserId: String, vatomCampaignId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Points Balance as Business
    * Gets the points balance of a Vatom user.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomUserId Vatom User Id
    * @param vatomCampaignId Vatom Campaign Id
    * @param returnRawResponse Return raw response
    */
  def getPointsBalanceAsBusiness(version: BigDecimal, accountId: Long, appKey: String, vatomUserId: String, vatomCampaignId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom Space
    * Gets the details of a space.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomSpaceId Vatom Space Id
    * @param returnRawResponse Return raw response
    */
  def getSpace(version: BigDecimal, accountId: Long, appKey: String, vatomSpaceId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get the coins for a user (as a Business)
    * Get the coins for a user (as a Business).
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param appKey Sirqul Application Key
    * @param returnRawResponse Return raw response
    */
  def getUserCoinsAsBusiness(version: BigDecimal, accountId: Long, vatomUserId: String, appKey: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Gets the coins balance for a Vatom User
    * Gets the coins balance for a Vatom User.
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def getUserCoinsBalance(version: BigDecimal, accountId: Long, vatomUserId: String, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * Get user followers
    * Get user followers.
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param returnRawResponse Return raw response
    */
  def getUserFollowers(version: BigDecimal, accountId: Long, vatomUserId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get user following
    * Get user following.
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param returnRawResponse Return raw response
    */
  def getUserFollowing(version: BigDecimal, accountId: Long, vatomUserId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get User Info
    * Get a User&#39;s Info.
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param returnRawResponse Return raw response
    */
  def getUserInfo(version: BigDecimal, accountId: Long, vatomUserId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom User Profile
    * Gets the logged in user&#39;s profile in Vatom.
    * @param accountId Sirqul Account Id
    * @param returnRawResponse Return raw response
    */
  def getUserProfile(version: BigDecimal, accountId: Long, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom Event
    * Gets the details of a event.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomEventId Vatom Event Id
    * @param returnRawResponse Return raw response
    */
  def getVatomEvent(version: BigDecimal, accountId: Long, appKey: String, vatomEventId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Get Vatom NFT Details
    * Get Vatom NFT Details
    * @param accountId Sirqul Account Id
    * @param vatomId Vatom NFT Id
    * @param returnRawResponse Return raw response
    */
  def getVatomNFT(version: BigDecimal, accountId: Long, vatomId: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * List Vatom Communities
    * Gets the communities tied to a business.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def listCommunities(version: BigDecimal, accountId: Long, appKey: String, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * List Vatom Events
    * Gets the events tied to a business.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def listEvents(version: BigDecimal, accountId: Long, appKey: String, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * List Vatom Spaces
    * Gets the spaces tied to a business.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def listSpaces(version: BigDecimal, accountId: Long, appKey: String, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * List Coin Transactions for a Vatom User
    * Gets the logged in user&#39;s Vatom coin transactions.
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def listUserCoinTransactions(version: BigDecimal, accountId: Long, vatomUserId: String, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * List coin transactions for a user (as a Business)
    * List coin transactions for a user (as a Business).
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def listUserCoinTransactionsAsBusiness(version: BigDecimal, accountId: Long, vatomUserId: String, appKey: String, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * Perform Action on NFT
    * Perform Action on NFT.
    * @param accountId Sirqul Account Id
    * @param vatomId Vatom NFT Id
    * @param vatomAction Vatom Action
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def performActionOnNFT(version: BigDecimal, accountId: Long, vatomId: String, vatomAction: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Redeem NFT
    * Redeem an NFT.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def redeemNFT(version: BigDecimal, accountId: Long, appKey: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Redeem the coins for a user (as a Business)
    * Redeem the coins for a user (as a Business).
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def redeemUserCoinsAsBusiness(version: BigDecimal, accountId: Long, vatomUserId: String, appKey: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Search for Vatom Businesses
    * Searches for Vatom businesses.
    * @param accountId Sirqul Account Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def searchBusinesses(version: BigDecimal, accountId: Long, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * Search Campaign Groups
    * Search campaign groups.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param returnRawResponse Return raw response
    */
  def searchCampaignGroups(version: BigDecimal, accountId: Long, appKey: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Search User Identities
    * Search User Identities.
    * @param accountId Sirqul Account Id
    * @param returnRawResponse Return raw response
    */
  def searchIdentities(version: BigDecimal, accountId: Long, returnRawResponse: Option[Boolean]): Unit

  /**
    * Search Vatom User&#39;s Inventory
    * Searches the logged in user&#39;s Vatom Inventory.
    * @param accountId Sirqul Account Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def searchInventory(version: BigDecimal, accountId: Long, vatomParameters: Option[String], returnRawResponse: Option[Boolean]): Unit

  /**
    * Send NFT
    * Send an NFT.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomCampaignId Vatom Campaign Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def sendNFT(version: BigDecimal, accountId: Long, appKey: String, vatomCampaignId: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Set Points Balance as Business
    * Sets the points balance of a Vatom user.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomUserId Vatom User Id
    * @param vatomCampaignId Vatom Campaign Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def setPointsBalanceAsBusiness(version: BigDecimal, accountId: Long, appKey: String, vatomUserId: String, vatomCampaignId: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Transfer coins from Vatom Users
    * Transfer coins from Vatom Users.
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def transferUserCoins(version: BigDecimal, accountId: Long, vatomUserId: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Fund coins for a Business
    * Fund/update coins for a Businesss.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def updateBusinessCoins(version: BigDecimal, accountId: Long, appKey: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Update Vatom Event Guest List
    * Update the guest list of an event.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomEventId Vatom Event Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def updateEventGuestList(version: BigDecimal, accountId: Long, appKey: String, vatomEventId: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Update Vatom Space
    * Update a Vatom space.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomSpaceId Vatom Space Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def updateSpace(version: BigDecimal, accountId: Long, appKey: String, vatomSpaceId: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Update the coins for a user (as a Business)
    * Update the coins for a user (as a Business).
    * @param accountId Sirqul Account Id
    * @param vatomUserId Vatom User Id
    * @param appKey Sirqul Application Key
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def updateUserCoinsAsBusiness(version: BigDecimal, accountId: Long, vatomUserId: String, appKey: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Update Vatom User Profile
    * Gets the logged in user&#39;s profile in Vatom.
    * @param accountId Sirqul Account Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def updateUserProfile(version: BigDecimal, accountId: Long, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit

  /**
    * Update Vatom Event
    * Update a Vatom event.
    * @param accountId Sirqul Account Id
    * @param appKey Sirqul Application Key
    * @param vatomEventId Vatom Event Id
    * @param vatomParameters Vatom Parameters
    * @param returnRawResponse Return raw response
    */
  def updateVatomEvent(version: BigDecimal, accountId: Long, appKey: String, vatomEventId: String, vatomParameters: String, returnRawResponse: Option[Boolean]): Unit
}
