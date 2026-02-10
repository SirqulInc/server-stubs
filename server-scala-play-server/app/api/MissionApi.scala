package api

import play.api.libs.json._
import model.BigDecimal
import model.MissionFormatResponse
import model.MissionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait MissionApi {
  /**
    * Create Mission
    * Create a user defined mission.
    * @param accountId The logged in user.
    * @param title The title of the mission
    * @param description The description of the mission
    * @param subType Custom string client apps can use for searching/filtering missions
    * @param startDate The date/time to start the mission, send 0 to unset
    * @param endDate The date/time to end the mission, send 0 to unset
    * @param active Activate/deactivate the mission
    * @param gameLevelIds the game level ids to include in the mission, comma separated
    * @param creativeIds creatives to associate with the mission
    * @param audienceIds audiences to associate with the mission
    * @param missionTask This parameter is deprecated.
    * @param formatType The string identifier for a mission format (this is not the missionFormatId)
    * @param offerId The offerId to give as a reward
    * @param balance Set the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.
    * @param advancedReporting Flag to mark the mission as eligible for advanced reporting
    * @param allocateTickets Flag to indicate owner should receive tickets for completed missions
    * @param ticketCount The number of tickets to reward
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a mission
    * @param metaData external custom client defined data
    * @param applicationIds Comma separated list of application ids
    * @param devices Deprecated parameter for device names
    * @param deviceIds Comma separated list of device ids
    * @param deviceVersions Comma separated list of device version ranges
    * @param locations List of lat/long pairs for mission locations
    * @param radius Comma separated list of radii for locations
    */
  def createMission(version: BigDecimal, accountId: Long, title: String, description: Option[String], subType: Option[String], startDate: Option[Long], endDate: Option[Long], active: Option[Boolean], gameLevelIds: Option[String], creativeIds: Option[String], audienceIds: Option[String], missionTask: Option[String], formatType: Option[String], offerId: Option[Long], balance: Option[Double], advancedReporting: Option[Boolean], allocateTickets: Option[Boolean], ticketCount: Option[Long], ticketType: Option[String], points: Option[Long], metaData: Option[String], applicationIds: Option[String], devices: Option[String], deviceIds: Option[String], deviceVersions: Option[String], locations: Option[String], radius: Option[String]): MissionResponse

  /**
    * Delete Mission
    * Delete a mission.
    * @param accountId the id of the logged in user
    * @param missionId the id of the mission to delete
    */
  def deleteMission(version: BigDecimal, accountId: Long, missionId: Long): SirqulResponse

  /**
    * Find Missions
    * Get a set of ad filtered by the parameters provided.
    * @param appKey The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.
    * @param suffix The type of mission to get, possible values are: click_banner, click_leaderboard, click_skyscraper, click_full, click_video, or click_zip
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
    * @param includeGameData Include the game level data with the mission.
    * @param includeAudiences If true then return the audience data in the response. Default is false.
    * @param allocatesTickets If true/false only return missions whose game levels allocate (or don&#39;t allocate) tickets. Do not provide a value to return both.
    * @param randomize return a random set of results, default is true. If false returns in natural order.
    * @param targetedAdsOnly return only ads targeted to the specific app, no global ads.
    * @param missionIds return only ads from the specified campaigns.
    * @param audienceOperator will return the items that have at least 1 or all of their audiences exist in the logged in user’s audiences, depending if the value is OR or AND
    */
  def findMissions(version: BigDecimal, appKey: String, suffix: Option[String], `type`: Option[String], accountId: Option[Long], appVersion: Option[String], latitude: Option[Double], longitude: Option[Double], device: Option[String], deviceIdentifier: Option[Long], deviceVersion: Option[String], start: Option[Int], limit: Option[Int], includeGameData: Option[Boolean], includeAudiences: Option[Boolean], allocatesTickets: Option[Boolean], randomize: Option[Boolean], targetedAdsOnly: Option[Boolean], missionIds: Option[String], audienceOperator: Option[String]): MissionResponse

  /**
    * Get Mission
    * Get a mission.
    * @param accountId The logged in user.
    * @param missionId The id of the mission to return.
    * @param returnCreative Return creatives associated with the mission when true
    */
  def getMission(version: BigDecimal, accountId: Long, missionId: Long, returnCreative: Option[Boolean]): MissionResponse

  /**
    * Import Mission
    * Create a mission using a source item such as an offer location.
    * @param accountId The logged in user.
    * @param latitude The current location of the requesting device
    * @param longitude The current location of the requesting device
    * @param appKey the application key
    * @param keyword the keyword of the mission
    * @param start The starting index in the result set to return. Default is 0.
    * @param limit The total number of records to return. Default is 20.
    * @param adSize the size of the ad
    */
  def importMission(version: BigDecimal, accountId: Long, latitude: Double, longitude: Double, appKey: String, keyword: Option[String], start: Option[Int], limit: Option[Int], adSize: Option[String]): SirqulResponse

  /**
    * Search Mission Formats
    * Searches on pre-defined mission formats
    * @param start The starting index in the result set to return. Default is 0.
    * @param limit The total number of records to return. Default is 20.
    * @param activeOnly Determines whether to return only active results. Default is false.
    */
  def searchMissionFormats(version: BigDecimal, start: Int, limit: Int, activeOnly: Boolean): List[MissionFormatResponse]

  /**
    * Search Missions
    * Get the list missions available to the account.  
    * @param accountId The logged in user.
    * @param keyword Filter by keyword
    * @param subType Custom string client apps can use for searching/filtering missions
    * @param start The index into the record set to start with. Default is 0.
    * @param limit The total number of record to return. Default is 20, maximum is 100.
    * @param includeGameData If true then return the game level data in the response. Default is false.
    * @param includeAudiences If true then return the audience data in the response. Default is false.
    * @param includeInactive If true then include inactive missions. Default is false.
    * @param suffix A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml
    * @param sortField The field to sort the search on (for example TITLE)
    * @param descending Whether to sort in descending order (default true)
    */
  def searchMissions(version: BigDecimal, accountId: Long, keyword: Option[String], subType: Option[String], start: Option[Int], limit: Option[Int], includeGameData: Option[Boolean], includeAudiences: Option[Boolean], includeInactive: Option[Boolean], suffix: Option[String], sortField: Option[String], descending: Option[Boolean]): List[MissionResponse]

  /**
    * Search Missions by Billable Entity
    * Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.
    * @param accountId The logged in user.
    * @param keyword Filter by keyword
    * @param start The index into the record set to start with. Default is 0.
    * @param limit The total number of record to return. Default id 20.
    * @param includeGameData If true then return the game level data in the response. Default is false.
    * @param includeAudiences If true then return the audience data in the response. Default is false.
    * @param includeInactive If true then include inactive missions. Default is false.
    * @param suffix A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml
    * @param sortField The field to sort the search on (for example TITLE)
    * @param descending Whether to sort in descending order (default true)
    */
  def searchMissionsByBillableEntity(version: BigDecimal, accountId: Long, keyword: Option[String], start: Option[Int], limit: Option[Int], includeGameData: Option[Boolean], includeAudiences: Option[Boolean], includeInactive: Option[Boolean], suffix: Option[String], sortField: Option[String], descending: Option[Boolean]): List[MissionResponse]

  /**
    * Update Mission
    * Update a mission.
    * @param accountId The logged in user.
    * @param missionId The id of the mission to update.
    * @param title The title of the mission
    * @param description The description of the mission
    * @param subType Custom string client apps can use for searching/filtering missions
    * @param metaData external custom client defined data
    * @param startDate The date/time to start the mission, send 0 to unset
    * @param endDate The date/time to end the mission, send 0 to unset
    * @param active Activate/deactivate the mission
    * @param gameLevelIds the game level ids to include in the mission, comma separated
    * @param creativeIds 
    * @param audienceIds 
    * @param offerId The offerId to give as a reward
    * @param balance Replace the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.
    * @param advancedReporting Flag to mark the mission as eligible for advanced reporting
    * @param allocateTickets Flag to indicate owner should receive tickets for completed missions
    * @param ticketCount The number of tickets to reward
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a mission
    * @param applicationIds Comma separated list of application ids
    * @param devices Deprecated parameter for device names
    * @param deviceIds Comma separated list of device ids
    * @param deviceVersions Comma separated list of device version ranges
    * @param locations List of lat/long pairs for mission locations
    * @param radius Comma separated list of radii for locations
    */
  def updateMission(version: BigDecimal, accountId: Long, missionId: Long, title: Option[String], description: Option[String], subType: Option[String], metaData: Option[String], startDate: Option[Long], endDate: Option[Long], active: Option[Boolean], gameLevelIds: Option[String], creativeIds: Option[String], audienceIds: Option[String], offerId: Option[Long], balance: Option[Double], advancedReporting: Option[Boolean], allocateTickets: Option[Boolean], ticketCount: Option[Long], ticketType: Option[String], points: Option[Long], applicationIds: Option[String], devices: Option[String], deviceIds: Option[String], deviceVersions: Option[String], locations: Option[String], radius: Option[String]): MissionResponse
}
