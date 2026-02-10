package api

import model.BigDecimal
import model.ScheduledNotificationFullResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[ScheduledNotificationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ScheduledNotificationApiImpl extends ScheduledNotificationApi {
  /**
    * @inheritdoc
    */
  override def createScheduledNotification(version: BigDecimal, accountId: Long, name: String, `type`: String, message: String, contentId: Option[Long], contentName: Option[String], contentType: Option[String], parentId: Option[Long], parentType: Option[String], appKey: Option[String], groupingId: Option[String], connectionGroupIds: Option[String], connectionAccountIds: Option[String], audienceId: Option[Long], audienceIds: Option[String], albumIds: Option[String], reportId: Option[Long], reportParams: Option[String], endpointURL: Option[String], payload: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], cronType: Option[String], metaData: Option[String], conditionalInput: Option[String], templateType: Option[String], visibility: Option[String], active: Option[Boolean], sendNow: Option[Boolean], eventType: Option[String], deepLinkURI: Option[String], sendToAll: Option[Boolean]): ScheduledNotificationFullResponse = {
    // TODO: Implement better logic

    ScheduledNotificationFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteScheduledNotification(version: BigDecimal, accountId: Long, scheduledNotificationId: Long, deleteByGroupingId: Option[Boolean]): ScheduledNotificationFullResponse = {
    // TODO: Implement better logic

    ScheduledNotificationFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getScheduledNotification(version: BigDecimal, accountId: Long, scheduledNotificationId: Long): ScheduledNotificationFullResponse = {
    // TODO: Implement better logic

    ScheduledNotificationFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def scheduleNotificationListings(version: BigDecimal, accountId: Long, appKey: String, reportName: String, message: String, offset: Int, recipientReportId: Long, reportParams: Option[String], `type`: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchScheduledNotifications(version: BigDecimal, accountId: Long, groupingId: Option[String], audienceId: Option[Long], filter: Option[String], types: Option[String], contentIds: Option[String], contentTypes: Option[String], parentIds: Option[String], parentTypes: Option[String], statuses: Option[String], templateTypes: Option[String], appKey: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], groupByGroupingId: Option[Boolean], returnAudienceAccountCount: Option[Boolean]): ScheduledNotificationFullResponse = {
    // TODO: Implement better logic

    ScheduledNotificationFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateScheduledNotification(version: BigDecimal, scheduledNotificationId: Long, accountId: Long, name: Option[String], `type`: Option[String], message: Option[String], payload: Option[String], contentId: Option[Long], contentName: Option[String], contentType: Option[String], parentId: Option[Long], parentType: Option[String], appKey: Option[String], groupingId: Option[String], connectionGroupIds: Option[String], connectionAccountIds: Option[String], audienceId: Option[Long], audienceIds: Option[String], albumIds: Option[String], reportId: Option[Long], reportParams: Option[String], endpointURL: Option[String], scheduledDate: Option[Long], startDate: Option[Long], endDate: Option[Long], cronExpression: Option[String], cronType: Option[String], metaData: Option[String], conditionalInput: Option[String], templateType: Option[String], visibility: Option[String], active: Option[Boolean], errorMessage: Option[String], status: Option[String], updateByGroupingId: Option[Boolean], sendNow: Option[Boolean], eventType: Option[String], deepLinkURI: Option[String], sendToAll: Option[Boolean]): ScheduledNotificationFullResponse = {
    // TODO: Implement better logic

    ScheduledNotificationFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
