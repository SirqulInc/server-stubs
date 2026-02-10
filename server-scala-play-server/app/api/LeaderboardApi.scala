package api

import play.api.libs.json._
import model.BigDecimal
import model.LeaderboardResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait LeaderboardApi {
  /**
    * Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
    * Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
    * @param accountId The account id of the user creating the leaderboard.
    * @param appKey The application key
    * @param rankType a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS
    * @param leaderboardMode the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking); LOCAL - filters results by select users and on users that have logged into the same device; SEARCH - does a GLOBAL search by keyword; CUSTOM - does a LOCAL search by keyword
    * @param iconMedia a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)
    * @param iconAssetId The asset ID to set the leaderboard icon
    * @param bannerMedia a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)
    * @param bannerAssetId The asset ID to set the leaderboard banner
    * @param limitation limit number of rankings for each leaderboard
    * @param sortField determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST
    * @param title leaderboard&#39;s title
    * @param description leaderboard&#39;s description
    * @param metaData custom meta data for the leaderboard
    */
  def createLeaderboard(version: BigDecimal, accountId: Option[Long], appKey: Option[String], rankType: Option[String], leaderboardMode: Option[String], iconMedia: Option[TemporaryFile], iconAssetId: Option[Long], bannerMedia: Option[TemporaryFile], bannerAssetId: Option[Long], limitation: Option[Int], sortField: Option[String], title: Option[String], description: Option[String], metaData: Option[String]): LeaderboardResponse

  /**
    * Delete the Leader Board
    * Removes a leader board id.
    * @param leaderboardId The leaderboard id to delete.
    * @param accountId The account id of the user making the request.
    */
  def deleteLeaderboard(version: BigDecimal, leaderboardId: Long, accountId: Option[Long]): SirqulResponse

  /**
    * Read a leaderboard by id and retrieve the matching ranking list
    * Read a leaderboard by id and retrieve the matching ranking list
    * @param leaderboardId The leaderboard id.
    * @param accountId A valid account.
    * @param includeFullRankingList set to true if need to return the leaderboard&#39;s full ranking list
    */
  def getLeaderboard(version: BigDecimal, leaderboardId: Long, accountId: Option[Long], includeFullRankingList: Option[Boolean]): LeaderboardResponse

  /**
    * Search leaderboard and retrieve the matching ranking list
    * Search leaderboard and retrieve the matching ranking list
    * @param accountId The account id of the user requesting the search.
    * @param appKey The application key.
    * @param globalOnly only include global leaderboards (this overrides the appKey filter)
    * @param keyword keyword to search by title
    * @param leaderboardIds comma separated list of leaderboard ids to filter results with
    * @param rankTypes comma separated list of rankType to filter results with
    * @param sortField sortField of the result, from LeaderboardApiMap (TITLE, DESCRIPTION, CREATED, UPDATED, RANK_TYPE, RANK_MODE)
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param includeInactive include inactive in the result
    * @param includeAppResponse determines whether to include the application response for each leaderboard
    * @param start Start the result set at some index.
    * @param limit Limit the result to some number.
    */
  def searchLeaderboards(version: BigDecimal, accountId: Option[Long], appKey: Option[String], globalOnly: Option[Boolean], keyword: Option[String], leaderboardIds: Option[String], rankTypes: Option[String], sortField: Option[String], descending: Option[Boolean], includeInactive: Option[Boolean], includeAppResponse: Option[Boolean], start: Option[Int], limit: Option[Int]): LeaderboardResponse

  /**
    * Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
    * Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
    * @param leaderboardId The leaderboard id to update.
    * @param accountId The account id of the user updating the leaderboard.
    * @param appKey The application key
    * @param rankType a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters.
    * @param leaderboardMode the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM
    * @param sortField determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST
    * @param iconMedia a MultipartFile containing the icon image of the leaderboard (this will only be used if \&quot;iconAssetId\&quot; is empty)
    * @param iconAssetId The asset ID to set the leaderboard icon
    * @param bannerMedia a MultipartFile containing the icon banner of the leaderboard (this will only be used if \&quot;bannerAssetId\&quot; is empty)
    * @param bannerAssetId The asset ID to set the leaderboard banner
    * @param limitation limit number of rankings for each leaderboard
    * @param active Whether the leaderboard is active
    * @param title leaderboard&#39;s title
    * @param description leaderboard&#39;s description
    * @param metaData custom meta data for the leaderboard
    */
  def updateLeaderboard(version: BigDecimal, leaderboardId: Long, accountId: Option[Long], appKey: Option[String], rankType: Option[String], leaderboardMode: Option[String], sortField: Option[String], iconMedia: Option[TemporaryFile], iconAssetId: Option[Long], bannerMedia: Option[TemporaryFile], bannerAssetId: Option[Long], limitation: Option[Int], active: Option[Boolean], title: Option[String], description: Option[String], metaData: Option[String]): LeaderboardResponse
}
