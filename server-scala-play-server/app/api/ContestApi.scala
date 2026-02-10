package api

import play.api.libs.json._
import model.AlbumContestListResponse
import model.AlbumContestResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ContestApi {
  /**
    * Create or Update Contest
    * Creates or updates a contest.
    * @param publicRead determines whether the contest&#39;s participants has read permissions
    * @param publicWrite determines whether the contest&#39;s participants has write permissions
    * @param publicDelete determines whether the contest&#39;s participants has delete permissions
    * @param publicAdd determines whether the contest&#39;s participants has add permissions
    * @param visibility the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    * @param includeFriendGroup determines whether to include all friends as participants
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param gameType This parameter is deprecated. the application key
    * @param appKey the application key
    * @param contestType a custom field used for aggregation and searching
    * @param albumContestId the album contest ID for updating (don&#39;t pass in if creating)
    * @param title the title of the contest
    * @param description the description of the contest
    * @param albumId1 the album ID for the first album
    * @param removeAlbum1 removes album1 from the contest
    * @param albumId2 the album ID for the second album
    * @param removeAlbum2 removes album2 from the contest
    * @param startDate the start date of the contest (time-stamp in milliseconds)
    * @param endDate the end date of the contest (time-stamp in milliseconds)
    * @param locationDescription the location description of the contest taking place
    * @param connectionIdsToAdd comma separated list of connection IDs
    * @param connectionGroupIdsToAdd comma separated list of connection group IDs
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def addOrUpdateAlbumContest(version: BigDecimal, publicRead: Boolean, publicWrite: Boolean, publicDelete: Boolean, publicAdd: Boolean, visibility: String, includeFriendGroup: Boolean, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], contestType: Option[String], albumContestId: Option[Long], title: Option[String], description: Option[String], albumId1: Option[Long], removeAlbum1: Option[Boolean], albumId2: Option[Long], removeAlbum2: Option[Boolean], startDate: Option[Long], endDate: Option[Long], locationDescription: Option[String], connectionIdsToAdd: Option[String], connectionGroupIdsToAdd: Option[String], latitude: Option[Double], longitude: Option[Double]): AlbumContestResponse

  /**
    * Approve Contest
    * Sets the approval status of a contest.
    * @param albumContestId The ID of the album contest
    * @param approvalStatus The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    * @param deviceId A unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    */
  def approveAlbumContest(version: BigDecimal, albumContestId: Long, approvalStatus: String, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Delete Contest
    * Deletes a contest.
    * @param albumContestId the album contest ID
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def deleteContest(version: BigDecimal, albumContestId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Get Contest
    * Gets the contest object including the likes and notes
    * @param albumContestId the album contest ID
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def getAlbumContest(version: BigDecimal, albumContestId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): AlbumContestResponse

  /**
    * Search Contests
    * Searches on contests.
    * @param filter a comma separated list of Ownership
    * @param sortField the field to sort by. See AlbumContestApiMap
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param start the start index for pagination
    * @param limit the limit for pagination (there is a hard limit of 30)
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param gameType This parameter is deprecated.
    * @param appKey the application key
    * @param appType the application type
    * @param contestType filter contests with this contest type
    * @param ownerId search on contests that have been created by this account (that the user has permissions to)
    * @param q This parameter is deprecated.
    * @param keyword keyword search string
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    * @param dateCreated filter on items that have been created before this date
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def getAlbumContests(version: BigDecimal, filter: String, sortField: String, descending: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], appType: Option[String], contestType: Option[String], ownerId: Option[Long], q: Option[String], keyword: Option[String], i: Option[Int], l: Option[Int], dateCreated: Option[Long], latitude: Option[Double], longitude: Option[Double]): AlbumContestListResponse

  /**
    * Vote on Contest
    * Vote on a collection in a contest.
    * @param albumContestId the album contest ID
    * @param albumId the ID of the album to vote on
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param contestType a custom field used for aggregation and searching
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def voteOnAlbumContest(version: BigDecimal, albumContestId: Long, albumId: Long, deviceId: Option[String], accountId: Option[Long], contestType: Option[String], latitude: Option[Double], longitude: Option[Double]): AlbumContestResponse
}
