package api

import model.BigDecimal
import model.MissionFormatResponse
import model.MissionResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[MissionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class MissionApiImpl extends MissionApi {
  /**
    * @inheritdoc
    */
  override def createMission(version: BigDecimal, accountId: Long, title: String, description: Option[String], subType: Option[String], startDate: Option[Long], endDate: Option[Long], active: Option[Boolean], gameLevelIds: Option[String], creativeIds: Option[String], audienceIds: Option[String], missionTask: Option[String], formatType: Option[String], offerId: Option[Long], balance: Option[Double], advancedReporting: Option[Boolean], allocateTickets: Option[Boolean], ticketCount: Option[Long], ticketType: Option[String], points: Option[Long], metaData: Option[String], applicationIds: Option[String], devices: Option[String], deviceIds: Option[String], deviceVersions: Option[String], locations: Option[String], radius: Option[String]): MissionResponse = {
    // TODO: Implement better logic

    MissionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteMission(version: BigDecimal, accountId: Long, missionId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def findMissions(version: BigDecimal, appKey: String, suffix: Option[String], `type`: Option[String], accountId: Option[Long], appVersion: Option[String], latitude: Option[Double], longitude: Option[Double], device: Option[String], deviceIdentifier: Option[Long], deviceVersion: Option[String], start: Option[Int], limit: Option[Int], includeGameData: Option[Boolean], includeAudiences: Option[Boolean], allocatesTickets: Option[Boolean], randomize: Option[Boolean], targetedAdsOnly: Option[Boolean], missionIds: Option[String], audienceOperator: Option[String]): MissionResponse = {
    // TODO: Implement better logic

    MissionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getMission(version: BigDecimal, accountId: Long, missionId: Long, returnCreative: Option[Boolean]): MissionResponse = {
    // TODO: Implement better logic

    MissionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def importMission(version: BigDecimal, accountId: Long, latitude: Double, longitude: Double, appKey: String, keyword: Option[String], start: Option[Int], limit: Option[Int], adSize: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchMissionFormats(version: BigDecimal, start: Int, limit: Int, activeOnly: Boolean): List[MissionFormatResponse] = {
    // TODO: Implement better logic

    List.empty[MissionFormatResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchMissions(version: BigDecimal, accountId: Long, keyword: Option[String], subType: Option[String], start: Option[Int], limit: Option[Int], includeGameData: Option[Boolean], includeAudiences: Option[Boolean], includeInactive: Option[Boolean], suffix: Option[String], sortField: Option[String], descending: Option[Boolean]): List[MissionResponse] = {
    // TODO: Implement better logic

    List.empty[MissionResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchMissionsByBillableEntity(version: BigDecimal, accountId: Long, keyword: Option[String], start: Option[Int], limit: Option[Int], includeGameData: Option[Boolean], includeAudiences: Option[Boolean], includeInactive: Option[Boolean], suffix: Option[String], sortField: Option[String], descending: Option[Boolean]): List[MissionResponse] = {
    // TODO: Implement better logic

    List.empty[MissionResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateMission(version: BigDecimal, accountId: Long, missionId: Long, title: Option[String], description: Option[String], subType: Option[String], metaData: Option[String], startDate: Option[Long], endDate: Option[Long], active: Option[Boolean], gameLevelIds: Option[String], creativeIds: Option[String], audienceIds: Option[String], offerId: Option[Long], balance: Option[Double], advancedReporting: Option[Boolean], allocateTickets: Option[Boolean], ticketCount: Option[Long], ticketType: Option[String], points: Option[Long], applicationIds: Option[String], devices: Option[String], deviceIds: Option[String], deviceVersions: Option[String], locations: Option[String], radius: Option[String]): MissionResponse = {
    // TODO: Implement better logic

    MissionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
