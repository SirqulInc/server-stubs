
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateNotificationTemplateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account ID of the user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Filter results by application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Filter results by event.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("event")]
    public string? VarEvent { get; set; }
    /// <summary>
    /// Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conduit")]
    public string Conduit { get; set; }
    /// <summary>
    /// title of the notification template
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// body of the notification template
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("body")]
    public string Body { get; set; }
    /// <summary>
    /// tags associated with the note template
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
}
public class CreateOrUpdateBlockedNotificationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// batch data payload (application specific)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
}
public class DeleteNotificationTemplateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the notification template to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notificationTemplateId")]
    public long NotificationTemplateId { get; set; }
}
public class GetNotificationTemplateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the notification template to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notificationTemplateId")]
    public long NotificationTemplateId { get; set; }
}
public class GetNotificationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the account id used to view another person&#39;s notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// the application key to filter messages by application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// comma separated list of EVENTS. Filters search results to only include these events. Don&#39;t include this parameter or pass in an empty string to return all event types.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("eventType")]
    public string? EventType { get; set; }
    /// <summary>
    /// comma separated list of content ids to search notifications on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentIds")]
    public string? ContentIds { get; set; }
    /// <summary>
    /// comma separated list of content types to search notifications on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentTypes")]
    public string? ContentTypes { get; set; }
    /// <summary>
    /// comma separated list of parent ids to search notifications on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentIds")]
    public string? ParentIds { get; set; }
    /// <summary>
    /// comma separated list of parent types to search notifications on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentTypes")]
    public string? ParentTypes { get; set; }
    /// <summary>
    /// Action category used to filter notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("actionCategory")]
    public string? ActionCategory { get; set; }
    /// <summary>
    /// comma separated list of conduits to search notifications on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conduits")]
    public string? Conduits { get; set; }
    /// <summary>
    /// search notifications via keyword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// if set to true, will return notifications that have been marked as read
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnReadMessages")]
    public bool? ReturnReadMessages { get; set; }
    /// <summary>
    /// if set to true, the returned notifications will be marked as \\\&quot;read\\\&quot; after the response has been sent
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("markAsRead")]
    public bool? MarkAsRead { get; set; }
    /// <summary>
    /// filter notifications from this date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fromDate")]
    public long? FromDate { get; set; }
    /// <summary>
    /// latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// whether to include notifications sent by the requester in the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnSent")]
    public bool? ReturnSent { get; set; }
    /// <summary>
    /// whether to ignore flagged notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ignoreFlagged")]
    public bool? IgnoreFlagged { get; set; }
    /// <summary>
    /// start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class RegisterNotificationTokenRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// A token that is generated by the device to sign requests for the notification service providers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("token")]
    public string Token { get; set; }
    /// <summary>
    /// The type of push notification. Possible values include: APNS, GCM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pushType")]
    public string PushType { get; set; }
    /// <summary>
    /// Determines if the token is a DEVELOPMENT or PRODUCTION token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("environment")]
    public string? Environment { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// This parameter is deprecated (use appKey instead)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// Sets whether the token is active or not (non-active tokens are not used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// Latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// Longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class SearchBlockedNotificationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// search tags to filter results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// events to filter by (comma separated)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("events")]
    public string? Events { get; set; }
    /// <summary>
    /// conduits to filter by (comma separated)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conduits")]
    public string? Conduits { get; set; }
    /// <summary>
    /// custom types to filter by (comma separated)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customTypes")]
    public string? CustomTypes { get; set; }
    /// <summary>
    /// content types to filter by (comma separated)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentTypes")]
    public string? ContentTypes { get; set; }
    /// <summary>
    /// content ids to filter by (comma separated)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentIds")]
    public string? ContentIds { get; set; }
    /// <summary>
    /// sort field for results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// whether to sort descending
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchNotificationTemplateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account ID of the user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Filter results by application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Filter results by event.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("event")]
    public string? VarEvent { get; set; }
    /// <summary>
    /// Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conduit")]
    public string? Conduit { get; set; }
    /// <summary>
    /// Returns only templates that have been reserved for system use on all applications (only for admin accounts).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("globalOnly")]
    public bool? GlobalOnly { get; set; }
    /// <summary>
    /// Returns only templates that use reserved events.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservedOnly")]
    public bool? ReservedOnly { get; set; }
    /// <summary>
    /// Filter results by keyword on the title, tags.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Specifies how results are ordered.ID - order results by the notificationTemplateId CREATED - order results by the created date UPDATED - order results by the updated date TITLE - order results by title EVENT - order results by event CONDUIT - order results by conduit APP_NAME - order results by the application name (&#39;global&#39; templates will not have an application and will be returned last if &#39;descending&#39; is set to false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Specified whether the results are returned in descending or ascending order.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The start of the pagination.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit of the pagination.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class SearchRecipientsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// filters results by application. If this is empty, will return all recipients for all applications that the user has access to.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conduit")]
    public string? Conduit { get; set; }
    /// <summary>
    /// search by keyword on user&#39;s display name and email
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// This parameter is deprecated. filter results by audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long? AudienceId { get; set; }
    /// <summary>
    /// filter results by audiences (comma separated list of audience ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// filter results by connection groups (comma separated list of connection group ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIds")]
    public string? ConnectionGroupIds { get; set; }
    /// <summary>
    /// filter results by accounts (comma separated list of account ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recipientAccountIds")]
    public string? RecipientAccountIds { get; set; }
    /// <summary>
    /// The field to sort by. Possible values include: {ACCOUNT_DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME, APPLICATION_NAME}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// limit of the pagination (hard limit of 1000)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchRecipientsCountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// filters results by application. If this is empty, will return all recipients for all applications that the user has access to.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conduit")]
    public string? Conduit { get; set; }
    /// <summary>
    /// search by keyword on user&#39;s display name and email
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// This parameter is deprecated. filter results by audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long? AudienceId { get; set; }
    /// <summary>
    /// filter results by audiences (comma separated list of audience ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// filter results by connection groups (comma separated list of connection group ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIds")]
    public string? ConnectionGroupIds { get; set; }
    /// <summary>
    /// The field to sort by (see API docs for allowed values).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SendBatchNotificationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the application owner/manager
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key for updating an existing application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conduit")]
    public string? Conduit { get; set; }
    /// <summary>
    /// Message string that will be displayed in on the notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customMessage")]
    public string CustomMessage { get; set; }
    /// <summary>
    /// Default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentId")]
    public long? ContentId { get; set; }
    /// <summary>
    /// Default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentName")]
    public string? ContentName { get; set; }
    /// <summary>
    /// Default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentType")]
    public string? ContentType { get; set; }
    /// <summary>
    /// Default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentId")]
    public long? ParentId { get; set; }
    /// <summary>
    /// Default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentType")]
    public string? ParentType { get; set; }
}
public class SendCustomNotificationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// comma separated list of account IDs that will receive the notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("receiverAccountIds")]
    public string? ReceiverAccountIds { get; set; }
    /// <summary>
    /// determines whether to send to all of the user&#39;s friends, this flag must be true or receiverAccountIds must not be empty
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFriendGroup")]
    public bool? IncludeFriendGroup { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conduit")]
    public string? Conduit { get; set; }
    /// <summary>
    /// default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentId")]
    public long? ContentId { get; set; }
    /// <summary>
    /// default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentName")]
    public string? ContentName { get; set; }
    /// <summary>
    /// default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contentType")]
    public string? ContentType { get; set; }
    /// <summary>
    /// default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentId")]
    public long? ParentId { get; set; }
    /// <summary>
    /// default notification pay-load field (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentType")]
    public string? ParentType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("actionCategory")]
    public string? ActionCategory { get; set; }
    /// <summary>
    /// the subject line of an email #@param customPayload custom json definition of notification pay-load (usage is dependent on the app and the type of event)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subject")]
    public string? Subject { get; set; }
    /// <summary>
    /// message string that will be displayed in on the notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customMessage")]
    public string? CustomMessage { get; set; }
    /// <summary>
    /// only sends APNS to people who are friends of the user (still saves the notification message for feed polling)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("friendOnlyAPNS")]
    public bool? FriendOnlyAPNS { get; set; }
    /// <summary>
    /// latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class UpdateNotificationTemplateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account ID of the user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The notification template ID to update.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notificationTemplateId")]
    public long NotificationTemplateId { get; set; }
    /// <summary>
    /// The title of the message (this would become the subject title for emails). There is a 191 character limit.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// The body of the message.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("body")]
    public string? Body { get; set; }
    /// <summary>
    /// The search tags on the template used during search queries.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
}


