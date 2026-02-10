package api

import play.api.libs.json._
import model.BigDecimal
import model.BlockedNotificationResponse
import model.NotificationMessageListResponse
import model.NotificationRecipientResponse
import model.NotificationRecipientResponseListResponse
import model.NotificationTemplateResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait NotificationApi {
  /**
    * Create Notification Template
    * Create a notification template. Developers will only be able to create notification templates for their own applications.
    * @param accountId The account ID of the user.
    * @param conduit Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    * @param title title of the notification template
    * @param body body of the notification template
    * @param appKey Filter results by application.
    * @param event Filter results by event.
    * @param tags tags associated with the note template
    */
  def createNotificationTemplate(version: BigDecimal, accountId: Long, conduit: String, title: String, body: String, appKey: Option[String], event: Option[String], tags: Option[String]): NotificationTemplateResponse

  /**
    * Create or update blocked notification settings
    * Create or update blocked notification settings
    * @param appKey The application key
    * @param data batch data payload (application specific)
    * @param accountId the account id of the user
    */
  def createOrUpdateBlockedNotifications(version: BigDecimal, appKey: String, data: String, accountId: Option[Long]): BlockedNotificationResponse

  /**
    * Delete Notification Template
    * Deletes a notification template. Developers will only be able to delete notification templates for their own applications.
    * @param accountId the account id of the user
    * @param notificationTemplateId the id of the notification template to delete
    */
  def deleteNotificationTemplate(version: BigDecimal, accountId: Long, notificationTemplateId: Long): NotificationTemplateResponse

  /**
    * Get Notification Template
    * Get the details of a notification template. Developers will only be able to see notification templates for their own applications.
    * @param accountId the id of the account
    * @param notificationTemplateId the id of the notification template to get
    */
  def getNotificationTemplate(version: BigDecimal, accountId: Long, notificationTemplateId: Long): NotificationTemplateResponse

  /**
    * Get Notifications
    * Get a list of notifications for a user. If the \&quot;markAsRead\&quot; parameter is set to true, the returned notifications will be marked as \&quot;read\&quot; after the response has been sent. By default, read messages will not be returned, so to see read messages, set \&quot;returnReadMessages\&quot; to true.
    * @param deviceId the unique id of the device making the request (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionAccountId the account id used to view another person&#39;s notifications
    * @param appKey the application key to filter messages by application
    * @param eventType comma separated list of EVENTS. Filters search results to only include these events. Don&#39;t include this parameter or pass in an empty string to return all event types.
    * @param contentIds comma separated list of content ids to search notifications on
    * @param contentTypes comma separated list of content types to search notifications on
    * @param parentIds comma separated list of parent ids to search notifications on
    * @param parentTypes comma separated list of parent types to search notifications on
    * @param actionCategory Action category used to filter notifications
    * @param conduits comma separated list of conduits to search notifications on
    * @param keyword search notifications via keyword
    * @param returnReadMessages if set to true, will return notifications that have been marked as read
    * @param markAsRead if set to true, the returned notifications will be marked as \\\&quot;read\\\&quot; after the response has been sent
    * @param fromDate filter notifications from this date
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    * @param returnSent whether to include notifications sent by the requester in the response
    * @param ignoreFlagged whether to ignore flagged notifications
    * @param start start of the pagination
    * @param limit limit of the pagination
    */
  def getNotifications(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], appKey: Option[String], eventType: Option[String], contentIds: Option[String], contentTypes: Option[String], parentIds: Option[String], parentTypes: Option[String], actionCategory: Option[String], conduits: Option[String], keyword: Option[String], returnReadMessages: Option[Boolean], markAsRead: Option[Boolean], fromDate: Option[Long], latitude: Option[Double], longitude: Option[Double], returnSent: Option[Boolean], ignoreFlagged: Option[Boolean], start: Option[Int], limit: Option[Int]): NotificationMessageListResponse

  /**
    * Register Notification Token
    * Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.
    * @param token A token that is generated by the device to sign requests for the notification service providers
    * @param pushType The type of push notification. Possible values include: APNS, GCM
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param environment Determines if the token is a DEVELOPMENT or PRODUCTION token
    * @param appKey The application key
    * @param gameType This parameter is deprecated (use appKey instead)
    * @param active Sets whether the token is active or not (non-active tokens are not used)
    * @param latitude Latitude used to update the user&#39;s current location
    * @param longitude Longitude used to update the user&#39;s current location
    */
  def registerNotificationToken(version: BigDecimal, token: String, pushType: String, deviceId: Option[String], accountId: Option[Long], environment: Option[String], appKey: Option[String], gameType: Option[String], active: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Search on the user&#39;s blocked notification settings
    * Search on the user&#39;s blocked notification settings
    * @param appKey The application key
    * @param accountId the account id of the user
    * @param searchTags search tags to filter results
    * @param events events to filter by (comma separated)
    * @param conduits conduits to filter by (comma separated)
    * @param customTypes custom types to filter by (comma separated)
    * @param contentTypes content types to filter by (comma separated)
    * @param contentIds content ids to filter by (comma separated)
    * @param sortField sort field for results
    * @param descending whether to sort descending
    * @param start start of the pagination
    * @param limit limit of the pagination
    */
  def searchBlockedNotifications(version: BigDecimal, appKey: String, accountId: Option[Long], searchTags: Option[String], events: Option[String], conduits: Option[String], customTypes: Option[String], contentTypes: Option[String], contentIds: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): BlockedNotificationResponse

  /**
    * Search Notification Templates
    * Search for notification templates on owned applications.
    * @param accountId The account ID of the user.
    * @param sortField Specifies how results are ordered.ID - order results by the notificationTemplateId CREATED - order results by the created date UPDATED - order results by the updated date TITLE - order results by title EVENT - order results by event CONDUIT - order results by conduit APP_NAME - order results by the application name (&#39;global&#39; templates will not have an application and will be returned last if &#39;descending&#39; is set to false.
    * @param descending Specified whether the results are returned in descending or ascending order.
    * @param start The start of the pagination.
    * @param limit The limit of the pagination.
    * @param appKey Filter results by application.
    * @param event Filter results by event.
    * @param conduit Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    * @param globalOnly Returns only templates that have been reserved for system use on all applications (only for admin accounts).
    * @param reservedOnly Returns only templates that use reserved events.
    * @param keyword Filter results by keyword on the title, tags.
    */
  def searchNotificationTemplate(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, appKey: Option[String], event: Option[String], conduit: Option[String], globalOnly: Option[Boolean], reservedOnly: Option[Boolean], keyword: Option[String]): NotificationTemplateResponse

  /**
    * Search for Recipients
    * Search for application users to send notifications.
    * @param sortField The field to sort by. Possible values include: {ACCOUNT_DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME, APPLICATION_NAME}
    * @param deviceId the unique id of the device making the request (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param appKey filters results by application. If this is empty, will return all recipients for all applications that the user has access to.
    * @param conduit the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    * @param keyword search by keyword on user&#39;s display name and email
    * @param audienceId This parameter is deprecated. filter results by audience
    * @param audienceIds filter results by audiences (comma separated list of audience ids)
    * @param connectionGroupIds filter results by connection groups (comma separated list of connection group ids)
    * @param recipientAccountIds filter results by accounts (comma separated list of account ids)
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start start of the pagination
    * @param limit limit of the pagination (hard limit of 1000)
    */
  def searchRecipients(version: BigDecimal, sortField: String, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], conduit: Option[String], keyword: Option[String], audienceId: Option[Long], audienceIds: Option[String], connectionGroupIds: Option[String], recipientAccountIds: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[NotificationRecipientResponse]

  /**
    * Search for Recipients (Counts/Grouped)
    * Search for application users to send notifications (count/grouped variant).
    * @param deviceId the unique id of the device making the request (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param appKey filters results by application. If this is empty, will return all recipients for all applications that the user has access to.
    * @param conduit the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    * @param keyword search by keyword on user&#39;s display name and email
    * @param audienceId This parameter is deprecated. filter results by audience
    * @param audienceIds filter results by audiences (comma separated list of audience ids)
    * @param connectionGroupIds filter results by connection groups (comma separated list of connection group ids)
    * @param sortField The field to sort by (see API docs for allowed values).
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start start of the pagination
    * @param limit limit of the pagination
    */
  def searchRecipientsCount(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], conduit: Option[String], keyword: Option[String], audienceId: Option[Long], audienceIds: Option[String], connectionGroupIds: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): NotificationRecipientResponseListResponse

  /**
    * Send Batch Notifications
    * Send notifications to all users of an application. Only someone with permissions to the application can do this.
    * @param accountId The account id of the application owner/manager
    * @param appKey The application key for updating an existing application
    * @param customMessage Message string that will be displayed in on the notification
    * @param conduit The type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    * @param contentId Default notification pay-load field (usage is dependent on the app and the type of event)
    * @param contentName Default notification pay-load field (usage is dependent on the app and the type of event)
    * @param contentType Default notification pay-load field (usage is dependent on the app and the type of event)
    * @param parentId Default notification pay-load field (usage is dependent on the app and the type of event)
    * @param parentType Default notification pay-load field (usage is dependent on the app and the type of event)
    */
  def sendBatchNotifications(version: BigDecimal, accountId: Long, appKey: String, customMessage: String, conduit: Option[String], contentId: Option[Long], contentName: Option[String], contentType: Option[String], parentId: Option[Long], parentType: Option[String]): SirqulResponse

  /**
    * Send Custom Notifications
    * Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.
    * @param deviceId the unique id of the device making the request (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param receiverAccountIds comma separated list of account IDs that will receive the notification
    * @param includeFriendGroup determines whether to send to all of the user&#39;s friends, this flag must be true or receiverAccountIds must not be empty
    * @param appKey the application key
    * @param gameType This parameter is deprecated.
    * @param conduit the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    * @param contentId default notification pay-load field (usage is dependent on the app and the type of event)
    * @param contentName default notification pay-load field (usage is dependent on the app and the type of event)
    * @param contentType default notification pay-load field (usage is dependent on the app and the type of event)
    * @param parentId default notification pay-load field (usage is dependent on the app and the type of event)
    * @param parentType default notification pay-load field (usage is dependent on the app and the type of event)
    * @param actionCategory 
    * @param subject the subject line of an email #@param customPayload custom json definition of notification pay-load (usage is dependent on the app and the type of event)
    * @param customMessage message string that will be displayed in on the notification
    * @param friendOnlyAPNS only sends APNS to people who are friends of the user (still saves the notification message for feed polling)
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def sendCustomNotifications(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], receiverAccountIds: Option[String], includeFriendGroup: Option[Boolean], appKey: Option[String], gameType: Option[String], conduit: Option[String], contentId: Option[Long], contentName: Option[String], contentType: Option[String], parentId: Option[Long], parentType: Option[String], actionCategory: Option[String], subject: Option[String], customMessage: Option[String], friendOnlyAPNS: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Update Notification Template
    * Update a notification template. Developers will only be able to update notification templates for their own applications.
    * @param accountId The account ID of the user.
    * @param notificationTemplateId The notification template ID to update.
    * @param title The title of the message (this would become the subject title for emails). There is a 191 character limit.
    * @param body The body of the message.
    * @param tags The search tags on the template used during search queries.
    */
  def updateNotificationTemplate(version: BigDecimal, accountId: Long, notificationTemplateId: Long, title: Option[String], body: Option[String], tags: Option[String]): NotificationTemplateResponse
}
