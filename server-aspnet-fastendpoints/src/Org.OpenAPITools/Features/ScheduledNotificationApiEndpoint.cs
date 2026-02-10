using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Scheduled Notification
/// </summary>

public class CreateScheduledNotificationEndpoint : FastEndpoints.Endpoint<CreateScheduledNotificationRequest, ScheduledNotificationFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/schedule/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Scheduled Notification");
        });

        Summary(s => {
            s.Summary = "Create Scheduled Notification";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Name, "The name of the scheduled notification");
            s.RequestParam(r => r.Type, "The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages");
            s.RequestParam(r => r.Message, "The message to send");
            s.RequestParam(r => r.ContentId, "The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.ContentName, "The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.ContentType, "The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.ParentId, "The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.ParentType, "The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.AppKey, "The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.");
            s.RequestParam(r => r.GroupingId, "Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.");
            s.RequestParam(r => r.ConnectionGroupIds, "The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)");
            s.RequestParam(r => r.ConnectionAccountIds, "The connection accounts to use to generate the list of recipients (comma separated list of user account ids)");
            s.RequestParam(r => r.AudienceId, "This parameter is deprecated. The audience used to generate the list of recipients");
            s.RequestParam(r => r.AudienceIds, "The audiences used to generate the list of recipients (comma separated list of audience IDs)");
            s.RequestParam(r => r.AlbumIds, "The album ids to associate with the scheduled notification (comma separated list of album IDs)");
            s.RequestParam(r => r.ReportId, "The report used to generate the the list of recipients");
            s.RequestParam(r => r.ReportParams, "The parameters to supply to the report used to generate the the list of recipients");
            s.RequestParam(r => r.EndpointURL, "The URL for making an HTTP call");
            s.RequestParam(r => r.Payload, "The parameters for making an HTTP call");
            s.RequestParam(r => r.ScheduledDate, "The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.");
            s.RequestParam(r => r.StartDate, "The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.");
            s.RequestParam(r => r.EndDate, "The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.");
            s.RequestParam(r => r.CronExpression, "The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.");
            s.RequestParam(r => r.CronType, "The cron expression type: UNIX, CRON4J, QUARTZ");
            s.RequestParam(r => r.MetaData, "Additional metadata for the scheduled notification");
            s.RequestParam(r => r.ConditionalInput, "Json input representing conditional logic that has to be met before running the scheduled notification");
            s.RequestParam(r => r.TemplateType, "This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered");
            s.RequestParam(r => r.Visibility, "Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)");
            s.RequestParam(r => r.Active, "Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule. The default value is &#39;true&#39;.");
            s.RequestParam(r => r.SendNow, "");
            s.RequestParam(r => r.EventType, "Sets the event type for the notification");
            s.RequestParam(r => r.DeepLinkURI, "The payload deep link URI that can be used by the client app to direct users to a screen in the app");
            s.RequestParam(r => r.SendToAll, "Determines whether to send to all users of the app if set to true for push notifications (appKey is required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateScheduledNotificationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Scheduled Notification
/// </summary>

public class DeleteScheduledNotificationEndpoint : FastEndpoints.Endpoint<DeleteScheduledNotificationRequest, ScheduledNotificationFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/schedule/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Scheduled Notification");
        });

        Summary(s => {
            s.Summary = "Delete Scheduled Notification";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.ScheduledNotificationId, "the id of the scheduled notification to delete");
            s.RequestParam(r => r.DeleteByGroupingId, "If set to true, also deletes Scheduled Notifications under the same account with the same groupingId.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteScheduledNotificationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Scheduled Notification
/// </summary>

public class GetScheduledNotificationEndpoint : FastEndpoints.Endpoint<GetScheduledNotificationRequest, ScheduledNotificationFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/notification/schedule/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Scheduled Notification");
        });

        Summary(s => {
            s.Summary = "Get Scheduled Notification";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account logged in");
            s.RequestParam(r => r.ScheduledNotificationId, "the id of the scheduled notification to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetScheduledNotificationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Generate Schedule Notifications
/// </summary>

public class ScheduleNotificationListingsEndpoint : FastEndpoints.Endpoint<ScheduleNotificationListingsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/schedule/generate");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Scheduled Notification");
        });

        Summary(s => {
            s.Summary = "Generate Schedule Notifications";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "The application to target");
            s.RequestParam(r => r.ReportName, "The name of the report used to identify events. The report must return columns named: id, name, date, params, and type otherwise it will fail");
            s.RequestParam(r => r.Message, "The message to be sent to the recipients. If you set %name% the report row name value will be swapped in. If you set %time% or %date% the report row start date/time value will be swapped in");
            s.RequestParam(r => r.Offset, "Time in munites before the event starts to notify recipients");
            s.RequestParam(r => r.RecipientReportId, "The report id used to generate the recipient list");
            s.RequestParam(r => r.ReportParams, "The parameters of the report used to identify events in a json structure, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;: \&quot;value\&quot;,   \&quot;number\&quot;: 3.345,   \&quot;date\&quot;: \&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.Type, "The type of scheduled notification; supported values are: MOBILE_NOTIFICATION");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ScheduleNotificationListingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Scheduled Notifications
/// </summary>

public class SearchScheduledNotificationsEndpoint : FastEndpoints.Endpoint<SearchScheduledNotificationsRequest, ScheduledNotificationFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/notification/schedule/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Scheduled Notification");
        });

        Summary(s => {
            s.Summary = "Search Scheduled Notifications";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.GroupingId, "Filter results by a grouping identifier defined by the client");
            s.RequestParam(r => r.AudienceId, "Filter results by audience");
            s.RequestParam(r => r.Filter, "a comma separated list of filters: MINE - Return scheduled notifications that the user has created. SHARED - Return scheduled notifications that have been shared to the user via addUsersToPermissionable. FOLLOWER - Return scheduled notifications that have been created by the users followers (the content needs to have been APPROVED or FEATURED). FOLLOWING - Return scheduled notifications that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). PUBLIC - Return all PUBLIC scheduled notifications that have been APPROVED or FEATURED. ALL_PUBLIC - Return all PUBLIC scheduled notifications regardless of whether they are approved or not (ignores the approval status). LIKED - Return all scheduled notifications that the user has liked. FEATURED - Return all scheduled notifications that have been featured. PENDING - Return all pending scheduled notifications.");
            s.RequestParam(r => r.Types, "Filter results by notification types (comma separated list). Values include: HTTP, EMAIL, SMS, MOBILE_NOTIFICATION");
            s.RequestParam(r => r.ContentIds, "search using content IDs");
            s.RequestParam(r => r.ContentTypes, "search using content types");
            s.RequestParam(r => r.ParentIds, "search using parent IDs");
            s.RequestParam(r => r.ParentTypes, "search using parent types");
            s.RequestParam(r => r.Statuses, "Filter results by status (comma separated list). Possible values include: NEW - scheduled to run ERROR - encountered an error during processing COMPLETE - processing has completed and it is no longer scheduled to run PROCESSING - currently processing/sending");
            s.RequestParam(r => r.TemplateTypes, "");
            s.RequestParam(r => r.AppKey, "Filter the list by a specific application");
            s.RequestParam(r => r.Keyword, "Keyword search on the scheduled notification names.");
            s.RequestParam(r => r.SortField, "The field to sort by. Possible values include: ID - order by the scheduledNotificationId CREATED - order by the timestamp it was created UPDATED - order by the timestamp it was last updated ACTIVE - order by whether it is active or inactive NAME - order by the scheduled notification name SCHEDULED_DATE - order by the next scheduled date START_DATE - order by the start date END_DATE - order by the end date");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number.");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active results");
            s.RequestParam(r => r.GroupByGroupingId, "Determines whether to group results with the same groupingId together.");
            s.RequestParam(r => r.ReturnAudienceAccountCount, "If true, include audience account counts in the response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchScheduledNotificationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Scheduled Notification
/// </summary>

public class UpdateScheduledNotificationEndpoint : FastEndpoints.Endpoint<UpdateScheduledNotificationRequest, ScheduledNotificationFullResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/schedule/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Scheduled Notification");
        });

        Summary(s => {
            s.Summary = "Update Scheduled Notification";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ScheduledNotificationId, "The id of scheduled notification to update");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Name, "The name of the scheduled notification");
            s.RequestParam(r => r.Type, "The type of scheduled notification. Supported values include: MOBILE_NOTIFICATION - sends push notifications via APNS and GCM EMAIL - sends email messages SMS - sends text messages");
            s.RequestParam(r => r.Message, "The message to send");
            s.RequestParam(r => r.Payload, "The parameters for making an HTTP call");
            s.RequestParam(r => r.ContentId, "The payload content ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.ContentName, "The payload content name that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.ContentType, "The payload content type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.ParentId, "The payload parent ID that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.ParentType, "The payload parent type that gets sent along with the message. For push notification, this could be used in client apps to know what the message is referring to and open up the related view.");
            s.RequestParam(r => r.AppKey, "The application that the notifications will send to. If connectionGroupIds, connectionAccountIds, and audienceIds is not set, this will send to all users who have used the application. This parameter is also required when sending push notifications via the MOBILE_NOTIFICATION type.");
            s.RequestParam(r => r.GroupingId, "Client defined identifier for grouping multiple scheduled notifications. This can be used with the search endpoint to return scheduled notifications with the same groupingId for display purposes. Only results that have been created by the user will be returned when using this feature.");
            s.RequestParam(r => r.ConnectionGroupIds, "The connection groups to use to generate the list of recipients (comma separated list of connection group IDs)");
            s.RequestParam(r => r.ConnectionAccountIds, "The connection accounts to use to generate the list of recipients (comma separated list of user account ids)");
            s.RequestParam(r => r.AudienceId, "This parameter is deprecated. The audience used to generate the list of recipients");
            s.RequestParam(r => r.AudienceIds, "The audiences used to generate the list of recipients (comma separated list of audience IDs)");
            s.RequestParam(r => r.AlbumIds, "The album ids to associate with the scheduled notification (comma separated list of album IDs)");
            s.RequestParam(r => r.ReportId, "The report used to generate the the list of recipients");
            s.RequestParam(r => r.ReportParams, "The parameters to supply to the report used to generate the the list of recipients");
            s.RequestParam(r => r.EndpointURL, "The URL for making an HTTP call");
            s.RequestParam(r => r.ScheduledDate, "The next time when the scheduled notification should begin processing (time in milliseconds). If this is left empty, then the startDate will be used.");
            s.RequestParam(r => r.StartDate, "The start time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to be available now.");
            s.RequestParam(r => r.EndDate, "The end time when the scheduled notification should be available to process (time in milliseconds). If this is left empty, then it will be assumed to not have an expiration date.");
            s.RequestParam(r => r.CronExpression, "The cron expression that represents the processing schedule. This uses the unix cron expression format. For example: 0 0 * * * will run once a day at midnight UTC.");
            s.RequestParam(r => r.CronType, "The cron expression type: UNIX, CRON4J, QUARTZ");
            s.RequestParam(r => r.MetaData, "Additional metadata for the scheduled notification");
            s.RequestParam(r => r.ConditionalInput, "Json input representing conditional logic that has to be met before running the scheduled notification");
            s.RequestParam(r => r.TemplateType, "This determines if the Scheduled Notification is a template which is used as a basis for dynamically generating re-occurring Scheduled Notifications. The available types include: REPORTING - saves an adhoc report to be able to run again at another time GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business owner) GEOFENCE_OWNER - template for sending notifications to the geofence/audience owner (i.e. the business employee, retailer location, etc) GEOFENCE_TRIGGER - template for sending notifications to the account that triggered the geofence/audience (i.e. the customer) GEOFENCE_HTTP_CALL - template for making http calls when the geofences are triggered");
            s.RequestParam(r => r.Visibility, "Determines the scope of who is able to find and view the scheduled notification (PUBLIC - openly available to all Sirqul users, PRIVATE - only available to users that have been invited)");
            s.RequestParam(r => r.Active, "Sets whether the Scheduled Notification is active or not (inactive Scheduled Notifications are not processed). This is a quick way to toggle on or off without altering its schedule.");
            s.RequestParam(r => r.ErrorMessage, "the error message associated with the scheduled notification");
            s.RequestParam(r => r.Status, "the status of the scheduled notification");
            s.RequestParam(r => r.UpdateByGroupingId, "also updates ScheduledNotifications with the same groupingId and account");
            s.RequestParam(r => r.SendNow, "whether to send the scheduled notification now or not");
            s.RequestParam(r => r.EventType, "Sets the event type for the notification");
            s.RequestParam(r => r.DeepLinkURI, "The payload deep link URI that can be used by the client app to direct users to a screen in the app");
            s.RequestParam(r => r.SendToAll, "Determines whether to send to all users of the app if set to true for push notifications (appKey is required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateScheduledNotificationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

