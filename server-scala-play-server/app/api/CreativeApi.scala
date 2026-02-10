package api

import play.api.libs.json._
import model.BigDecimal
import model.CreativeResponse
import model.MissionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait CreativeApi {
  /**
    * Add Preview
    * Enable this ad for preview for this account.
    * @param accountId the id of the account
    * @param creativeId The id of the creative that want to enable preview. The type of the creative should be CONFIG, otherwise no action will be applied.
    */
  def addPreview(version: BigDecimal, accountId: Long, creativeId: Long): SirqulResponse

  /**
    * Find Missions
    * Get a set of ad filtered by the parameters provided.
    * @param appKey The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.
    * @param randomize return a random set of results, default is true. If false returns in nature order.
    * @param targetedAdsOnly return only ads targets to the specific app, no global ads.
    * @param `type` The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.
    * @param accountId The logged in user.
    * @param appVersion The version of the application, will not return levels newer than the appVersion.
    * @param latitude The current location of the requesting device
    * @param longitude The current location of the requesting device
    * @param device Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.
    * @param deviceIdentifier The device ID of the requesting device, use /audience/devices for list
    * @param deviceVersion The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.
    * @param start The index into the record set to start with.
    * @param limit The total number of record to return.
    * @param includeAudiences If true then return the audience data in the response. Default is false.
    * @param allocatesTickets If true/false only return missions whose game levels allocate (or don&#39;t allocate) tickets. Do not provide a value to return both.
    * @param missionIds return only ads from the specified campaigns.
    */
  def adsFind(version: BigDecimal, appKey: String, randomize: Boolean, targetedAdsOnly: Boolean, `type`: Option[String], accountId: Option[Long], appVersion: Option[String], latitude: Option[Double], longitude: Option[Double], device: Option[String], deviceIdentifier: Option[Long], deviceVersion: Option[String], start: Option[Int], limit: Option[Int], includeAudiences: Option[Boolean], allocatesTickets: Option[Boolean], missionIds: Option[String]): List[MissionResponse]

  /**
    * Create Creative
    * Create a creative
    * @param accountId The logged in user.
    * @param name The name of the level.
    * @param active If true set the game level as active. Default is false.
    * @param waitForAsset determines whether the response will wait until the asset gets created
    * @param description The description of the level.
    * @param assetImageId The asset Id of the level image.
    * @param action This parameter is deprecated. deprecated use data field
    * @param data The creative data, json based format depending on type. If not using action then data is required.
    * @param suffix This parameter is deprecated. deprecated use type field
    * @param `type` The type of creative. If not using suffix then type is required.
    * @param balance Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    * @param referenceId if creative related so some other content provided the id
    * @param appVersion The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.
    * @param missionId Assign the creative to a campaign for timing and audience matching.
    * @param offerId the id of the offer
    */
  def createCreative(version: BigDecimal, accountId: Long, name: String, active: Boolean, waitForAsset: Boolean, description: Option[String], assetImageId: Option[Long], action: Option[String], data: Option[String], suffix: Option[String], `type`: Option[String], balance: Option[Double], referenceId: Option[Long], appVersion: Option[String], missionId: Option[Long], offerId: Option[Long]): CreativeResponse

  /**
    * Delete Creative
    * Delete a creative
    * @param accountId the id of the logged in user
    * @param creativeId the id of the creative to delete
    */
  def deleteCreative(version: BigDecimal, accountId: Long, creativeId: Long): SirqulResponse

  /**
    * Get Creative
    * Get a creative
    * @param accountId the id of the logged in user
    * @param creativeId the ID of the creative to get
    */
  def getCreative(version: BigDecimal, accountId: Long, creativeId: Long): CreativeResponse

  /**
    * Search Creatives
    * Get a list of levels for an application, just those the account has permissions to view.
    * @param accountId The logged in user.
    * @param appKey the application key
    * @param start Start the result set at some index.
    * @param limit Limit the result to some number.
    * @param missionId Creatives contained in the provided mission.
    * @param keyword Match the keyword to the owner name or level name.
    */
  def getCreativesByApplication(version: BigDecimal, accountId: Long, appKey: String, start: Int, limit: Int, missionId: Option[Long], keyword: Option[String]): List[CreativeResponse]

  /**
    * Remove Preview
    * Remove this ad for preview for this account.
    * @param accountId the ID of the logged in user
    * @param creativeId the ID of the creative to remove preview
    */
  def removePreview(version: BigDecimal, accountId: Long, creativeId: Long): SirqulResponse

  /**
    * Update Creative
    * Update a creative
    * @param accountId The logged in user.
    * @param creativeId the creative Id to upate.
    * @param name The name of the level.
    * @param description The description of the level.
    * @param assetImageId The asset Id of the level image.
    * @param action This parameter is deprecated. deprecated use data field
    * @param data The creative data, json based format depending on type
    * @param suffix This parameter is deprecated. deprecated use type field
    * @param `type` The type of creative.
    * @param balance Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    * @param active If true set the game level as active. Default is false.
    * @param referenceId if creative related so some other content provided the id
    * @param appVersion The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.
    * @param missionId Assign the creative to a campaign for timing and audience matching.
    */
  def updateCreative(version: BigDecimal, accountId: Long, creativeId: Long, name: Option[String], description: Option[String], assetImageId: Option[Long], action: Option[String], data: Option[String], suffix: Option[String], `type`: Option[String], balance: Option[Double], active: Option[Boolean], referenceId: Option[Long], appVersion: Option[String], missionId: Option[Long]): CreativeResponse
}
