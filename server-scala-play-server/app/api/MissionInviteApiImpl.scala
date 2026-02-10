package api

import model.BigDecimal
import model.MissionResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[MissionInviteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class MissionInviteApiImpl extends MissionInviteApi {
  /**
    * @inheritdoc
    */
  override def createMissionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], missionId: Option[Long], joinCode: Option[String], includeGameData: Option[Boolean]): MissionResponse = {
    // TODO: Implement better logic

    MissionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteMissionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], missionId: Option[Long], missionInviteId: Option[Long], includeGameData: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getMissionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], missionId: Option[Long], missionInviteId: Option[Long], includeGameData: Option[Boolean], includeScores: Option[String]): MissionResponse = {
    // TODO: Implement better logic

    MissionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchMissionInvites(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], appVersion: Option[String], missionId: Option[Long], status: Option[String], lastUpdated: Option[Long], start: Option[Int], limit: Option[Int], keyword: Option[String], missionTypes: Option[String], filterByBillable: Option[Boolean], includeGameData: Option[Boolean]): List[MissionResponse] = {
    // TODO: Implement better logic

    List.empty[MissionResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateMissionInvite(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], missionId: Option[Long], missionInviteId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], status: Option[String], permissionableType: Option[String], permissionableId: Option[Long], includeGameData: Option[Boolean]): MissionResponse = {
    // TODO: Implement better logic

    MissionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
