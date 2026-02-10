package api

import play.api.libs.json._
import model.BigDecimal
import model.MissionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait MissionInviteApi {
  /**
    * Create Mission Invite
    * Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.
    * @param deviceId the device id (deviceId or accountId required).
    * @param accountId the account id of the user (deviceId or accountId required).
    * @param missionId The mission to find the invite for.
    * @param joinCode code to be entered for user to join the mission
    * @param includeGameData Include the game level data with the mission.
    */
  def createMissionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], missionId: Option[Long], joinCode: Option[String], includeGameData: Option[Boolean]): MissionResponse

  /**
    * Delete Mission Invite
    * Update the mission invite status to quit.
    * @param deviceId the device id (deviceId or accountId required).
    * @param accountId the account id of the user (deviceId or accountId required).
    * @param missionId The mission to find the invite for (missionId or missionInviteId requried).
    * @param missionInviteId The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    * @param includeGameData Include the game level data with the mission.
    */
  def deleteMissionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], missionId: Option[Long], missionInviteId: Option[Long], includeGameData: Option[Boolean]): SirqulResponse

  /**
    * Get Mission Invite
    * Get the mission invite. An account can only be invited to a mission one time.
    * @param deviceId the device id (deviceId or accountId required).
    * @param accountId the account id of the user (deviceId or accountId required).
    * @param missionId The mission to find the invite for (missionId or missionInviteId requried).
    * @param missionInviteId The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    * @param includeGameData Include the game level data with the mission.
    * @param includeScores include the scores with the mission
    */
  def getMissionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], missionId: Option[Long], missionInviteId: Option[Long], includeGameData: Option[Boolean], includeScores: Option[String]): MissionResponse

  /**
    * Search Mission Invites
    * Get a list of mission invites that the account has.
    * @param deviceId the device id (deviceId or accountId required).
    * @param accountId the account id of the user (deviceId or accountId required).
    * @param appKey the app to retrieve the data for, use your application key.
    * @param appVersion the application version, used to version the game level data
    * @param missionId the mission id to filter on
    * @param status The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}
    * @param lastUpdated Only return invites that have been updated since this date/time (long)
    * @param start The index into the record set to start with.
    * @param limit The total number of record to return.
    * @param keyword the keyword to search on
    * @param missionTypes 
    * @param filterByBillable filter results by the account&#39;s billable
    * @param includeGameData Include the game level data with the mission.
    */
  def searchMissionInvites(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], appVersion: Option[String], missionId: Option[Long], status: Option[String], lastUpdated: Option[Long], start: Option[Int], limit: Option[Int], keyword: Option[String], missionTypes: Option[String], filterByBillable: Option[Boolean], includeGameData: Option[Boolean]): List[MissionResponse]

  /**
    * Update Mission Invite
    * Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.
    * @param deviceId the device id (deviceId or accountId required).
    * @param accountId the account id of the user (deviceId or accountId required).
    * @param appKey the application key
    * @param missionId The mission to find the invite for (missionId or missionInviteId requried).
    * @param missionInviteId The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    * @param packId the pack id to find the invite for
    * @param gameLevelId the game level id to find the invite for
    * @param status The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}
    * @param permissionableType This is the content type for missions that require user submission. Note that user submitted content must require a status of PENDING_REVIEW to be accpeted. {ACCOUNT, GAMELEVEL, COLLECTION, ALBUM_CONTEST, THEME_DESCRIPTOR, ALBUM}
    * @param permissionableId The id of the content being submitted.
    * @param includeGameData Include the game level data with the mission.
    */
  def updateMissionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], missionId: Option[Long], missionInviteId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], status: Option[String], permissionableType: Option[String], permissionableId: Option[Long], includeGameData: Option[Boolean]): MissionResponse
}
