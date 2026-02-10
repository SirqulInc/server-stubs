package api

import play.api.libs.json._
import model.BigDecimal
import model.JsObject
import model.RankFullResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RankingApi {
  /**
    * Search Historical Rankings
    * Get historical leaderboard rankings by time-frame.
    * @param appKey the application key for filtering results by application
    * @param rankType the rank type to return
    * @param startDate timestamp in milliseconds to filter results with
    * @param endDate timestamp in milliseconds to filter results with
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user
    * @param sortField determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST
    * @param descending determines whether to return results in ascending or descending order
    * @param start the start index for pagination
    * @param limit the limit for pagination
    */
  def getHistoricalRankings(version: BigDecimal, appKey: String, rankType: String, startDate: Long, endDate: Long, deviceId: Option[String], accountId: Option[Long], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): RankFullResponse

  /**
    * Search Rankings
    * Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param gameType This parameter is deprecated.
    * @param appKey the application key for filtering results by application (required for non-EXECUTIVE users)
    * @param q This parameter is deprecated.
    * @param keyword keyword to search for
    * @param rankType a comma separated list of rank types to return. Possible default rank types: POINTS, DOWNLOADS, INVITATIONS
    * @param leaderboardMode the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking) LOCAL - filters results by select users and on users that have logged into the same device CUSTOM - allows for custom filtering using the params: withinAccountIds, albumId, audienceId
    * @param withinAccountIds comma separated list of account ids. If performing a LOCAL or CUSTOM search, the query will include these accounts.
    * @param returnUserRank determines whether to return the user&#39;s current rank in the response. This can be turned off for sequential paginated requests.
    * @param albumId album id to use when performing CUSTOM filters
    * @param audienceId audience id to use when performing CUSTOM filters
    * @param sortField determines how to order and rank the results. Possible values include: TOTAL - order results by total score MONTHLY - order results by monthly score WEEKLY - order results by weekly score DAILY - order results by daily score TOP - order results by top score LOWEST - order results by lowest score
    * @param descending determines whether to return results in ascending or descending order
    * @param i This parameter is deprecated.
    * @param start the start index for pagination
    * @param l This parameter is deprecated.
    * @param limit the limit for pagination
    */
  def getRankings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], q: Option[String], keyword: Option[String], rankType: Option[String], leaderboardMode: Option[String], withinAccountIds: Option[String], returnUserRank: Option[Boolean], albumId: Option[Long], audienceId: Option[Long], sortField: Option[String], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int]): RankFullResponse

  /**
    * Get Personal Rankings
    * Returns the user&#39;s ranks for one or more rank types and modes.
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user
    * @param appKey the application key for filtering results by application (required)
    * @param rankType pass in all rankTypes and children rankTypes
    * @param returnUserRank determines whether to return the user&#39;s current rank in the response, for each rankType
    * @param leaderboardMode the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM
    * @param sortField determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST
    * @param keyword keyword to search for (on rankType)
    * @param descending determines whether to return results in descending order
    * @param start the start index for pagination
    * @param limit the limit for pagination
    */
  def getUserRank(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], rankType: Option[String], returnUserRank: Option[Boolean], leaderboardMode: Option[String], sortField: Option[String], keyword: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): JsObject

  /**
    * Override User Rank
    * Allows an admin of an application to override a user&#39;s scores for a leaderboard.
    * @param accountId the logged in user&#39;s account id (must have permissions to manage data for the application)
    * @param ownerAccountId the end user&#39;s account id to override
    * @param appKey the application key the leaderboard is for
    * @param rankType the rankType of the leaderboard
    * @param totalScore the total score to update
    * @param totalCount the total count to update
    * @param totalTime the total time to update
    * @param dailyScore the daily score to update
    * @param dailyCount the daily count to update
    * @param dailyTime the daily time to update
    * @param weeklyScore the weekly score to update
    * @param weeklyCount the weekly count to update
    * @param weeklyTime the weekly time to update
    * @param monthlyScore the monthly score to update
    * @param monthlyCount the monthly count to update
    * @param monthlyTime the monthly time to update
    * @param topScore the top score to update
    * @param lowestScore the lowest score to update
    * @param streakCount the streak count to update
    * @param streakBestCount the best streak count to update
    * @param startDate the start date to update
    * @param endDate the end date to update
    */
  def overrideUserRank(version: BigDecimal, accountId: Long, ownerAccountId: Long, appKey: String, rankType: String, totalScore: Option[Long], totalCount: Option[Long], totalTime: Option[Long], dailyScore: Option[Long], dailyCount: Option[Long], dailyTime: Option[Long], weeklyScore: Option[Long], weeklyCount: Option[Long], weeklyTime: Option[Long], monthlyScore: Option[Long], monthlyCount: Option[Long], monthlyTime: Option[Long], topScore: Option[Long], lowestScore: Option[Long], streakCount: Option[Long], streakBestCount: Option[Long], startDate: Option[Long], endDate: Option[Long]): SirqulResponse

  /**
    * Update Ranking
    * Update the rank value 
    * @param accountId the account id of the user
    * @param appKey the application key for filtering results by application
    * @param rankType a unique label for identifying the ranking. This can be any alphanumeric string (no spaces or special characters) with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS
    * @param increment the value to increment
    * @param timeIncrement the time value to increment
    * @param tag the analytic tag for this achievement (used to validate scores)
    * @param startDate custom date you can save along with the score for the user
    * @param endDate custom date you can save along with the score for the user
    * @param updateGlobal update the global rankings if true, default is false
    * @param createLeaderboard create the leaderboard if it does not exist (default false)
    */
  def updateRankings(version: BigDecimal, accountId: Long, appKey: String, rankType: String, increment: Option[Long], timeIncrement: Option[Long], tag: Option[String], startDate: Option[Long], endDate: Option[Long], updateGlobal: Option[Boolean], createLeaderboard: Option[Boolean]): SirqulResponse
}
