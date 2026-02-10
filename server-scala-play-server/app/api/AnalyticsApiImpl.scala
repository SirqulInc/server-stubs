package api

import model.BigDecimal
import model.ChartData
import model.SirqulResponse
import model.UserActivityResponse

/**
  * Provides a default implementation for [[AnalyticsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AnalyticsApiImpl extends AnalyticsApi {
  /**
    * @inheritdoc
    */
  override def activities(version: BigDecimal, start: Int, limit: Int, accountId: Long): List[UserActivityResponse] = {
    // TODO: Implement better logic

    List.empty[UserActivityResponse]
  }

  /**
    * @inheritdoc
    */
  override def aggregatedFilteredUsage(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], applicationId: Option[Long], appKey: Option[String], startDate: Option[Long], endDate: Option[Long], deviceType: Option[String], device: Option[String], deviceOS: Option[String], gender: Option[String], ageGroup: Option[String], country: Option[String], state: Option[String], city: Option[String], zip: Option[String], model: Option[String], tag: Option[String], userAccountId: Option[Long], userAccountDisplay: Option[String], userAccountUsername: Option[String], groupByRoot: Option[String], groupBy: Option[String], distinctCount: Option[String], sortField: Option[String], descending: Option[Boolean], hideUnknown: Option[Boolean], responseFormat: Option[String], l: Option[Int], limit: Option[Int], latitude: Option[Double], longitude: Option[Double]): ChartData = {
    // TODO: Implement better logic

    ChartData(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def filteredUsage(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], applicationId: Option[Long], appKey: Option[String], startDate: Option[Long], endDate: Option[Long], deviceType: Option[String], device: Option[String], deviceOS: Option[String], gender: Option[String], ageGroup: Option[String], country: Option[String], state: Option[String], city: Option[String], zip: Option[String], model: Option[String], tag: Option[String], userAccountId: Option[Long], userAccountDisplay: Option[String], userAccountUsername: Option[String], customId: Option[Long], customType: Option[String], customValue: Option[Double], customValue2: Option[Double], customLong: Option[Long], customLong2: Option[Long], customMessage: Option[String], customMessage2: Option[String], groupBy: Option[String], distinctCount: Option[String], sumColumn: Option[String], sortField: Option[String], descending: Option[Boolean], hideUnknown: Option[Boolean], responseFormat: Option[String], l: Option[Int], limit: Option[Int], latitude: Option[Double], longitude: Option[Double]): ChartData = {
    // TODO: Implement better logic

    ChartData(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def usage(version: BigDecimal, tag: String, deviceId: Option[String], accountId: Option[Long], applicationId: Option[Long], appKey: Option[String], appVersion: Option[String], device: Option[String], deviceType: Option[String], deviceOS: Option[String], model: Option[String], latitude: Option[Double], longitude: Option[Double], customId: Option[Long], customType: Option[String], achievementIncrement: Option[Long], city: Option[String], state: Option[String], country: Option[String], zip: Option[String], locationDescription: Option[String], clientTime: Option[Long], errorMessage: Option[String], ip: Option[String], userAgent: Option[String], backgroundEvent: Option[Boolean], customMessage: Option[String], customMessage2: Option[String], customValue: Option[Double], customValue2: Option[Double], customLong: Option[Long], customLong2: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def usageBatch(version: BigDecimal, appKey: String, device: String, data: String, deviceId: Option[String], accountId: Option[Long], appVersion: Option[String], deviceType: Option[String], deviceOS: Option[String], model: Option[String], updateRanking: Option[Boolean], returnSummaryResponse: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
