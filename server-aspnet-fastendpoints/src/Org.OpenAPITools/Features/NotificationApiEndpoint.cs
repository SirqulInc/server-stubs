using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Notification Template
/// </summary>

public class CreateNotificationTemplateEndpoint : FastEndpoints.Endpoint<CreateNotificationTemplateRequest, NotificationTemplateResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/template/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Create Notification Template";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account ID of the user.");
            s.RequestParam(r => r.Conduit, "Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.");
            s.RequestParam(r => r.Title, "title of the notification template");
            s.RequestParam(r => r.Body, "body of the notification template");
            s.RequestParam(r => r.AppKey, "Filter results by application.");
            s.RequestParam(r => r.VarEvent, "Filter results by event.");
            s.RequestParam(r => r.Tags, "tags associated with the note template");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateNotificationTemplateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create or update blocked notification settings
/// </summary>

public class CreateOrUpdateBlockedNotificationsEndpoint : FastEndpoints.Endpoint<CreateOrUpdateBlockedNotificationsRequest, BlockedNotificationResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/blocked/batch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Create or update blocked notification settings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.Data, "batch data payload (application specific)");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateOrUpdateBlockedNotificationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Notification Template
/// </summary>

public class DeleteNotificationTemplateEndpoint : FastEndpoints.Endpoint<DeleteNotificationTemplateRequest, NotificationTemplateResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/template/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Delete Notification Template";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.NotificationTemplateId, "the id of the notification template to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteNotificationTemplateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Notification Template
/// </summary>

public class GetNotificationTemplateEndpoint : FastEndpoints.Endpoint<GetNotificationTemplateRequest, NotificationTemplateResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/notification/template/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Get Notification Template";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account");
            s.RequestParam(r => r.NotificationTemplateId, "the id of the notification template to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetNotificationTemplateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Notifications
/// </summary>

public class GetNotificationsEndpoint : FastEndpoints.Endpoint<GetNotificationsRequest, NotificationMessageListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/notification/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Get Notifications";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "the account id used to view another person&#39;s notifications");
            s.RequestParam(r => r.AppKey, "the application key to filter messages by application");
            s.RequestParam(r => r.EventType, "comma separated list of EVENTS. Filters search results to only include these events. Don&#39;t include this parameter or pass in an empty string to return all event types.");
            s.RequestParam(r => r.ContentIds, "comma separated list of content ids to search notifications on");
            s.RequestParam(r => r.ContentTypes, "comma separated list of content types to search notifications on");
            s.RequestParam(r => r.ParentIds, "comma separated list of parent ids to search notifications on");
            s.RequestParam(r => r.ParentTypes, "comma separated list of parent types to search notifications on");
            s.RequestParam(r => r.ActionCategory, "Action category used to filter notifications");
            s.RequestParam(r => r.Conduits, "comma separated list of conduits to search notifications on");
            s.RequestParam(r => r.Keyword, "search notifications via keyword");
            s.RequestParam(r => r.ReturnReadMessages, "if set to true, will return notifications that have been marked as read");
            s.RequestParam(r => r.MarkAsRead, "if set to true, the returned notifications will be marked as \\\&quot;read\\\&quot; after the response has been sent");
            s.RequestParam(r => r.FromDate, "filter notifications from this date");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.RequestParam(r => r.ReturnSent, "whether to include notifications sent by the requester in the response");
            s.RequestParam(r => r.IgnoreFlagged, "whether to ignore flagged notifications");
            s.RequestParam(r => r.Start, "start of the pagination");
            s.RequestParam(r => r.Limit, "limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetNotificationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Register Notification Token
/// </summary>

public class RegisterNotificationTokenEndpoint : FastEndpoints.Endpoint<RegisterNotificationTokenRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/token");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Register Notification Token";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Token, "A token that is generated by the device to sign requests for the notification service providers");
            s.RequestParam(r => r.PushType, "The type of push notification. Possible values include: APNS, GCM");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Environment, "Determines if the token is a DEVELOPMENT or PRODUCTION token");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.GameType, "This parameter is deprecated (use appKey instead)");
            s.RequestParam(r => r.Active, "Sets whether the token is active or not (non-active tokens are not used)");
            s.RequestParam(r => r.Latitude, "Latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RegisterNotificationTokenRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search on the user&#39;s blocked notification settings
/// </summary>

public class SearchBlockedNotificationsEndpoint : FastEndpoints.Endpoint<SearchBlockedNotificationsRequest, BlockedNotificationResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/notification/blocked/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Search on the user&#39;s blocked notification settings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.SearchTags, "search tags to filter results");
            s.RequestParam(r => r.Events, "events to filter by (comma separated)");
            s.RequestParam(r => r.Conduits, "conduits to filter by (comma separated)");
            s.RequestParam(r => r.CustomTypes, "custom types to filter by (comma separated)");
            s.RequestParam(r => r.ContentTypes, "content types to filter by (comma separated)");
            s.RequestParam(r => r.ContentIds, "content ids to filter by (comma separated)");
            s.RequestParam(r => r.SortField, "sort field for results");
            s.RequestParam(r => r.Descending, "whether to sort descending");
            s.RequestParam(r => r.Start, "start of the pagination");
            s.RequestParam(r => r.Limit, "limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchBlockedNotificationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Notification Templates
/// </summary>

public class SearchNotificationTemplateEndpoint : FastEndpoints.Endpoint<SearchNotificationTemplateRequest, NotificationTemplateResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/notification/template/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Search Notification Templates";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account ID of the user.");
            s.RequestParam(r => r.SortField, "Specifies how results are ordered.ID - order results by the notificationTemplateId CREATED - order results by the created date UPDATED - order results by the updated date TITLE - order results by title EVENT - order results by event CONDUIT - order results by conduit APP_NAME - order results by the application name (&#39;global&#39; templates will not have an application and will be returned last if &#39;descending&#39; is set to false.");
            s.RequestParam(r => r.Descending, "Specified whether the results are returned in descending or ascending order.");
            s.RequestParam(r => r.Start, "The start of the pagination.");
            s.RequestParam(r => r.Limit, "The limit of the pagination.");
            s.RequestParam(r => r.AppKey, "Filter results by application.");
            s.RequestParam(r => r.VarEvent, "Filter results by event.");
            s.RequestParam(r => r.Conduit, "Filter results by notification type: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.");
            s.RequestParam(r => r.GlobalOnly, "Returns only templates that have been reserved for system use on all applications (only for admin accounts).");
            s.RequestParam(r => r.ReservedOnly, "Returns only templates that use reserved events.");
            s.RequestParam(r => r.Keyword, "Filter results by keyword on the title, tags.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchNotificationTemplateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search for Recipients
/// </summary>

public class SearchRecipientsEndpoint : FastEndpoints.Endpoint<SearchRecipientsRequest, List<NotificationRecipientResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/notification/recipient/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Search for Recipients";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "The field to sort by. Possible values include: {ACCOUNT_DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME, APPLICATION_NAME}");
            s.RequestParam(r => r.DeviceId, "the unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "filters results by application. If this is empty, will return all recipients for all applications that the user has access to.");
            s.RequestParam(r => r.Conduit, "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.");
            s.RequestParam(r => r.Keyword, "search by keyword on user&#39;s display name and email");
            s.RequestParam(r => r.AudienceId, "This parameter is deprecated. filter results by audience");
            s.RequestParam(r => r.AudienceIds, "filter results by audiences (comma separated list of audience ids)");
            s.RequestParam(r => r.ConnectionGroupIds, "filter results by connection groups (comma separated list of connection group ids)");
            s.RequestParam(r => r.RecipientAccountIds, "filter results by accounts (comma separated list of account ids)");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "start of the pagination");
            s.RequestParam(r => r.Limit, "limit of the pagination (hard limit of 1000)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRecipientsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search for Recipients (Counts/Grouped)
/// </summary>

public class SearchRecipientsCountEndpoint : FastEndpoints.Endpoint<SearchRecipientsCountRequest, NotificationRecipientResponseListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/notification/recipient/search/count");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Search for Recipients (Counts/Grouped)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppKey, "filters results by application. If this is empty, will return all recipients for all applications that the user has access to.");
            s.RequestParam(r => r.Conduit, "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.");
            s.RequestParam(r => r.Keyword, "search by keyword on user&#39;s display name and email");
            s.RequestParam(r => r.AudienceId, "This parameter is deprecated. filter results by audience");
            s.RequestParam(r => r.AudienceIds, "filter results by audiences (comma separated list of audience ids)");
            s.RequestParam(r => r.ConnectionGroupIds, "filter results by connection groups (comma separated list of connection group ids)");
            s.RequestParam(r => r.SortField, "The field to sort by (see API docs for allowed values).");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "start of the pagination");
            s.RequestParam(r => r.Limit, "limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRecipientsCountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Send Batch Notifications
/// </summary>

public class SendBatchNotificationsEndpoint : FastEndpoints.Endpoint<SendBatchNotificationsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/batch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Send Batch Notifications";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the application owner/manager");
            s.RequestParam(r => r.AppKey, "The application key for updating an existing application");
            s.RequestParam(r => r.CustomMessage, "Message string that will be displayed in on the notification");
            s.RequestParam(r => r.Conduit, "The type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.");
            s.RequestParam(r => r.ContentId, "Default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ContentName, "Default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ContentType, "Default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ParentId, "Default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ParentType, "Default notification pay-load field (usage is dependent on the app and the type of event)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SendBatchNotificationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Send Custom Notifications
/// </summary>

public class SendCustomNotificationsEndpoint : FastEndpoints.Endpoint<SendCustomNotificationsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/custom");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Send Custom Notifications";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ReceiverAccountIds, "comma separated list of account IDs that will receive the notification");
            s.RequestParam(r => r.IncludeFriendGroup, "determines whether to send to all of the user&#39;s friends, this flag must be true or receiverAccountIds must not be empty");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.Conduit, "the type of notification to send: EMAIL, SMS, PUSH, MOBILE_NOTIFICATION.");
            s.RequestParam(r => r.ContentId, "default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ContentName, "default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ContentType, "default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ParentId, "default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ParentType, "default notification pay-load field (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.ActionCategory, "");
            s.RequestParam(r => r.Subject, "the subject line of an email #@param customPayload custom json definition of notification pay-load (usage is dependent on the app and the type of event)");
            s.RequestParam(r => r.CustomMessage, "message string that will be displayed in on the notification");
            s.RequestParam(r => r.FriendOnlyAPNS, "only sends APNS to people who are friends of the user (still saves the notification message for feed polling)");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SendCustomNotificationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Notification Template
/// </summary>

public class UpdateNotificationTemplateEndpoint : FastEndpoints.Endpoint<UpdateNotificationTemplateRequest, NotificationTemplateResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/notification/template/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Notification");
        });

        Summary(s => {
            s.Summary = "Update Notification Template";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account ID of the user.");
            s.RequestParam(r => r.NotificationTemplateId, "The notification template ID to update.");
            s.RequestParam(r => r.Title, "The title of the message (this would become the subject title for emails). There is a 191 character limit.");
            s.RequestParam(r => r.Body, "The body of the message.");
            s.RequestParam(r => r.Tags, "The search tags on the template used during search queries.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateNotificationTemplateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

