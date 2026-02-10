
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateScheduledNotificationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The name of the scheduled notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string Type { get; set; }
    /// <summary>
    /// The message to send
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("message")]
    public string Message { get; set; }
    /// <summary>
    /// The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentId")]
    public long? ContentId { get; set; }
    /// <summary>
    /// The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentName")]
    public string? ContentName { get; set; }
    /// <summary>
    /// The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentType")]
    public string? ContentType { get; set; }
    /// <summary>
    /// The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentId")]
    public long? ParentId { get; set; }
    /// <summary>
    /// The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentType")]
    public string? ParentType { get; set; }
    /// <summary>
    /// The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupingId")]
    public string? GroupingId { get; set; }
    /// <summary>
    /// The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIds")]
    public string? ConnectionGroupIds { get; set; }
    /// <summary>
    /// The connection accounts to use to generate the list of recipients (comma separated list of user account ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// This parameter is deprecated. The audience used to generate the list of recipients
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long? AudienceId { get; set; }
    /// <summary>
    /// The audiences used to generate the list of recipients (comma separated list of audience IDs)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// The album ids to associate with the scheduled notification (comma separated list of album IDs)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumIds")]
    public string? AlbumIds { get; set; }
    /// <summary>
    /// The report used to generate the the list of recipients
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reportId")]
    public long? ReportId { get; set; }
    /// <summary>
    /// The parameters to supply to the report used to generate the the list of recipients
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reportParams")]
    public string? ReportParams { get; set; }
    /// <summary>
    /// The URL for making an HTTP call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endpointURL")]
    public string? EndpointURL { get; set; }
    /// <summary>
    /// The parameters for making an HTTP call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("payload")]
    public string? Payload { get; set; }
    /// <summary>
    /// The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledDate")]
    public long? ScheduledDate { get; set; }
    /// <summary>
    /// The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cronExpression")]
    public string? CronExpression { get; set; }
    /// <summary>
    /// The cron expression type: UNIX, CRON4J, QUARTZ
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cronType")]
    public string? CronType { get; set; }
    /// <summary>
    /// Additional metadata for the scheduled notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Json input representing conditional logic that has to be met before running the scheduled notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditionalInput")]
    public string? ConditionalInput { get; set; }
    /// <summary>
    /// This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("templateType")]
    public string? TemplateType { get; set; }
    /// <summary>
    /// Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule. The default value is &#39;true&#39;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sendNow")]
    public bool? SendNow { get; set; }
    /// <summary>
    /// Sets the event type for the notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("eventType")]
    public string? EventType { get; set; }
    /// <summary>
    /// The payload deep link URI that can be used by the client app to direct users to a screen in the app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deepLinkURI")]
    public string? DeepLinkURI { get; set; }
    /// <summary>
    /// Determines whether to send to all users of the app if set to true for push notifications (appKey is required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sendToAll")]
    public bool? SendToAll { get; set; }
}
public class DeleteScheduledNotificationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the scheduled notification to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledNotificationId")]
    public long ScheduledNotificationId { get; set; }
    /// <summary>
    /// If set to true, also deletes Scheduled Notifications under the same account with the same groupingId.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deleteByGroupingId")]
    public bool? DeleteByGroupingId { get; set; }
}
public class GetScheduledNotificationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the account logged in
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the scheduled notification to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledNotificationId")]
    public long ScheduledNotificationId { get; set; }
}
public class ScheduleNotificationListingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application to target
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the report used to identify events. The report must return columns named: id, name, date, params, and type otherwise it will fail
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reportName")]
    public string ReportName { get; set; }
    /// <summary>
    /// The parameters of the report used to identify events in a json structure, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;: \&quot;value\&quot;,   \&quot;number\&quot;: 3.345,   \&quot;date\&quot;: \&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reportParams")]
    public string? ReportParams { get; set; }
    /// <summary>
    /// The message to be sent to the recipients. If you set %name% the report row name value will be swapped in. If you set %time% or %date% the report row start date/time value will be swapped in
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("message")]
    public string Message { get; set; }
    /// <summary>
    /// Time in munites before the event starts to notify recipients
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int Offset { get; set; }
    /// <summary>
    /// The type of scheduled notification; supported values are: MOBILE_NOTIFICATION
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// The report id used to generate the recipient list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recipientReportId")]
    public long RecipientReportId { get; set; }
}
public class SearchScheduledNotificationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Filter results by a grouping identifier defined by the client
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupingId")]
    public string? GroupingId { get; set; }
    /// <summary>
    /// Filter results by audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long? AudienceId { get; set; }
    /// <summary>
    /// a comma separated list of filters: MINE - Return scheduled notifications that the user has created. SHARED - Return scheduled notifications that have been shared to the user via addUsersToPermissionable. FOLLOWER - Return scheduled notifications that have been created by the users followers (the content needs to have been APPROVED or FEATURED). FOLLOWING - Return scheduled notifications that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). PUBLIC - Return all PUBLIC scheduled notifications that have been APPROVED or FEATURED. ALL_PUBLIC - Return all PUBLIC scheduled notifications regardless of whether they are approved or not (ignores the approval status). LIKED - Return all scheduled notifications that the user has liked. FEATURED - Return all scheduled notifications that have been featured. PENDING - Return all pending scheduled notifications.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string? Filter { get; set; }
    /// <summary>
    /// Filter results by notification types (comma separated list). Values include: HTTP, EMAIL, SMS, MOBILE_NOTIFICATION
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("types")]
    public string? Types { get; set; }
    /// <summary>
    /// search using content IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentIds")]
    public string? ContentIds { get; set; }
    /// <summary>
    /// search using content types
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentTypes")]
    public string? ContentTypes { get; set; }
    /// <summary>
    /// search using parent IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentIds")]
    public string? ParentIds { get; set; }
    /// <summary>
    /// search using parent types
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentTypes")]
    public string? ParentTypes { get; set; }
    /// <summary>
    /// Filter results by status (comma separated list). Possible values include: NEW - scheduled to run ERROR - encountered an error during processing COMPLETE - processing has completed and it is no longer scheduled to run PROCESSING - currently processing/sending
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("statuses")]
    public string? Statuses { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("templateTypes")]
    public string? TemplateTypes { get; set; }
    /// <summary>
    /// Filter the list by a specific application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Keyword search on the scheduled notification names.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The field to sort by. Possible values include: ID - order by the scheduledNotificationId CREATED - order by the timestamp it was created UPDATED - order by the timestamp it was last updated ACTIVE - order by whether it is active or inactive NAME - order by the scheduled notification name SCHEDULED_DATE - order by the next scheduled date START_DATE - order by the start date END_DATE - order by the end date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Start the result set at some index.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// Limit the result to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Determines whether to return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// Determines whether to group results with the same groupingId together.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupByGroupingId")]
    public bool? GroupByGroupingId { get; set; }
    /// <summary>
    /// If true, include audience account counts in the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAudienceAccountCount")]
    public bool? ReturnAudienceAccountCount { get; set; }
}
public class UpdateScheduledNotificationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of scheduled notification to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledNotificationId")]
    public long ScheduledNotificationId { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The name of the scheduled notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// The message to send
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("message")]
    public string? Message { get; set; }
    /// <summary>
    /// The parameters for making an HTTP call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("payload")]
    public string? Payload { get; set; }
    /// <summary>
    /// The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentId")]
    public long? ContentId { get; set; }
    /// <summary>
    /// The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentName")]
    public string? ContentName { get; set; }
    /// <summary>
    /// The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentType")]
    public string? ContentType { get; set; }
    /// <summary>
    /// The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentId")]
    public long? ParentId { get; set; }
    /// <summary>
    /// The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentType")]
    public string? ParentType { get; set; }
    /// <summary>
    /// The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupingId")]
    public string? GroupingId { get; set; }
    /// <summary>
    /// The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIds")]
    public string? ConnectionGroupIds { get; set; }
    /// <summary>
    /// The connection accounts to use to generate the list of recipients (comma separated list of user account ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// This parameter is deprecated. The audience used to generate the list of recipients
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long? AudienceId { get; set; }
    /// <summary>
    /// The audiences used to generate the list of recipients (comma separated list of audience IDs)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// The album ids to associate with the scheduled notification (comma separated list of album IDs)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumIds")]
    public string? AlbumIds { get; set; }
    /// <summary>
    /// The report used to generate the the list of recipients
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reportId")]
    public long? ReportId { get; set; }
    /// <summary>
    /// The parameters to supply to the report used to generate the the list of recipients
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reportParams")]
    public string? ReportParams { get; set; }
    /// <summary>
    /// The URL for making an HTTP call
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endpointURL")]
    public string? EndpointURL { get; set; }
    /// <summary>
    /// The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledDate")]
    public long? ScheduledDate { get; set; }
    /// <summary>
    /// The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cronExpression")]
    public string? CronExpression { get; set; }
    /// <summary>
    /// The cron expression type: UNIX, CRON4J, QUARTZ
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cronType")]
    public string? CronType { get; set; }
    /// <summary>
    /// Additional metadata for the scheduled notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Json input representing conditional logic that has to be met before running the scheduled notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditionalInput")]
    public string? ConditionalInput { get; set; }
    /// <summary>
    /// This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("templateType")]
    public string? TemplateType { get; set; }
    /// <summary>
    /// Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// the error message associated with the scheduled notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("errorMessage")]
    public string? ErrorMessage { get; set; }
    /// <summary>
    /// the status of the scheduled notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public string? Status { get; set; }
    /// <summary>
    /// also updates ScheduledNotifications with the same groupingId and account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateByGroupingId")]
    public bool? UpdateByGroupingId { get; set; }
    /// <summary>
    /// whether to send the scheduled notification now or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sendNow")]
    public bool? SendNow { get; set; }
    /// <summary>
    /// Sets the event type for the notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("eventType")]
    public string? EventType { get; set; }
    /// <summary>
    /// The payload deep link URI that can be used by the client app to direct users to a screen in the app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deepLinkURI")]
    public string? DeepLinkURI { get; set; }
    /// <summary>
    /// Determines whether to send to all users of the app if set to true for push notifications (appKey is required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sendToAll")]
    public bool? SendToAll { get; set; }
}


