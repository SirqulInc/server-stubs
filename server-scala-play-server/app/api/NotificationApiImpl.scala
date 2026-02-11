package api

import model.BlockedNotificationResponse
import model.NotificationMessageListResponse
import model.NotificationRecipientResponse
import model.NotificationRecipientResponseListResponse
import model.NotificationTemplateResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[NotificationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class NotificationApiImpl extends NotificationApi {
  /**
    * @inheritdoc
    */
  override def createNotificationTemplate(accountId: Long, conduit: String, title: String, body: String, appKey: Option[String], event: Option[String], tags: Option[String]): NotificationTemplateResponse = {
    // TODO: Implement better logic

    NotificationTemplateResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createOrUpdateBlockedNotifications(appKey: String, data: String, accountId: Option[Long]): BlockedNotificationResponse = {
    // TODO: Implement better logic

    BlockedNotificationResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteNotificationTemplate(accountId: Long, notificationTemplateId: Long): NotificationTemplateResponse = {
    // TODO: Implement better logic

    NotificationTemplateResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getNotificationTemplate(accountId: Long, notificationTemplateId: Long): NotificationTemplateResponse = {
    // TODO: Implement better logic

    NotificationTemplateResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getNotifications(deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], appKey: Option[String], eventType: Option[String], contentIds: Option[String], contentTypes: Option[String], parentIds: Option[String], parentTypes: Option[String], actionCategory: Option[String], conduits: Option[String], keyword: Option[String], returnReadMessages: Option[Boolean], markAsRead: Option[Boolean], fromDate: Option[Long], latitude: Option[Double], longitude: Option[Double], returnSent: Option[Boolean], ignoreFlagged: Option[Boolean], start: Option[Int], limit: Option[Int]): NotificationMessageListResponse = {
    // TODO: Implement better logic

    NotificationMessageListResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def registerNotificationToken(token: String, pushType: String, deviceId: Option[String], accountId: Option[Long], environment: Option[String], appKey: Option[String], gameType: Option[String], active: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchBlockedNotifications(appKey: String, accountId: Option[Long], searchTags: Option[String], events: Option[String], conduits: Option[String], customTypes: Option[String], contentTypes: Option[String], contentIds: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): BlockedNotificationResponse = {
    // TODO: Implement better logic

    BlockedNotificationResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchNotificationTemplate(accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, appKey: Option[String], event: Option[String], conduit: Option[String], globalOnly: Option[Boolean], reservedOnly: Option[Boolean], keyword: Option[String]): NotificationTemplateResponse = {
    // TODO: Implement better logic

    NotificationTemplateResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchRecipients(sortField: String, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], conduit: Option[String], keyword: Option[String], audienceId: Option[Long], audienceIds: Option[String], connectionGroupIds: Option[String], recipientAccountIds: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[NotificationRecipientResponse] = {
    // TODO: Implement better logic

    List.empty[NotificationRecipientResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchRecipientsCount(deviceId: Option[String], accountId: Option[Long], appKey: Option[String], conduit: Option[String], keyword: Option[String], audienceId: Option[Long], audienceIds: Option[String], connectionGroupIds: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): NotificationRecipientResponseListResponse = {
    // TODO: Implement better logic

    NotificationRecipientResponseListResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def sendBatchNotifications(accountId: Long, appKey: String, customMessage: String, conduit: Option[String], contentId: Option[Long], contentName: Option[String], contentType: Option[String], parentId: Option[Long], parentType: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def sendCustomNotifications(deviceId: Option[String], accountId: Option[Long], receiverAccountIds: Option[String], includeFriendGroup: Option[Boolean], appKey: Option[String], gameType: Option[String], conduit: Option[String], contentId: Option[Long], contentName: Option[String], contentType: Option[String], parentId: Option[Long], parentType: Option[String], actionCategory: Option[String], subject: Option[String], customMessage: Option[String], friendOnlyAPNS: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateNotificationTemplate(accountId: Long, notificationTemplateId: Long, title: Option[String], body: Option[String], tags: Option[String]): NotificationTemplateResponse = {
    // TODO: Implement better logic

    NotificationTemplateResponse(None, None, None, None, None, None, None, None, None, None)
  }
}
